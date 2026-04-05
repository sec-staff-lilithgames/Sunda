package com.explorestack.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class sc {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f22641a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f22642b;

    /* renamed from: c, reason: collision with root package name */
    public static final rc f22643c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f22644d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f22645e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f22646f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f22647g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f22648h;

    static {
        Unsafe unsafeL = l();
        f22641a = unsafeL;
        f22642b = f.f22099a;
        boolean zH = h(Long.TYPE);
        boolean zH2 = h(Integer.TYPE);
        rc qcVar = null;
        if (unsafeL != null) {
            if (!f.a()) {
                qcVar = new qc(unsafeL);
            } else if (zH) {
                qcVar = new pc(unsafeL);
            } else if (zH2) {
                qcVar = new oc(unsafeL);
            }
        }
        f22643c = qcVar;
        f22644d = qcVar == null ? false : qcVar.supportsUnsafeByteBufferOperations();
        f22645e = qcVar == null ? false : qcVar.supportsUnsafeArrayOperations();
        f22646f = d(byte[].class);
        d(boolean[].class);
        e(boolean[].class);
        d(int[].class);
        e(int[].class);
        d(long[].class);
        e(long[].class);
        d(float[].class);
        e(float[].class);
        d(double[].class);
        e(double[].class);
        d(Object[].class);
        e(Object[].class);
        Field fieldF = f();
        f22647g = (fieldF == null || qcVar == null) ? -1L : qcVar.objectFieldOffset(fieldF);
        f22648h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(sc.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static long b(ByteBuffer byteBuffer) {
        return f22643c.getLong(byteBuffer, f22647g);
    }

    public static Object c(Class cls) {
        try {
            return f22641a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int d(Class cls) {
        if (f22645e) {
            return f22643c.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (f22645e) {
            f22643c.arrayIndexScale(cls);
        }
    }

    public static Field f() {
        Field declaredField;
        Field declaredField2;
        if (f.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static void g(long j10, byte[] bArr, long j11, long j12) {
        f22643c.copyMemory(j10, bArr, j11, j12);
    }

    public static boolean h(Class cls) {
        if (!f.a()) {
            return false;
        }
        try {
            Class cls2 = f22642b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte i(byte[] bArr, long j10) {
        return f22643c.getByte(bArr, f22646f + j10);
    }

    public static byte j(Object obj, long j10) {
        return (byte) ((f22643c.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte k(Object obj, long j10) {
        return (byte) ((f22643c.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new nc());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void m(long j10, byte b10) {
        f22643c.putByte(j10, b10);
    }

    public static void n(byte[] bArr, long j10, byte b10) {
        f22643c.putByte(bArr, f22646f + j10, b10);
    }

    public static void o(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = f22643c.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        q(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    public static void p(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        q(obj, j11, ((255 & b10) << i10) | (f22643c.getInt(obj, j11) & (~(255 << i10))));
    }

    public static void q(Object obj, long j10, int i10) {
        f22643c.putInt(obj, j10, i10);
    }

    public static void r(Object obj, long j10, long j11) {
        f22643c.putLong(obj, j10, j11);
    }

    public static void s(Object obj, long j10, Object obj2) {
        f22643c.putObject(obj, j10, obj2);
    }
}
