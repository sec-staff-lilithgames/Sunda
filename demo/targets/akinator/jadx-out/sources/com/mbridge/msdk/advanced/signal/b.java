package com.mbridge.msdk.advanced.signal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.device.ads.MraidExpandCommand;
import com.amazon.device.ads.MraidUseCustomCloseCommand;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.communication.c;
import com.mbridge.msdk.mbsignalcommon.communication.d;
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
/* loaded from: classes4.dex */
public class b extends c {

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<Context> f39605c;

    /* renamed from: d, reason: collision with root package name */
    private List<CampaignEx> f39606d;

    /* renamed from: e, reason: collision with root package name */
    private String f39607e;

    /* renamed from: f, reason: collision with root package name */
    private String f39608f;

    /* renamed from: g, reason: collision with root package name */
    private int f39609g;

    /* renamed from: h, reason: collision with root package name */
    private int f39610h;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.a f39612j;

    /* renamed from: k, reason: collision with root package name */
    private NativeAdvancedExpandDialog f39613k;

    /* renamed from: b, reason: collision with root package name */
    private String f39604b = "NativeAdvancedJSBridgeImpl";

    /* renamed from: i, reason: collision with root package name */
    private int f39611i = 5;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f39614a;

        public a(ArrayList arrayList) {
            this.f39614a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                Iterator it = this.f39614a.iterator();
                while (it.hasNext()) {
                    jVarA.b((String) it.next());
                }
            } catch (Exception unused) {
                p0.b(b.this.f39604b, "campain can't insert db");
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f39608f = str;
        this.f39607e = str2;
        this.f39605c = new WeakReference<>(context);
    }

