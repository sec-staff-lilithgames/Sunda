package o3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f77458a = new ConcurrentHashMap();

    public static Object c(Object[] objArr, int i10, boolean z10, s sVar) {
        Object obj = null;
        int i11 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(sVar.getWeight(obj2) - i10) * 2) + (sVar.isItalic(obj2) == z10 ? 0 : 1);
            if (obj == null || i11 > iAbs) {
                obj = obj2;
                i11 = iAbs;
            }
        }
        return obj;
    }

    public static long e(Typeface typeface) throws NoSuchFieldException, SecurityException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e10) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e10);
            return 0L;
        } catch (NoSuchFieldException e11) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e11);
            return 0L;
        }
    }

    public Typeface a(Context context, InputStream inputStream) {
        File tempFile = u.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (u.copyToFile(tempFile, inputStream)) {
                return Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    public Typeface b(Context context, Typeface typeface, int i10, boolean z10) {
        Typeface typefaceA;
        try {
            typefaceA = v.a(this, context, typeface, i10, z10);
        } catch (RuntimeException unused) {
            typefaceA = null;
        }
        return typefaceA == null ? typeface : typefaceA;
    }

    public Typeface createFromFontFamilyFilesResourceEntry(Context context, n3.f fVar, Resources resources, int i10) throws NoSuchFieldException, SecurityException {
        n3.g gVar = (n3.g) c(fVar.getEntries(), (i10 & 1) == 0 ? 400 : IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, (i10 & 2) != 0, new q());
        if (gVar == null) {
            return null;
        }
        Typeface typefaceCreateFromResourcesFontFile = i.createFromResourcesFontFile(context, resources, gVar.getResourceId(), gVar.getFileName(), 0, i10);
        long jE = e(typefaceCreateFromResourcesFontFile);
        if (jE != 0) {
            this.f77458a.put(Long.valueOf(jE), fVar);
        }
        return typefaceCreateFromResourcesFontFile;
    }

    public Typeface createFromFontInfo(Context context, CancellationSignal cancellationSignal, u3.o[] oVarArr, int i10) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (oVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(d(i10, oVarArr).getUri());
            try {
                Typeface typefaceA = a(context, inputStreamOpenInputStream);
                u.closeQuietly(inputStreamOpenInputStream);
                return typefaceA;
            } catch (IOException unused) {
                u.closeQuietly(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpenInputStream;
                u.closeQuietly(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public Typeface createFromFontInfoWithFallback(Context context, CancellationSignal cancellationSignal, List<u3.o[]> list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i10, String str, int i11) {
        File tempFile = u.getTempFile(context);
        if (tempFile == null) {
            return null;
        }
        try {
            if (u.copyToFile(tempFile, resources, i10)) {
                return Typeface.createFromFile(tempFile.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            tempFile.delete();
        }
    }

    public u3.o d(int i10, u3.o[] oVarArr) {
        return (u3.o) c(oVarArr, (i10 & 1) == 0 ? 400 : IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, (i10 & 2) != 0, new p());
    }
}
