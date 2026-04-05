package com.explorestack.protobuf;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class pc extends rc {
    @Override // com.explorestack.protobuf.rc
    public void copyMemory(long j10, byte[] bArr, long j11, long j12) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.rc
    public boolean getBoolean(Object obj, long j10) {
        return sc.f22648h ? sc.j(obj, j10) != 0 : sc.k(obj, j10) != 0;
    }

    @Override // com.explorestack.protobuf.rc
    public byte getByte(Object obj, long j10) {
        return sc.f22648h ? sc.j(obj, j10) : sc.k(obj, j10);
    }

    @Override // com.explorestack.protobuf.rc
    public double getDouble(Object obj, long j10) {
        return Double.longBitsToDouble(getLong(obj, j10));
    }

    @Override // com.explorestack.protobuf.rc
    public float getFloat(Object obj, long j10) {
        return Float.intBitsToFloat(getInt(obj, j10));
    }

    @Override // com.explorestack.protobuf.rc
    public int getInt(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.rc
    public long getLong(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.rc
    public Object getStaticObject(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // com.explorestack.protobuf.rc
    public void putBoolean(Object obj, long j10, boolean z10) {
        if (sc.f22648h) {
            sc.o(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            sc.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.explorestack.protobuf.rc
    public void putByte(Object obj, long j10, byte b10) {
        if (sc.f22648h) {
            sc.o(obj, j10, b10);
        } else {
            sc.p(obj, j10, b10);
        }
    }

    @Override // com.explorestack.protobuf.rc
    public void putDouble(Object obj, long j10, double d10) {
        putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.explorestack.protobuf.rc
    public void putFloat(Object obj, long j10, float f10) {
        putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.explorestack.protobuf.rc
    public void putInt(long j10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.rc
    public void putLong(long j10, long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.rc
    public boolean supportsUnsafeByteBufferOperations() {
        return false;
    }

    @Override // com.explorestack.protobuf.rc
    public void copyMemory(byte[] bArr, long j10, long j11, long j12) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.rc
    public byte getByte(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.explorestack.protobuf.rc
    public void putByte(long j10, byte b10) {
        throw new UnsupportedOperationException();
    }
}
