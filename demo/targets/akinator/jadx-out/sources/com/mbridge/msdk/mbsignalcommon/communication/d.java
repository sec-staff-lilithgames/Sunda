package com.mbridge.msdk.mbsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f41878a = "d";

    /* renamed from: b, reason: collision with root package name */
    public static int f41879b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f41880c = 1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41881a;

        public a(CampaignEx campaignEx) {
            this.f41881a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j jVarA = j.a(g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                if (jVarA != null) {
                    if (jVarA.a(this.f41881a.getId())) {
                        jVarA.b(this.f41881a.getId());
                    } else {
                        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                        gVar.a(this.f41881a.getId());
                        gVar.b(this.f41881a.getFca());
                        gVar.c(this.f41881a.getFcb());
                        gVar.a(0);
                        gVar.d(1);
                        gVar.a(System.currentTimeMillis());
                        jVarA.b(gVar);
                    }
                }
                d.b(this.f41881a.getCampaignUnitId(), this.f41881a);
            } catch (Throwable th2) {
                p0.b(d.f41878a, th2.getMessage(), th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, CampaignEx campaignEx) {
        if (com.mbridge.msdk.foundation.same.buffer.b.f40737c == null || TextUtils.isEmpty(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.same.buffer.b.a(str, campaignEx, "banner");
    }

    public static void a(Object obj, JSONObject jSONObject) throws JSONException {
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

    public static void b(Object obj, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f41879b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            a(obj, e10.getMessage());
            p0.a(f41878a, e10.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx) {
        new Thread(new a(campaignEx)).start();
    }

    public static String a(float f10, float f11) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40711h, u0.b(com.mbridge.msdk.foundation.controller.c.m().d(), f10));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40712i, u0.b(com.mbridge.msdk.foundation.controller.c.m().d(), f11));
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40716m, 0);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40714k, com.mbridge.msdk.foundation.controller.c.m().d().getResources().getConfiguration().orientation);
            jSONObject2.put(com.mbridge.msdk.foundation.same.a.f40715l, u0.d(com.mbridge.msdk.foundation.controller.c.m().d()));
            jSONObject.put(com.mbridge.msdk.foundation.same.a.f40713j, jSONObject2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            p0.b(f41878a, "code to string is error");
            return "";
        }
    }

    public static void a(Object obj, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f41880c);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            p0.a(f41878a, e10.getMessage());
        }
    }
}
