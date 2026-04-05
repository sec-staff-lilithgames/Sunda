package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f13077b;

    /* renamed from: a, reason: collision with root package name */
    private Context f13078a;

    /* renamed from: f, reason: collision with root package name */
    private C0021b f13082f;

    /* renamed from: g, reason: collision with root package name */
    private HashMap<String, C0021b> f13083g;

    /* renamed from: c, reason: collision with root package name */
    private List<File> f13079c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private List<File> f13080d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private int f13081e = -1;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f13084h = false;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f13085i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.f();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private Runnable f13086j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.d();
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    public static class C0021b {

        /* renamed from: a, reason: collision with root package name */
        String f13101a;

        /* renamed from: d, reason: collision with root package name */
        a f13104d;

        /* renamed from: e, reason: collision with root package name */
        a f13105e;

        /* renamed from: b, reason: collision with root package name */
        List<a> f13102b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        List<a> f13103c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        boolean f13106f = false;

        /* renamed from: g, reason: collision with root package name */
        int f13107g = 0;

        public C0021b(String str) {
            this.f13101a = str;
        }
    }

    private b(Context context) {
        this.f13078a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws Throwable {
        if (this.f13084h || this.f13083g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f13078a)) {
            e();
        }
        if (this.f13081e == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.f13081e = 1;
            } else {
                this.f13081e = 0;
            }
        }
        boolean z10 = this.f13081e == 1;
        com.apm.insight.runtime.f fVar = new com.apm.insight.runtime.f(this.f13078a);
        Iterator<C0021b> it = this.f13083g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z10, fVar);
        }
        Iterator<C0021b> it2 = this.f13083g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z10, fVar);
        }
        Iterator<C0021b> it3 = this.f13083g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.f13078a, it3.next().f13101a));
        }
        fVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    private void e() {
        this.f13084h = true;
        this.f13083g = null;
        NativeImpl.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws Throwable {
        if (this.f13084h) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f13078a) || (System.currentTimeMillis() - com.apm.insight.e.j() <= 5000 && com.apm.insight.e.i().isApmExists() && !Npth.hasCrash())) {
            m.a().a(this.f13085i, 5000L);
        } else {
            d();
        }
    }

    private void g() {
        File[] fileArrListFiles = com.apm.insight.l.j.i(this.f13078a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b bVarC = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (bVarC != null) {
                        if (bVarC.b() != null) {
                            bVarC.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), bVarC.e(), bVarC.d(), bVarC.f(), bVarC.g())) {
                            com.apm.insight.l.f.a(file);
                            String strC = bVarC.c();
                            if (!TextUtils.isEmpty(strC)) {
                                com.apm.insight.l.f.a(new File(strC));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                }
            }
        }
    }

    public static b a() {
        if (f13077b == null) {
            synchronized (b.class) {
                try {
                    if (f13077b == null) {
                        f13077b = new b(com.apm.insight.e.g());
                    }
                } finally {
                }
            }
        }
        return f13077b;
    }

    public final void b() {
        try {
            if (!this.f13084h && com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                m.a().a(this.f13086j);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean c() {
        return this.f13084h;
    }

    private void b(HashMap<String, C0021b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.d(this.f13078a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0021b c0021b = map.get(name);
                    if (c0021b == null) {
                        c0021b = new C0021b(name);
                        map.put(name, c0021b);
                    }
                    c0021b.f13103c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        File f13096a;

        /* renamed from: b, reason: collision with root package name */
        long f13097b;

        /* renamed from: c, reason: collision with root package name */
        long f13098c;

        /* renamed from: d, reason: collision with root package name */
        CrashType f13099d;

        /* renamed from: e, reason: collision with root package name */
        String f13100e;

        public a(File file, CrashType crashType) {
            this.f13097b = -1L;
            this.f13098c = -1L;
            this.f13096a = file;
            this.f13099d = crashType;
            this.f13100e = file.getName();
        }

        public a(File file, long j10, CrashType crashType) {
            this.f13098c = -1L;
            this.f13096a = file;
            this.f13097b = j10;
            this.f13099d = crashType;
            this.f13100e = file.getName();
        }
    }

    public final void a(boolean z10) throws Throwable {
        if (!Npth.isStopUpload() && z10) {
            if (this.f13082f == null) {
                this.f13082f = new C0021b("old_uuid");
                HashMap<String, C0021b> map = new HashMap<>();
                this.f13083g = map;
                a(map);
                a(this.f13083g, this.f13082f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.f13078a));
                b(this.f13083g);
                b(this.f13082f, true, null);
                a(this.f13082f, true, null);
                this.f13082f = null;
                if (this.f13083g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    private void b(final C0021b c0021b, boolean z10, com.apm.insight.runtime.f fVar) {
        boolean z11;
        JSONObject jSONObjectA;
        if (c0021b.f13103c.size() <= 1 && c0021b.f13103c.isEmpty()) {
            c0021b.f13105e = c0021b.f13104d;
            return;
        }
        boolean zB = com.apm.insight.l.k.b(this.f13078a);
        c0021b.f13105e = c0021b.f13104d;
        com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(this.f13078a);
        for (a aVar2 : c0021b.f13103c) {
            final File file = aVar2.f13096a;
            try {
                aVar.a(file);
                jSONObjectA = a(aVar);
            } catch (Throwable th2) {
                th = th2;
                z11 = zB;
            }
            if (jSONObjectA != null && jSONObjectA.length() != 0) {
                if (jSONObjectA.length() != 0) {
                    if (!z10) {
                        long jOptLong = jSONObjectA.optLong("crash_time");
                        try {
                            a aVar3 = c0021b.f13105e;
                            if (aVar3 == null) {
                                c0021b.f13105e = aVar2;
                                c0021b.f13106f = true;
                                if (fVar == null || fVar.a(BuildConfig.FLAVOR)) {
                                    z11 = zB;
                                } else {
                                    aVar.i();
                                }
                            } else {
                                z11 = zB;
                                try {
                                    if (!c0021b.f13106f && jOptLong < aVar3.f13097b) {
                                        c0021b.f13105e = aVar2;
                                        if (fVar != null && !fVar.a(BuildConfig.FLAVOR)) {
                                            aVar.i();
                                            zB = z11;
                                        } else {
                                            a(file);
                                            c0021b.f13106f = true;
                                        }
                                    } else {
                                        com.apm.insight.entity.a.a(jSONObjectA, "filters", "aid", String.valueOf(jSONObjectA.optJSONObject("header").opt("aid")));
                                        jSONObjectA.optJSONObject("header").put("aid", 2010);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                    com.apm.insight.l.f.a(file);
                                    zB = z11;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z11 = zB;
                        }
                    } else {
                        z11 = zB;
                        if (fVar != null && !fVar.a(BuildConfig.FLAVOR)) {
                            aVar.i();
                        }
                    }
                    com.apm.insight.entity.a.a(jSONObjectA, "filters", "start_uuid", c0021b.f13101a);
                    com.apm.insight.entity.a.a(jSONObjectA, "filters", "crash_thread_name", jSONObjectA.optString("crash_thread_name", "unknown"));
                    if (z11) {
                        try {
                            c.a aVar4 = new c.a(jSONObjectA, CrashType.NATIVE);
                            com.apm.insight.entity.b.a(jSONObjectA, com.apm.insight.entity.b.a(aVar4.c(), aVar4.a(), o.a().b(aVar4.b() == -1 ? System.currentTimeMillis() : aVar4.b())), new b.a() { // from class: com.apm.insight.k.b.4
                                @Override // com.apm.insight.entity.b.a
                                public final void a(JSONObject jSONObject) {
                                    d.a();
                                    d.a(jSONObject, file, com.apm.insight.l.j.a(b.this.f13078a, c0021b.f13101a));
                                }
                            });
                            if (!aVar.i()) {
                                aVar.f();
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                            com.apm.insight.l.f.a(file);
                            zB = z11;
                        }
                    }
                    c.a(CrashType.NATIVE, jSONObjectA);
                } else {
                    z11 = zB;
                }
                zB = z11;
            } else {
                z11 = zB;
                aVar.i();
                zB = z11;
            }
        }
    }

    private void a(HashMap<String, C0021b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.f(this.f13078a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < 5; i10++) {
            File file = fileArrListFiles[i10];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0021b c0021b = map.get(name);
                    if (c0021b == null) {
                        c0021b = new C0021b(name);
                        map.put(name, c0021b);
                    }
                    JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    int length = jSONArrayA.length();
                    c0021b.f13107g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), jSONArrayA);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:9:0x0024, B:11:0x0032, B:14:0x003a, B:17:0x0042, B:20:0x0052, B:22:0x0058, B:23:0x005d, B:25:0x0069, B:27:0x0074, B:31:0x008e, B:48:0x00ca, B:50:0x00d2, B:51:0x00da, B:53:0x00e5, B:61:0x00fd, B:56:0x00ef, B:58:0x00f3, B:60:0x00fb, B:38:0x00a8, B:40:0x00b0, B:41:0x00b3, B:43:0x00bb, B:44:0x00be, B:46:0x00c6, B:62:0x0103, B:63:0x0120, B:29:0x0080), top: B:70:0x0024, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:9:0x0024, B:11:0x0032, B:14:0x003a, B:17:0x0042, B:20:0x0052, B:22:0x0058, B:23:0x005d, B:25:0x0069, B:27:0x0074, B:31:0x008e, B:48:0x00ca, B:50:0x00d2, B:51:0x00da, B:53:0x00e5, B:61:0x00fd, B:56:0x00ef, B:58:0x00f3, B:60:0x00fb, B:38:0x00a8, B:40:0x00b0, B:41:0x00b3, B:43:0x00bb, B:44:0x00be, B:46:0x00c6, B:62:0x0103, B:63:0x0120, B:29:0x0080), top: B:70:0x0024, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.HashMap<java.lang.String, com.apm.insight.k.b.C0021b> r18, com.apm.insight.k.b.C0021b r19) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(java.util.HashMap, com.apm.insight.k.b$b):void");
    }

    private static JSONObject a(com.apm.insight.nativecrash.a aVar) {
        JSONObject jSONObjectB = aVar.b();
        if (jSONObjectB != null && jSONObjectB.length() != 0) {
            return jSONObjectB;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(5:97|38|39|(1:41)(1:43)|44)|(18:46|89|47|(1:49)|91|55|56|87|57|70|71|93|72|(1:74)|75|78|69|113)(1:52)|53|(5:91|55|56|87|57)(4:64|(0)(1:68)|69|113)|70|71|93|72|(0)|75|78|69|113) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0166, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154 A[Catch: all -> 0x0166, TryCatch #4 {all -> 0x0166, blocks: (B:72:0x0148, B:74:0x0154, B:78:0x0168), top: B:93:0x0148 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(final com.apm.insight.k.b.C0021b r19, boolean r20, com.apm.insight.runtime.f r21) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(com.apm.insight.k.b$b, boolean, com.apm.insight.runtime.f):void");
    }

    private static boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[Catch: all -> 0x01e1, TRY_ENTER, TryCatch #1 {all -> 0x01e1, blocks: (B:31:0x0072, B:39:0x0090, B:42:0x009d, B:47:0x00b3, B:46:0x00ac), top: B:92:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.apm.insight.f.b a(java.io.File r24, com.apm.insight.CrashType r25, java.lang.String r26, long r27, long r29) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.b.a(java.io.File, com.apm.insight.CrashType, java.lang.String, long, long):com.apm.insight.f.b");
    }
}
