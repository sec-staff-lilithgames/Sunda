package qe;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.util.n1;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f82809g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f82810h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f82811a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f82812b;

    /* renamed from: c, reason: collision with root package name */
    public d f82813c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f82814d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.g f82815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f82816f;

    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        com.google.android.exoplayer2.util.g gVar = new com.google.android.exoplayer2.util.g();
        this.f82811a = mediaCodec;
        this.f82812b = handlerThread;
        this.f82815e = gVar;
        this.f82814d = new AtomicReference();
    }

    public static e a() {
        ArrayDeque arrayDeque = f82809g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new e();
                }
                return (e) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void flush() {
        if (this.f82816f) {
            try {
                ((Handler) com.google.android.exoplayer2.util.a.checkNotNull(this.f82813c)).removeCallbacksAndMessages(null);
                com.google.android.exoplayer2.util.g gVar = this.f82815e;
                gVar.close();
                ((Handler) com.google.android.exoplayer2.util.a.checkNotNull(this.f82813c)).obtainMessage(2).sendToTarget();
                gVar.block();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void maybeThrowException() {
        RuntimeException runtimeException = (RuntimeException) this.f82814d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        maybeThrowException();
        e eVarA = a();
        eVarA.setQueueParams(i10, i11, i12, j10, i13);
        ((Handler) n1.castNonNull(this.f82813c)).obtainMessage(0, eVarA).sendToTarget();
    }

    public void queueSecureInputBuffer(int i10, int i11, ce.d dVar, long j10, int i12) {
        maybeThrowException();
        e eVarA = a();
        eVarA.setQueueParams(i10, i11, 0, j10, i12);
        MediaCodec.CryptoInfo cryptoInfo = eVarA.f82803d;
        cryptoInfo.numSubSamples = dVar.f12219f;
        int[] iArr = dVar.f12217d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = dVar.f12218e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = dVar.f12215b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        cryptoInfo.key = (byte[]) com.google.android.exoplayer2.util.a.checkNotNull(bArrCopyOf);
        byte[] bArr2 = dVar.f12214a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        cryptoInfo.iv = (byte[]) com.google.android.exoplayer2.util.a.checkNotNull(bArrCopyOf2);
        cryptoInfo.mode = dVar.f12216c;
        if (n1.f28506a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f12220g, dVar.f12221h));
        }
        ((Handler) n1.castNonNull(this.f82813c)).obtainMessage(1, eVarA).sendToTarget();
    }

    public void shutdown() {
        if (this.f82816f) {
            flush();
            this.f82812b.quit();
        }
        this.f82816f = false;
    }

    public void start() {
        if (this.f82816f) {
            return;
        }
        HandlerThread handlerThread = this.f82812b;
        handlerThread.start();
        this.f82813c = new d(this, handlerThread.getLooper());
        this.f82816f = true;
    }

    public void waitUntilQueueingComplete() throws InterruptedException {
        com.google.android.exoplayer2.util.g gVar = this.f82815e;
        gVar.close();
        ((Handler) com.google.android.exoplayer2.util.a.checkNotNull(this.f82813c)).obtainMessage(2).sendToTarget();
        gVar.block();
    }
}
