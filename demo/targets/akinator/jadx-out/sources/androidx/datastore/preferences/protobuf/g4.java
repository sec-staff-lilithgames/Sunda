package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g4 extends i4 {
    @Override // androidx.datastore.preferences.protobuf.i4
    public void copyMemory(long j10, byte[] bArr, long j11, long j12) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public boolean getBoolean(Object obj, long j10) {
        return j4.f5929h ? j4.j(obj, j10) != 0 : j4.k(obj, j10) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public byte getByte(Object obj, long j10) {
        return j4.f5929h ? j4.j(obj, j10) : j4.k(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public double getDouble(Object obj, long j10) {
        return Double.longBitsToDouble(getLong(obj, j10));
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public float getFloat(Object obj, long j10) {
        return Float.intBitsToFloat(getInt(obj, j10));
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public int getInt(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public long getLong(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public Object getStaticObject(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putBoolean(Object obj, long j10, boolean z10) {
        if (j4.f5929h) {
            j4.o(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            j4.p(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putByte(Object obj, long j10, byte b10) {
        if (j4.f5929h) {
            j4.o(obj, j10, b10);
        } else {
            j4.p(obj, j10, b10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putDouble(Object obj, long j10, double d10) {
        putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putFloat(Object obj, long j10, float f10) {
        putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putInt(long j10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putLong(long j10, long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public boolean supportsUnsafeByteBufferOperations() {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void copyMemory(byte[] bArr, long j10, long j11, long j12) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public byte getByte(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.i4
    public void putByte(long j10, byte b10) {
        throw new UnsupportedOperationException();
    }
}
