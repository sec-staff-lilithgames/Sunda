package com.fyber.inneractive.sdk.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b0 extends k {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f26348b = Logger.getLogger(b0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f26349c = x3.f26539e;

    /* renamed from: a, reason: collision with root package name */
    public c0 f26350a;

    public static int a(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static long b(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int c(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int d(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public abstract void a(byte b10);

    public abstract void a(int i10, int i11);

    public abstract void a(int i10, long j10);

    public abstract void a(int i10, d2 d2Var);

    public abstract void a(int i10, d2 d2Var, t2 t2Var);

    public abstract void a(int i10, s sVar);

    public abstract void a(int i10, boolean z10);

    public abstract void a(String str, int i10);

    public abstract void b(int i10, int i11);

    public abstract void b(int i10, long j10);

    public abstract void b(int i10, s sVar);

    public abstract void c(int i10, int i11);

    public abstract void c(long j10);

    public abstract void d(int i10, int i11);

    public abstract void d(long j10);

    public abstract void e(int i10);

    public abstract void f(int i10);

    public abstract void g(int i10);

    public static int a(int i10) {
        if (i10 >= 0) {
            return c(i10);
        }
        return 10;
    }

    public static int b(int i10) {
        return c(i10 << 3);
    }

    public static int a(String str) {
        int length;
        try {
            length = d4.a(str);
        } catch (b4 unused) {
            length = str.getBytes(l1.f26429a).length;
        }
        return c(length) + length;
    }

    public static int a(s sVar) {
        int size = sVar.size();
        return c(size) + size;
    }

    public final void a(String str, b4 b4Var) throws z {
        f26348b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) b4Var);
        byte[] bytes = str.getBytes(l1.f26429a);
        try {
            g(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (z e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new z(e11);
        }
    }
}
