package com.applovin.sdk;

import a.b;
import android.content.Context;
import android.text.TextUtils;
import b0.e2;
import com.applovin.impl.c2;
import com.applovin.impl.k7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t0;
import e3.g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinSdkSettings {

    /* renamed from: a, reason: collision with root package name */
    private boolean f16508a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16509b;

    /* renamed from: e, reason: collision with root package name */
    private String f16512e;

    /* renamed from: f, reason: collision with root package name */
    private String f16513f;

    /* renamed from: g, reason: collision with root package name */
    private String f16514g;

    /* renamed from: j, reason: collision with root package name */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f16517j;

    /* renamed from: k, reason: collision with root package name */
    private k f16518k;

    /* renamed from: l, reason: collision with root package name */
    private String f16519l;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16511d = true;
    private final Map<String, Object> localSettings = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map f16515h = b.u();

    /* renamed from: i, reason: collision with root package name */
    private final Map f16516i = b.u();

    /* renamed from: c, reason: collision with root package name */
    private boolean f16510c = true;

    public AppLovinSdkSettings(Context context) {
        this.f16519l = "";
        if (context == null) {
            o.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextE = k7.e(context);
        this.f16508a = k7.m(contextE);
        this.f16517j = t0.a(contextE);
        this.f16519l = contextE.getPackageName();
        a(contextE);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strA = k7.a(identifier, context, (k) null);
        this.f16515h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(k kVar) {
        this.f16518k = kVar;
        if (StringUtils.isValidString(this.f16512e)) {
            kVar.t0().a(Arrays.asList(this.f16512e.split(",")));
            this.f16512e = null;
        }
        if (this.f16513f != null) {
            kVar.O();
            if (o.a()) {
                e2.B(new StringBuilder("Setting user id: "), this.f16513f, kVar.O(), "AppLovinSdkSettings");
            }
            kVar.x0().a(this.f16513f);
            this.f16513f = null;
        }
        if (StringUtils.isValidString(this.f16514g)) {
            l.a(this.f16514g, kVar);
            this.f16514g = null;
        }
        for (Map.Entry entry : this.f16516i.entrySet()) {
            kVar.w0().a(c2.f13717j, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + ":" + ((String) entry.getValue())));
        }
        this.f16516i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f16515h) {
            map = CollectionUtils.map(this.f16515h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f16517j;
    }

    public String getUserIdentifier() {
        k kVar = this.f16518k;
        return kVar == null ? this.f16513f : kVar.x0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f16510c;
    }

    public boolean isMuted() {
        return this.f16509b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f16508a;
    }

    public void setCreativeDebuggerEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z10 + ")");
        if (this.f16510c == z10) {
            return;
        }
        this.f16510c = z10;
        k kVar = this.f16518k;
        if (kVar == null) {
            return;
        }
        if (z10) {
            kVar.z().l();
        } else {
            kVar.z().k();
        }
    }

    public void setExtraParameter(String str, String str2) {
        o.e("AppLovinSdkSettings", g.l("setExtraParameter(key=", str, ", value=", str2, ")"));
        if (TextUtils.isEmpty(str)) {
            o.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f16518k == null) {
                this.f16512e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f16518k.t0().a(Arrays.asList(strTrim.split(",")));
            } else {
                this.f16518k.t0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f16519l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            o.a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            k kVar = this.f16518k;
            if (kVar != null) {
                l.a(strTrim, kVar);
            } else {
                this.f16514g = strTrim;
            }
        }
        if (this.f16518k != null) {
            this.f16518k.w0().a(c2.f13717j, "postInitExtraParameter", CollectionUtils.hashMap("details", str + ":" + str2));
        } else {
            this.f16516i.put(str, strTrim);
        }
        this.f16515h.put(str, strTrim);
    }

    public void setMuted(boolean z10) {
        o.e("AppLovinSdkSettings", "setMuted(muted=" + z10 + ")");
        this.f16509b = z10;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z10) {
        o.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z10 + ")");
        this.f16511d = z10;
    }

    public void setUserIdentifier(String str) {
        o.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > k7.d(8)) {
            o.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + k7.d(8) + " maximum)");
        }
        k kVar = this.f16518k;
        if (kVar == null) {
            this.f16513f = str;
            return;
        }
        kVar.O();
        if (o.a()) {
            e2.y("Setting user id: ", str, this.f16518k.O(), "AppLovinSdkSettings");
        }
        this.f16518k.x0().a(str);
    }

    public void setVerboseLogging(boolean z10) {
        o.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z10 + ")");
        if (!k7.k()) {
            this.f16508a = z10;
            return;
        }
        o.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (k7.m(null) != z10) {
            o.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f16511d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppLovinSdkSettings{isVerboseLoggingEnabled=");
        sb2.append(this.f16508a);
        sb2.append(", muted=");
        sb2.append(this.f16509b);
        sb2.append(", creativeDebuggerEnabled=");
        return b.p(sb2, this.f16510c, AbstractJsonLexerKt.END_OBJ);
    }
}
