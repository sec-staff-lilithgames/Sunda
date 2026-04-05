package com.mbridge.msdk.splash.signal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.device.ads.MraidExpandCommand;
import com.amazon.device.ads.MraidUseCustomCloseCommand;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.base.d;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a implements com.mbridge.msdk.mbsignalcommon.mraid.b {

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f42990b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f42991c;

    /* renamed from: d, reason: collision with root package name */
    private String f42992d;

    /* renamed from: e, reason: collision with root package name */
    private String f42993e;

    /* renamed from: f, reason: collision with root package name */
    private int f42994f;

    /* renamed from: g, reason: collision with root package name */
    private int f42995g;

    /* renamed from: i, reason: collision with root package name */
    private int f42997i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.a f42998j;

    /* renamed from: k, reason: collision with root package name */
    private SplashExpandDialog f42999k;

    /* renamed from: a, reason: collision with root package name */
    protected String f42989a = "SplashSignalCommunicationImpl";

    /* renamed from: h, reason: collision with root package name */
    private int f42996h = 5;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.splash.signal.a$a, reason: collision with other inner class name */
    public class RunnableC0328a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f43000a;

        public RunnableC0328a(ArrayList arrayList) {
            this.f43000a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                Iterator it = this.f43000a.iterator();
                while (it.hasNext()) {
                    jVarA.b((String) it.next());
                }
            } catch (Exception unused) {
                p0.b(a.this.f42989a, "campain can't insert db");
            }
        }
    }

    public a(Context context, String str, String str2) {
        this.f42993e = str;
        this.f42992d = str2;
        this.f42990b = new WeakReference<>(context);
    }

    public void a(Context context) {
        this.f42990b = new WeakReference<>(context);
    }

    public void b(int i10) {
        this.f42996h = i10;
    }

    public void c(int i10) {
        this.f42997i = i10;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        p0.b(this.f42989a, "close");
        try {
            com.mbridge.msdk.splash.middle.a aVar = this.f42998j;
            if (aVar != null) {
                aVar.close();
            }
        } catch (Throwable th2) {
            p0.b(this.f42989a, "close", th2);
        }
    }

    public void d(Object obj, String str) {
        com.google.android.gms.internal.play_billing.a.D("sendImpressions:", str, this.f42989a);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                for (CampaignEx campaignEx : this.f42991c) {
                    if (campaignEx.getId().equals(string)) {
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f42992d, campaignEx, "splash");
                        arrayList.add(string);
                    }
                }
            }
            new Thread(new RunnableC0328a(arrayList)).start();
        } catch (Throwable th2) {
            p0.b(this.f42989a, "sendImpressions", th2);
        }
    }

    public void e(Object obj, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Call pause count down success.");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("countdown", this.f42997i);
            jSONObject.put("data", jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            p0.b(this.f42989a, e10.getMessage());
        }
        com.mbridge.msdk.splash.middle.a aVar = this.f42998j;
        if (aVar != null) {
            aVar.a(1, -1);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f42990b;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            SplashExpandDialog splashExpandDialog = this.f42999k;
            if (splashExpandDialog == null || !splashExpandDialog.isShowing()) {
                SplashExpandDialog splashExpandDialog2 = new SplashExpandDialog(this.f42990b.get(), bundle, this.f42998j);
                this.f42999k = splashExpandDialog2;
                splashExpandDialog2.setCampaignList(this.f42992d, this.f42991c);
                this.f42999k.show();
                com.mbridge.msdk.splash.middle.a aVar = this.f42998j;
                if (aVar != null) {
                    aVar.a(true);
                }
                com.mbridge.msdk.splash.report.a.a(this.f42992d, getMraidCampaign(), str);
            }
        } catch (Throwable th2) {
            p0.b(this.f42989a, MraidExpandCommand.NAME, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.lang.Object r3, java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L2c
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L22
            r0.<init>(r4)     // Catch: java.lang.Exception -> L22
            java.lang.String r4 = "countdown"
            int r4 = r0.optInt(r4)     // Catch: java.lang.Exception -> L22
            com.mbridge.msdk.mbsignalcommon.windvane.f r0 = com.mbridge.msdk.mbsignalcommon.windvane.f.a()     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = com.mbridge.msdk.splash.signal.c.a(r1)     // Catch: java.lang.Exception -> L1f
            r0.b(r3, r1)     // Catch: java.lang.Exception -> L1f
            r1 = r4
            goto L2c
        L1f:
            r3 = move-exception
            r1 = r4
            goto L23
        L22:
            r3 = move-exception
        L23:
            java.lang.String r4 = r2.f42989a
            java.lang.String r3 = r3.getMessage()
            com.mbridge.msdk.foundation.tools.p0.b(r4, r3)
        L2c:
            com.mbridge.msdk.splash.middle.a r3 = r2.f42998j
            if (r3 == 0) goto L34
            r4 = 2
            r3.a(r4, r1)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.signal.a.f(java.lang.Object, java.lang.String):void");
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f42991c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f42991c.get(0);
    }

    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.mbridge.msdk.splash.common.b bVar = new com.mbridge.msdk.splash.common.b(com.mbridge.msdk.foundation.controller.c.m().d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f42994f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(C3191e4.h.G, bVar.b());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f42991c));
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.m().b(), this.f42992d);
            if (lVarE == null) {
                lVarE = l.i(this.f42992d);
            }
            if (!TextUtils.isEmpty(this.f42993e)) {
                lVarE.d(this.f42993e);
            }
            lVarE.e(this.f42992d);
            lVarE.j(this.f42996h);
            lVarE.a(this.f42995g);
            jSONObject.put("unitSetting", lVarE.M());
            String strE = h.b().e(com.mbridge.msdk.foundation.controller.c.m().b());
            if (!TextUtils.isEmpty(strE)) {
                jSONObject.put("appSetting", new JSONObject(strE));
            }
            jSONObject.put("sdk_info", d.f41814a);
            p0.b(this.f42989a, C3191e4.a.f36368f + jSONObject.toString());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th2) {
            p0.b(this.f42989a, C3191e4.a.f36368f, th2);
        }
    }

    public void install(Object obj, String str) {
        p0.b(this.f42989a, "install");
        try {
            List<CampaignEx> list = this.f42991c;
            if (list == null) {
                return;
            }
            CampaignEx campaignEx = list.size() > 0 ? this.f42991c.get(0) : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectCampaignToJsonObject.put(next, jSONObject.getString(next));
                }
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                String strOptString = jSONObjectCampaignToJsonObject.optString("unitId");
                if (!TextUtils.isEmpty(strOptString)) {
                    campaignWithBackData.setCampaignUnitId(strOptString);
                }
                campaignEx = campaignWithBackData;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            com.mbridge.msdk.splash.middle.a aVar = this.f42998j;
            if (aVar != null) {
                aVar.a(campaignEx);
            }
        } catch (Throwable th2) {
            p0.b(this.f42989a, "click", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        com.mbridge.msdk.splash.middle.a aVar = this.f42998j;
        if (aVar != null) {
            aVar.a(true, str);
        }
    }

    public void openURL(Object obj, String str) throws JSONException {
        WindVaneWebView windVaneWebView;
        p0.b(this.f42989a, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextD == null) {
            try {
                if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b) != null) {
                    contextD = windVaneWebView.getContext();
                }
            } catch (Exception e10) {
                p0.b(this.f42989a, e10.getMessage());
            }
        }
        if (contextD == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.mbridge.msdk.click.c.c(contextD, strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.e(contextD, strOptString);
            }
        } catch (JSONException e11) {
            p0.b(this.f42989a, e11.getMessage());
        } catch (Throwable th2) {
            p0.b(this.f42989a, th2.getMessage());
        }
    }

    public void reportUrls(Object obj, String str) throws JSONException {
        p0.a(this.f42989a, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                int iOptInt = jSONObject.optInt("type");
                String strA = u0.a(jSONObject.optString("url"), "&tun=", l0.y() + "");
                int iOptInt2 = jSONObject.optInt("report");
                if (iOptInt2 == 0) {
                    Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                    List<CampaignEx> list = this.f42991c;
                    com.mbridge.msdk.click.a.a(contextD, list != null ? list.get(0) : null, "", strA, false, iOptInt != 0);
                } else {
                    Context contextD2 = com.mbridge.msdk.foundation.controller.c.m().d();
                    List<CampaignEx> list2 = this.f42991c;
                    com.mbridge.msdk.click.a.a(contextD2, list2 != null ? list2.get(0) : null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            f.a().b(obj, c.a(0));
        } catch (Throwable th2) {
            p0.b(this.f42989a, "reportUrls", th2);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            com.mbridge.msdk.splash.middle.a aVar = this.f42998j;
            if (aVar != null) {
                aVar.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable th2) {
            p0.b(this.f42989a, "toggleCloseBtn", th2);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        com.mbridge.msdk.splash.middle.a aVar = this.f42998j;
        if (aVar != null) {
            aVar.triggerCloseBtn(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        int i10 = z10 ? 2 : 1;
        try {
            com.mbridge.msdk.splash.middle.a aVar = this.f42998j;
            if (aVar != null) {
                aVar.toggleCloseBtn(i10);
            }
        } catch (Throwable th2) {
            p0.b(this.f42989a, MraidUseCustomCloseCommand.NAME, th2);
        }
    }

    public void a(int i10) {
        this.f42995g = i10;
    }

    public List<CampaignEx> b() {
        return this.f42991c;
    }

    public void c(Object obj, String str) {
        try {
            if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
                f.a().a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b);
            }
        } catch (Throwable th2) {
            p0.b(this.f42989a, "onJSBridgeConnect", th2);
        }
    }

    public void a(com.mbridge.msdk.splash.middle.a aVar) {
        if (aVar != null) {
            this.f42998j = aVar;
        }
    }

    public com.mbridge.msdk.splash.middle.a a() {
        return this.f42998j;
    }

    public void a(List<CampaignEx> list) {
        this.f42991c = list;
    }

    public void a(Object obj, String str) throws JSONException {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i10 = new JSONObject(str).getInt("countdown");
            com.mbridge.msdk.splash.middle.a aVar = this.f42998j;
            if (aVar != null) {
                aVar.a(i10);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
