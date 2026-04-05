package ph;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import mh.k1;
import mh.p1;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z {
    public static z concat(Iterable<? extends z> iterable) {
        return new w(iterable);
    }

    public static z empty() {
        return x.f81365d;
    }

    public static z wrap(byte[] bArr) {
        return new v(bArr, 0, bArr.length);
    }

    public m0 asCharSource(Charset charset) {
        return new u(this, charset);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r6 == 8192) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean contentEquals(ph.z r11) throws java.lang.Throwable {
        /*
            r10 = this;
            mh.p1.checkNotNull(r11)
            ph.s0 r0 = ph.s0.create()
            java.io.InputStream r1 = r10.openStream()     // Catch: java.lang.Throwable -> L40
            java.io.Closeable r1 = r0.register(r1)     // Catch: java.lang.Throwable -> L40
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L40
            java.io.InputStream r11 = r11.openStream()     // Catch: java.lang.Throwable -> L40
            java.io.Closeable r11 = r0.register(r11)     // Catch: java.lang.Throwable -> L40
            java.io.InputStream r11 = (java.io.InputStream) r11     // Catch: java.lang.Throwable -> L40
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L40
            byte[] r4 = new byte[r2]     // Catch: java.lang.Throwable -> L40
        L21:
            r5 = 0
            int r6 = ph.e0.read(r1, r3, r5, r2)     // Catch: java.lang.Throwable -> L40
            int r7 = ph.e0.read(r11, r4, r5, r2)     // Catch: java.lang.Throwable -> L40
            if (r6 != r7) goto L3c
            r7 = r5
        L2d:
            if (r7 >= r6) goto L39
            r8 = r3[r7]     // Catch: java.lang.Throwable -> L40
            r9 = r4[r7]     // Catch: java.lang.Throwable -> L40
            if (r8 == r9) goto L36
            goto L3c
        L36:
            int r7 = r7 + 1
            goto L2d
        L39:
            if (r6 == r2) goto L21
            r5 = 1
        L3c:
            r0.close()
            return r5
        L40:
            r11 = move-exception
            java.lang.RuntimeException r11 = r0.rethrow(r11)     // Catch: java.lang.Throwable -> L46
            throw r11     // Catch: java.lang.Throwable -> L46
        L46:
            r11 = move-exception
            r0.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.z.contentEquals(ph.z):boolean");
    }

    public long copyTo(OutputStream outputStream) throws Throwable {
        p1.checkNotNull(outputStream);
        try {
            return e0.copy((InputStream) s0.create().register(openStream()), outputStream);
        } finally {
        }
    }

    public oh.m hash(oh.n nVar) throws Throwable {
        nVar.a();
        copyTo(oh.i.asOutputStream(null));
        throw null;
    }

    public boolean isEmpty() throws Throwable {
        k1 k1VarSizeIfKnown = sizeIfKnown();
        if (k1VarSizeIfKnown.isPresent()) {
            return ((Long) k1VarSizeIfKnown.get()).longValue() == 0;
        }
        try {
            return ((InputStream) s0.create().register(openStream())).read() == -1;
        } finally {
        }
    }

    public InputStream openBufferedStream() throws IOException {
        InputStream inputStreamOpenStream = openStream();
        return inputStreamOpenStream instanceof BufferedInputStream ? (BufferedInputStream) inputStreamOpenStream : new BufferedInputStream(inputStreamOpenStream);
    }

    public abstract InputStream openStream() throws IOException;

    public byte[] read() throws Throwable {
        s0 s0VarCreate = s0.create();
        try {
            InputStream inputStream = (InputStream) s0VarCreate.register(openStream());
            k1 k1VarSizeIfKnown = sizeIfKnown();
            return k1VarSizeIfKnown.isPresent() ? e0.c(inputStream, ((Long) k1VarSizeIfKnown.get()).longValue()) : e0.toByteArray(inputStream);
        } catch (Throwable th2) {
            try {
                throw s0VarCreate.rethrow(th2);
            } finally {
                s0VarCreate.close();
            }
        }
    }

    public long size() throws Throwable {
        k1 k1VarSizeIfKnown = sizeIfKnown();
        if (k1VarSizeIfKnown.isPresent()) {
            return ((Long) k1VarSizeIfKnown.get()).longValue();
        }
        s0 s0VarCreate = s0.create();
        try {
            InputStream inputStream = (InputStream) s0VarCreate.register(openStream());
            long j10 = 0;
            while (true) {
                long jB = e0.b(inputStream, 2147483647L);
                if (jB <= 0) {
                    return j10;
                }
                j10 += jB;
            }
        } catch (IOException unused) {
            s0VarCreate.close();
            try {
                return e0.exhaust((InputStream) s0.create().register(openStream()));
            } finally {
            }
        } finally {
        }
    }

    public k1 sizeIfKnown() {
        return k1.absent();
    }

    public z slice(long j10, long j11) {
        return new y(this, j10, j11);
    }

    public static z concat(Iterator<? extends z> it) {
        return concat(b5.copyOf(it));
    }

    public static z concat(z... zVarArr) {
        return concat(b5.copyOf(zVarArr));
    }

    public long copyTo(t tVar) throws Throwable {
        p1.checkNotNull(tVar);
        s0 s0VarCreate = s0.create();
        try {
            return e0.copy((InputStream) s0VarCreate.register(openStream()), (OutputStream) s0VarCreate.register(tVar.openStream()));
        } finally {
        }
    }

    public <T> T read(r rVar) throws Throwable {
        p1.checkNotNull(rVar);
        try {
            return (T) e0.readBytes((InputStream) s0.create().register(openStream()), rVar);
        } finally {
        }
    }
}
