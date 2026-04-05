package pw;

import java.io.IOException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final j f81919b;

    /* renamed from: c, reason: collision with root package name */
    public final Cipher f81920c;

    /* renamed from: e, reason: collision with root package name */
    public final int f81921e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f81922f;

    public m(j sink, Cipher cipher) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.e0.checkNotNullParameter(cipher, "cipher");
        this.f81919b = sink;
        this.f81920c = cipher;
        int blockSize = cipher.getBlockSize();
        this.f81921e = blockSize;
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f81922f) {
            return;
        }
        this.f81922f = true;
        Cipher cipher = this.f81920c;
        int outputSize = cipher.getOutputSize(0);
        j jVar = this.f81919b;
        Throwable th2 = null;
        if (outputSize != 0) {
            if (outputSize > 8192) {
                try {
                    byte[] bArrDoFinal = cipher.doFinal();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                    jVar.write(bArrDoFinal);
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } else {
                g buffer = jVar.getBuffer();
                w0 w0VarWritableSegment$okio = buffer.writableSegment$okio(outputSize);
                try {
                    int iDoFinal = cipher.doFinal(w0VarWritableSegment$okio.f81994a, w0VarWritableSegment$okio.f81996c);
                    w0VarWritableSegment$okio.f81996c += iDoFinal;
                    buffer.setSize$okio(buffer.size() + iDoFinal);
                } catch (Throwable th4) {
                    th2 = th4;
                }
                if (w0VarWritableSegment$okio.f81995b == w0VarWritableSegment$okio.f81996c) {
                    buffer.f81896b = w0VarWritableSegment$okio.pop();
                    x0.recycle(w0VarWritableSegment$okio);
                }
            }
        }
        try {
            jVar.close();
        } catch (Throwable th5) {
            if (th2 == null) {
                th2 = th5;
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // pw.z0, java.io.Flushable
    public void flush() throws IOException {
        this.f81919b.flush();
    }

    public final Cipher getCipher() {
        return this.f81920c;
    }

    @Override // pw.z0
    public d1 timeout() {
        return this.f81919b.timeout();
    }

    @Override // pw.z0
    public void write(g source, long j10) throws IOException, ShortBufferException {
        int i10;
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        b.checkOffsetAndCount(source.size(), 0L, j10);
        if (this.f81922f) {
            throw new IllegalStateException("closed");
        }
        for (long j11 = j10; j11 > 0; j11 -= i10) {
            w0 w0Var = source.f81896b;
            kotlin.jvm.internal.e0.checkNotNull(w0Var);
            int iMin = (int) Math.min(j11, w0Var.f81996c - w0Var.f81995b);
            j jVar = this.f81919b;
            g buffer = jVar.getBuffer();
            Cipher cipher = this.f81920c;
            int outputSize = cipher.getOutputSize(iMin);
            i10 = iMin;
            while (true) {
                if (outputSize > 8192) {
                    int i11 = this.f81921e;
                    if (i10 <= i11) {
                        byte[] bArrUpdate = cipher.update(source.readByteArray(j11));
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrUpdate, "update(...)");
                        jVar.write(bArrUpdate);
                        i10 = (int) j11;
                        break;
                    }
                    i10 -= i11;
                    outputSize = cipher.getOutputSize(i10);
                } else {
                    w0 w0VarWritableSegment$okio = buffer.writableSegment$okio(outputSize);
                    int iUpdate = this.f81920c.update(w0Var.f81994a, w0Var.f81995b, i10, w0VarWritableSegment$okio.f81994a, w0VarWritableSegment$okio.f81996c);
                    w0VarWritableSegment$okio.f81996c += iUpdate;
                    buffer.setSize$okio(buffer.size() + iUpdate);
                    if (w0VarWritableSegment$okio.f81995b == w0VarWritableSegment$okio.f81996c) {
                        buffer.f81896b = w0VarWritableSegment$okio.pop();
                        x0.recycle(w0VarWritableSegment$okio);
                    }
                    jVar.emitCompleteSegments();
                    source.setSize$okio(source.size() - i10);
                    int i12 = w0Var.f81995b + i10;
                    w0Var.f81995b = i12;
                    if (i12 == w0Var.f81996c) {
                        source.f81896b = w0Var.pop();
                        x0.recycle(w0Var);
                    }
                }
            }
        }
    }
}
