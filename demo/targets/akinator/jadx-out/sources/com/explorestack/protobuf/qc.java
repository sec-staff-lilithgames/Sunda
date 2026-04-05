package com.explorestack.protobuf;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class qc extends rc {
    @Override // com.explorestack.protobuf.rc
    public void copyMemory(long j10, byte[] bArr, long j11, long j12) {
        this.f22563a.copyMemory((Object) null, j10, bArr, sc.f22646f + j11, j12);
    }

    @Override // com.explorestack.protobuf.rc
    public boolean getBoolean(Object obj, long j10) {
        return this.f22563a.getBoolean(obj, j10);
    }

    @Override // com.explorestack.protobuf.rc
    public byte getByte(Object obj, long j10) {
        return this.f22563a.getByte(obj, j10);
    }

    @Override // com.explorestack.protobuf.rc
    public double getDouble(Object obj, long j10) {
        return this.f22563a.getDouble(obj, j10);
    }

    @Override // com.explorestack.protobuf.rc
    public float getFloat(Object obj, long j10) {
        return this.f22563a.getFloat(obj, j10);
    }

    @Override // com.explorestack.protobuf.rc
    public int getInt(long j10) {
        return this.f22563a.getInt(j10);
    }

    @Override // com.explorestack.protobuf.rc
    public long getLong(long j10) {
        return this.f22563a.getLong(j10);
    }

    @Override // com.explorestack.protobuf.rc
    public Object getStaticObject(Field field) {
        return getObject(this.f22563a.staticFieldBase(field), this.f22563a.staticFieldOffset(field));
    }

    @Override // com.explorestack.protobuf.rc
    public void putBoolean(Object obj, long j10, boolean z10) {
        this.f22563a.putBoolean(obj, j10, z10);
    }

    @Override // com.explorestack.protobuf.rc
    public void putByte(Object obj, long j10, byte b10) {
        this.f22563a.putByte(obj, j10, b10);
    }

    @Override // com.explorestack.protobuf.rc
    public void putDouble(Object obj, long j10, double d10) {
        this.f22563a.putDouble(obj, j10, d10);
    }

    @Override // com.explorestack.protobuf.rc
    public void putFloat(Object obj, long j10, float f10) {
        this.f22563a.putFloat(obj, j10, f10);
    }

    @Override // com.explorestack.protobuf.rc
    public void putInt(long j10, int i10) {
        this.f22563a.putInt(j10, i10);
    }

    @Override // com.explorestack.protobuf.rc
    public void putLong(long j10, long j11) {
        this.f22563a.putLong(j10, j11);
    }

    @Override // com.explorestack.protobuf.rc
    public boolean supportsUnsafeByteBufferOperations() {
        if (!super.supportsUnsafeByteBufferOperations()) {
            return false;
        }
        try {
            Class<?> cls = this.f22563a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th2) {
            sc.a(th2);
            return false;
        }
    }

    @Override // com.explorestack.protobuf.rc
    public void copyMemory(byte[] bArr, long j10, long j11, long j12) {
        this.f22563a.copyMemory(bArr, sc.f22646f + j10, (Object) null, j11, j12);
    }

    @Override // com.explorestack.protobuf.rc
    public byte getByte(long j10) {
        return this.f22563a.getByte(j10);
    }

    @Override // com.explorestack.protobuf.rc
    public void putByte(long j10, byte b10) {
        this.f22563a.putByte(j10, b10);
    }

    @Override // com.explorestack.protobuf.rc
    public boolean supportsUnsafeArrayOperations() {
        if (!super.supportsUnsafeArrayOperations()) {
            return false;
        }
        try {
            Class<?> cls = this.f22563a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod(PtLatqAYjEFT.PObaJPNbbCEhR, Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            sc.a(th2);
            return false;
        }
    }
}
