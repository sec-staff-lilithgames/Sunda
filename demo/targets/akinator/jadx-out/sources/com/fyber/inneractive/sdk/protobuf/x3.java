package com.fyber.inneractive.sdk.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f26535a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f26536b;

    /* renamed from: c, reason: collision with root package name */
    public static final w3 f26537c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f26538d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f26539e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f26540f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f26541g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f26542h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[PHI: r4
      0x00a2: PHI (r4v21 java.lang.reflect.Field) = (r4v19 java.lang.reflect.Field), (r4v24 java.lang.reflect.Field) binds: [B:39:0x00b3, B:31:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    static {
        /*
            r0 = 0
            com.fyber.inneractive.sdk.protobuf.s3 r1 = new com.fyber.inneractive.sdk.protobuf.s3     // Catch: java.lang.Throwable -> Ld
            r1.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)     // Catch: java.lang.Throwable -> Ld
            sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch: java.lang.Throwable -> Ld
            goto Le
        Ld:
            r1 = r0
        Le:
            com.fyber.inneractive.sdk.protobuf.x3.f26535a = r1
            java.lang.Class r2 = com.fyber.inneractive.sdk.protobuf.d.f26360a
            com.fyber.inneractive.sdk.protobuf.x3.f26536b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = c(r2)
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = c(r4)
            if (r1 != 0) goto L23
            goto L39
        L23:
            boolean r5 = com.fyber.inneractive.sdk.protobuf.d.a()
            if (r5 == 0) goto L3b
            if (r3 == 0) goto L31
            com.fyber.inneractive.sdk.protobuf.u3 r3 = new com.fyber.inneractive.sdk.protobuf.u3
            r3.<init>(r1)
            goto L40
        L31:
            if (r4 == 0) goto L39
            com.fyber.inneractive.sdk.protobuf.t3 r3 = new com.fyber.inneractive.sdk.protobuf.t3
            r3.<init>(r1)
            goto L40
        L39:
            r3 = r0
            goto L40
        L3b:
            com.fyber.inneractive.sdk.protobuf.v3 r3 = new com.fyber.inneractive.sdk.protobuf.v3
            r3.<init>(r1)
        L40:
            com.fyber.inneractive.sdk.protobuf.x3.f26537c = r3
            r1 = 0
            if (r3 != 0) goto L47
            r4 = r1
            goto L4b
        L47:
            boolean r4 = r3.b()
        L4b:
            com.fyber.inneractive.sdk.protobuf.x3.f26538d = r4
            if (r3 != 0) goto L51
            r4 = r1
            goto L55
        L51:
            boolean r4 = r3.a()
        L55:
            com.fyber.inneractive.sdk.protobuf.x3.f26539e = r4
            java.lang.Class<byte[]> r4 = byte[].class
            int r4 = a(r4)
            long r4 = (long) r4
            com.fyber.inneractive.sdk.protobuf.x3.f26540f = r4
            java.lang.Class<boolean[]> r4 = boolean[].class
            a(r4)
            b(r4)
            java.lang.Class<int[]> r4 = int[].class
            a(r4)
            b(r4)
            java.lang.Class<long[]> r4 = long[].class
            a(r4)
            b(r4)
            java.lang.Class<float[]> r4 = float[].class
            a(r4)
            b(r4)
            java.lang.Class<double[]> r4 = double[].class
            a(r4)
            b(r4)
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            a(r4)
            b(r4)
            boolean r4 = com.fyber.inneractive.sdk.protobuf.d.a()
            java.lang.Class<java.nio.Buffer> r5 = java.nio.Buffer.class
            if (r4 == 0) goto La4
            java.lang.String r4 = "effectiveDirectAddress"
            java.lang.reflect.Field r4 = r5.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L9f
            goto La0
        L9f:
            r4 = r0
        La0:
            if (r4 == 0) goto La4
        La2:
            r0 = r4
            goto Lb6
        La4:
            r4 = 0
            java.lang.String r4 = com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ.pwveoJGuAgO
            java.lang.reflect.Field r4 = r5.getDeclaredField(r4)     // Catch: java.lang.Throwable -> Lac
            goto Lad
        Lac:
            r4 = r0
        Lad:
            if (r4 == 0) goto Lb6
            java.lang.Class r5 = r4.getType()
            if (r5 != r2) goto Lb6
            goto La2
        Lb6:
            if (r0 == 0) goto Lc2
            if (r3 != 0) goto Lbb
            goto Lc2
        Lbb:
            sun.misc.Unsafe r2 = r3.f26523a
            long r2 = r2.objectFieldOffset(r0)
            goto Lc4
        Lc2:
            r2 = -1
        Lc4:
            com.fyber.inneractive.sdk.protobuf.x3.f26541g = r2
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r2) goto Lcf
            r1 = 1
        Lcf:
            com.fyber.inneractive.sdk.protobuf.x3.f26542h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.x3.<clinit>():void");
    }

    public static int a(Class cls) {
        if (f26539e) {
            return f26537c.f26523a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void b(Class cls) {
        if (f26539e) {
            f26537c.f26523a.arrayIndexScale(cls);
        }
    }

    public static int c(Object obj, long j10) {
        return f26537c.f26523a.getInt(obj, j10);
    }

    public static long d(Object obj, long j10) {
        return f26537c.f26523a.getLong(obj, j10);
    }

    public static Object e(Object obj, long j10) {
        return f26537c.f26523a.getObject(obj, j10);
    }

    public static void a(Object obj, long j10, int i10) {
        f26537c.f26523a.putInt(obj, j10, i10);
    }

    public static byte b(Object obj, long j10) {
        return (byte) ((c(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static boolean c(Class cls) {
        if (!d.a()) {
            return false;
        }
        try {
            Class cls2 = f26536b;
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

    public static void b(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        a(obj, j11, ((255 & b10) << i10) | (c(obj, j11) & (~(255 << i10))));
    }

    public static void a(Object obj, long j10, long j11) {
        f26537c.f26523a.putLong(obj, j10, j11);
    }

    public static void a(long j10, Object obj, Object obj2) {
        f26537c.f26523a.putObject(obj, j10, obj2);
    }

    public static byte a(Object obj, long j10) {
        return (byte) ((c(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static void a(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iC = c(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        a(obj, j11, ((255 & b10) << i10) | (iC & (~(255 << i10))));
    }

    public static void a(Throwable th2) {
        Logger.getLogger(x3.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }
}
