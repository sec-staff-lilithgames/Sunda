package o3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends t {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f77447b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f77448c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f77449d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f77450e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f77448c = constructor;
        f77447b = cls;
        f77449d = method2;
        f77450e = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f77449d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f77447b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f77450e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean isUsable() {
        Method method = f77449d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    @Override // o3.t
    public final Typeface b(Context context, Typeface typeface, int i10, boolean z10) {
        Typeface typefaceB;
        try {
            typefaceB = w.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.b(context, typeface, i10, z10) : typefaceB;
    }

    @Override // o3.t
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, n3.f fVar, Resources resources, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        try {
            objNewInstance = f77448c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (n3.g gVar : fVar.getEntries()) {
                ByteBuffer byteBufferCopyToDirectBuffer = u.copyToDirectBuffer(context, resources, gVar.getResourceId());
                if (byteBufferCopyToDirectBuffer != null && f(objNewInstance, byteBufferCopyToDirectBuffer, gVar.getTtcIndex(), gVar.getWeight(), gVar.isItalic())) {
                }
            }
            return g(objNewInstance);
        }
        return null;
    }

    @Override // o3.t
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, u3.o[] oVarArr, int i10) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f77448c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            t1 t1Var = new t1();
            int length = oVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    u3.o oVar = oVarArr[i11];
                    Uri uri = oVar.getUri();
                    ByteBuffer byteBufferMmap = (ByteBuffer) t1Var.get(uri);
                    if (byteBufferMmap == null) {
                        byteBufferMmap = u.mmap(context, cancellationSignal, uri);
                        t1Var.put(uri, byteBufferMmap);
                    }
                    if (byteBufferMmap == null || !f(objNewInstance, byteBufferMmap, oVar.getTtcIndex(), oVar.getWeight(), oVar.isItalic())) {
                        break;
                    }
                    i11++;
                } else {
                    Typeface typefaceG = g(objNewInstance);
                    if (typefaceG != null) {
                        return Typeface.create(typefaceG, i10);
                    }
                }
            }
        }
        return null;
    }
}
