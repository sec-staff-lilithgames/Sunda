package o3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j extends t {

    /* renamed from: b, reason: collision with root package name */
    public static Class f77442b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f77443c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f77444d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f77445e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f77446f = false;

    public static boolean f(String str, boolean z10, int i10, Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        g();
        try {
            return ((Boolean) f77444d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void g() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f77446f) {
            return;
        }
        f77446f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f77443c = constructor;
        f77442b = cls;
        f77444d = method2;
        f77445e = method;
    }

    @Override // o3.t
    public Typeface b(Context context, Typeface typeface, int i10, boolean z10) {
        Typeface typefaceB;
        try {
            typefaceB = w.b(typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceB = null;
        }
        return typefaceB == null ? super.b(context, typeface, i10, z10) : typefaceB;
    }

    @Override // o3.t
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, n3.f fVar, Resources resources, int i10) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        g();
        try {
            Object objNewInstance = f77443c.newInstance(null);
            for (n3.g gVar : fVar.getEntries()) {
                File tempFile = u.getTempFile(context);
                if (tempFile == null) {
                    return null;
                }
                try {
                    if (!u.copyToFile(tempFile, resources, gVar.getResourceId())) {
                        return null;
                    }
                    if (!f(tempFile.getPath(), gVar.isItalic(), gVar.getWeight(), objNewInstance)) {
                        return null;
                    }
                    tempFile.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    tempFile.delete();
                }
            }
            g();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f77442b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f77445e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // o3.t
    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, u3.o[] oVarArr, int i10) throws IOException {
        String str;
        if (oVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(d(i10, oVarArr).getUri(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
            if (file != null && file.canRead()) {
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceCreateFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                Typeface typefaceA = a(context, fileInputStream);
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceA;
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
