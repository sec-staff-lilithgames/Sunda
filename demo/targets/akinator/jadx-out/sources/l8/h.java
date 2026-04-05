package l8;

import com.applovin.shadow.okio.Segment;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final InputStream f72702b;

    /* renamed from: c, reason: collision with root package name */
    public final Charset f72703c;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f72704e;

    /* renamed from: f, reason: collision with root package name */
    public int f72705f;

    /* renamed from: g, reason: collision with root package name */
    public int f72706g;

    public h(InputStream inputStream, Charset charset) {
        this(inputStream, Segment.SIZE, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f72702b) {
            try {
                if (this.f72704e != null) {
                    this.f72704e = null;
                    this.f72702b.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean hasUnterminatedLine() {
        return this.f72706g == -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String readLine() throws java.io.IOException {
        /*
            r8 = this;
            java.io.InputStream r0 = r8.f72702b
            monitor-enter(r0)
            byte[] r1 = r8.f72704e     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto La4
            int r2 = r8.f72705f     // Catch: java.lang.Throwable -> L3e
            int r3 = r8.f72706g     // Catch: java.lang.Throwable -> L3e
            r4 = 0
            r5 = -1
            if (r2 < r3) goto L23
            java.io.InputStream r2 = r8.f72702b     // Catch: java.lang.Throwable -> L3e
            int r3 = r1.length     // Catch: java.lang.Throwable -> L3e
            int r1 = r2.read(r1, r4, r3)     // Catch: java.lang.Throwable -> L3e
            if (r1 == r5) goto L1d
            r8.f72705f = r4     // Catch: java.lang.Throwable -> L3e
            r8.f72706g = r1     // Catch: java.lang.Throwable -> L3e
            goto L23
        L1d:
            java.io.EOFException r1 = new java.io.EOFException     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: java.lang.Throwable -> L3e
        L23:
            int r1 = r8.f72705f     // Catch: java.lang.Throwable -> L3e
        L25:
            int r2 = r8.f72706g     // Catch: java.lang.Throwable -> L3e
            r3 = 10
            if (r1 == r2) goto L56
            byte[] r2 = r8.f72704e     // Catch: java.lang.Throwable -> L3e
            r6 = r2[r1]     // Catch: java.lang.Throwable -> L3e
            if (r6 != r3) goto L53
            int r3 = r8.f72705f     // Catch: java.lang.Throwable -> L3e
            if (r1 == r3) goto L40
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L3e
            r6 = 13
            if (r5 != r6) goto L40
            goto L41
        L3e:
            r1 = move-exception
            goto Lac
        L40:
            r4 = r1
        L41:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L3e
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r8.f72703c     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L3e
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L3e
            int r1 = r1 + 1
            r8.f72705f = r1     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return r5
        L53:
            int r1 = r1 + 1
            goto L25
        L56:
            l8.g r1 = new l8.g     // Catch: java.lang.Throwable -> L3e
            int r2 = r8.f72706g     // Catch: java.lang.Throwable -> L3e
            int r6 = r8.f72705f     // Catch: java.lang.Throwable -> L3e
            int r2 = r2 - r6
            int r2 = r2 + 80
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L3e
        L62:
            byte[] r2 = r8.f72704e     // Catch: java.lang.Throwable -> L3e
            int r6 = r8.f72705f     // Catch: java.lang.Throwable -> L3e
            int r7 = r8.f72706g     // Catch: java.lang.Throwable -> L3e
            int r7 = r7 - r6
            r1.write(r2, r6, r7)     // Catch: java.lang.Throwable -> L3e
            r8.f72706g = r5     // Catch: java.lang.Throwable -> L3e
            java.io.InputStream r2 = r8.f72702b     // Catch: java.lang.Throwable -> L3e
            byte[] r6 = r8.f72704e     // Catch: java.lang.Throwable -> L3e
            int r7 = r6.length     // Catch: java.lang.Throwable -> L3e
            int r2 = r2.read(r6, r4, r7)     // Catch: java.lang.Throwable -> L3e
            if (r2 == r5) goto L9e
            r8.f72705f = r4     // Catch: java.lang.Throwable -> L3e
            r8.f72706g = r2     // Catch: java.lang.Throwable -> L3e
            r2 = r4
        L7e:
            int r6 = r8.f72706g     // Catch: java.lang.Throwable -> L3e
            if (r2 == r6) goto L62
            byte[] r6 = r8.f72704e     // Catch: java.lang.Throwable -> L3e
            r7 = r6[r2]     // Catch: java.lang.Throwable -> L3e
            if (r7 != r3) goto L9b
            int r3 = r8.f72705f     // Catch: java.lang.Throwable -> L3e
            if (r2 == r3) goto L91
            int r4 = r2 - r3
            r1.write(r6, r3, r4)     // Catch: java.lang.Throwable -> L3e
        L91:
            int r2 = r2 + 1
            r8.f72705f = r2     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return r1
        L9b:
            int r2 = r2 + 1
            goto L7e
        L9e:
            java.io.EOFException r1 = new java.io.EOFException     // Catch: java.lang.Throwable -> L3e
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: java.lang.Throwable -> L3e
        La4:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3e
            throw r1     // Catch: java.lang.Throwable -> L3e
        Lac:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.h.readLine():java.lang.String");
    }

    public h(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(i.f72707a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f72702b = inputStream;
        this.f72703c = charset;
        this.f72704e = new byte[i10];
    }
}
