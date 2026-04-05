package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import ao.kwoC.zAQQWzBxnS;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.Header;
import com.apm.insight.l.m;
import com.apm.insight.l.n;
import com.apm.insight.runtime.j;
import com.apm.insight.runtime.o;
import com.ironsource.C3191e4;
import j1.o2;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f13199d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f13200a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f13201b = null;

    /* renamed from: c, reason: collision with root package name */
    private b f13202c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.apm.insight.nativecrash.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0022a {
        /* JADX INFO: Access modifiers changed from: private */
        public static String b(File file) {
            BufferedReader bufferedReader;
            String line;
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                line = bufferedReader.readLine();
            } catch (Throwable th3) {
                th = th3;
                bufferedReader2 = bufferedReader;
                try {
                    com.apm.insight.c.a();
                    j.a(th, "NPTH_CATCH");
                    return "";
                } finally {
                    com.apm.insight.a.a((Closeable) bufferedReader2);
                }
            }
            if (line == null) {
                com.apm.insight.a.a((Closeable) bufferedReader);
                return "";
            }
            if (!line.startsWith("[FATAL:jni_android.cc") || !line.contains("Please include Java exception stack in crash report ttwebview:")) {
                com.apm.insight.a.a((Closeable) bufferedReader);
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            int iIndexOf = line.indexOf(" ttwebview:");
            sb2.append("Caused by: ");
            sb2.append("Please include Java exception stack in crash report");
            sb2.append("\n");
            sb2.append(line.substring(iIndexOf + 11));
            sb2.append("\n");
            while (true) {
                String line2 = bufferedReader.readLine();
                if (line2 == null) {
                    String string = sb2.toString();
                    com.apm.insight.a.a((Closeable) bufferedReader);
                    return string;
                }
                sb2.append(line2);
                sb2.append("\n");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        private final com.apm.insight.nativecrash.c f13203a;

        /* renamed from: b, reason: collision with root package name */
        private final com.apm.insight.h.b f13204b;

        /* renamed from: c, reason: collision with root package name */
        private final File f13205c;

        /* renamed from: d, reason: collision with root package name */
        private final File f13206d;

        public b(File file) {
            this.f13205c = file;
            this.f13206d = com.apm.insight.l.j.a(com.apm.insight.e.g(), file.getName());
            com.apm.insight.h.b bVar = new com.apm.insight.h.b(file);
            this.f13204b = bVar;
            com.apm.insight.nativecrash.c cVar = new com.apm.insight.nativecrash.c(file);
            this.f13203a = cVar;
            if (bVar.d() && cVar.a() == null) {
                cVar.a(file);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long a() {
            /*
                r2 = this;
                com.apm.insight.h.b r0 = r2.f13204b
                java.util.Map r0 = r0.f()
                if (r0 == 0) goto L19
                boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto L19
                java.lang.String r1 = "start_time"
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L17
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L17
                goto L1a
            L17:
                r0 = move-exception
                goto L21
            L19:
                r0 = 0
            L1a:
                if (r0 == 0) goto L29
                long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> L17
                return r0
            L21:
                com.apm.insight.c.a()
                java.lang.String r1 = "NPTH_CATCH"
                com.apm.insight.runtime.j.a(r0, r1)
            L29:
                long r0 = java.lang.System.currentTimeMillis()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.a.b.a():long");
        }

        public final File b() {
            return this.f13205c;
        }

        public final boolean c() {
            return this.f13204b.d();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class c extends e {
        public c() {
            super();
            this.f13211b = "Total FD Count:";
            this.f13210a = com.apm.insight.l.j.i(a.this.f13202c.b());
            this.f13212c = ":";
            this.f13213d = -2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class d extends e {
        public d() {
            super();
            this.f13211b = "VmSize:";
            this.f13210a = com.apm.insight.l.j.k(a.this.f13202c.b());
            this.f13212c = "\\s+";
            this.f13213d = -1;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class f extends e {
        public f() {
            super();
            this.f13211b = "Total Threads Count:";
            this.f13210a = com.apm.insight.l.j.j(a.this.f13202c.b());
            this.f13212c = ":";
            this.f13213d = -2;
        }
    }

    public a(Context context) {
        this.f13200a = context;
    }

    public static long g() {
        if (NativeImpl.f()) {
            return Long.MAX_VALUE;
        }
        return Header.a() ? 3891200L : 2867200L;
    }

    public static boolean k() {
        Boolean bool = f13199d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 11; i10++) {
            try {
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
            }
            if (new File(strArr[i10]).exists()) {
                f13199d = Boolean.TRUE;
                return true;
            }
            continue;
        }
        f13199d = Boolean.FALSE;
        return false;
    }

    private String l() {
        b bVar = this.f13202c;
        if (bVar == null) {
            return null;
        }
        String strC = bVar.f13203a.c();
        return (strC == null || strC.isEmpty()) ? this.f13202c.f13204b.e() : strC;
    }

    public final JSONObject b() {
        File fileF = com.apm.insight.l.j.f(this.f13202c.b());
        if (!fileF.exists()) {
            return null;
        }
        try {
            String strA = com.apm.insight.l.f.a(fileF.getAbsolutePath(), "\n");
            if (strA != null && !strA.isEmpty()) {
                return new JSONObject(strA);
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            j.a(th2, "NPTH_CATCH");
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0124 A[Catch: IOException -> 0x0032, LOOP:2: B:56:0x0124->B:61:0x014e, LOOP_START, PHI: r6
      0x0124: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:55:0x0122, B:61:0x014e] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {IOException -> 0x0032, blocks: (B:3:0x0004, B:5:0x002e, B:8:0x0035, B:10:0x003e, B:12:0x0044, B:14:0x0065, B:15:0x0068, B:16:0x006b, B:17:0x0071, B:19:0x0077, B:21:0x0098, B:23:0x00a8, B:25:0x00b3, B:29:0x00be, B:28:0x00b8, B:30:0x00c1, B:36:0x00dd, B:38:0x00e3, B:42:0x00fa, B:54:0x011e, B:56:0x0124, B:58:0x012a, B:60:0x014b, B:61:0x014e, B:62:0x0151, B:63:0x0154, B:48:0x0104, B:52:0x0117), top: B:76:0x0004, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.a.c():void");
    }

    public final boolean d() {
        ICrashFilter iCrashFilterB = com.apm.insight.e.b().b();
        if (iCrashFilterB == null) {
            return true;
        }
        try {
            return iCrashFilterB.onNativeCrashFilter(l(), "");
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            j.a(th2, "NPTH_CATCH");
            return true;
        }
    }

    public final boolean e() {
        return com.apm.insight.e.a.a().a(com.apm.insight.l.j.f(this.f13202c.b()).getAbsolutePath());
    }

    public final void f() {
        com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(com.apm.insight.l.j.f(this.f13202c.b()).getAbsolutePath()));
    }

    public final boolean i() {
        return com.apm.insight.l.f.a(this.f13202c.b());
    }

    public final void j() {
        try {
            com.apm.insight.l.f.b(this.f13202c.b().getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + com.apm.insight.e.g().getPackageName() + "/" + this.f13202c.b().getName() + ".zip");
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            j.a(th2, "NPTH_CATCH");
        }
    }

    public final void a(File file) {
        this.f13202c = new b(file);
    }

    public final JSONObject h() {
        try {
            com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
            Header header = new Header(this.f13200a);
            JSONObject jSONObjectA = o.a().a(this.f13202c.a());
            if (jSONObjectA != null) {
                header.a(jSONObjectA);
                header.d();
                header.e();
            }
            Header.b(header);
            aVar.a(header);
            boolean z10 = true;
            aVar.a("is_native_crash", (Object) 1);
            aVar.a("repack_time", Long.valueOf(System.currentTimeMillis()));
            aVar.a("crash_uuid", this.f13202c.b().getName());
            b bVar = this.f13202c;
            Map<String, String> mapF = bVar != null ? bVar.f13204b.f() : null;
            if (mapF != null) {
                Object obj = (String) mapF.get("process_name");
                if (obj != null) {
                    aVar.a("process_name", obj);
                }
                String str = mapF.get("start_time");
                if (str != null) {
                    try {
                        aVar.a(Long.decode(str).longValue());
                    } catch (Throwable th2) {
                        com.apm.insight.c.a();
                        j.a(th2, "NPTH_CATCH");
                    }
                }
                String str2 = mapF.get("pid");
                if (str2 != null) {
                    try {
                        aVar.a("pid", Long.decode(str2));
                    } catch (Throwable th3) {
                        com.apm.insight.c.a();
                        j.a(th3, "NPTH_CATCH");
                    }
                }
                Object obj2 = (String) mapF.get("crash_thread_name");
                if (obj2 != null) {
                    aVar.a("crash_thread_name", obj2);
                }
                String str3 = mapF.get("crash_time");
                if (str3 != null) {
                    try {
                        aVar.a("crash_time", Long.decode(str3));
                    } catch (Throwable th4) {
                        com.apm.insight.c.a();
                        j.a(th4, "NPTH_CATCH");
                    }
                }
                aVar.a("data", l());
            }
            Map<String, String> mapB = this.f13202c.f13203a.b();
            if (!mapB.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String str4 : mapB.keySet()) {
                    String strA = a(mapB.get(str4));
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("lib_name", str4);
                        jSONObject.put("lib_uuid", strA);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        com.apm.insight.c.a();
                        j.a(e10, "NPTH_CATCH");
                    }
                }
                aVar.a("crash_lib_uuid", (Object) jSONArray);
            }
            File fileE = com.apm.insight.l.j.e(this.f13202c.b());
            if (fileE.exists() || this.f13201b != null) {
                try {
                    JSONObject jSONObject2 = this.f13201b;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject(com.apm.insight.l.f.a(fileE.getAbsolutePath(), "\n"));
                    }
                    aVar.c(jSONObject2);
                    aVar.a("has_callback", "true");
                    if (aVar.c().opt(C3191e4.a.f36373k) == null) {
                        com.apm.insight.e.g();
                        aVar.b(n.a());
                    }
                    com.apm.insight.a.a(aVar, aVar.d(), CrashType.NATIVE);
                } catch (Throwable th5) {
                    com.apm.insight.c.a();
                    j.a(th5, "NPTH_CATCH");
                }
                long j10 = -1;
                long jOptLong = aVar.c().optLong("crash_time", -1L);
                long jOptLong2 = aVar.c().optLong("java_end", -1L);
                if (jOptLong2 != -1 && jOptLong != -1) {
                    j10 = jOptLong2 - jOptLong;
                }
                try {
                    aVar.b("total_cost", String.valueOf(j10));
                    aVar.a("total_cost", String.valueOf(j10 / 1000));
                } catch (Throwable unused) {
                }
            } else {
                com.apm.insight.e.g();
                aVar.b(n.a());
                aVar.a("has_callback", "false");
            }
            File fileG = com.apm.insight.l.j.g(this.f13202c.b());
            String strA2 = "";
            if (fileG.exists()) {
                try {
                    strA2 = m.a(fileG.getAbsolutePath());
                } catch (Throwable th6) {
                    com.apm.insight.c.a();
                    j.a(th6, "NPTH_CATCH");
                }
            }
            File fileO = com.apm.insight.l.j.o(this.f13202c.b());
            if (fileO.exists()) {
                String strB = C0022a.b(fileO);
                strA2 = strA2.isEmpty() ? strB : strA2 + "\n" + strB;
            }
            try {
                if (!strA2.isEmpty()) {
                    aVar.a("java_data", (Object) strA2);
                }
            } catch (Throwable th7) {
                com.apm.insight.c.a();
                j.a(th7, "NPTH_CATCH");
            }
            b(aVar);
            a(aVar);
            com.apm.insight.entity.d.b(aVar.c());
            HashMap map = new HashMap();
            if (k()) {
                map.put("is_root", "true");
                aVar.a("is_root", "true");
            } else {
                map.put("is_root", "false");
                aVar.a("is_root", "false");
            }
            map.put("has_fds_file", com.apm.insight.l.j.i(this.f13202c.b()).exists() ? "true" : "false");
            File fileH = com.apm.insight.l.j.h(this.f13202c.b());
            map.put("has_logcat_file", (!fileH.exists() || fileH.length() <= 128) ? "false" : "true");
            map.put("has_maps_file", com.apm.insight.l.j.d(this.f13202c.b()).exists() ? "true" : "false");
            map.put("has_tombstone_file", com.apm.insight.l.j.b(this.f13202c.b()).exists() ? "true" : "false");
            map.put("has_meminfo_file", com.apm.insight.l.j.k(this.f13202c.b()).exists() ? "true" : "false");
            map.put("has_threads_file", com.apm.insight.l.j.j(this.f13202c.b()).exists() ? "true" : "false");
            int iA = new c().a();
            if (iA > 0) {
                if (iA > 960) {
                    map.put("fd_leak", "true");
                } else {
                    map.put("fd_leak", "false");
                }
                aVar.a("fd_count", Integer.valueOf(iA));
            }
            int iA2 = new f().a();
            if (iA2 > 0) {
                if (iA2 > 350) {
                    map.put("threads_leak", "true");
                } else {
                    map.put("threads_leak", "false");
                }
                aVar.a("threads_count", Integer.valueOf(iA2));
            }
            int iA3 = new d().a();
            if (iA3 > 0) {
                long j11 = iA3;
                long jG = g();
                String str5 = zAQQWzBxnS.nOwUV;
                if (j11 > jG) {
                    map.put(str5, "true");
                } else {
                    map.put(str5, "false");
                }
                aVar.a("memory_size", Integer.valueOf(iA3));
            }
            map.put("sdk_version", "2008-20250701130429");
            if (aVar.c().opt("java_data") == null) {
                z10 = false;
            }
            map.put("has_java_stack", String.valueOf(z10));
            JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(this.f13202c.f13205c), com.apm.insight.l.j.m(this.f13202c.f13205c));
            map.put("leak_threads_count", String.valueOf(jSONArrayA.length()));
            if (jSONArrayA.length() > 0) {
                try {
                    com.apm.insight.l.f.a(com.apm.insight.l.j.n(this.f13202c.f13205c), jSONArrayA);
                } catch (Throwable unused2) {
                }
            }
            aVar.b();
            aVar.a("is_64_devices", String.valueOf(Header.a()));
            aVar.a("is_64_runtime", String.valueOf(NativeImpl.f()));
            aVar.a("is_x86_devices", String.valueOf(Header.b()));
            aVar.c(map);
            File fileF = com.apm.insight.l.j.f(this.f13202c.b());
            JSONObject jSONObjectC = aVar.c();
            com.apm.insight.l.f.a(fileF, jSONObjectC);
            return jSONObjectC;
        } catch (Throwable th8) {
            com.apm.insight.c.a();
            j.a(th8, "NPTH_CATCH");
            return null;
        }
    }

    public final boolean a() {
        b bVar = this.f13202c;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    private void a(com.apm.insight.entity.a aVar) {
        File fileA = com.apm.insight.l.j.a(this.f13202c.b());
        if (fileA.exists()) {
            try {
                String strA = com.apm.insight.l.f.a(fileA.getAbsolutePath(), "\n");
                JSONArray jSONArray = new JSONArray();
                if (strA != null) {
                    for (String str : strA.split("\n")) {
                        jSONArray.put(str);
                    }
                }
                aVar.a("native_log", (Object) jSONArray);
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public class e {

        /* renamed from: a, reason: collision with root package name */
        protected File f13210a;

        /* renamed from: b, reason: collision with root package name */
        protected String f13211b;

        /* renamed from: c, reason: collision with root package name */
        protected String f13212c;

        /* renamed from: d, reason: collision with root package name */
        protected int f13213d;

        public e() {
        }

        public final int a() {
            int i10;
            Throwable th2;
            if (!this.f13210a.exists() || !this.f13210a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f13210a));
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
            int i10 = this.f13213d;
            if (!str.startsWith(this.f13211b)) {
                return i10;
            }
            try {
                i10 = Integer.parseInt(str.split(this.f13212c)[1].trim());
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

    private void b(com.apm.insight.entity.a aVar) {
        BufferedReader bufferedReader;
        File fileH = com.apm.insight.l.j.h(this.f13202c.b());
        if (!fileH.exists()) {
            NativeImpl.a(fileH.getAbsolutePath(), String.valueOf(com.apm.insight.e.i().getLogcatDumpCount()), String.valueOf(com.apm.insight.e.i().getLogcatLevel()));
        }
        JSONArray jSONArray = new JSONArray();
        String strO = o2.o(new StringBuilder(" "), this.f13202c.f13204b.f().get("pid"), " ");
        try {
            bufferedReader = new BufferedReader(new FileReader(fileH));
            try {
                if (fileH.length() > 512000) {
                    bufferedReader.skip(fileH.length() - 512000);
                }
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    if ((line.length() > 32 ? line.substring(0, 31) : line).contains(strO)) {
                        jSONArray.put(line);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
        }
        com.apm.insight.a.a((Closeable) bufferedReader);
        aVar.a("logcat", (Object) jSONArray);
    }

    private static String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb2.append(str);
            } else {
                sb2.append(str.charAt(6));
                sb2.append(str.charAt(7));
                sb2.append(str.charAt(4));
                sb2.append(str.charAt(5));
                sb2.append(str.charAt(2));
                sb2.append(str.charAt(3));
                sb2.append(str.charAt(0));
                sb2.append(str.charAt(1));
                sb2.append(str.charAt(10));
                sb2.append(str.charAt(11));
                sb2.append(str.charAt(8));
                sb2.append(str.charAt(9));
                sb2.append(str.charAt(14));
                sb2.append(str.charAt(15));
                sb2.append(str.charAt(12));
                sb2.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb2.append((CharSequence) str, 16, 32);
                    sb2.append('0');
                }
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            j.a(th2, "NPTH_CATCH");
        }
        return sb2.toString().toUpperCase();
    }
}
