package pw;

import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public final k f81925b;

    /* renamed from: c, reason: collision with root package name */
    public final Cipher f81926c;

    /* renamed from: e, reason: collision with root package name */
    public final int f81927e;

    /* renamed from: f, reason: collision with root package name */
    public final g f81928f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f81929g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f81930h;

    public n(k source, Cipher cipher) {
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(cipher, "cipher");
        this.f81925b = source;
        this.f81926c = cipher;
        int blockSize = cipher.getBlockSize();
        this.f81927e = blockSize;
        this.f81928f = new g();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81930h = true;
        this.f81925b.close();
    }

    public final Cipher getCipher() {
        return this.f81926c;
    }

    @Override // pw.b1
    public long read(g sink, long j10) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        g gVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(o2.m(j10, "byteCount < 0: ").toString());
        }
        if (this.f81930h) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        while (true) {
            gVar = this.f81928f;
            if (gVar.size() != 0 || this.f81929g) {
                break;
            }
            k kVar = this.f81925b;
            boolean zExhausted = kVar.exhausted();
            Cipher cipher = this.f81926c;
            if (zExhausted) {
                this.f81929g = true;
                int outputSize = cipher.getOutputSize(0);
                if (outputSize != 0) {
                    w0 w0VarWritableSegment$okio = gVar.writableSegment$okio(outputSize);
                    int iDoFinal = cipher.doFinal(w0VarWritableSegment$okio.f81994a, w0VarWritableSegment$okio.f81995b);
                    w0VarWritableSegment$okio.f81996c += iDoFinal;
                    gVar.setSize$okio(gVar.size() + iDoFinal);
                    if (w0VarWritableSegment$okio.f81995b == w0VarWritableSegment$okio.f81996c) {
                        gVar.f81896b = w0VarWritableSegment$okio.pop();
                        x0.recycle(w0VarWritableSegment$okio);
                    }
                }
            } else {
                w0 w0Var = kVar.getBuffer().f81896b;
                kotlin.jvm.internal.e0.checkNotNull(w0Var);
                int i10 = w0Var.f81996c - w0Var.f81995b;
                int outputSize2 = cipher.getOutputSize(i10);
                while (true) {
                    if (outputSize2 > 8192) {
                        int i11 = this.f81927e;
                        if (i10 <= i11) {
                            this.f81929g = true;
                            byte[] bArrDoFinal = cipher.doFinal(kVar.readByteArray());
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                            gVar.write(bArrDoFinal);
                            break;
                        }
                        i10 -= i11;
                        outputSize2 = cipher.getOutputSize(i10);
                    } else {
                        w0 w0VarWritableSegment$okio2 = gVar.writableSegment$okio(outputSize2);
                        int iUpdate = this.f81926c.update(w0Var.f81994a, w0Var.f81995b, i10, w0VarWritableSegment$okio2.f81994a, w0VarWritableSegment$okio2.f81995b);
                        kVar.skip(i10);
                        w0VarWritableSegment$okio2.f81996c += iUpdate;
                        gVar.setSize$okio(gVar.size() + iUpdate);
                        if (w0VarWritableSegment$okio2.f81995b == w0VarWritableSegment$okio2.f81996c) {
                            gVar.f81896b = w0VarWritableSegment$okio2.pop();
                            x0.recycle(w0VarWritableSegment$okio2);
                        }
                    }
                }
            }
        }
        return gVar.read(sink, j10);
    }

    @Override // pw.b1
    public d1 timeout() {
        return this.f81925b.timeout();
    }
}
