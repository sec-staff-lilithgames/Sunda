package com.applovin.impl.sdk.ad;

import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import b0.e2;
import com.applovin.impl.adview.e;
import com.applovin.impl.d4;
import com.applovin.impl.f5;
import com.applovin.impl.n4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class a extends b implements n4 {

    /* renamed from: n, reason: collision with root package name */
    private final String f15326n;

    /* renamed from: o, reason: collision with root package name */
    private final String f15327o;

    /* renamed from: p, reason: collision with root package name */
    private final String f15328p;

    /* renamed from: q, reason: collision with root package name */
    private final d4 f15329q;

    public a(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
        this.f15326n = s1();
        this.f15327o = w1();
        this.f15328p = v1();
        this.f15329q = new d4(this);
    }

    public static a a(JSONObject jSONObject, k kVar) {
        JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = JsonUtils.getJSONObject(jSONObject, "full_response", (JSONObject) null)) == null) {
            return null;
        }
        JSONObject jSONObject3 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject2, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray()), 0, (JSONObject) null);
        if (jSONObject3 == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject3, "html", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        String string2 = JsonUtils.getString(jSONObject3, "video", "");
        JsonUtils.putString(jSONObject3, "html", JsonUtils.getString(jSONObject, "original_html_source", ""));
        JsonUtils.putString(jSONObject3, "video", JsonUtils.getString(jSONObject, "original_video_uri_string", ""));
        a aVar = new a(jSONObject3, jSONObject2, kVar);
        JSONArray jSONArrayT = e2.t(jSONObject, "cached_ad_html_resources_urls");
        for (int i10 = 0; i10 < jSONArrayT.length(); i10++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArrayT, i10, null);
            if (objectAtIndex instanceof String) {
                String str = (String) objectAtIndex;
                if (!TextUtils.isEmpty(str)) {
                    aVar.a(Uri.parse(str));
                }
            }
        }
        aVar.d(string);
        if (StringUtils.isValidString(string2)) {
            aVar.d(Uri.parse(string2));
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(f5 f5Var) {
        f5Var.b("html", this.f15326n);
        f5Var.b("stream_url", this.f15328p);
    }

    private String v1() {
        return getStringFromAdObject("stream_url", "");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean K0() {
        return getBooleanFromFullResponse("is_persisted_ad", false);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public boolean O0() {
        return containsKeyForAdObject("stream_url");
    }

    @Override // com.applovin.impl.sdk.ad.b
    public void Q0() {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            f5Var.a(new d(this, 0));
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", this.f15326n);
            JsonUtils.putString(this.adObject, "stream_url", this.f15328p);
        }
    }

    @Override // com.applovin.impl.sdk.ad.b
    public String S() {
        return this.f15327o;
    }

    public void d(String str) {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            f5Var.b("html", str);
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html", str);
        }
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        JSONObject jSONObjectDeepCopy;
        JSONObject jSONObjectA;
        f5 f5Var = this.synchronizedFullResponse;
        if (f5Var != null) {
            jSONObjectA = f5Var.a();
        } else {
            synchronized (this.fullResponseLock) {
                jSONObjectDeepCopy = JsonUtils.deepCopy(this.fullResponse);
            }
            jSONObjectA = jSONObjectDeepCopy;
        }
        JSONArray jSONArrayT = e2.t(jSONObjectA, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        if (jSONArrayT.length() > 0) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArrayT, 0, new JSONObject());
            JsonUtils.putString(jSONObject, "html", this.f15326n);
            JsonUtils.putString(jSONObject, "video", this.f15327o);
            JsonUtils.putString(jSONObject, "stream_url", this.f15328p);
        }
        return jSONObjectA;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        return v0() != null;
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public boolean isOpenMeasurementEnabled() {
        if (this.sdk.e0().e()) {
            return true;
        }
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri m() {
        String stringFromAdObject = getStringFromAdObject(CampaignEx.JSON_KEY_CLICK_URL, "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public String s1() {
        return getStringFromAdObject("html", "");
    }

    public float t1() {
        return getFloatFromAdObject("mraid_close_delay_graphic", 0.0f);
    }

    public String u1() {
        return this.f15328p;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri v0() {
        String strV1 = v1();
        if (StringUtils.isValidString(strV1)) {
            return Uri.parse(strV1);
        }
        String strW1 = w1();
        if (StringUtils.isValidString(strW1)) {
            return Uri.parse(strW1);
        }
        return null;
    }

    public String w1() {
        return getStringFromAdObject("video", "");
    }

    public boolean x1() {
        if (this.adObject.has("close_button_expandable_hidden")) {
            return getBooleanFromAdObject("close_button_expandable_hidden", Boolean.FALSE);
        }
        return true;
    }

    public void y1() {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            f5Var.c("stream_url");
            return;
        }
        synchronized (this.adObjectLock) {
            this.adObject.remove("stream_url");
        }
    }

    @Override // com.applovin.impl.sdk.ad.b, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.impl.b4
    public d4 getAdEventTracker() {
        return this.f15329q;
    }

    @Override // com.applovin.impl.sdk.ad.b
    public Uri m0() {
        String stringFromAdObject = getStringFromAdObject(QFzuMMDfrzagDN.GVSyFiCWedSf, "");
        return StringUtils.isValidString(stringFromAdObject) ? Uri.parse(stringFromAdObject) : m();
    }

    public e.a r1() {
        return a(getIntFromAdObject("expandable_style", e.a.INVISIBLE.b()));
    }

    public void d(Uri uri) {
        f5 f5Var = this.synchronizedAdObject;
        if (f5Var != null) {
            f5Var.b("video", uri.toString());
            return;
        }
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "video", uri.toString());
        }
    }

    @Override // com.applovin.impl.n4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "original_html_source", this.f15326n);
        JsonUtils.putString(jSONObject, "original_video_uri_string", this.f15327o);
        JsonUtils.putString(jSONObject, "original_video_stream_uri_string", this.f15328p);
        ArrayList arrayList = new ArrayList();
        Iterator it = l().iterator();
        while (it.hasNext()) {
            arrayList.add(((Uri) it.next()).toString());
        }
        JsonUtils.putJsonArray(jSONObject, "cached_ad_html_resources_urls", new JSONArray((Collection) arrayList));
        f5 f5Var = this.synchronizedFullResponse;
        if (f5Var != null) {
            JsonUtils.putJSONObject(jSONObject, "full_response", f5Var.a());
            return jSONObject;
        }
        synchronized (this.fullResponseLock) {
            JsonUtils.putJSONObject(jSONObject, "full_response", this.fullResponse);
        }
        return jSONObject;
    }
}
