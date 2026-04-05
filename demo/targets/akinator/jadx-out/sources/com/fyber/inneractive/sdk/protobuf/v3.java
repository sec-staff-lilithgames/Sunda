package com.fyber.inneractive.sdk.protobuf;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v3 extends w3 {
    public v3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        try {
            Class<?> cls = this.f26523a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            x3.a(th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[PHI: r4
      0x0038: PHI (r4v9 java.lang.reflect.Field) = (r4v5 java.lang.reflect.Field), (r4v12 java.lang.reflect.Field) binds: [B:22:0x004a, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.w3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r8 = this;
            java.lang.String r0 = "copyMemory"
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Class r2 = java.lang.Long.TYPE
            java.lang.String r3 = "getLong"
            sun.misc.Unsafe r4 = r8.f26523a
            r5 = 0
            if (r4 != 0) goto Lf
            goto La6
        Lf:
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r6 = "objectFieldOffset"
            java.lang.Class<java.lang.reflect.Field> r7 = java.lang.reflect.Field.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L3a
            r4.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L3a
            java.lang.Class[] r6 = new java.lang.Class[]{r1, r2}     // Catch: java.lang.Throwable -> L3a
            r4.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L3a
            boolean r4 = com.fyber.inneractive.sdk.protobuf.d.a()     // Catch: java.lang.Throwable -> L3a
            java.lang.Class<java.nio.Buffer> r6 = java.nio.Buffer.class
            r7 = 0
            if (r4 == 0) goto L3c
            java.lang.String r4 = "effectiveDirectAddress"
            java.lang.reflect.Field r4 = r6.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L35
            goto L36
        L35:
            r4 = r7
        L36:
            if (r4 == 0) goto L3c
        L38:
            r7 = r4
            goto L4d
        L3a:
            r0 = move-exception
            goto La3
        L3c:
            java.lang.String r4 = "address"
            java.lang.reflect.Field r4 = r6.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r4 = r7
        L44:
            if (r4 == 0) goto L4d
            java.lang.Class r6 = r4.getType()     // Catch: java.lang.Throwable -> L3a
            if (r6 != r2) goto L4d
            goto L38
        L4d:
            if (r7 != 0) goto L50
            goto La6
        L50:
            sun.misc.Unsafe r4 = r8.f26523a     // Catch: java.lang.Throwable -> L9e
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = "getByte"
            java.lang.Class[] r7 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L9e
            r4.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = "putByte"
            java.lang.Class r7 = java.lang.Byte.TYPE     // Catch: java.lang.Throwable -> L9e
            java.lang.Class[] r7 = new java.lang.Class[]{r2, r7}     // Catch: java.lang.Throwable -> L9e
            r4.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = "getInt"
            java.lang.Class[] r7 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L9e
            r4.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = "putInt"
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L9e
            java.lang.Class[] r7 = new java.lang.Class[]{r2, r7}     // Catch: java.lang.Throwable -> L9e
            r4.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L9e
            java.lang.Class[] r6 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L9e
            r4.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = "putLong"
            java.lang.Class[] r6 = new java.lang.Class[]{r2, r2}     // Catch: java.lang.Throwable -> L9e
            r4.getMethod(r3, r6)     // Catch: java.lang.Throwable -> L9e
            java.lang.Class[] r3 = new java.lang.Class[]{r2, r2, r2}     // Catch: java.lang.Throwable -> L9e
            r4.getMethod(r0, r3)     // Catch: java.lang.Throwable -> L9e
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2, r1, r2, r2}     // Catch: java.lang.Throwable -> L9e
            r4.getMethod(r0, r1)     // Catch: java.lang.Throwable -> L9e
            r0 = 1
            return r0
        L9e:
            r0 = move-exception
            com.fyber.inneractive.sdk.protobuf.x3.a(r0)
            return r5
        La3:
            com.fyber.inneractive.sdk.protobuf.x3.a(r0)
        La6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.v3.b():boolean");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final double c(Object obj, long j10) {
        return this.f26523a.getDouble(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final float d(Object obj, long j10) {
        return this.f26523a.getFloat(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, byte b10) {
        this.f26523a.putByte(obj, j10, b10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final boolean a(Object obj, long j10) {
        return this.f26523a.getBoolean(obj, j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, boolean z10) {
        this.f26523a.putBoolean(obj, j10, z10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, float f10) {
        this.f26523a.putFloat(obj, j10, f10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(Object obj, long j10, double d10) {
        this.f26523a.putDouble(obj, j10, d10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte a(long j10) {
        return this.f26523a.getByte(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final void a(long j10, byte[] bArr, long j11) {
        this.f26523a.copyMemory((Object) null, j10, bArr, x3.f26540f, j11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w3
    public final byte b(Object obj, long j10) {
        return this.f26523a.getByte(obj, j10);
    }
}
