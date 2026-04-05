package com.mbridge.msdk.playercommon.exoplayer2.decoder;

import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.lang.Exception;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends OutputBuffer, E extends Exception> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;
    private I dequeuedInputBuffer;
    private E exception;
    private boolean flushed;
    private final Object lock = new Object();
    private final ArrayDeque<I> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<O> queuedOutputBuffers = new ArrayDeque<>();
    private boolean released;
    private int skippedOutputBufferCount;

    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.availableInputBuffers = iArr;
        this.availableInputBufferCount = iArr.length;
        for (int i10 = 0; i10 < this.availableInputBufferCount; i10++) {
            ((I[]) this.availableInputBuffers)[i10] = createInputBuffer();
        }
        this.availableOutputBuffers = oArr;
        this.availableOutputBufferCount = oArr.length;
        for (int i11 = 0; i11 < this.availableOutputBufferCount; i11++) {
            ((O[]) this.availableOutputBuffers)[i11] = createOutputBuffer();
        }
        Thread thread = new Thread() { // from class: com.mbridge.msdk.playercommon.exoplayer2.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SimpleDecoder.this.run();
            }
        };
        this.decodeThread = thread;
        thread.start();
    }

    private boolean canDecodeBuffer() {
        return !this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0;
    }

    private boolean decode() throws InterruptedException {
        synchronized (this.lock) {
            while (!this.released && !canDecodeBuffer()) {
                try {
                    this.lock.wait();
                } finally {
                }
            }
            if (this.released) {
                return false;
            }
            I iRemoveFirst = this.queuedInputBuffers.removeFirst();
            O[] oArr = this.availableOutputBuffers;
            int i10 = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i10;
            O o10 = oArr[i10];
            boolean z10 = this.flushed;
            this.flushed = false;
            if (iRemoveFirst.isEndOfStream()) {
                o10.addFlag(4);
            } else {
                if (iRemoveFirst.isDecodeOnly()) {
                    o10.addFlag(Integer.MIN_VALUE);
                }
                try {
                    this.exception = (E) decode(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e10) {
                    this.exception = (E) createUnexpectedDecodeException(e10);
                } catch (RuntimeException e11) {
                    this.exception = (E) createUnexpectedDecodeException(e11);
                }
                if (this.exception != null) {
                    synchronized (this.lock) {
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                try {
                    if (this.flushed) {
                        releaseOutputBufferInternal(o10);
                    } else if (o10.isDecodeOnly()) {
                        this.skippedOutputBufferCount++;
                        releaseOutputBufferInternal(o10);
                    } else {
                        o10.skippedOutputBufferCount = this.skippedOutputBufferCount;
                        this.skippedOutputBufferCount = 0;
                        this.queuedOutputBuffers.addLast(o10);
                    }
                    releaseInputBufferInternal(iRemoveFirst);
                } finally {
                }
            }
            return true;
        }
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.lock.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    private void maybeThrowException() throws Exception {
        E e10 = this.exception;
        if (e10 != null) {
            throw e10;
        }
    }

    private void releaseInputBufferInternal(I i10) {
        i10.clear();
        I[] iArr = this.availableInputBuffers;
        int i11 = this.availableInputBufferCount;
        this.availableInputBufferCount = i11 + 1;
        iArr[i11] = i10;
    }

    private void releaseOutputBufferInternal(O o10) {
        o10.clear();
        O[] oArr = this.availableOutputBuffers;
        int i10 = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (decode());
    }

    public abstract I createInputBuffer();

    public abstract O createOutputBuffer();

    public abstract E createUnexpectedDecodeException(Throwable th2);

    public abstract E decode(I i10, O o10, boolean z10);

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final void flush() {
        synchronized (this.lock) {
            try {
                this.flushed = true;
                this.skippedOutputBufferCount = 0;
                I i10 = this.dequeuedInputBuffer;
                if (i10 != null) {
                    releaseInputBufferInternal(i10);
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    releaseInputBufferInternal(this.queuedInputBuffers.removeFirst());
                }
                while (!this.queuedOutputBuffers.isEmpty()) {
                    releaseOutputBufferInternal(this.queuedOutputBuffers.removeFirst());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public void release() throws InterruptedException {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void releaseOutputBuffer(O o10) {
        synchronized (this.lock) {
            releaseOutputBufferInternal(o10);
            maybeNotifyDecodeLoop();
        }
    }

    public final void setInitialInputBufferSize(int i10) throws IllegalStateException {
        Assertions.checkState(this.availableInputBufferCount == this.availableInputBuffers.length);
        for (I i11 : this.availableInputBuffers) {
            i11.ensureSpaceForWrite(i10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final I dequeueInputBuffer() throws Exception {
        I i10;
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkState(this.dequeuedInputBuffer == null);
            int i11 = this.availableInputBufferCount;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.availableInputBuffers;
                int i12 = i11 - 1;
                this.availableInputBufferCount = i12;
                i10 = iArr[i12];
            }
            this.dequeuedInputBuffer = i10;
        }
        return i10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final O dequeueOutputBuffer() throws Exception {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                if (this.queuedOutputBuffers.isEmpty()) {
                    return null;
                }
                return this.queuedOutputBuffers.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.decoder.Decoder
    public final void queueInputBuffer(I i10) throws Exception {
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkArgument(i10 == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(i10);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }
}
