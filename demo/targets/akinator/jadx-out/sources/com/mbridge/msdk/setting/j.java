package com.mbridge.msdk.setting;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.f0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.services.core.network.model.HttpRequest;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f42707a = "j";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.mbridge.msdk.foundation.same.net.wrapper.d {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) {
            if (jSONObject == null || !jSONObject.has(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I)) {
                return;
            }
            try {
                f0.a().a(jSONObject.getString(com.mbridge.msdk.foundation.entity.b.JSON_KEY_C_I));
            } catch (Exception e10) {
                p0.b(j.f42707a, e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends com.mbridge.msdk.foundation.same.net.handler.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f42713b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f42714c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f42715d;

        public c(Context context, String str, String str2) {
            this.f42713b = context;
            this.f42714c = str;
            this.f42715d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f40860r = false;
            com.google.android.gms.internal.play_billing.a.D("fetch CNDSettingHost failed, errorCode = ", str, j.f42707a);
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            p0.a(j.f42707a, "fetch CNDSettingHost success, content = " + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host_ts", System.currentTimeMillis());
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host", str);
            for (String str2 : str.split("\n")) {
                if (!TextUtils.isEmpty(str2.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f40863u.contains(str2.trim())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f40863u.add(str2.trim());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f40866x.add(str2.trim());
                }
            }
            j.this.a(this.f42713b, this.f42714c, this.f42715d);
        }
    }

    private String b() {
        String str = com.mbridge.msdk.foundation.same.net.utils.d.h().f40861s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f40861s && com.mbridge.msdk.foundation.same.net.utils.d.h().f40860r && com.mbridge.msdk.foundation.same.net.utils.d.h().f40865w < com.mbridge.msdk.foundation.same.net.utils.d.h().f40866x.size()) {
                String str2 = com.mbridge.msdk.foundation.same.net.utils.d.h().f40866x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f40865w);
                if (!TextUtils.isEmpty(str2)) {
                    if (!str2.startsWith("http")) {
                        if (str2.startsWith(HttpRequest.DEFAULT_SCHEME)) {
                        }
                    }
                    return str2.concat("/setting");
                }
            }
        } catch (Throwable th2) {
            p0.b(f42707a, th2.getMessage());
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.m().d()).a();
        } catch (Throwable th2) {
            p0.b(f42707a, th2.getMessage());
        }
    }

    public void d(Context context, String str, String str2) {
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f40860r) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.utils.d.h().f40860r = true;
            if (System.currentTimeMillis() >= com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("mkey_spare_host_ts").longValue() + 86400000) {
                String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("mkey_spare_host");
                if (!TextUtils.isEmpty(strA)) {
                    for (String str3 : strA.split("\n")) {
                        if (!TextUtils.isEmpty(str3.trim()) && !com.mbridge.msdk.foundation.same.net.utils.d.h().f40863u.contains(str3.trim())) {
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f40863u.add(str3.trim());
                            com.mbridge.msdk.foundation.same.net.utils.d.h().f40866x.add(str3.trim());
                        }
                    }
                    a(context, str, str2);
                    return;
                }
            }
            new com.mbridge.msdk.foundation.same.net.wrapper.c(context.getApplicationContext()).get(0, com.mbridge.msdk.foundation.same.net.utils.d.h().f40841c, new com.mbridge.msdk.foundation.same.net.wrapper.e(), new c(context, str, str2), "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        } catch (Throwable th2) {
            com.mbridge.msdk.foundation.same.net.utils.d.h().f40860r = false;
            p0.b(f42707a, th2.getMessage());
        }
    }

    public void c(Context context, String str, String str2) {
        a(context, str, str2, "1", new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2) {
        if (!com.mbridge.msdk.foundation.same.net.utils.d.h().g()) {
            d(context, str, str2);
        } else {
            b(context, str, str2);
        }
    }

    public void a(Context context, String str, String str2, String str3, com.mbridge.msdk.foundation.same.net.wrapper.d dVar) {
        if (context == null) {
            return;
        }
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        eVar.a("app_id", str);
        eVar.a("sign", SameMD5.getMD5(str + str2));
        try {
            String strV0 = h.b().b(str).v0();
            if (TextUtils.isEmpty(strV0)) {
                strV0 = "";
            }
            eVar.a("vtag", strV0);
        } catch (Throwable th2) {
            p0.b(f42707a, th2.getMessage());
        }
        if (com.mbridge.msdk.foundation.same.net.utils.d.h().f40860r) {
            eVar.a("st_net", com.mbridge.msdk.foundation.same.net.utils.d.h().f40862t + "");
        }
        eVar.a("only_p_info", str3);
        com.mbridge.msdk.setting.net.c cVar = new com.mbridge.msdk.setting.net.c(context);
        String strConcat = com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
        try {
            if (com.mbridge.msdk.foundation.same.net.utils.d.h().f40861s && com.mbridge.msdk.foundation.same.net.utils.d.h().f40860r && com.mbridge.msdk.foundation.same.net.utils.d.h().f40865w < com.mbridge.msdk.foundation.same.net.utils.d.h().f40866x.size()) {
                String str4 = com.mbridge.msdk.foundation.same.net.utils.d.h().f40866x.get(com.mbridge.msdk.foundation.same.net.utils.d.h().f40865w);
                if (!TextUtils.isEmpty(str4) && (str4.startsWith("http") || str4.startsWith(HttpRequest.DEFAULT_SCHEME))) {
                    strConcat = str4.concat("/setting");
                }
            }
        } catch (Throwable th3) {
            p0.b(f42707a, th3.getMessage());
        }
        cVar.get(1, strConcat, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public void b(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        a(context, str, str2, "0", new b(str, context, str2));
        a(3, 0, "");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42717b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f42718c;

        public d(String str, String str2) {
            this.f42717b = str;
            this.f42718c = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) throws JSONException {
            try {
                if (u0.a(jSONObject)) {
                    String strOptString = jSONObject.optString("vtag", "");
                    String strOptString2 = jSONObject.optString("rid", "");
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unitSetting");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
                        if (jSONObject.optInt("vtag_status", 0) == 1) {
                            String strF = h.b().f(this.f42717b, this.f42718c);
                            if (!TextUtils.isEmpty(strF)) {
                                try {
                                    jSONObjectOptJSONObject = h.b().a(new JSONObject(strF), jSONObjectOptJSONObject);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                        jSONObjectOptJSONObject.put("current_time", System.currentTimeMillis());
                        jSONObjectOptJSONObject.put("vtag", strOptString);
                        jSONObjectOptJSONObject.put("rid", strOptString2);
                        h.b().a(this.f42717b, this.f42718c, jSONObjectOptJSONObject.toString());
                    }
                } else {
                    h.b().j(this.f42717b, this.f42718c);
                }
                j.this.a(1, 1, "");
            } catch (Exception e11) {
                p0.b(j.f42707a, e11.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            j.this.a(2, 1, "");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends com.mbridge.msdk.foundation.same.net.wrapper.d {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42709b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f42710c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f42711d;

        public b(String str, Context context, String str2) {
            this.f42709b = str;
            this.f42710c = context;
            this.f42711d = str2;
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(JSONObject jSONObject) throws JSONException {
            try {
                j.this.a(1, 0, "");
            } catch (Throwable th2) {
                p0.b(j.f42707a, th2.getMessage());
            }
            try {
                if (u0.a(jSONObject)) {
                    if (jSONObject.optInt("vtag_status", 0) == 1) {
                        String strE = h.b().e(this.f42709b);
                        if (!TextUtils.isEmpty(strE)) {
                            try {
                                jSONObject = h.b().a(new JSONObject(strE), jSONObject);
                            } catch (Exception e10) {
                                p0.b(j.f42707a, e10.getMessage());
                            }
                        }
                    }
                    k.a(jSONObject);
                    jSONObject.put("current_time", System.currentTimeMillis());
                    if (com.mbridge.msdk.foundation.same.net.utils.d.h().f40861s) {
                        if (TextUtils.isEmpty(jSONObject.optString("hst_st_t"))) {
                            jSONObject.put("hst_st_t", com.mbridge.msdk.foundation.same.net.utils.d.h().f40855m);
                        }
                    } else if (TextUtils.isEmpty(jSONObject.optString("hst_st"))) {
                        jSONObject.put("hst_st", com.mbridge.msdk.foundation.same.net.utils.d.h().f40851i);
                    }
                    h.b().h(this.f42709b, jSONObject.toString());
                    com.mbridge.msdk.foundation.same.net.utils.d.h().j();
                    k.a();
                    try {
                        if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                            com.mbridge.msdk.setting.util.a.a().a(this.f42710c, jSONObject.optString("mraid_js"));
                        }
                    } catch (Exception e11) {
                        p0.b(j.f42707a, e11.getMessage());
                    }
                    if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                        com.mbridge.msdk.setting.util.b.c().a(this.f42710c, jSONObject.optString("web_env_url"));
                    }
                    j.this.a(this.f42710c, this.f42709b);
                } else {
                    h.b().h(this.f42709b);
                }
                j.this.c();
            } catch (Exception e12) {
                p0.b(j.f42707a, e12.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.same.net.wrapper.d
        public void a(String str) {
            try {
                j.this.a(2, 0, str);
            } catch (Throwable th2) {
                p0.b(j.f42707a, th2.getMessage());
            }
            if (!com.mbridge.msdk.foundation.same.net.utils.d.h().f40861s) {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f40864v++;
            } else {
                com.mbridge.msdk.foundation.same.net.utils.d.h().f40865w++;
            }
            j.this.a(this.f42710c, this.f42709b, this.f42711d);
            j.this.c();
            com.google.android.gms.internal.play_billing.a.v("get app setting error", str, j.f42707a);
        }
    }

    public void a(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = com.mbridge.msdk.foundation.controller.c.m().b();
            str2 = com.mbridge.msdk.foundation.controller.c.m().c();
        }
        if (h.b().g(str3, str) && h.b().a(str, 2, str3)) {
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String str4 = C3191e4.i.f36529d + str3 + C3191e4.i.f36531e;
            eVar.a("unit_ids", str4);
            eVar.a("app_id", str);
            eVar.a("sign", SameMD5.getMD5(str + str2));
            try {
                String strJ = h.b().d(str, str4).J();
                if (TextUtils.isEmpty(strJ)) {
                    strJ = "";
                }
                eVar.a("vtag", strJ);
            } catch (Throwable th2) {
                p0.b(f42707a, th2.getMessage());
            }
            d dVar = new d(str, str3);
            dVar.setUnitId(str3);
            new com.mbridge.msdk.setting.net.c(context).get(1, com.mbridge.msdk.foundation.same.net.utils.d.h().Q, eVar, dVar, "setting", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            a(3, 1, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str) {
        g gVarD;
        h hVarB = h.b();
        if (hVarB != null && (gVarD = hVarB.d(str)) != null) {
            MBridgeConstans.OMID_JS_SERVICE_URL = gVarD.U();
            MBridgeConstans.OMID_JS_H5_URL = gVarD.T();
        }
        com.mbridge.msdk.omsdk.b.b(context);
        com.mbridge.msdk.omsdk.b.c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, String str) {
        String strB;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(C3191e4.h.W, "2000112");
            eVar.a("st_net", Integer.valueOf(com.mbridge.msdk.foundation.same.net.utils.d.h().f40862t));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("type", Integer.valueOf(i11));
            if (i11 == 0) {
                strB = b();
            } else {
                strB = com.mbridge.msdk.foundation.same.net.utils.d.h().f40861s ? com.mbridge.msdk.foundation.same.net.utils.d.h().R : com.mbridge.msdk.foundation.same.net.utils.d.h().Q;
            }
            eVar.a("url", strB);
            eVar.a("reason", str);
            cVar.a("2000112", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000112", cVar);
        } catch (Throwable th2) {
            p0.b(f42707a, th2.getMessage());
        }
    }
}
