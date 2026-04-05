package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, c> f45368c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public static com.mbridge.msdk.videocommon.setting.a f45369d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile b f45370e;

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f45371a = false;

    /* renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f45372b = new CopyOnWriteArrayList<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f45373a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45374b;

        public a(String str, String str2) {
            this.f45373a = str;
            this.f45374b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            j.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f45373a, this.f45374b, 2, str2);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            j.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f45373a, this.f45374b, 1, "");
        }
    }

    private b() {
    }

    public static b b() {
        if (f45370e == null) {
            synchronized (b.class) {
                try {
                    if (f45370e == null) {
                        f45370e = new b();
                    }
                } finally {
                }
            }
        }
        return f45370e;
    }

    public void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f45372b.add(str);
        } catch (Exception unused) {
        }
    }

    public com.mbridge.msdk.videocommon.setting.a c() {
        com.mbridge.msdk.videocommon.setting.a aVar = f45369d;
        if (aVar != null) {
            return aVar;
        }
        String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + com.mbridge.msdk.foundation.controller.c.m().b());
        if (TextUtils.isEmpty(strA)) {
            e(com.mbridge.msdk.foundation.controller.c.m().b(), com.mbridge.msdk.foundation.controller.c.m().c());
            return a();
        }
        com.mbridge.msdk.videocommon.setting.a aVarA = com.mbridge.msdk.videocommon.setting.a.a(strA);
        if (!a(aVarA)) {
            return aVarA;
        }
        e(com.mbridge.msdk.foundation.controller.c.m().b(), com.mbridge.msdk.foundation.controller.c.m().c());
        return a();
    }

    public String d(String str) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(a.b.k("reward_", str));
    }

    public void e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f45372b.remove(str);
        } catch (Exception unused) {
        }
    }

    public void f(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(a.b.k("reward_", str), str2);
        f45369d = com.mbridge.msdk.videocommon.setting.a.a(str2);
    }

    public void g(String str, String str2) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + str + "_" + str2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th2) {
            p0.b("RewardSettingManager", th2.getMessage());
        }
    }

    public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.net.c cVar) {
        if (!TextUtils.isEmpty(str3) && !this.f45372b.contains(str3)) {
            a(str3);
            new com.mbridge.msdk.videocommon.net.a().a(com.mbridge.msdk.foundation.controller.c.m().d(), str, str2, str3, cVar);
            return;
        }
        p0.a("test_reward_unit_setting", "unitID: " + str3 + " is requesting");
    }

    public void e(String str, String str2) {
        if (this.f45371a) {
            return;
        }
        this.f45371a = true;
        new com.mbridge.msdk.videocommon.net.a().a(com.mbridge.msdk.foundation.controller.c.m().d(), str, str2);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strC = b().a(com.mbridge.msdk.foundation.controller.c.m().b(), str, false).c();
        if (TextUtils.isEmpty(strC) || !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(strC))) {
            return;
        }
        a(strC, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.videocommon.setting.c a(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "reward_"
            java.lang.String r1 = "_"
            java.lang.String r0 = a.b.m(r0, r5, r1, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.setting.c> r1 = com.mbridge.msdk.videocommon.setting.b.f45368c
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L2e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.setting.c> r7 = com.mbridge.msdk.videocommon.setting.b.f45368c     // Catch: java.lang.Exception -> L1e
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Exception -> L1e
            com.mbridge.msdk.videocommon.setting.c r7 = (com.mbridge.msdk.videocommon.setting.c) r7     // Catch: java.lang.Exception -> L1e
            boolean r0 = r4.a(r7)     // Catch: java.lang.Exception -> L1f
            goto L20
        L1e:
            r7 = r2
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L2d
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.c()
            r4.a(r5, r0, r6, r2)
        L2d:
            return r7
        L2e:
            com.mbridge.msdk.foundation.buffer.sharedperference.a r1 = com.mbridge.msdk.foundation.buffer.sharedperference.a.b()
            java.lang.String r1 = r1.a(r0)
            com.mbridge.msdk.videocommon.setting.c r1 = com.mbridge.msdk.videocommon.setting.c.a(r1)
            boolean r3 = r4.a(r1)
            if (r3 == 0) goto L53
            if (r1 != 0) goto L52
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.c()
            r4.a(r5, r0, r6, r2)
            com.mbridge.msdk.videocommon.setting.c r5 = r4.a(r7)
            return r5
        L52:
            return r1
        L53:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.setting.c> r5 = com.mbridge.msdk.videocommon.setting.b.f45368c
            r5.put(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.setting.b.a(java.lang.String, java.lang.String, boolean):com.mbridge.msdk.videocommon.setting.c");
    }

    public c d(String str, String str2) {
        String strM = a.b.m("reward_", str, "_", str2);
        if (f45368c.containsKey(strM)) {
            return f45368c.get(strM);
        }
        c cVarA = c.a(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strM));
        if (cVarA != null) {
            f45368c.put(strM, cVarA);
        }
        return cVarA;
    }

    public void f(String str) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            f(str, jSONObject.toString());
        } catch (Throwable th2) {
            p0.b("RewardSettingManager", th2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.videocommon.setting.c c(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reward_"
            java.lang.String r1 = "_"
            java.lang.String r0 = a.b.m(r0, r5, r1, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.setting.c> r1 = com.mbridge.msdk.videocommon.setting.b.f45368c
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L2e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.setting.c> r1 = com.mbridge.msdk.videocommon.setting.b.f45368c     // Catch: java.lang.Exception -> L1e
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> L1e
            com.mbridge.msdk.videocommon.setting.c r0 = (com.mbridge.msdk.videocommon.setting.c) r0     // Catch: java.lang.Exception -> L1e
            boolean r1 = r4.a(r0)     // Catch: java.lang.Exception -> L1f
            goto L20
        L1e:
            r0 = r2
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L2d
            com.mbridge.msdk.foundation.controller.c r1 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r1 = r1.c()
            r4.a(r5, r1, r6, r2)
        L2d:
            return r0
        L2e:
            com.mbridge.msdk.foundation.buffer.sharedperference.a r1 = com.mbridge.msdk.foundation.buffer.sharedperference.a.b()
            java.lang.String r1 = r1.a(r0)
            com.mbridge.msdk.videocommon.setting.c r1 = com.mbridge.msdk.videocommon.setting.c.a(r1)
            boolean r3 = r4.a(r1)
            if (r3 == 0) goto L4c
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()
            java.lang.String r0 = r0.c()
            r4.a(r5, r0, r6, r2)
            return r2
        L4c:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.videocommon.setting.c> r5 = com.mbridge.msdk.videocommon.setting.b.f45368c
            r5.put(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.setting.b.c(java.lang.String, java.lang.String):com.mbridge.msdk.videocommon.setting.c");
    }

    public void b(boolean z10) {
        this.f45371a = z10;
    }

    public String b(String str, String str2) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(a.b.m("reward_", str, "_", str2));
    }

    public com.mbridge.msdk.videocommon.setting.a d() {
        String str = "reward_" + com.mbridge.msdk.foundation.controller.c.m().b();
        if (f45369d == null) {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
            if (!TextUtils.isEmpty(strA)) {
                com.mbridge.msdk.videocommon.setting.a aVarA = com.mbridge.msdk.videocommon.setting.a.a(strA);
                if (aVarA != null) {
                    f45369d = aVarA;
                }
                return aVarA;
            }
        }
        return f45369d;
    }

    public boolean a(com.mbridge.msdk.videocommon.setting.a aVar) {
        if (aVar != null) {
            return aVar.b() + aVar.d() <= System.currentTimeMillis();
        }
        return true;
    }

    public static boolean c(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String strOptString = jSONArrayOptJSONArray.optJSONObject(0).optString("unitId");
                if (jSONArrayOptJSONArray.length() > 0) {
                    if (!TextUtils.isEmpty(strOptString)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public final com.mbridge.msdk.videocommon.setting.a a() {
        com.mbridge.msdk.videocommon.setting.a aVar = new com.mbridge.msdk.videocommon.setting.a();
        HashMap map = new HashMap(5);
        map.put("1", 1000);
        map.put("9", 1000);
        map.put("8", 1000);
        HashMap map2 = new HashMap(3);
        map2.put("1", new com.mbridge.msdk.videocommon.entity.c("Virtual Item", 1));
        aVar.a(map);
        aVar.b(map2);
        aVar.c(43200L);
        aVar.e(5400L);
        aVar.d(3600L);
        aVar.b(3600L);
        aVar.f(5L);
        aVar.a(1);
        return aVar;
    }

    private final boolean a(c cVar) {
        com.mbridge.msdk.videocommon.setting.a aVarC = c();
        if (aVarC == null || cVar == null) {
            return true;
        }
        return cVar.j() + aVarC.h() <= System.currentTimeMillis();
    }

    public void a(String str, String str2, String str3) {
        String strM = a.b.m("reward_", str, "_", str2);
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strM, str3);
        c cVarA = c.a(str3);
        f45368c.put(strM, cVarA);
        if (com.mbridge.msdk.util.b.a() || TextUtils.isEmpty(cVarA.c())) {
            return;
        }
        a(cVarA.c(), str2);
    }

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            j.a(com.mbridge.msdk.foundation.controller.c.m().d(), str, str2, 2, a.b.k("alert url is exception ,url:", str));
        } else {
            H5DownLoadManager.getInstance().downloadH5Res(new com.mbridge.msdk.foundation.same.report.metrics.c(true), str, new a(str, str2));
        }
    }

    public c a(boolean z10) {
        c cVar = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.mbridge.msdk.videocommon.entity.b(1, 30, null));
            cVar.a((List<com.mbridge.msdk.videocommon.entity.b>) arrayList);
            cVar.b(1);
            cVar.e(1);
            cVar.E(1);
            cVar.h(1);
            cVar.u(1);
            cVar.n(1);
            cVar.D(3);
            cVar.C(80);
            cVar.y(100);
            cVar.i(0);
            cVar.o(2);
            cVar.G(-1);
            cVar.p(70);
            cVar.H(2);
            if (z10) {
                cVar.I(5);
            } else {
                cVar.I(-1);
            }
            cVar.m(0);
            cVar.A(0);
            cVar.k(1);
            cVar.B(1);
            cVar.f(3);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(4);
            arrayList2.add(6);
            cVar.a(arrayList2);
            cVar.q(1);
            cVar.F(1);
            cVar.r(60);
            return cVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return cVar;
        }
    }
}
