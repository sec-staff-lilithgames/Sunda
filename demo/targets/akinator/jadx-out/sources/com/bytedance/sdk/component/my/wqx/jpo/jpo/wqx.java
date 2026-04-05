package com.bytedance.sdk.component.my.wqx.jpo.jpo;

import com.applovin.shadow.okio.Segment;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class wqx implements Closeable {

    /* renamed from: cm, reason: collision with root package name */
    private int f18925cm;

    /* renamed from: jd, reason: collision with root package name */
    private final Charset f18926jd;
    private final InputStream jpo;
    private int my;
    private byte[] wqx;

    public wqx(InputStream inputStream, Charset charset) {
        this(inputStream, Segment.SIZE, charset);
    }

    private void wqx() throws IOException {
        InputStream inputStream = this.jpo;
        byte[] bArr = this.wqx;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f18925cm = 0;
        this.my = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.jpo) {
            try {
                if (this.wqx != null) {
                    this.wqx = null;
                    this.jpo.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean jd() {
        return this.my == -1;
    }

    public wqx(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(cm.jpo)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.jpo = inputStream;
        this.f18926jd = charset;
        this.wqx = new byte[i10];
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String jpo() throws java.io.IOException {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.jpo
            monitor-enter(r0)
            byte[] r1 = r7.wqx     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.f18925cm     // Catch: java.lang.Throwable -> L11
            int r2 = r7.my     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.wqx()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.f18925cm     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.my     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.wqx     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.f18925cm     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto L2f
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L11
            r6 = 13
            if (r5 != r6) goto L2f
            goto L30
        L2f:
            r4 = r1
        L30:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f18926jd     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.f18925cm = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            com.bytedance.sdk.component.my.wqx.jpo.jpo.wqx$1 r1 = new com.bytedance.sdk.component.my.wqx.jpo.jpo.wqx$1     // Catch: java.lang.Throwable -> L11
            int r2 = r7.my     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f18925cm     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.wqx     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f18925cm     // Catch: java.lang.Throwable -> L11
            int r5 = r7.my     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.my = r2     // Catch: java.lang.Throwable -> L11
            r7.wqx()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f18925cm     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.my     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.wqx     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.f18925cm     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.f18925cm = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L8b:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.my.wqx.jpo.jpo.wqx.jpo():java.lang.String");
    }
}
