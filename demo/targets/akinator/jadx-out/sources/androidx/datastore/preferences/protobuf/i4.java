package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f5907a;

    public i4(Unsafe unsafe) {
        this.f5907a = unsafe;
    }

    public final int arrayBaseOffset(Class<?> cls) {
        return this.f5907a.arrayBaseOffset(cls);
    }

    public final int arrayIndexScale(Class<?> cls) {
        return this.f5907a.arrayIndexScale(cls);
    }

    public abstract void copyMemory(long j10, byte[] bArr, long j11, long j12);

    public abstract void copyMemory(byte[] bArr, long j10, long j11, long j12);

    public abstract boolean getBoolean(Object obj, long j10);

    public abstract byte getByte(long j10);

    public abstract byte getByte(Object obj, long j10);

    public abstract double getDouble(Object obj, long j10);

    public abstract float getFloat(Object obj, long j10);

    public abstract int getInt(long j10);

    public final int getInt(Object obj, long j10) {
        return this.f5907a.getInt(obj, j10);
    }

    public abstract long getLong(long j10);

    public final long getLong(Object obj, long j10) {
        return this.f5907a.getLong(obj, j10);
    }

    public final Object getObject(Object obj, long j10) {
        return this.f5907a.getObject(obj, j10);
    }

    public abstract Object getStaticObject(Field field);

    public final long objectFieldOffset(Field field) {
        return this.f5907a.objectFieldOffset(field);
    }

    public abstract void putBoolean(Object obj, long j10, boolean z10);

    public abstract void putByte(long j10, byte b10);

    public abstract void putByte(Object obj, long j10, byte b10);

    public abstract void putDouble(Object obj, long j10, double d10);

    public abstract void putFloat(Object obj, long j10, float f10);

    public abstract void putInt(long j10, int i10);

    public final void putInt(Object obj, long j10, int i10) {
        this.f5907a.putInt(obj, j10, i10);
    }

    public abstract void putLong(long j10, long j11);

    public final void putLong(Object obj, long j10, long j11) {
        this.f5907a.putLong(obj, j10, j11);
    }

    public final void putObject(Object obj, long j10, Object obj2) {
        this.f5907a.putObject(obj, j10, obj2);
    }

    public boolean supportsUnsafeArrayOperations() {
        Unsafe unsafe = this.f5907a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            j4.a(th2);
            return false;
        }
    }

    public boolean supportsUnsafeByteBufferOperations() {
        Unsafe unsafe = this.f5907a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            return j4.f() != null;
        } catch (Throwable th2) {
            j4.a(th2);
            return false;
        }
    }
}
