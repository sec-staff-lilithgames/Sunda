package com.fyber.inneractive.sdk.player.cache;

import com.applovin.shadow.okio.Segment;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f24375a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f24376b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f24377c;

    /* renamed from: d, reason: collision with root package name */
    public int f24378d;

    /* renamed from: e, reason: collision with root package name */
    public int f24379e;

    public k(FileInputStream fileInputStream) {
        Charset charset = l.f24380a;
        charset.getClass();
        if (!charset.equals(charset)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f24375a = fileInputStream;
        this.f24376b = charset;
        this.f24377c = new byte[Segment.SIZE];
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            r8 = this;
            java.io.InputStream r0 = r8.f24375a
            monitor-enter(r0)
            byte[] r1 = r8.f24377c     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto La5
            int r2 = r8.f24378d     // Catch: java.lang.Throwable -> L1d
            int r3 = r8.f24379e     // Catch: java.lang.Throwable -> L1d
            r4 = -1
            r5 = 0
            if (r2 < r3) goto L26
            java.io.InputStream r2 = r8.f24375a     // Catch: java.lang.Throwable -> L1d
            int r3 = r1.length     // Catch: java.lang.Throwable -> L1d
            int r1 = r2.read(r1, r5, r3)     // Catch: java.lang.Throwable -> L1d
            if (r1 == r4) goto L20
            r8.f24378d = r5     // Catch: java.lang.Throwable -> L1d
            r8.f24379e = r1     // Catch: java.lang.Throwable -> L1d
            goto L26
        L1d:
            r1 = move-exception
            goto Lad
        L20:
            java.io.EOFException r1 = new java.io.EOFException     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1d
        L26:
            int r1 = r8.f24378d     // Catch: java.lang.Throwable -> L1d
        L28:
            int r2 = r8.f24379e     // Catch: java.lang.Throwable -> L1d
            r3 = 10
            if (r1 == r2) goto L57
            byte[] r2 = r8.f24377c     // Catch: java.lang.Throwable -> L1d
            r6 = r2[r1]     // Catch: java.lang.Throwable -> L1d
            if (r6 != r3) goto L54
            int r3 = r8.f24378d     // Catch: java.lang.Throwable -> L1d
            if (r1 == r3) goto L41
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L1d
            r6 = 13
            if (r5 != r6) goto L41
            goto L42
        L41:
            r4 = r1
        L42:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L1d
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r8.f24376b     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L1d
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L1d
            int r1 = r1 + 1
            r8.f24378d = r1     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r5
        L54:
            int r1 = r1 + 1
            goto L28
        L57:
            com.fyber.inneractive.sdk.player.cache.j r1 = new com.fyber.inneractive.sdk.player.cache.j     // Catch: java.lang.Throwable -> L1d
            int r2 = r8.f24379e     // Catch: java.lang.Throwable -> L1d
            int r6 = r8.f24378d     // Catch: java.lang.Throwable -> L1d
            int r2 = r2 - r6
            int r2 = r2 + 80
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L1d
        L63:
            byte[] r2 = r8.f24377c     // Catch: java.lang.Throwable -> L1d
            int r6 = r8.f24378d     // Catch: java.lang.Throwable -> L1d
            int r7 = r8.f24379e     // Catch: java.lang.Throwable -> L1d
            int r7 = r7 - r6
            r1.write(r2, r6, r7)     // Catch: java.lang.Throwable -> L1d
            r8.f24379e = r4     // Catch: java.lang.Throwable -> L1d
            java.io.InputStream r2 = r8.f24375a     // Catch: java.lang.Throwable -> L1d
            byte[] r6 = r8.f24377c     // Catch: java.lang.Throwable -> L1d
            int r7 = r6.length     // Catch: java.lang.Throwable -> L1d
            int r2 = r2.read(r6, r5, r7)     // Catch: java.lang.Throwable -> L1d
            if (r2 == r4) goto L9f
            r8.f24378d = r5     // Catch: java.lang.Throwable -> L1d
            r8.f24379e = r2     // Catch: java.lang.Throwable -> L1d
            r2 = r5
        L7f:
            int r6 = r8.f24379e     // Catch: java.lang.Throwable -> L1d
            if (r2 == r6) goto L63
            byte[] r6 = r8.f24377c     // Catch: java.lang.Throwable -> L1d
            r7 = r6[r2]     // Catch: java.lang.Throwable -> L1d
            if (r7 != r3) goto L9c
            int r3 = r8.f24378d     // Catch: java.lang.Throwable -> L1d
            if (r2 == r3) goto L92
            int r4 = r2 - r3
            r1.write(r6, r3, r4)     // Catch: java.lang.Throwable -> L1d
        L92:
            int r2 = r2 + 1
            r8.f24378d = r2     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L9c:
            int r2 = r2 + 1
            goto L7f
        L9f:
            java.io.EOFException r1 = new java.io.EOFException     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1d
        La5:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1d
        Lad:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.k.a():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f24375a) {
            try {
                if (this.f24377c != null) {
                    this.f24377c = null;
                    this.f24375a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
