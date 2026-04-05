package o3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f77459a;

    /* renamed from: b, reason: collision with root package name */
    public static final z.x f77460b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f77461c;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception e10) {
            Log.e("WeightTypeface", e10.getClass().getName(), e10);
            declaredField = null;
        }
        f77459a = declaredField;
        f77460b = new z.x(3);
        f77461c = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(t tVar, Context context, Typeface typeface, int i10, boolean z10) {
        Field field = f77459a;
        Typeface typefaceCreateFromResourcesFontFile = null;
        if (field == null) {
            return null;
        }
        int i11 = (i10 << 1) | (z10 ? 1 : 0);
        synchronized (f77461c) {
            try {
                try {
                    long jLongValue = ((Number) field.get(typeface)).longValue();
                    z.x xVar = f77460b;
                    SparseArray sparseArray = (SparseArray) xVar.get(jLongValue);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        xVar.put(jLongValue, sparseArray);
                    } else {
                        Typeface typeface2 = (Typeface) sparseArray.get(i11);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    long jE = t.e(typeface);
                    n3.f fVar = jE == 0 ? null : (n3.f) tVar.f77458a.get(Long.valueOf(jE));
                    if (fVar != null) {
                        Resources resources = context.getResources();
                        n3.g gVar = (n3.g) t.c(fVar.getEntries(), i10, z10, new r());
                        if (gVar != null) {
                            typefaceCreateFromResourcesFontFile = i.createFromResourcesFontFile(context, resources, gVar.getResourceId(), gVar.getFileName(), 0, 0);
                            long jE2 = t.e(typefaceCreateFromResourcesFontFile);
                            if (jE2 != 0) {
                                tVar.f77458a.put(Long.valueOf(jE2), fVar);
                            }
                        }
                    }
                    if (typefaceCreateFromResourcesFontFile == null) {
                        int i12 = 1;
                        Object[] objArr = i10 >= 600;
                        if (objArr != true && !z10) {
                            i12 = 0;
                        } else if (objArr != true) {
                            i12 = 2;
                        } else if (z10) {
                            i12 = 3;
                        }
                        typefaceCreateFromResourcesFontFile = Typeface.create(typeface, i12);
                    }
                    sparseArray.put(i11, typefaceCreateFromResourcesFontFile);
                    return typefaceCreateFromResourcesFontFile;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
