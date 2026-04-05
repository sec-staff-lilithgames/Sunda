package com.bytedance.adsdk.jd;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.jd.my.dt;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {
    private static final Map<String, au<qk>> jpo = new HashMap();

    /* renamed from: jd, reason: collision with root package name */
    private static final Set<Object> f17590jd = new HashSet();
    private static final byte[] wqx = {80, 75, 3, 4};

    public static au<qk> jd(Context context, String str) {
        return jd(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static Cif<qk> wqx(Context context, String str) {
        return wqx(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static au<qk> jd(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return jpo(str2, new Callable<Cif<qk>>() { // from class: com.bytedance.adsdk.jd.xyk.4
            @Override // java.util.concurrent.Callable
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public Cif<qk> call() throws Exception {
                return xyk.wqx(applicationContext, str, str2);
            }
        });
    }

    public static au<qk> jpo(Context context, String str) {
        return jpo(context, str, "url_".concat(String.valueOf(str)));
    }

    public static Cif<qk> wqx(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return jd(context.getAssets().open(str), str2);
            }
            return jpo(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new Cif<>((Throwable) e10);
        }
    }

    public static au<qk> jpo(final Context context, final String str, final String str2) {
        return jpo(str2, new Callable<Cif<qk>>() { // from class: com.bytedance.adsdk.jd.xyk.1
            @Override // java.util.concurrent.Callable
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public Cif<qk> call() throws Exception {
                Cif<qk> cifJpo = my.jpo(context).jpo(context, str, str2);
                if (str2 != null && cifJpo.jpo() != null) {
                    com.bytedance.adsdk.jd.wqx.my.jpo().jpo(str2, cifJpo.jpo());
                }
                return cifJpo;
            }
        });
    }

    public static Cif<qk> jd(Context context, int i10) {
        return jd(context, i10, wqx(context, i10));
    }

    public static au<qk> jpo(Context context, int i10) {
        return jpo(context, i10, wqx(context, i10));
    }

    public static Cif<qk> jd(Context context, int i10, String str) {
        try {
            return jd(context.getResources().openRawResource(i10), wqx(context, i10));
        } catch (Resources.NotFoundException e10) {
            return new Cif<>((Throwable) e10);
        }
    }

    public static au<qk> jpo(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return jpo(str, new Callable<Cif<qk>>() { // from class: com.bytedance.adsdk.jd.xyk.5
            @Override // java.util.concurrent.Callable
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public Cif<qk> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return xyk.jd(context2, i10, str);
            }
        });
    }

    private static String wqx(Context context, int i10) {
        return o2.l(i10, jpo(context) ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }

    public static Cif<qk> jd(InputStream inputStream, String str) {
        return jpo(inputStream, str, true);
    }

    private static Cif<qk> jd(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            qk qkVarJpo = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    qkVarJpo = jpo(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).jpo();
                } else if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
                    if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                        zipInputStream.closeEntry();
                    } else if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split("/");
                        String str2 = strArrSplit[strArrSplit.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i10 = zipInputStream.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th4) {
                                        th2.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            file.getAbsolutePath();
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    }
                } else if (name.contains("../")) {
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    String[] strArrSplit2 = name.split("/");
                    map.put(strArrSplit2[strArrSplit2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (qkVarJpo == null) {
                return new Cif<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                yd ydVarJpo = jpo(qkVarJpo, (String) entry.getKey());
                if (ydVarJpo != null) {
                    ydVarJpo.jpo(com.bytedance.adsdk.jd.jj.jj.jpo((Bitmap) entry.getValue(), ydVarJpo.jpo(), ydVarJpo.jd()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z10 = false;
                for (com.bytedance.adsdk.jd.wqx.wqx wqxVar : qkVarJpo.prr().values()) {
                    if (wqxVar.jpo().equals(entry2.getKey())) {
                        wqxVar.jpo((Typeface) entry2.getValue());
                        z10 = true;
                    }
                }
                if (!z10) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, yd>> it = qkVarJpo.hna().entrySet().iterator();
                while (it.hasNext()) {
                    yd value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strZz = value.zz();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strZz.startsWith("data:") && strZz.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strZz.substring(strZz.indexOf(44) + 1), 0);
                            value.jpo(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, yd> entry3 : qkVarJpo.hna().entrySet()) {
                if (entry3.getValue().ju() == null) {
                    return new Cif<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().zz()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.jd.wqx.my.jpo().jpo(str, qkVarJpo);
            }
            return new Cif<>(qkVarJpo);
        } catch (IOException e10) {
            return new Cif<>((Throwable) e10);
        }
    }

    private static boolean jpo(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static au<qk> jpo(final InputStream inputStream, final String str) {
        return jpo(str, new Callable<Cif<qk>>() { // from class: com.bytedance.adsdk.jd.xyk.6
            @Override // java.util.concurrent.Callable
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public Cif<qk> call() throws Exception {
                return xyk.jd(inputStream, str);
            }
        });
    }

    private static Cif<qk> jpo(InputStream inputStream, String str, boolean z10) throws IOException {
        try {
            return jpo(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z10) {
                com.bytedance.adsdk.jd.jj.jj.jpo(inputStream);
            }
        }
    }

    public static Cif<qk> jpo(JsonReader jsonReader, String str) {
        return jpo(jsonReader, str, true);
    }

    private static Cif<qk> jpo(JsonReader jsonReader, String str, boolean z10) throws IOException {
        try {
            try {
                qk qkVarJpo = dt.jpo(jsonReader);
                com.bytedance.adsdk.jd.wqx.my.jpo().jpo(str, qkVarJpo);
                Cif<qk> cif = new Cif<>(qkVarJpo);
                if (z10) {
                    jpo(jsonReader);
                }
                return cif;
            } catch (Exception e10) {
                Cif<qk> cif2 = new Cif<>(e10);
                if (z10) {
                    jpo(jsonReader);
                }
                return cif2;
            }
        } catch (Throwable th2) {
            if (z10) {
                jpo(jsonReader);
            }
            throw th2;
        }
    }

    public static void jpo(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static Cif<qk> jpo(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return jd(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.jd.jj.jj.jpo(zipInputStream);
        }
    }

    private static yd jpo(qk qkVar, String str) {
        for (yd ydVar : qkVar.hna().values()) {
            if (ydVar.zz().equals(str)) {
                return ydVar;
            }
        }
        return null;
    }

    private static au<qk> jpo(final String str, Callable<Cif<qk>> callable) {
        final qk qkVarJpo = str == null ? null : com.bytedance.adsdk.jd.wqx.my.jpo().jpo(str);
        if (qkVarJpo != null) {
            return new au<>(new Callable<Cif<qk>>() { // from class: com.bytedance.adsdk.jd.xyk.7
                @Override // java.util.concurrent.Callable
                /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
                public Cif<qk> call() throws Exception {
                    return new Cif<>(qkVarJpo);
                }
            });
        }
        if (str != null) {
            Map<String, au<qk>> map = jpo;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        au<qk> auVar = new au<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            auVar.jpo(new ju<qk>() { // from class: com.bytedance.adsdk.jd.xyk.2
                @Override // com.bytedance.adsdk.jd.ju
                public void jpo(qk qkVar) {
                    xyk.jpo.remove(str);
                    atomicBoolean.set(true);
                    if (xyk.jpo.size() == 0) {
                        xyk.jd(true);
                    }
                }
            });
            auVar.wqx(new ju<Throwable>() { // from class: com.bytedance.adsdk.jd.xyk.3
                @Override // com.bytedance.adsdk.jd.ju
                public void jpo(Throwable th2) {
                    xyk.jpo.remove(str);
                    atomicBoolean.set(true);
                    if (xyk.jpo.size() == 0) {
                        xyk.jd(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, au<qk>> map2 = jpo;
                map2.put(str, auVar);
                if (map2.size() == 1) {
                    jd(false);
                }
            }
        }
        return auVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(boolean z10) {
        ArrayList arrayList = new ArrayList(f17590jd);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10);
        }
    }
}
