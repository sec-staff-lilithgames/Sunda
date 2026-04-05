package com.ironsource;

import com.ironsource.D7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.s5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3440s5 implements D7, D7.a {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f38368a = new JSONObject();

    private final JSONObject j() {
        JSONObject jSONObjectOptJSONObject = this.f38368a.optJSONObject(C3457t5.f38909a);
        return jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
    }

    @Override // com.ironsource.D7.a
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = this.f38368a;
        }
        this.f38368a = jSONObject;
        IronLog.INTERNAL.verbose("setEpConfig: " + jSONObject);
    }

    @Override // com.ironsource.InterfaceC3474u5
    public long b() {
        String strOptString = j().optString(C3491v5.f39106c);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_BN_…FRESH_ANIMATION_DURATION)");
        Long longOrNull = sv.j0.toLongOrNull(strOptString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 0L;
    }

    @Override // com.ironsource.InterfaceC3474u5
    public boolean c() {
        return j().optBoolean(C3491v5.f39111h, true);
    }

    @Override // com.ironsource.D7
    public JSONObject config() {
        return this.f38368a;
    }

    @Override // com.ironsource.InterfaceC3474u5
    public boolean d() {
        return j().optBoolean(C3491v5.f39110g, true);
    }

    @Override // com.ironsource.InterfaceC3474u5
    public long e() {
        String strOptString = j().optString(C3491v5.f39107d);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "traits.optString(LPM_DEL…_TIME_AFTER_INIT_PROCESS)");
        Long longOrNull = sv.j0.toLongOrNull(strOptString);
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return 2000L;
    }

    @Override // com.ironsource.InterfaceC3474u5
    public boolean f() {
        return j().optBoolean(C3491v5.f39112i, false);
    }

    @Override // com.ironsource.InterfaceC3474u5
    public boolean g() {
        String strOptString = j().optString(C3491v5.f39104a);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "traits.optString(IS_EP_CONFIG_ENABLED)");
        String lowerCase = strOptString.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return kotlin.jvm.internal.e0.areEqual(lowerCase, "true");
    }

    @Override // com.ironsource.InterfaceC3474u5
    public int h() {
        String strOptString = j().optString(C3491v5.f39105b);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strOptString, "traits.optString(ISN_CTRL_INIT_DELAY)");
        Integer intOrNull = sv.j0.toIntOrNull(strOptString);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    @Override // com.ironsource.InterfaceC3474u5
    public boolean i() {
        return j().optBoolean(C3491v5.f39108e, true);
    }

    @Override // com.ironsource.InterfaceC3474u5
    public boolean a() {
        return j().optBoolean(C3491v5.f39109f, true);
    }
}
