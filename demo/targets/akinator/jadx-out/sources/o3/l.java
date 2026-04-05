package o3;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l extends j {

    /* renamed from: g, reason: collision with root package name */
    public final Class f77451g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f77452h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f77453i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f77454j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f77455k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f77456l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f77457m;

    public l() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodL;
        Constructor<?> constructor;
        Method methodK;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodK = k(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodL = l(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            methodL = null;
            constructor = null;
            methodK = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f77451g = cls;
        this.f77452h = constructor;
        this.f77453i = methodK;
        this.f77454j = method;
        this.f77455k = method2;
        this.f77456l = method3;
        this.f77457m = methodL;
    }

    public static Method k(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // o3.j, o3.t
    public Typeface b(Context context, Typeface typeface, int i10, boolean z10) {
        Typeface typefaceA;
        try {
            typefaceA = x.a(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? super.b(context, typeface, i10, z10) : typefaceA;
    }

    @Override // o3.j, o3.t
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, n3.f fVar, Resources resources, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f77453i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.createFromFontFamilyFilesResourceEntry(context, fVar, resources, i10);
        }
        try {
            objNewInstance = this.f77452h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            n3.g[] entries = fVar.getEntries();
            int length = entries.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    n3.g gVar = entries[i11];
                    Context context2 = context;
                    if (h(context2, objNewInstance, gVar.getFileName(), gVar.getTtcIndex(), gVar.getWeight(), gVar.isItalic() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.getVariationSettings()))) {
                        i11++;
                        context = context2;
                    } else {
                        try {
                            this.f77456l.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (j(objNewInstance)) {
                    return i(objNewInstance);
                }
            }
        }
        return null;
    }

    @Override // o3.j, o3.t
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, u3.o[] oVarArr, int i10) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Typeface typefaceI;
        boolean zBooleanValue;
        if (oVarArr.length >= 1) {
            Method method = this.f77453i;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    Map<Uri, ByteBuffer> fontInfoIntoByteBuffer = u.readFontInfoIntoByteBuffer(context, oVarArr, cancellationSignal);
                    try {
                        objNewInstance = this.f77452h.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = oVarArr.length;
                        int i11 = 0;
                        boolean z10 = false;
                        while (true) {
                            Method method2 = this.f77456l;
                            if (i11 < length) {
                                u3.o oVar = oVarArr[i11];
                                ByteBuffer byteBuffer = fontInfoIntoByteBuffer.get(oVar.getUri());
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.f77454j.invoke(objNewInstance, byteBuffer, Integer.valueOf(oVar.getTtcIndex()), null, Integer.valueOf(oVar.getWeight()), Integer.valueOf(oVar.isItalic() ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z10 = true;
                                }
                                i11++;
                                z10 = z10;
                            } else if (!z10) {
                                method2.invoke(objNewInstance, null);
                            } else if (j(objNewInstance) && (typefaceI = i(objNewInstance)) != null) {
                                return Typeface.create(typefaceI, i10);
                            }
                        }
                    }
                } else {
                    u3.o oVarD = d(i10, oVarArr);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(oVarD.getUri(), "r", cancellationSignal);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(oVarD.getWeight()).setItalic(oVarD.isItalic()).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // o3.t
    public /* bridge */ /* synthetic */ Typeface createFromFontInfoWithFallback(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        return super.createFromFontInfoWithFallback(context, cancellationSignal, list, i10);
    }

    @Override // o3.t
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i10, String str, int i11) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.f77453i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.createFromResourcesFontFile(context, resources, i10, str, i11);
        }
        try {
            objNewInstance = this.f77452h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!h(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.f77456l.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (j(objNewInstance)) {
                return i(objNewInstance);
            }
        }
        return null;
    }

    public final boolean h(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f77453i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface i(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f77451g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f77457m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean j(Object obj) {
        try {
            return ((Boolean) this.f77455k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method l(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
