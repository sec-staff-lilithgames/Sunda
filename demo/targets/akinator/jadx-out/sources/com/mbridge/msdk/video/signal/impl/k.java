package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3191e4;
import com.ironsource.Y1;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.video.signal.a;
import com.mbridge.msdk.video.signal.impl.a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class k extends l {

    /* renamed from: t, reason: collision with root package name */
    private Activity f45224t;

    /* renamed from: u, reason: collision with root package name */
    private String f45225u;

    /* renamed from: v, reason: collision with root package name */
    private String f45226v;

    /* renamed from: x, reason: collision with root package name */
    private CampaignEx f45228x;

    /* renamed from: y, reason: collision with root package name */
    private List<CampaignEx> f45229y;

    /* renamed from: z, reason: collision with root package name */
    private int f45230z;

    /* renamed from: w, reason: collision with root package name */
    private int f45227w = 0;
    private String A = "";
    private String B = "";
    private boolean C = false;
    private boolean D = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f45231a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f45232b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f45233c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f45234d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f45235e;

        public a(String str, String str2, String str3, String str4, int i10) {
            this.f45231a = str;
            this.f45232b = str2;
            this.f45233c = str3;
            this.f45234d = str4;
            this.f45235e = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(k.this.f45224t.getApplication())).a(new com.mbridge.msdk.foundation.entity.n("2000039", this.f45231a, this.f45232b, this.f45233c, this.f45234d, k.this.f45228x.getId(), this.f45235e, l0.a(k.this.f45224t.getApplication(), this.f45235e)));
        }
    }

    public k(Activity activity, CampaignEx campaignEx) {
        this.f45224t = activity;
        this.f45228x = campaignEx;
    }

    private String A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f45208j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.A);
            jSONObject2.put("rootViewInstanceId", this.B);
            jSONObject2.put("isRootTemplateWebView", this.C);
            jSONObject.put("sdk_info", "MAL_16.9.91,3.0.1");
            jSONObject2.put("playVideoMute", this.f45212n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<CampaignEx> list = this.f45229y;
            if (list == null || list.size() <= 0) {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.f45228x));
            } else {
                for (CampaignEx campaignEx : this.f45229y) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(campaignEx, campaignEx.isReady(), b(campaignEx)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", x());
            String strE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.m().b());
            if (!TextUtils.isEmpty(strE)) {
                JSONObject jSONObject3 = new JSONObject(strE);
                c(jSONObject3);
                String strC = com.mbridge.msdk.setting.h.b().c(this.f45208j);
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject3.put("ivreward", new JSONObject(strC));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", w());
            if (!TextUtils.isEmpty(this.f45208j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f45208j);
            }
            jSONObject.put("rw_plus", this.D ? "1" : "0");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return jSONObject.toString();
    }

    private JSONObject B() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(this.f45208j)) {
                return jSONObject;
            }
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f45208j);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject C() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            com.mbridge.msdk.videocommon.setting.c cVar = this.f45209k;
            if (cVar == null) {
                return jSONObject;
            }
            jSONObject.put("unitSetting", cVar.H());
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.m().b());
            if (!TextUtils.isEmpty(strE)) {
                jSONObject.put("appSetting", new JSONObject(strE));
                return jSONObject;
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f45212n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.f45228x));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", x());
            String strE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.m().b());
            if (!TextUtils.isEmpty(strE)) {
                JSONObject jSONObject3 = new JSONObject(strE);
                c(jSONObject3);
                String strC = com.mbridge.msdk.setting.h.b().c(this.f45208j);
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject3.put("ivreward", strC);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", w());
            return jSONObject;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
            return jSONObject;
        } catch (Exception e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
        return aVarC != null ? aVarC.k() : jSONObject;
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.setting.c cVar = this.f45209k;
        return cVar != null ? cVar.H() : jSONObject;
    }

    private JSONObject y() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_16.9.91,3.0.1");
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    private JSONObject z() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f45212n);
            jSONObject2.put("instanceId", this.A);
            jSONObject.put("sdkSetting", jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public void c(CampaignEx campaignEx) {
        this.f45228x = campaignEx;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.e
    public void click(int i10, String str) {
        AppletsModel appletsModel;
        List<CampaignEx> list;
        int i11;
        super.click(i10, str);
        CampaignEx campaignEx = this.f45228x;
        if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
            b(str);
        }
        try {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return;
                    }
                    this.f45211m.a(true);
                    return;
                }
                CampaignEx campaignEx2 = this.f45228x;
                if (campaignEx2 == null || campaignEx2.getCbd() <= -2) {
                    com.mbridge.msdk.videocommon.setting.c cVar = this.f45209k;
                    i11 = cVar != null ? cVar.i() : 1;
                } else {
                    i11 = this.f45228x.getCbd();
                }
                if (i11 == -1) {
                    a(new a.b(this, this.f45211m));
                }
                this.f45227w = i10;
                click(1, str);
                return;
            }
            if (this.f45228x == null && (list = this.f45229y) != null && list.size() > 0) {
                this.f45228x = this.f45229y.get(0);
            }
            CampaignEx campaignEx3 = this.f45228x;
            if (campaignEx3 == null) {
                return;
            }
            CampaignEx campaignExA = a(str, campaignEx3);
            if (this.f45227w != 3) {
                this.f45227w = i10;
            }
            a(campaignExA);
            if (campaignExA != null && (appletsModel = AppletModelManager.getInstance().get(campaignExA)) != null) {
                appletsModel.setUserClick(true);
                AppletModelManager.getInstance().replace(appletsModel, campaignExA);
            }
            a(campaignExA, this.f45224t);
        } catch (Throwable th2) {
            p0.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    public void d(String str) {
        this.B = str;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String e() {
        p0.a("DefaultJSCommon", "getNotchArea");
        return this.f45226v;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void f() {
        super.f();
        try {
            Activity activity = this.f45224t;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th2) {
            p0.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playVideoMute", this.f45212n);
            jSONObject.put("userVideoMute", this.f45213o);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public void h(int i10) {
        this.f45230z = i10;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i10, String str) {
        super.handlerH5Exception(i10, str);
        try {
            this.f45211m.a(i10, str);
        } catch (Throwable th2) {
            p0.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    public void r() {
        this.f45225u = "";
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        this.f45224t = activity;
    }

    public int v() {
        return this.f45230z;
    }

    private void b(String str) {
        List<CampaignEx> list;
        if (this.f45228x == null || (list = this.f45229y) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.f45228x = this.f45229y.get(jSONObject.getInt("camp_position"));
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void a(List<CampaignEx> list) {
        this.f45229y = list;
    }

    public void c(boolean z10) {
        this.C = z10;
    }

    public void d(boolean z10) {
        this.D = z10;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void h() {
        super.h();
        a.InterfaceC0353a interfaceC0353a = this.f45211m;
        if (interfaceC0353a != null) {
            interfaceC0353a.a();
        }
    }

    private CampaignEx a(String str, CampaignEx campaignEx) throws JSONException {
        String strValueOf;
        String strValueOf2;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                if (campaignWithBackData == null) {
                    campaignWithBackData = campaignEx;
                }
                if (!TextUtils.isEmpty(str)) {
                    a(jSONObjectCampaignToJsonObject, campaignWithBackData);
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.f40713j);
                    if (jSONObjectOptJSONObject != null) {
                        strValueOf = String.valueOf(u0.a(this.f45224t, Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.f40711h)).intValue()));
                        strValueOf2 = String.valueOf(u0.a(this.f45224t, Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.f40712i)).intValue()));
                    } else {
                        strValueOf = "-999";
                        strValueOf2 = "-999";
                    }
                    campaignWithBackData.setClickURL(com.mbridge.msdk.click.c.a(campaignWithBackData.getClickURL(), strValueOf, strValueOf2));
                    String noticeUrl = campaignWithBackData.getNoticeUrl();
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        StringBuilder sb2 = new StringBuilder();
                        while (itKeys.hasNext()) {
                            sb2.append(C3191e4.i.f36527c);
                            String next = itKeys.next();
                            String strOptString = jSONObjectOptJSONObject.optString(next);
                            if (com.mbridge.msdk.foundation.same.a.f40711h.equals(next) || com.mbridge.msdk.foundation.same.a.f40712i.equals(next)) {
                                strOptString = String.valueOf(u0.a(this.f45224t, Integer.valueOf(strOptString).intValue()));
                            }
                            sb2.append(next);
                            sb2.append(C3191e4.i.f36525b);
                            sb2.append(strOptString);
                        }
                        campaignWithBackData.setNoticeUrl(noticeUrl + ((Object) sb2));
                    }
                }
                return campaignWithBackData;
            } catch (JSONException e10) {
                e10.printStackTrace();
                return campaignEx;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return campaignEx;
            }
        }
        try {
            JSONObject jSONObjectCampaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            JSONObject jSONObject = new JSONObject(str);
            b(jSONObject);
            try {
                if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                    jSONObjectCampaignToJsonObject2.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                }
            } catch (Exception unused) {
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObjectCampaignToJsonObject2.put(next2, jSONObject.getString(next2));
            }
            CampaignEx campaignWithBackData2 = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject2);
            a(jSONObjectCampaignToJsonObject2, campaignWithBackData2);
            return campaignWithBackData2;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return campaignEx;
        }
    }

    public void c(String str) {
        this.A = str;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String c() {
        this.f45211m.onInitSuccess();
        this.f45199a = true;
        if (TextUtils.isEmpty(this.f45225u)) {
            this.f45225u = A();
        } else {
            this.f45225u = u0.b(this.f45225u, "tun", l0.y() + "");
        }
        return this.f45225u;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String f(int i10) {
        switch (i10) {
            case 1:
                return y().toString();
            case 2:
                return B().toString();
            case 3:
                return s().toString();
            case 4:
                return C().toString();
            case 5:
                return u().toString();
            case 6:
                return z().toString();
            default:
                return t().toString();
        }
    }

    public k(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.f45224t = activity;
        this.f45228x = campaignEx;
        this.f45229y = list;
    }

    private boolean b(CampaignEx campaignEx) {
        com.mbridge.msdk.setting.g gVarD;
        try {
            String strB = com.mbridge.msdk.foundation.controller.c.m().b();
            long jA0 = (TextUtils.isEmpty(strB) || (gVarD = com.mbridge.msdk.setting.h.b().d(strB)) == null) ? 0L : gVarD.a0() * 1000;
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            long jE = aVarC != null ? aVarC.e() : 0L;
            if (campaignEx != null) {
                return campaignEx.isSpareOffer(jE, jA0);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private void c(JSONObject jSONObject) throws JSONException {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
            String string = x0.a(contextD, "MBridge_ConfirmTitle" + this.f45208j, "").toString();
            String string2 = x0.a(contextD, "MBridge_ConfirmContent" + this.f45208j, "").toString();
            String string3 = x0.a(contextD, "MBridge_CancelText" + this.f45208j, "").toString();
            String string4 = x0.a(contextD, "MBridge_ConfirmText" + this.f45208j, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("confirm_title", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put("confirm_description", string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put("confirm_t", string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put("confirm_c_play", string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put("confirm_c_rv", string4);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String strOptString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            campaignEx.setCampaignUnitId(strOptString);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void a(int i10, String str) {
        super.a(i10, str);
        if (i10 != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT), jSONObject.optString("template", Y1.f35726f), jSONObject.optString(TtmlNode.TAG_LAYOUT, Y1.f35726f), jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f45208j), l0.s(this.f45224t.getApplication()));
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        } catch (Throwable th2) {
            p0.b("DefaultJSCommon", th2.getMessage(), th2);
        }
    }

    private void a(CampaignEx campaignEx) {
        try {
            int i10 = this.f45227w;
            if (i10 == 3) {
                campaignEx.setClickTempSource(2);
                if (campaignEx.getTriggerClickSource() == 0) {
                    campaignEx.setTriggerClickSource(2);
                    return;
                }
                return;
            }
            if (i10 != 1 || campaignEx.getClickTempSource() == 2) {
                return;
            }
            campaignEx.setClickTempSource(1);
        } catch (Exception e10) {
            p0.b("DefaultJSCommon", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f45226v = str;
    }
}
