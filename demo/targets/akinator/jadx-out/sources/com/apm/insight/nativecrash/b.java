package com.apm.insight.nativecrash;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.ICommonParams;
import com.apm.insight.runtime.j;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private Context f13216a;

    /* renamed from: b, reason: collision with root package name */
    private ICommonParams f13217b;

    /* renamed from: c, reason: collision with root package name */
    private ICommonParams f13218c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class a extends c {
        public a(File file) {
            super(file);
            this.f13220b = "Total FD Count:";
            this.f13221c = ":";
            this.f13222d = -2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.apm.insight.nativecrash.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0023b extends c {
        public C0023b(File file) {
            super(file);
            this.f13220b = "VmSize:";
            this.f13221c = "\\s+";
            this.f13222d = -1;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class d extends c {
        public d(File file) {
            super(file);
        }

        public final HashMap<String, List<String>> b() {
            HashMap<String, List<String>> map = new HashMap<>();
            try {
                JSONArray jSONArrayA = com.apm.insight.l.f.a(this.f13219a.getAbsolutePath());
                if (jSONArrayA != null) {
                    for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
                        String strOptString = jSONArrayA.optString(i10);
                        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith("[tid:0") && strOptString.endsWith("sigstack:0x0]")) {
                            int iIndexOf = strOptString.indexOf("[routine:0x");
                            int i11 = iIndexOf + 11;
                            String strSubstring = iIndexOf > 0 ? strOptString.substring(i11, strOptString.indexOf(93, i11)) : "unknown addr";
                            List<String> arrayList = map.get(strSubstring);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                                map.put(strSubstring, arrayList);
                            }
                            arrayList.add(strOptString);
                        }
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
            }
            return map;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class e extends c {
        public e(File file) {
            super(file);
        }

        public final JSONArray a(HashMap<String, List<String>> map) {
            int iIndexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (!map.isEmpty()) {
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(this.f13219a.getAbsolutePath());
                    if (jSONArrayA != null) {
                        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
                            String strOptString = jSONArrayA.optString(i10);
                            if (!TextUtils.isEmpty(strOptString) && (iIndexOf = strOptString.indexOf(":")) > 2) {
                                String strSubstring = strOptString.substring(2, iIndexOf);
                                if (map.containsKey(strSubstring) && (list = map.get(strSubstring)) != null) {
                                    Iterator<String> it = list.iterator();
                                    while (it.hasNext()) {
                                        jSONArray.put(it.next() + " " + strOptString);
                                    }
                                    map.remove(strSubstring);
                                }
                            }
                        }
                        Iterator<List<String>> it2 = map.values().iterator();
                        while (it2.hasNext()) {
                            Iterator<String> it3 = it2.next().iterator();
                            while (it3.hasNext()) {
                                jSONArray.put(it3.next() + "  0x000000:unknown");
                            }
                        }
                    }
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    j.a(th2, "NPTH_CATCH");
                }
            }
            return jSONArray;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class f extends c {
        public f(File file) {
            super(file);
            this.f13220b = "Total Threads Count:";
            this.f13221c = ":";
            this.f13222d = -2;
        }
    }

    public b(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    public static JSONArray a(File file, File file2) {
        return new e(file2).a(new d(file).b());
    }

    public static int b(String str) {
        return new f(com.apm.insight.l.j.c(str)).a();
    }

    public static int c(String str) {
        return new C0023b(com.apm.insight.l.j.d(str)).a();
    }

    public final String d() {
        try {
            return this.f13217b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String e() {
        try {
            return String.valueOf(this.f13217b.getCommonParams().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    public final long f() {
        try {
            return this.f13217b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public b(Context context, ICommonParams iCommonParams, b bVar) {
        this.f13216a = context;
        this.f13217b = iCommonParams;
        this.f13218c = bVar == null ? null : bVar.f13217b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.Object> b() {
        /*
            r9 = this;
            java.lang.String r0 = "version_name"
            java.lang.String r1 = "update_version_code"
            java.lang.String r2 = "version_code"
            r3 = 0
            com.apm.insight.ICommonParams r4 = r9.f13218c     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L13
            java.util.Map r4 = r4.getCommonParams()     // Catch: java.lang.Throwable -> L10
            goto L18
        L10:
            r4 = move-exception
            r5 = r3
            goto L27
        L13:
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L10
            r4.<init>()     // Catch: java.lang.Throwable -> L10
        L18:
            com.apm.insight.ICommonParams r5 = r9.f13217b     // Catch: java.lang.Throwable -> L23
            java.util.Map r5 = r5.getCommonParams()     // Catch: java.lang.Throwable -> L23
            r4.putAll(r5)     // Catch: java.lang.Throwable -> L23
            r5 = r3
            goto L2a
        L23:
            r5 = move-exception
            r8 = r5
            r5 = r4
            r4 = r8
        L27:
            r8 = r5
            r5 = r4
            r4 = r8
        L2a:
            if (r4 != 0) goto L3d
            java.util.HashMap r4 = new java.util.HashMap
            r6 = 4
            r4.<init>(r6)
            if (r5 == 0) goto L3d
            java.lang.String r6 = "err_info"
            java.lang.String r5 = com.apm.insight.l.m.a(r5)     // Catch: java.lang.Throwable -> L3d
            r4.put(r6, r5)     // Catch: java.lang.Throwable -> L3d
        L3d:
            boolean r5 = a(r4)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 == 0) goto La3
            android.content.Context r5 = r9.f13216a     // Catch: java.lang.Throwable -> L7f
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L7f
            android.content.Context r7 = r9.f13216a     // Catch: java.lang.Throwable -> L7f
            java.lang.String r7 = r7.getPackageName()     // Catch: java.lang.Throwable -> L7f
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r7, r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r6 = r5.versionName     // Catch: java.lang.Throwable -> L7f
            r4.put(r0, r6)     // Catch: java.lang.Throwable -> L7f
            int r6 = r5.versionCode     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L7f
            r4.put(r2, r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r6 = r4.get(r1)     // Catch: java.lang.Throwable -> L7f
            if (r6 != 0) goto Le9
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo     // Catch: java.lang.Throwable -> L7f
            android.os.Bundle r5 = r5.metaData     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L75
            java.lang.String r3 = "UPDATE_VERSION_CODE"
            java.lang.Object r3 = r5.get(r3)     // Catch: java.lang.Throwable -> L7f
        L75:
            if (r3 != 0) goto L7b
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> L7f
        L7b:
            r4.put(r1, r3)     // Catch: java.lang.Throwable -> L7f
            goto Le9
        L7f:
            android.content.Context r3 = r9.f13216a
            java.lang.String r3 = com.apm.insight.l.a.c(r3)
            r4.put(r0, r3)
            android.content.Context r0 = r9.f13216a
            int r0 = com.apm.insight.l.a.d(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.put(r2, r0)
            java.lang.Object r0 = r4.get(r1)
            if (r0 != 0) goto Le9
            java.lang.Object r0 = r4.get(r2)
            r4.put(r1, r0)
            goto Le9
        La3:
            android.content.Context r0 = r9.f13216a     // Catch: java.lang.Throwable -> Le9
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Le9
            android.content.Context r1 = r9.f13216a     // Catch: java.lang.Throwable -> Le9
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> Le9
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r6)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r0 = r0.versionName     // Catch: java.lang.Throwable -> Le9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le9
            r1.<init>()     // Catch: java.lang.Throwable -> Le9
            android.content.Context r2 = r9.f13216a     // Catch: java.lang.Throwable -> Le9
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> Le9
            r1.append(r2)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r2 = ".BuildConfig"
            r1.append(r2)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Le9
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r2 = "VERSION_NAME"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> Le9
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> Le9
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Le9
            if (r0 == 0) goto Le9
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> Le9
            if (r1 != 0) goto Le9
            java.lang.String r1 = "manifest_version"
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> Le9
        Le9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.b.b():java.util.Map");
    }

    public final ICommonParams c() {
        return this.f13217b;
    }

    public static int a(String str) {
        return new a(com.apm.insight.l.j.b(str)).a();
    }

    public final Map<String, Object> a() {
        Object obj;
        Map<String, Object> mapB = b();
        if (((mapB == null || (obj = mapB.get("aid")) == null) ? null : String.valueOf(obj)) == null) {
            mapB.put("aid", 4444);
        }
        return mapB;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        protected File f13219a;

        /* renamed from: b, reason: collision with root package name */
        protected String f13220b;

        /* renamed from: c, reason: collision with root package name */
        protected String f13221c;

        /* renamed from: d, reason: collision with root package name */
        protected int f13222d;

        public c(File file) {
            this.f13219a = file;
        }

        public final int a() {
            int i10;
            Throwable th2;
            if (!this.f13219a.exists() || !this.f13219a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f13219a));
                int iA = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iA = a(line);
                    } catch (Throwable th3) {
                        th2 = th3;
                        i10 = iA;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                            return i10;
                        } finally {
                            if (bufferedReader != null) {
                                com.apm.insight.a.a((Closeable) bufferedReader);
                            }
                        }
                    }
                } while (iA == -1);
                com.apm.insight.a.a((Closeable) bufferedReader2);
                return iA;
            } catch (Throwable th4) {
                i10 = -1;
                th2 = th4;
            }
        }

        private int a(String str) throws NumberFormatException {
            int i10 = this.f13222d;
            if (!str.startsWith(this.f13220b)) {
                return i10;
            }
            try {
                i10 = Integer.parseInt(str.split(this.f13221c)[1].trim());
            } catch (NumberFormatException e10) {
                com.apm.insight.c.a();
                j.a(e10, "NPTH_CATCH");
            }
            if (i10 < 0) {
                return -2;
            }
            return i10;
        }
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return ((map.containsKey("app_version") || map.containsKey(TJzY.NCfWCEc)) && map.containsKey("version_code") && map.containsKey("update_version_code")) ? false : true;
    }
}
