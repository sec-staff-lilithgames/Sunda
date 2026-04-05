package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h4 extends i4 {
    @Override // androidx.datastore.preferences.protobuf.i4
    public void copyMemory(long j10, byte[] bArr, long j11, long j12) {
        this.f5907a.copyMemory((Object) null, j10, bArr, j4.f5927f + j11, j12);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public boolean getBoolean(Object obj, long j10) {
        return this.f5907a.getBoolean(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public byte getByte(Object obj, long j10) {
        return this.f5907a.getByte(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public double getDouble(Object obj, long j10) {
        return this.f5907a.getDouble(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public float getFloat(Object obj, long j10) {
        return this.f5907a.getFloat(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public int getInt(long j10) {
        return this.f5907a.getInt(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public long getLong(long j10) {
        return this.f5907a.getLong(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public Object getStaticObject(Field field) {
        return getObject(this.f5907a.staticFieldBase(field), this.f5907a.staticFieldOffset(field));
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putBoolean(Object obj, long j10, boolean z10) {
        this.f5907a.putBoolean(obj, j10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putByte(Object obj, long j10, byte b10) {
        this.f5907a.putByte(obj, j10, b10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putDouble(Object obj, long j10, double d10) {
        this.f5907a.putDouble(obj, j10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putFloat(Object obj, long j10, float f10) {
        this.f5907a.putFloat(obj, j10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putInt(long j10, int i10) {
        this.f5907a.putInt(j10, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putLong(long j10, long j11) {
        this.f5907a.putLong(j10, j11);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public boolean supportsUnsafeArrayOperations() {
        if (!super.supportsUnsafeArrayOperations()) {
            return false;
        }
        try {
            Class<?> cls = this.f5907a.getClass();
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
            j4.a(th2);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public boolean supportsUnsafeByteBufferOperations() {
        if (!super.supportsUnsafeByteBufferOperations()) {
            return false;
        }
        try {
            Class<?> cls = this.f5907a.getClass();
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
            j4.a(th2);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void copyMemory(byte[] bArr, long j10, long j11, long j12) {
        this.f5907a.copyMemory(bArr, j4.f5927f + j10, (Object) null, j11, j12);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public byte getByte(long j10) {
        return this.f5907a.getByte(j10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putByte(long j10, byte b10) {
        this.f5907a.putByte(j10, b10);
    }
}
