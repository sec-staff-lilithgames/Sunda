package com.bytedance.sdk.openadsdk.core.p000if;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd {

    /* renamed from: cm, reason: collision with root package name */
    private final String f20448cm;

    /* renamed from: jd, reason: collision with root package name */
    private final URL f20449jd;
    private final String jpo;
    private final String wqx;

    private yd(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.jpo = str2;
        this.f20449jd = new URL(str);
        this.wqx = str3;
        this.f20448cm = str4;
    }

    public JSONObject cm() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apiFramework", CampaignEx.KEY_OMID);
            jSONObject.put("javascriptResourceUrl", this.f20449jd.toString());
            if (!TextUtils.isEmpty(this.jpo)) {
                jSONObject.put("vendorKey", this.jpo);
            }
            if (!TextUtils.isEmpty(this.wqx)) {
                jSONObject.put("verificationParameters", this.wqx);
            }
            if (!TextUtils.isEmpty(this.f20448cm)) {
                jSONObject.put("verificationNotExecuted", this.f20448cm);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        if (jpo(this.jpo, ydVar.jpo) && jpo(this.f20449jd, ydVar.f20449jd) && jpo(this.wqx, ydVar.wqx)) {
            return jpo(this.f20448cm, ydVar.f20448cm);
        }
        return false;
    }

    public int hashCode() {
        String str = this.jpo;
        int iHashCode = (this.f20449jd.hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31;
        String str2 = this.wqx;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20448cm;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String jd() {
        return this.wqx;
    }

    public String jpo() {
        return this.jpo;
    }

    public URL wqx() {
        return this.f20449jd;
    }

    private boolean jpo(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static yd jpo(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new yd(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static yd jpo(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new yd(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static HashSet<yd> jpo(JSONArray jSONArray) {
        HashSet<yd> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    hashSet.add(jpo(jSONArray.getJSONObject(i10)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }
}
