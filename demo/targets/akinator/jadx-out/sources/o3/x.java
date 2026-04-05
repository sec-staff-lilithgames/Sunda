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
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f77468a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f77469b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f77470c;

    /* renamed from: d, reason: collision with root package name */
    public static final z.x f77471d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f77472e;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e10) {
            Log.e("WeightTypeface", e10.getClass().getName(), e10);
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        f77468a = declaredField;
        f77469b = declaredMethod;
        f77470c = declaredConstructor;
        f77471d = new z.x(3);
        f77472e = new Object();
    }

    public static Typeface a(Typeface typeface, int i10, boolean z10) {
        Field field = f77468a;
        Typeface typeface2 = null;
        if (field == null) {
            return null;
        }
        int i11 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f77472e) {
            try {
                try {
                    long j10 = field.getLong(typeface);
                    z.x xVar = f77471d;
                    SparseArray sparseArray = (SparseArray) xVar.get(j10);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        xVar.put(j10, sparseArray);
                    } else {
                        Typeface typeface3 = (Typeface) sparseArray.get(i11);
                        if (typeface3 != null) {
                            return typeface3;
                        }
                    }
                    try {
                        try {
                            Long l9 = (Long) f77469b.invoke(null, Long.valueOf(j10), Integer.valueOf(i10), Boolean.valueOf(z10));
                            l9.longValue();
                            try {
                                typeface2 = (Typeface) f77470c.newInstance(l9);
                            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                            }
                            sparseArray.put(i11, typeface2);
                            return typeface2;
                        } catch (InvocationTargetException e10) {
                            throw new RuntimeException(e10);
                        }
                    } catch (IllegalAccessException e11) {
                        throw new RuntimeException(e11);
                    }
                } catch (IllegalAccessException e12) {
                    throw new RuntimeException(e12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
