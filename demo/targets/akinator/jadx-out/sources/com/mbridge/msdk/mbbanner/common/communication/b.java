package com.mbridge.msdk.mbbanner.common.communication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.device.ads.MraidExpandCommand;
import com.amazon.device.ads.MraidUseCustomCloseCommand;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.communication.c;
import com.mbridge.msdk.mbsignalcommon.communication.d;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b extends c {

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<Context> f41413b;

    /* renamed from: c, reason: collision with root package name */
    private List<CampaignEx> f41414c;

    /* renamed from: d, reason: collision with root package name */
    private String f41415d;

    /* renamed from: e, reason: collision with root package name */
    private String f41416e;

    /* renamed from: f, reason: collision with root package name */
    private int f41417f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.a f41418g;

    /* renamed from: h, reason: collision with root package name */
    private BannerExpandDialog f41419h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f41420i = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f41421a;

        public a(ArrayList arrayList) {
            this.f41421a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                Iterator it = this.f41421a.iterator();
                while (it.hasNext()) {
                    jVarA.b((String) it.next());
                }
            } catch (Exception e10) {
                p0.b("BannerSignalCommunicationImpl", e10.getMessage());
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f41415d = str;
        this.f41416e = str2;
        this.f41413b = new WeakReference<>(context);
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.a aVar) {
        if (aVar != null) {
            this.f41418g = aVar;
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void click(Object obj, String str) {
        p0.b("BannerSignalCommunicationImpl", "click");
        try {
            List<CampaignEx> list = this.f41414c;
            if (list == null) {
                return;
            }
            CampaignEx campaignEx = list.size() > 0 ? this.f41414c.get(0) : null;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
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
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f41418g;
            if (aVar != null) {
                aVar.a(campaignEx);
            }
        } catch (Throwable th2) {
            p0.b("BannerSignalCommunicationImpl", "click", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void close() {
        p0.b("BannerSignalCommunicationImpl", "close");
        try {
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f41418g;
            if (aVar != null) {
                aVar.close();
            }
        } catch (Throwable th2) {
            p0.b("BannerSignalCommunicationImpl", "close", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void d(Object obj, String str) {
        com.google.android.gms.internal.play_billing.a.D("sendImpressions:", str, "BannerSignalCommunicationImpl");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                for (CampaignEx campaignEx : this.f41414c) {
                    if (campaignEx.getId().equals(string)) {
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.f41416e, campaignEx, "banner");
                        arrayList.add(string);
                    }
                }
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(arrayList));
        } catch (Throwable th2) {
            p0.b("BannerSignalCommunicationImpl", "sendImpressions", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void expand(String str, boolean z10) {
        Context context;
        String bannerUrl;
        try {
            String str2 = "";
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().getBannerHtml())) {
                    bannerUrl = getMraidCampaign().getBannerUrl();
                } else {
                    bannerUrl = "file:////" + getMraidCampaign().getBannerHtml();
                }
                str2 = bannerUrl;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            bundle.putString("url", str2);
            bundle.putBoolean("shouldUseCustomClose", z10);
            WeakReference<Context> weakReference = this.f41413b;
            if (weakReference != null && (context = weakReference.get()) != null) {
                BannerExpandDialog bannerExpandDialog = this.f41419h;
                if (bannerExpandDialog != null && bannerExpandDialog.isShowing()) {
                    return;
                }
                BannerExpandDialog bannerExpandDialog2 = new BannerExpandDialog(context, bundle, this.f41418g);
                this.f41419h = bannerExpandDialog2;
                bannerExpandDialog2.setCampaignList(this.f41416e, this.f41414c);
                this.f41419h.show();
            }
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f41418g;
            if (aVar != null) {
                aVar.a(true);
            }
            com.mbridge.msdk.mbbanner.common.report.a.a(this.f41416e, getMraidCampaign(), str);
        } catch (Throwable th2) {
            p0.b("BannerSignalCommunicationImpl", MraidExpandCommand.NAME, th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void getFileInfo(Object obj, String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            d.a(obj, "params is empty");
            return;
        }
        try {
            a(obj, new JSONObject(str));
        } catch (Throwable th2) {
            p0.a("BannerSignalCommunicationImpl", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f41414c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f41414c.get(0);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void init(Object obj, String str) {
        p0.b("BannerSignalCommunicationImpl", "BANNER INIT INVOKE");
        try {
            JSONObject jSONObject = new JSONObject();
            t tVar = new t(com.mbridge.msdk.foundation.controller.c.m().d());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f41417f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put(C3191e4.h.G, tVar.a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f41414c));
            l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.m().b(), this.f41416e);
            if (lVarE == null) {
                lVarE = l.i(this.f41416e);
            }
            if (!TextUtils.isEmpty(this.f41415d)) {
                lVarE.d(this.f41415d);
            }
            jSONObject.put("unitSetting", lVarE.M());
            String strE = h.b().e(com.mbridge.msdk.foundation.controller.c.m().b());
            if (!TextUtils.isEmpty(strE)) {
                jSONObject.put("appSetting", new JSONObject(strE));
            }
            jSONObject.put("sdk_info", com.mbridge.msdk.mbsignalcommon.base.d.f41814a);
            p0.b("BannerSignalCommunicationImpl", C3191e4.a.f36368f + jSONObject.toString());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th2) {
            p0.b("BannerSignalCommunicationImpl", C3191e4.a.f36368f, th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
    public void open(String str) {
        p0.b("BannerSignalCommunicationImpl", "open");
        try {
            p0.b("BannerSignalCommunicationImpl", str);
            if (this.f41414c.size() > 1) {
                com.mbridge.msdk.foundation.controller.c.m().d().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f41418g;
            if (aVar != null) {
                aVar.a(true, str);
            }
        } catch (Throwable th2) {
            p0.b("BannerSignalCommunicationImpl", "open", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void readyStatus(Object obj, String str) {
        if (obj != null) {
            try {
                int iOptInt = new JSONObject(str).optInt("isReady", 1);
                f.a().b(obj, d.a(0));
                com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f41418g;
                if (aVar != null) {
                    aVar.readyStatus(iOptInt);
                }
            } catch (Throwable th2) {
                p0.b("BannerSignalCommunicationImpl", "readyStatus", th2);
            }
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void reportUrls(Object obj, String str) throws JSONException {
        p0.a("BannerSignalCommunicationImpl", "reportUrls:" + str);
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
                    List<CampaignEx> list = this.f41414c;
                    com.mbridge.msdk.click.a.a(contextD, list != null ? list.get(0) : null, "", strA, false, iOptInt != 0);
                } else {
                    Context contextD2 = com.mbridge.msdk.foundation.controller.c.m().d();
                    List<CampaignEx> list2 = this.f41414c;
                    com.mbridge.msdk.click.a.a(contextD2, list2 != null ? list2.get(0) : null, "", strA, false, iOptInt != 0, iOptInt2);
                }
            }
            f.a().b(obj, d.a(0));
        } catch (Throwable th2) {
            p0.b("BannerSignalCommunicationImpl", "reportUrls", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void toggleCloseBtn(Object obj, String str) {
        p0.b("BannerSignalCommunicationImpl", "toggleCloseBtn");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iOptInt = new JSONObject(str).optInt("state");
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f41418g;
            if (aVar != null) {
                aVar.toggleCloseBtn(iOptInt);
            }
        } catch (Throwable th2) {
            p0.b("BannerSignalCommunicationImpl", "toggleCloseBtn", th2);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.communication.b
    public void triggerCloseBtn(Object obj, String str) {
        p0.b("BannerSignalCommunicationImpl", "triggerCloseBtn");
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String strOptString = new JSONObject(str).optString("state");
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f41418g;
            if (aVar != null) {
                aVar.triggerCloseBtn(strOptString);
            }
            f.a().b(obj, d.a(0));
        } catch (Throwable th2) {
            p0.b("BannerSignalCommunicationImpl", "triggerCloseBtn", th2);
            f.a().b(obj, d.a(-1));
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
            com.mbridge.msdk.mbbanner.common.listener.a aVar = this.f41418g;
            if (aVar != null) {
                aVar.toggleCloseBtn(i10);
            }
        } catch (Throwable th2) {
            p0.b("BannerSignalCommunicationImpl", MraidUseCustomCloseCommand.NAME, th2);
        }
    }

    public void a(List<CampaignEx> list) {
        this.f41414c = list;
    }

    public void a(int i10) {
        this.f41417f = i10;
    }

    public void a() {
        if (this.f41418g != null) {
            this.f41418g = null;
        }
        if (this.f41419h != null) {
            this.f41419h = null;
        }
    }

    public static void a(Object obj, JSONObject jSONObject) throws JSONException {
        String str;
        int i10;
        boolean z10;
        String str2;
        File file;
        String str3 = "";
        JSONObject jSONObject2 = new JSONObject();
        int i11 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "params is null");
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e10) {
                p0.a("BannerSignalCommunicationImpl", e10.getMessage());
                return;
            }
        }
        try {
            try {
                jSONObject2.put("code", 0);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
                JSONArray jSONArray = jSONObject.getJSONArray("resource");
                if (jSONArray != null && jSONArray.length() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    int length = jSONArray.length();
                    int i12 = 0;
                    while (i12 < length) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i12);
                        String strOptString = jSONObject3.optString("ref", str3);
                        int i13 = jSONObject3.getInt("type");
                        JSONObject jSONObject4 = new JSONObject();
                        JSONArray jSONArray3 = jSONArray;
                        if (i13 == i11 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            m mVarB = com.mbridge.msdk.foundation.db.m.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d())).b(strOptString);
                            if (mVarB != null) {
                                p0.a("BannerSignalCommunicationImpl", "VideoBean not null");
                                jSONObject5.put("type", 1);
                                i10 = length;
                                jSONObject5.put("videoDataLength", mVarB.d());
                                String strE = mVarB.e();
                                if (TextUtils.isEmpty(strE)) {
                                    p0.a("BannerSignalCommunicationImpl", "VideoPath null");
                                    jSONObject5.put("path", str3);
                                    jSONObject5.put("path4Web", str3);
                                    str = str3;
                                } else {
                                    str = str3;
                                    p0.a("BannerSignalCommunicationImpl", "VideoPath not null");
                                    jSONObject5.put("path", strE);
                                    jSONObject5.put("path4Web", strE);
                                }
                                if (mVarB.b() == 5) {
                                    jSONObject5.put("downloaded", 1);
                                    z10 = false;
                                } else {
                                    z10 = false;
                                    jSONObject5.put("downloaded", 0);
                                }
                                jSONObject4.put(strOptString, jSONObject5);
                                jSONArray2.put(jSONObject4);
                            } else {
                                str = str3;
                                i10 = length;
                                z10 = false;
                                p0.a("BannerSignalCommunicationImpl", "VideoBean null");
                            }
                        } else {
                            str = str3;
                            i10 = length;
                            z10 = false;
                            if (i13 == 2 && !TextUtils.isEmpty(strOptString)) {
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("type", 2);
                                jSONObject6.put("path", H5DownLoadManager.getInstance().getResAddress(strOptString) == null ? str : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                                jSONObject4.put(strOptString, jSONObject6);
                                jSONArray2.put(jSONObject4);
                            } else if (i13 == 3 && !TextUtils.isEmpty(strOptString)) {
                                try {
                                    file = new File(strOptString);
                                } catch (Throwable th2) {
                                    if (MBridgeConstans.DEBUG) {
                                        th2.printStackTrace();
                                    }
                                }
                                if (file.exists() && file.isFile() && file.canRead()) {
                                    p0.a("BannerSignalCommunicationImpl", "getFileInfo Mraid file " + strOptString);
                                    str2 = "file:////" + strOptString;
                                } else {
                                    str2 = str;
                                }
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("type", 3);
                                jSONObject7.put("path", str2);
                                jSONObject4.put(strOptString, jSONObject7);
                                jSONArray2.put(jSONObject4);
                            } else if (i13 == 4 && !TextUtils.isEmpty(strOptString)) {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("type", 4);
                                jSONObject8.put("path", t0.a(strOptString) == null ? str : t0.a(strOptString));
                                jSONObject4.put(strOptString, jSONObject8);
                                jSONArray2.put(jSONObject4);
                            }
                        }
                        i12++;
                        jSONArray = jSONArray3;
                        length = i10;
                        str3 = str;
                        i11 = 1;
                    }
                    jSONObject2.put("resource", jSONArray2);
                    f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                }
                try {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "resource is null");
                    f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e11) {
                    p0.a("BannerSignalCommunicationImpl", e11.getMessage());
                    return;
                }
            } catch (Throwable th3) {
                jSONObject2.put("code", 1);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th3.getLocalizedMessage());
                f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            jSONObject2.put("code", 1);
            jSONObject2.put(PglCryptUtils.KEY_MESSAGE, th3.getLocalizedMessage());
            f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (JSONException e12) {
            p0.a("BannerSignalCommunicationImpl", e12.getMessage());
            return;
        }
    }
}
