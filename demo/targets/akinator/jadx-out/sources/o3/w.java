package o3;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f77462a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f77463b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f77464c;

    /* renamed from: d, reason: collision with root package name */
    public static final Constructor f77465d;

    /* renamed from: e, reason: collision with root package name */
    public static final z.x f77466e;

    /* renamed from: f, reason: collision with root package name */
    public static final Object f77467f;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e10) {
            Log.e("WeightTypeface", e10.getClass().getName(), e10);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
        f77462a = declaredField;
        f77463b = declaredMethod;
        f77464c = declaredMethod2;
        f77465d = declaredConstructor;
        f77466e = new z.x(3);
        f77467f = new Object();
    }

    public static Typeface a(long j10) {
        try {
            return (Typeface) f77465d.newInstance(Long.valueOf(j10));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Typeface b(Typeface typeface, int i10, boolean z10) {
        Typeface typefaceA;
        Field field = f77462a;
        if (field == null) {
            return null;
        }
        int i11 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f77467f) {
            try {
                try {
                    long j10 = field.getLong(typeface);
                    z.x xVar = f77466e;
                    SparseArray sparseArray = (SparseArray) xVar.get(j10);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        xVar.put(j10, sparseArray);
                    } else {
                        Typeface typeface2 = (Typeface) sparseArray.get(i11);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    if (z10 == typeface.isItalic()) {
                        try {
                            typefaceA = a(((Long) f77464c.invoke(null, Long.valueOf(j10), Integer.valueOf(i10))).longValue());
                        } catch (IllegalAccessException e10) {
                            throw new RuntimeException(e10);
                        } catch (InvocationTargetException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        typefaceA = a(c(j10, i10, z10));
                    }
                    sparseArray.put(i11, typefaceA);
                    return typefaceA;
                } catch (IllegalAccessException e12) {
                    throw new RuntimeException(e12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static long c(long j10, int i10, boolean z10) {
        try {
            Long l9 = (Long) f77463b.invoke(null, Long.valueOf(j10), Integer.valueOf(z10 ? 2 : 0));
            l9.longValue();
            return ((Long) f77464c.invoke(null, l9, Integer.valueOf(i10))).longValue();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
