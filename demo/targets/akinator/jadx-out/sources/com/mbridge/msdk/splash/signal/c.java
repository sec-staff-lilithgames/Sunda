package com.mbridge.msdk.splash.signal;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f43002a = "SplashSignalUtils";

    /* renamed from: b, reason: collision with root package name */
    private static int f43003b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f43004c = 1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f43005a;

        public a(CampaignEx campaignEx) {
            this.f43005a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                if (jVarA != null) {
                    if (jVarA.a(this.f43005a.getId())) {
                        jVarA.b(this.f43005a.getId());
                    } else {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(this.f43005a.getId());
                        gVar.b(this.f43005a.getFca());
                        gVar.c(this.f43005a.getFcb());
                        gVar.a(0);
                        gVar.d(1);
                        gVar.a(System.currentTimeMillis());
                        jVarA.b(gVar);
                    }
                }
                c.b(this.f43005a.getCampaignUnitId(), this.f43005a);
            } catch (Throwable th2) {
                p0.b(c.f43002a, th2.getMessage(), th2);
            }
        }
    }

    public static void b(Object obj, JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectOptJSONObject);
            if (campaignWithBackData == null) {
                a(obj, "data camapign is empty");
            } else {
                a(campaignWithBackData);
                b(obj, "");
            }
        } catch (Throwable th2) {
            a(obj, th2.getMessage());
        }
    }

    public static void a(Object obj, JSONObject jSONObject) throws JSONException {
        String str;
        JSONArray jSONArray;
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
                p0.a(f43002a, e10.getMessage());
                return;
            }
        }
        try {
            try {
                jSONObject2.put("code", 0);
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "");
                JSONArray jSONArray2 = jSONObject.getJSONArray("resource");
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    JSONArray jSONArray3 = new JSONArray();
                    int length = jSONArray2.length();
                    int i12 = 0;
                    while (i12 < length) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                        String strOptString = jSONObject3.optString("ref", str3);
                        int i13 = jSONObject3.getInt("type");
                        JSONObject jSONObject4 = new JSONObject();
                        if (i13 == i11 && !TextUtils.isEmpty(strOptString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            m mVarB = com.mbridge.msdk.foundation.db.m.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d())).b(strOptString);
                            if (mVarB != null) {
                                jSONArray = jSONArray2;
                                p0.a(f43002a, "VideoBean not null");
                                jSONObject5.put("type", 1);
                                jSONObject5.put("videoDataLength", mVarB.d());
                                String strE = mVarB.e();
                                if (TextUtils.isEmpty(strE)) {
                                    i10 = length;
                                    p0.a(f43002a, "VideoPath null");
                                    jSONObject5.put("path", str3);
                                    jSONObject5.put("path4Web", str3);
                                    str = str3;
                                } else {
                                    i10 = length;
                                    str = str3;
                                    p0.a(f43002a, "VideoPath not null");
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
                                jSONArray3.put(jSONObject4);
                            } else {
                                str = str3;
                                jSONArray = jSONArray2;
                                i10 = length;
                                z10 = false;
                                p0.a(f43002a, "VideoBean null");
                            }
                        } else {
                            str = str3;
                            jSONArray = jSONArray2;
                            i10 = length;
                            z10 = false;
                            if (i13 == 2 && !TextUtils.isEmpty(strOptString)) {
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("type", 2);
                                jSONObject6.put("path", H5DownLoadManager.getInstance().getH5ResAddress(strOptString) == null ? str : H5DownLoadManager.getInstance().getH5ResAddress(strOptString));
                                jSONObject4.put(strOptString, jSONObject6);
                                jSONArray3.put(jSONObject4);
                            } else if (i13 == 3 && !TextUtils.isEmpty(strOptString)) {
                                try {
                                    file = new File(strOptString);
                                } catch (Throwable th2) {
                                    if (MBridgeConstans.DEBUG) {
                                        th2.printStackTrace();
                                    }
                                }
                                if (file.exists() && file.isFile() && file.canRead()) {
                                    p0.a(f43002a, "getFileInfo Mraid file " + strOptString);
                                    str2 = "file:////" + strOptString;
                                } else {
                                    str2 = str;
                                }
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("type", 3);
                                jSONObject7.put("path", str2);
                                jSONObject4.put(strOptString, jSONObject7);
                                jSONArray3.put(jSONObject4);
                            } else if (i13 == 4 && !TextUtils.isEmpty(strOptString)) {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("type", 4);
                                jSONObject8.put("path", t0.a(strOptString) == null ? str : t0.a(strOptString));
                                jSONObject4.put(strOptString, jSONObject8);
                                jSONArray3.put(jSONObject4);
                            }
                        }
                        i12++;
                        jSONArray2 = jSONArray;
                        length = i10;
                        str3 = str;
                        i11 = 1;
                    }
                    jSONObject2.put("resource", jSONArray3);
                    f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                }
                try {
                    jSONObject2.put("code", 1);
                    jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "resource is null");
                    f.a().b(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                    return;
                } catch (JSONException e11) {
                    p0.a(f43002a, e11.getMessage());
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
            p0.a(f43002a, e12.getMessage());
            return;
        }
    }

    public static void b(Object obj, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f43003b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            a(obj, e10.getMessage());
            p0.a(f43002a, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.buffer.b.f40747m == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(str, campaignEx, "splash");
    }

    public static String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            p0.b(f43002a, "code to string is error");
            return "";
        }
    }

    public static void a(Object obj, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f43004c);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            p0.a(f43002a, e10.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx) {
        new Thread(new a(campaignEx)).start();
    }

    public static void a(WebView webView, String str, String str2) {
        f.a().a(webView, str, str2);
    }

    public static void a(WebView webView) {
        p0.b(f43002a, "fireOnSignalCommunication");
        f.a().a(webView);
    }
}