    public void b(int i10) {
        this.f39611i = i10;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public void c(Object obj, String str) {
        try {
            if (obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) {
                f.a().a(((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b);
            }
        } catch (Throwable th2) {
            p0.b(this.f39604b, "onSignalCommunicationConnect", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void click(Object obj, String str) {
        try {
            List<CampaignEx> list = this.f39606d;
            CampaignEx campaignEx = (list == null || list.size() <= 0) ? null : this.f39606d.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = campaignEx != null ? CampaignEx.campaignToJsonObject(campaignEx) : new JSONObject();
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
                p0.b(this.f39604b, e10.getMessage());
            }
            com.mbridge.msdk.advanced.middle.a aVar = this.f39612j;
            if (aVar != null) {
                aVar.a(campaignEx);
            }
        } catch (Throwable th2) {
            p0.b(this.f39604b, "click", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        p0.b(this.f39604b, "close");
        try {
            com.mbridge.msdk.advanced.middle.a aVar = this.f39612j;
            if (aVar != null) {
                aVar.close();
            }
        } catch (Throwable th2) {
            p0.b(this.f39604b, "close", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void d(Object obj, String str) {
        com.google.android.gms.internal.play_billing.a.D("sendImpressions:", str, this.f39604b);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                for (CampaignEx campaignEx : this.f39606d) {
                    if (campaignEx.getId().equals(string)) {
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f39607e, campaignEx, "h5_native");
                        arrayList.add(string);
                    }
                }
            }
            new Thread(new a(arrayList)).start();
        } catch (Throwable th2) {
            p0.b(this.f39604b, "sendImpressions", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("url", str);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f39605c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            NativeAdvancedExpandDialog nativeAdvancedExpandDialog = this.f39613k;
            if (nativeAdvancedExpandDialog == null || !nativeAdvancedExpandDialog.isShowing()) {
                NativeAdvancedExpandDialog nativeAdvancedExpandDialog2 = new NativeAdvancedExpandDialog(this.f39605c.get(), bundle, this.f39612j);
                this.f39613k = nativeAdvancedExpandDialog2;
                nativeAdvancedExpandDialog2.setCampaignList(this.f39607e, this.f39606d);
                this.f39613k.show();
                com.mbridge.msdk.advanced.middle.a aVar = this.f39612j;
                if (aVar != null) {
                    aVar.a(true);
                }
                com.mbridge.msdk.advanced.report.a.a(this.f39607e, getMraidCampaign(), str);
            }
        } catch (Throwable th2) {
            p0.b(this.f39604b, MraidExpandCommand.NAME, th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void getFileInfo(Object obj, String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is empty");
            return;
        }
        try {
            com.mbridge.msdk.advanced.signal.a.a(obj, new JSONObject(str));
        } catch (Throwable th2) {
            p0.a(this.f39604b, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f39606d;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.f39606d.get(0);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void init(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            com.mbridge.msdk.advanced.common.b bVar = new com.mbridge.msdk.advanced.common.b(com.mbridge.msdk.foundation.controller.c.m().d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f39609g);
            jSONObject2.put("customURLScheme", 1);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(C3191e4.h.G, bVar.b());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f39606d));
            l lVarA = h.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.f39607e);
            if (lVarA == null) {
                lVarA = l.k(this.f39607e);
            }
            if (!TextUtils.isEmpty(this.f39608f)) {
                lVarA.d(this.f39608f);
            }
            lVarA.e(this.f39607e);
            lVarA.j(this.f39611i);
            lVarA.a(this.f39610h);
            jSONObject.put("unitSetting", lVarA.M());
            String strE = h.b().e(com.mbridge.msdk.foundation.controller.c.m().b());
            if (!TextUtils.isEmpty(strE)) {
                jSONObject.put("appSetting", new JSONObject(strE));
            }
            jSONObject.put("sdk_info", com.mbridge.msdk.mbsignalcommon.base.d.f41814a);
            p0.b(this.f39604b, C3191e4.a.f36368f + jSONObject.toString());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th2) {
            p0.b(this.f39604b, C3191e4.a.f36368f, th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public void install(Object obj, String str) {
        p0.b(this.f39604b, "install");
        try {
            List<CampaignEx> list = this.f39606d;
            CampaignEx campaignEx = (list == null || list.size() <= 0) ? null : this.f39606d.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = campaignEx != null ? CampaignEx.campaignToJsonObject(campaignEx) : new JSONObject();
                JSONObject jSONObject = new JSONObject(str).getJSONObject("pt");
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
            com.mbridge.msdk.advanced.middle.a aVar = this.f39612j;
            if (aVar != null) {
                aVar.a(campaignEx);
            }
        } catch (Throwable th2) {
            p0.b(this.f39604b, "install", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        com.mbridge.msdk.advanced.middle.a aVar = this.f39612j;
        if (aVar != null) {
            aVar.a(true, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void readyStatus(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            if (!(obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) || (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b) == null) {
                return;
            }
            try {
                windVaneWebView.getWebViewListener().a(windVaneWebView, new JSONObject(str).getInt("isReady"));
            } catch (Exception unused) {
                windVaneWebView.getWebViewListener().a(windVaneWebView, 2);
            }
        } catch (Throwable th2) {
            p0.a(this.f39604b, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void reportUrls(Object obj, String str) throws JSONException {
        p0.a(this.f39604b, "reportUrls:" + str);
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is null");
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
                    List<CampaignEx> list = this.f39606d;
                    com.mbridge.msdk.click.a.a(contextD, list != null ? list.get(0) : null, "", strA, false, iOptInt != 0);
                } else {
                    Context contextD2 = com.mbridge.msdk.foundation.controller.c.m().d();
                    List<CampaignEx> list2 = this.f39606d;
                    com.mbridge.msdk.click.a.a(contextD2, list2 != null ? list2.get(0) : null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            f.a().b(obj, d.a(0));
        } catch (Throwable th2) {
            p0.b(this.f39604b, "reportUrls", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            com.mbridge.msdk.advanced.middle.a aVar = this.f39612j;
            if (aVar != null) {
                aVar.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable th2) {
            p0.b(this.f39604b, "toggleCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void triggerCloseBtn(Object obj, String str) throws JSONException {
        if (this.f39612j != null) {
            com.mbridge.msdk.advanced.signal.a.a(obj);
            this.f39612j.triggerCloseBtn(obj, str);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void unload() {
        close();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void useCustomClose(boolean z10) {
        try {
            if (this.f39610h == -1) {
                int i10 = z10 ? 2 : 1;
                com.mbridge.msdk.advanced.middle.a aVar = this.f39612j;
                if (aVar != null) {
                    aVar.toggleCloseBtn(i10);
                }
            }
        } catch (Throwable th2) {
            p0.b(this.f39604b, MraidUseCustomCloseCommand.NAME, th2);
        }
    }

    public void a(int i10) {
        this.f39610h = i10;
    }

    public void a(com.mbridge.msdk.advanced.middle.a aVar) {
        if (aVar != null) {
            this.f39612j = aVar;
        }
    }

    public void a(List<CampaignEx> list) {
        this.f39606d = list;
    }

    public List<CampaignEx> a() {
        return this.f39606d;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.a, com.mbridge.msdk.mbsignalcommon.communication.b
    public void a(Object obj, String str) throws JSONException {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i10 = new JSONObject(str).getInt("countdown");
            com.mbridge.msdk.advanced.middle.a aVar = this.f39612j;
            if (aVar != null) {
                aVar.a(i10);
            }
        } catch (JSONException e10) {
            p0.b(this.f39604b, "resetCountdown", e10);
        }
    }
}
