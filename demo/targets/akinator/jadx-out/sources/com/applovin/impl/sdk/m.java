package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import b0.e2;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.a4;
import com.applovin.impl.b6;
import com.applovin.impl.c2;
import com.applovin.impl.f2;
import com.applovin.impl.g2;
import com.applovin.impl.g5;
import com.applovin.impl.k7;
import com.applovin.impl.o0;
import com.applovin.impl.p6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    private final k f15523b;

    /* renamed from: c, reason: collision with root package name */
    private final o f15524c;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15527f;

    /* renamed from: a, reason: collision with root package name */
    private final String f15522a = "FileManager";

    /* renamed from: d, reason: collision with root package name */
    private final Object f15525d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Set f15526e = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final f2 f15528g = a();

    public m(k kVar) {
        this.f15523b = kVar;
        this.f15524c = kVar.O();
        this.f15527f = ((Boolean) kVar.a(v4.U0)).booleanValue();
    }

    private boolean e(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f15525d) {
            try {
                if (this.f15526e.contains(absolutePath)) {
                    return false;
                }
                d(file);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean g(File file) {
        if (o.a()) {
            this.f15524c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            d(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
                mapHashMap.put("details", b(file));
                this.f15523b.E().a(c2.D0, "removeFile", mapHashMap);
            }
            h(file);
            return zDelete;
        } catch (Throwable th2) {
            try {
                if (o.a()) {
                    this.f15524c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th2);
                }
                this.f15523b.E().a("FileManager", "removeFile", th2);
                h(file);
                return false;
            } catch (Throwable th3) {
                h(file);
                throw th3;
            }
        }
    }

    private void h(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f15525d) {
            try {
                if (!this.f15526e.remove(absolutePath)) {
                    this.f15523b.E().a(c2.D0, "unlockFile", CollectionUtils.hashMap("path", absolutePath));
                }
                this.f15525d.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f15523b.r0().a((g5) new p6(this.f15523b, false, "removeCachedResourcesForAd", new z(this, bVar, context, 0)), b6.b.CACHING);
    }

    public void d(com.applovin.impl.sdk.ad.b bVar, Context context) {
        this.f15523b.r0().a((g5) new p6(this.f15523b, false, "removeCachedVideoResourceForAd", new z(this, bVar, context, 1)), b6.b.CACHING);
    }

    public String f(File file) {
        if (file == null) {
            return null;
        }
        if (o.a()) {
            this.f15524c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        boolean z10 = true;
        try {
            try {
                try {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                d(file);
                                String strA = a(fileInputStream);
                                boolean z11 = strA == null;
                                fileInputStream.close();
                                if (z11 && ((Boolean) this.f15523b.a(v4.M0)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                h(file);
                                return strA;
                            } catch (Throwable th2) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (z10 && ((Boolean) this.f15523b.a(v4.M0)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            h(file);
                            throw th;
                        }
                    } catch (IOException e10) {
                        if (o.a()) {
                            this.f15524c.a("FileManager", "Failed to read file: " + file.getName() + e10);
                        }
                        this.f15524c.a("FileManager", e10);
                        this.f15523b.E().a("FileManager", "readFileIO", e10);
                        if (((Boolean) this.f15523b.a(v4.M0)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        h(file);
                        return null;
                    }
                } catch (Throwable th5) {
                    if (o.a()) {
                        this.f15524c.a("FileManager", "Unknown failure to read file.", th5);
                    }
                    this.f15524c.a("FileManager", th5);
                    this.f15523b.E().a("FileManager", "readFile", th5);
                    if (((Boolean) this.f15523b.a(v4.M0)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    h(file);
                    return null;
                }
            } catch (FileNotFoundException e11) {
                if (o.a()) {
                    this.f15524c.d("FileManager", "File not found. " + e11);
                }
                this.f15524c.a("FileManager", e11);
                this.f15523b.E().a("FileManager", "readFileNotFound", e11);
                if (0 != 0 && ((Boolean) this.f15523b.a(v4.M0)).booleanValue()) {
                    a(file, "removeFileAfterReadFail");
                }
                h(file);
                return null;
            }
        } catch (Throwable th6) {
            th = th6;
            z10 = false;
        }
    }

    private f2 a() {
        if (o0.e() && ((Boolean) this.f15523b.a(v4.f16011q3)).booleanValue()) {
            try {
                return new a4(this.f15523b);
            } catch (Throwable th2) {
                if (o.a()) {
                    this.f15524c.a("FileManager", "Error instantiating OkHttpLoader, falling back to HttpUrlConnectionLoader", th2);
                }
                this.f15523b.E().a("FileManager", "instantiateOkHttpLoader", th2);
            }
        }
        return new g2(this.f15523b);
    }

    private boolean c(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f15525d) {
            zContains = this.f15526e.contains(absolutePath);
        }
        return zContains;
    }

    private void d(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.f15525d) {
            boolean zAdd = this.f15526e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.f15525d.wait();
                    zAdd = this.f15526e.add(absolutePath);
                } catch (InterruptedException e10) {
                    if (o.a()) {
                        this.f15524c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e10);
                    }
                    throw new RuntimeException(e10);
                }
            }
        }
    }

    public void b(Context context) {
        if (this.f15523b.F0()) {
            if (o.a()) {
                this.f15524c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (bVar.v0() == null) {
            return;
        }
        g(a(bVar.v0().getLastPathSegment(), context));
    }

    private List c(Context context) {
        File[] fileArrListFiles;
        File fileD = d(context);
        if (fileD.isDirectory() && (fileArrListFiles = fileD.listFiles()) != null) {
            return Arrays.asList(fileArrListFiles);
        }
        return Collections.EMPTY_LIST;
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (o.a()) {
                this.f15524c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (o.a()) {
                this.f15524c.b("FileManager", "Failed to create .nomedia file");
            }
            this.f15523b.E().a(c2.D0, "createNoMediaFile");
        } catch (IOException e10) {
            if (o.a()) {
                this.f15524c.a("FileManager", "Failed to create .nomedia file", e10);
            }
        }
    }

    private File a(String str, boolean z10, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f15524c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (o.a()) {
            e2.y("Looking up cached resource: ", str, this.f15524c, "FileManager");
        }
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        File fileD = d(context);
        File file = new File(fileD, str);
        if (!z10) {
            return file;
        }
        try {
            fileD.mkdirs();
            return file;
        } catch (Throwable th2) {
            if (o.a()) {
                this.f15524c.a("FileManager", "Unable to make cache directory at " + fileD, th2);
            }
            this.f15523b.E().a("FileManager", "createCacheDir", th2);
            return null;
        }
    }

    private String b(File file) {
        try {
            boolean zExists = file.exists();
            boolean zIsDirectory = file.isDirectory();
            String[] list = file.list();
            boolean z10 = false;
            boolean z11 = zIsDirectory && list != null && list.length == 0;
            File parentFile = file.getParentFile();
            boolean z12 = parentFile != null && parentFile.exists();
            if (z12 && parentFile.canWrite()) {
                z10 = true;
            }
            return "fileExists: " + zExists + "\nisDirectory: " + zIsDirectory + "\nisEmptyDirectory: " + z11 + "\nparentDirectoryExists: " + z12 + "\nisParentDirectoryWritable: " + z10;
        } catch (Throwable th2) {
            return "Error retrieving file deletion failure reason: " + th2;
        }
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), CampaignEx.JSON_KEY_AD_AL);
    }

    public boolean c(String str, Context context) {
        if (this.f15527f) {
            return b(str, context);
        }
        boolean z10 = false;
        File fileA = a(str, false, context);
        if (!e(fileA)) {
            return false;
        }
        if (fileA.exists() && !fileA.isDirectory()) {
            z10 = true;
        }
        h(fileA);
        return z10;
    }

    private long b() {
        long jLongValue = ((Long) this.f15523b.a(v4.B0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    public String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i10 = inputStream.read(bArr, 0, Segment.SIZE);
                    if (i10 >= 0) {
                        byteArrayOutputStream.write(bArr, 0, i10);
                    } else {
                        String string = byteArrayOutputStream.toString(C.UTF8_NAME);
                        byteArrayOutputStream.close();
                        return string;
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f15524c.a("FileManager", th2);
            this.f15523b.E().a("FileManager", "readInputStreamAsString", th2);
            return null;
        }
    }

    public boolean a(InputStream inputStream, File file, boolean z10) {
        return a(inputStream, file, z10, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02f9 A[Catch: all -> 0x02ff, TRY_LEAVE, TryCatch #24 {all -> 0x02ff, blocks: (B:184:0x02f3, B:186:0x02f9), top: B:269:0x02f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0266 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0325 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x02bc A[EDGE_INSN: B:272:0x02bc->B:166:0x02bc BREAK  A[LOOP:1: B:139:0x025f->B:273:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014a A[Catch: all -> 0x0150, TryCatch #12 {all -> 0x0150, blocks: (B:73:0x0144, B:75:0x014a, B:78:0x0153), top: B:247:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.InputStream r20, java.io.File r21, boolean r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.m.a(java.io.InputStream, java.io.File, boolean, boolean):boolean");
    }

    public boolean a(File file, String str, List list, int i10, String str2, Map map) {
        return a(file, str, list, true, i10, str2, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean a(File file, String str, List list, boolean z10, int i10, String str2, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        Map map2 = map;
        mapHashMap.putAll(map2);
        this.f15523b.g().d(c2.f13745x, mapHashMap);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i11 = 1;
        while (i11 <= i10) {
            if (a(file, str, list, z10, str2, map2)) {
                a(true, str, i11, jElapsedRealtime, map);
                return true;
            }
            i11++;
            map2 = map;
        }
        a(false, str, i10, jElapsedRealtime, map);
        return false;
    }

    private boolean a(File file, String str, List list, boolean z10, String str2, Map map) {
        Boolean bool = (Boolean) this.f15523b.a(v4.V0);
        if (bool.booleanValue()) {
            d(file);
        }
        if (a(file)) {
            if (o.a()) {
                e2.y("File exists for ", str, this.f15524c, "FileManager");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
            mapHashMap.putAll(map);
            this.f15523b.g().d(c2.f13747y, mapHashMap);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            InputStream inputStreamA = a(str, list, z10, map);
            try {
                if (o.a()) {
                    this.f15524c.a("FileManager", "Caching " + file.getAbsolutePath() + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                boolean zA = a(inputStreamA, file, false, bool.booleanValue());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (zA) {
                    if (o.a()) {
                        this.f15524c.a("FileManager", "Caching completed for " + file);
                    }
                    double d10 = k7.d(jElapsedRealtime2);
                    double dC = k7.c(file.length());
                    long j10 = (long) (dC / d10);
                    Map mapA = a(file, str, jElapsedRealtime2, map);
                    CollectionUtils.putObjectToStringIfValid("network_throughput_kbps", Long.valueOf(j10), mapA);
                    CollectionUtils.putObjectToStringIfValid("details", Double.valueOf(dC), mapA);
                    this.f15523b.g().d(c2.D, mapA);
                    this.f15523b.d0().b(j10, str, str2);
                } else {
                    if (o.a()) {
                        this.f15524c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
                    }
                    this.f15523b.g().d(c2.E, a(file, str, jElapsedRealtime2, map));
                }
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                if (bool.booleanValue()) {
                    h(file);
                }
                return zA;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                this.f15524c.a("FileManager", th2);
                this.f15523b.E().a("FileManager", "loadAndCacheResource", th2);
                if (bool.booleanValue()) {
                    h(file);
                }
                return false;
            } finally {
                if (bool.booleanValue()) {
                    h(file);
                }
            }
        }
    }

    private Map a(File file, String str, long j10, Map map) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
        CollectionUtils.putStringIfValid("url", str, mapHashMap);
        CollectionUtils.putObjectToStringIfValid("duration_ms", Long.valueOf(j10), mapHashMap);
        mapHashMap.putAll(map);
        return mapHashMap;
    }

    private void a(boolean z10, String str, int i10, long j10, Map map) {
        c2 c2Var = z10 ? c2.f13749z : c2.A;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        HashMap map2 = new HashMap(3);
        map2.put("attempt_number", Integer.toString(i10));
        map2.put("url", str);
        map2.put("duration_ms", String.valueOf(jElapsedRealtime));
        map2.putAll(map);
        this.f15523b.g().d(c2Var, map2);
    }

    public InputStream a(String str, List list, boolean z10, Map map) {
        if (z10 && !k7.a(str, list)) {
            if (o.a()) {
                e2.y("Domain is not whitelisted, skipping precache for url: ", str, this.f15524c, "FileManager");
            }
            return null;
        }
        String httpsString = StringUtils.toHttpsString(str);
        if (o.a()) {
            this.f15524c.a("FileManager", "Loading " + httpsString + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", httpsString);
        mapHashMap.putAll(map);
        this.f15523b.g().d(c2.B, mapHashMap);
        try {
            return this.f15528g.a(httpsString, map);
        } catch (Throwable th2) {
            if (o.a()) {
                this.f15524c.a("FileManager", "Error loading " + httpsString, th2);
            }
            this.f15523b.E().a("FileManager", "loadResource", th2, CollectionUtils.hashMap("url", httpsString));
            return null;
        }
    }

    public int a(String str, com.applovin.impl.sdk.ad.b bVar) {
        List listD0 = bVar.d0();
        if (bVar.Z0() || listD0.contains(str)) {
            return bVar.L();
        }
        return 1;
    }

    public String a(Context context, String str, String str2, List list, boolean z10, int i10, String str3, Map map) {
        return a(context, str, str2, list, z10, false, i10, str3, map);
    }

    public String a(Context context, String str, String str2, List list, boolean z10, boolean z11, int i10, String str3, Map map) {
        if (!StringUtils.isValidString(str)) {
            if (o.a()) {
                this.f15524c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.f15523b.E().a(c2.D0, "cacheResource");
            return null;
        }
        String strA = k7.a(Uri.parse(str), str2, this.f15523b);
        File fileA = a(strA, context);
        if (!a(fileA, str, list, z10, i10, str3, map)) {
            return null;
        }
        if (o.a()) {
            e2.y("Caching succeeded for file ", strA, this.f15524c, "FileManager");
        }
        return z11 ? Uri.fromFile(fileA).toString() : strA;
    }

    private long a(Context context) {
        boolean zG;
        long jB = b();
        boolean z10 = jB != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listC = this.f15523b.c(v4.G0);
        long length = 0;
        for (File file : c(context)) {
            if (!z10 || listC.contains(file.getName()) || c(file) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= jB) {
                zG = false;
            } else {
                if (o.a()) {
                    this.f15524c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                zG = g(file);
            }
            if (!zG) {
                length += file.length();
            }
        }
        return length;
    }

    private void a(long j10, Context context) {
        long jIntValue = ((Integer) this.f15523b.a(v4.C0)).intValue();
        if (jIntValue == -1) {
            if (o.a()) {
                this.f15524c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j10) > jIntValue) {
                if (o.a()) {
                    this.f15524c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    g((File) it.next());
                }
                return;
            }
            if (o.a()) {
                this.f15524c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        ArrayList arrayList = new ArrayList(bVar.l());
        CollectionUtils.addObjectIfExists(bVar.v0(), arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g(a(((Uri) it.next()).getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (o.a()) {
            this.f15524c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("path", file.getAbsolutePath());
            mapHashMap.put("details", b(file));
            this.f15523b.E().a(c2.D0, str, mapHashMap);
        } catch (Throwable th2) {
            if (o.a()) {
                this.f15524c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th2);
            }
            this.f15523b.E().a("FileManager", str, th2);
        }
    }

    private long a(long j10) {
        return j10 / 1048576;
    }

    public boolean a(File file) {
        return (file == null || !file.exists() || file.isDirectory()) ? false : true;
    }
}
