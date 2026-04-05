package r7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.applovin.impl.k9;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;
import p0.o2;
import pw.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f83969a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f83970b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f83971c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f83972d = {31, -117, 8};

    public static k0 a(final String str, Callable callable, Runnable runnable) {
        h hVar = str == null ? null : x7.h.getInstance().get(str);
        k0 k0Var = hVar != null ? new k0(hVar) : null;
        HashMap map = f83969a;
        if (str != null && map.containsKey(str)) {
            k0Var = (k0) map.get(str);
        }
        if (k0Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return k0Var;
        }
        k0 k0Var2 = new k0((Callable<i0>) callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i10 = 0;
            k0Var2.addListener(new e0() { // from class: r7.n
                @Override // r7.e0
                public final void onResult(Object obj) {
                    switch (i10) {
                        case 0:
                            HashMap map2 = o.f83969a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                o.e();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = o.f83969a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                o.e();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i11 = 1;
            k0Var2.addFailureListener(new e0() { // from class: r7.n
                @Override // r7.e0
                public final void onResult(Object obj) {
                    switch (i11) {
                        case 0:
                            HashMap map2 = o.f83969a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                o.e();
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = o.f83969a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                o.e();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, k0Var2);
                if (map.size() == 1) {
                    e();
                }
            }
        }
        return k0Var2;
    }

    public static i0 b(d8.c cVar, String str, boolean z10) throws IOException {
        h hVar;
        try {
            if (str == null) {
                hVar = null;
            } else {
                try {
                    hVar = x7.h.getInstance().get(str);
                } catch (Exception e10) {
                    i0 i0Var = new i0((Throwable) e10);
                    if (z10) {
                        e8.n.closeQuietly(cVar);
                    }
                    return i0Var;
                }
            }
            if (hVar != null) {
                i0 i0Var2 = new i0(hVar);
                if (z10) {
                    e8.n.closeQuietly(cVar);
                }
                return i0Var2;
            }
            h hVar2 = c8.w.parse(cVar);
            if (str != null) {
                x7.h.getInstance().put(str, hVar2);
            }
            i0 i0Var3 = new i0(hVar2);
            if (z10) {
                e8.n.closeQuietly(cVar);
            }
            return i0Var3;
        } catch (Throwable th2) {
            if (z10) {
                e8.n.closeQuietly(cVar);
            }
            throw th2;
        }
    }

    public static i0 c(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        h hVar;
        d0 next;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            hVar = null;
        } else {
            try {
                hVar = x7.h.getInstance().get(str);
            } catch (IOException e10) {
                return new i0((Throwable) e10);
            }
        }
        if (hVar != null) {
            return new i0(hVar);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        h hVar2 = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                hVar2 = (h) b(d8.c.of(pw.h0.buffer(pw.h0.source(zipInputStream))), null, false).getValue();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new i0((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i10 = zipInputStream.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i10);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } finally {
                    }
                } catch (Throwable th4) {
                    e8.e.warning("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th4);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    e8.e.warning("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (hVar2 == null) {
            return new i0((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator<d0> it = hVar2.getImages().values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getFileName().equals(str4)) {
                    break;
                }
            }
            if (next != null) {
                next.setBitmap(e8.n.resizeBitmapIfNeeded((Bitmap) entry.getValue(), next.getWidth(), next.getHeight()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z10 = false;
            for (x7.d dVar : hVar2.getFonts().values()) {
                if (dVar.getFamily().equals(entry2.getKey())) {
                    dVar.setTypeface((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                e8.e.warning("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, d0>> it2 = hVar2.getImages().entrySet().iterator();
            while (it2.hasNext()) {
                d0 value = it2.next().getValue();
                if (value == null) {
                    return null;
                }
                String fileName = value.getFileName();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            value.setBitmap(e8.n.resizeBitmapIfNeeded(bitmapDecodeByteArray, value.getWidth(), value.getHeight()));
                        }
                    } catch (IllegalArgumentException e11) {
                        e8.e.warning("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            x7.h.getInstance().put(str, hVar2);
        }
        return new i0(hVar2);
    }

    public static void clearCache(Context context) {
        clearCache(context, true);
    }

    public static Boolean d(pw.k kVar, byte[] bArr) {
        try {
            pw.k kVarPeek = kVar.peek();
            for (byte b10 : bArr) {
                if (kVarPeek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            kVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            e8.e.error("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static void e() {
        ArrayList arrayList = new ArrayList(f83970b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String f(Context context, int i10) {
        return o2.l(i10, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }

    public static k0 fromAsset(Context context, String str) {
        return fromAsset(context, str, "asset_" + str);
    }

    public static i0 fromAssetSync(Context context, String str) {
        return fromAssetSync(context, str, "asset_" + str);
    }

    public static k0 fromInputStream(Context context, InputStream inputStream, String str) {
        return a(str, new ci.f(context == null ? null : context.getApplicationContext(), 5, inputStream, str), null);
    }

    public static i0 fromInputStreamSync(Context context, InputStream inputStream, String str) {
        h hVar = str == null ? null : x7.h.getInstance().get(str);
        if (hVar != null) {
            return new i0(hVar);
        }
        try {
            pw.k kVarBuffer = pw.h0.buffer(pw.h0.source(inputStream));
            return d(kVarBuffer, f83971c).booleanValue() ? fromZipStreamSync(context, new ZipInputStream(kVarBuffer.inputStream()), str) : d(kVarBuffer, f83972d).booleanValue() ? fromJsonInputStreamSync(new GZIPInputStream(kVarBuffer.inputStream()), str) : fromJsonReaderSync(d8.c.of(kVarBuffer), str);
        } catch (IOException e10) {
            return new i0((Throwable) e10);
        }
    }

    @Deprecated
    public static k0 fromJson(JSONObject jSONObject, String str) {
        return a(str, new com.google.firebase.messaging.m(15, jSONObject, str), null);
    }

    public static k0 fromJsonInputStream(InputStream inputStream, String str) {
        return a(str, new com.google.firebase.messaging.m(14, inputStream, str), new on.w(inputStream, 8));
    }

    public static i0 fromJsonInputStreamSync(InputStream inputStream, String str) {
        return fromJsonInputStreamSync(inputStream, str, true);
    }

    public static k0 fromJsonReader(d8.c cVar, String str) {
        return a(str, new com.google.firebase.messaging.m(12, cVar, str), new on.w(cVar, 6));
    }

    public static i0 fromJsonReaderSync(d8.c cVar, String str) {
        return fromJsonReaderSync(cVar, str, true);
    }

    public static k0 fromJsonSource(b1 b1Var, String str) {
        return a(str, new com.google.firebase.messaging.m(13, b1Var, str), new on.w(b1Var, 7));
    }

    public static i0 fromJsonSourceSync(b1 b1Var, String str) {
        return fromJsonSourceSync(b1Var, str, true);
    }

    public static k0 fromJsonString(String str, String str2) {
        return a(str2, new com.google.firebase.messaging.m(11, str, str2), null);
    }

    public static i0 fromJsonStringSync(String str, String str2) {
        return fromJsonSourceSync(pw.h0.source(new ByteArrayInputStream(str.getBytes())), str2);
    }

    @Deprecated
    public static i0 fromJsonSync(JSONObject jSONObject, String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static k0 fromRawRes(Context context, int i10) {
        return fromRawRes(context, i10, f(context, i10));
    }

    public static i0 fromRawResSync(Context context, int i10) {
        return fromRawResSync(context, i10, f(context, i10));
    }

    public static k0 fromUrl(Context context, String str) {
        return fromUrl(context, str, "url_" + str);
    }

    public static i0 fromUrlSync(Context context, String str) {
        return fromUrlSync(context, str, str);
    }

    public static k0 fromZipStream(ZipInputStream zipInputStream, String str) {
        return fromZipStream((Context) null, zipInputStream, str);
    }

    public static i0 fromZipStreamSync(ZipInputStream zipInputStream, String str) {
        return fromZipStreamSync(zipInputStream, str, true);
    }

    public static void registerLottieTaskIdleListener(l0 l0Var) {
        f83970b.add(l0Var);
        f83969a.size();
        l0Var.a();
    }

    public static void setMaxCacheSize(int i10) {
        x7.h.getInstance().resize(i10);
    }

    public static void unregisterLottieTaskIdleListener(l0 l0Var) {
        f83970b.remove(l0Var);
    }

    public static void clearCache(Context context, boolean z10) {
        b8.g gVarNetworkCache;
        f83969a.clear();
        x7.h.getInstance().clear();
        if (!z10 || (gVarNetworkCache = d.networkCache(context)) == null) {
            return;
        }
        gVarNetworkCache.clear();
    }

    public static k0 fromJsonInputStream(final InputStream inputStream, final String str, final boolean z10) {
        return a(str, new Callable() { // from class: r7.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return o.fromJsonInputStreamSync(inputStream, str, z10);
            }
        }, new k9(z10, inputStream, 11));
    }

    public static i0 fromJsonInputStreamSync(InputStream inputStream, String str, boolean z10) {
        return fromJsonSourceSync(pw.h0.source(inputStream), str, z10);
    }

    public static i0 fromJsonReaderSync(d8.c cVar, String str, boolean z10) {
        return b(cVar, str, z10);
    }

    public static i0 fromJsonSourceSync(b1 b1Var, String str, boolean z10) {
        return b(d8.c.of(pw.h0.buffer(b1Var)), str, z10);
    }

    public static k0 fromRawRes(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: r7.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return o.fromRawResSync(context2, i10, str);
            }
        }, null);
    }

    public static i0 fromRawResSync(Context context, int i10, String str) {
        h hVar = str == null ? null : x7.h.getInstance().get(str);
        if (hVar != null) {
            return new i0(hVar);
        }
        try {
            pw.k kVarBuffer = pw.h0.buffer(pw.h0.source(context.getResources().openRawResource(i10)));
            if (d(kVarBuffer, f83971c).booleanValue()) {
                return fromZipStreamSync(context, new ZipInputStream(kVarBuffer.inputStream()), str);
            }
            if (!d(kVarBuffer, f83972d).booleanValue()) {
                return fromJsonReaderSync(d8.c.of(kVarBuffer), str);
            }
            try {
                return fromJsonInputStreamSync(new GZIPInputStream(kVarBuffer.inputStream()), str);
            } catch (IOException e10) {
                return new i0((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new i0((Throwable) e11);
        }
    }

    public static k0 fromUrl(Context context, String str, String str2) {
        return a(str2, new j(context, str, str2, 1), null);
    }

    public static i0 fromUrlSync(Context context, String str, String str2) throws IOException {
        h hVar = str2 == null ? null : x7.h.getInstance().get(str2);
        if (hVar != null) {
            return new i0(hVar);
        }
        i0 i0VarFetchSync = d.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && i0VarFetchSync.getValue() != null) {
            x7.h.getInstance().put(str2, (h) i0VarFetchSync.getValue());
        }
        return i0VarFetchSync;
    }

    public static k0 fromZipStream(ZipInputStream zipInputStream, String str, boolean z10) {
        return fromZipStream(null, zipInputStream, str, z10);
    }

    public static i0 fromZipStreamSync(ZipInputStream zipInputStream, String str, boolean z10) {
        return fromZipStreamSync(null, zipInputStream, str, z10);
    }

    public static k0 fromAsset(Context context, String str, String str2) {
        return a(str2, new j(context.getApplicationContext(), str, str2, 0), null);
    }

    public static i0 fromAssetSync(Context context, String str, String str2) {
        h hVar = str2 == null ? null : x7.h.getInstance().get(str2);
        if (hVar != null) {
            return new i0(hVar);
        }
        try {
            return fromInputStreamSync(context, context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new i0((Throwable) e10);
        }
    }

    public static k0 fromZipStream(Context context, ZipInputStream zipInputStream, String str) {
        return a(str, new k(context, zipInputStream, str, 0), new l(zipInputStream, 0));
    }

    public static i0 fromZipStreamSync(Context context, ZipInputStream zipInputStream, String str) {
        return fromZipStreamSync(context, zipInputStream, str, true);
    }

    public static k0 fromZipStream(Context context, ZipInputStream zipInputStream, String str, boolean z10) {
        return a(str, new k(context, zipInputStream, str, 1), z10 ? new l(zipInputStream, 1) : null);
    }

    public static i0 fromZipStreamSync(Context context, ZipInputStream zipInputStream, String str, boolean z10) throws IOException {
        try {
            return c(context, zipInputStream, str);
        } finally {
            if (z10) {
                e8.n.closeQuietly(zipInputStream);
            }
        }
    }
}
