package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class q6 extends s6 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f15141g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdRewardListener f15142h;

    public q6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.f15141g = bVar;
        this.f15142h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.o6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f15141g.getAdZone().e());
        String clCode = this.f15141g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.o6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.s6
    public boolean h() {
        return this.f15141g.W0();
    }

    @Override // com.applovin.impl.s6
    public void a(l4 l4Var) {
        this.f15141g.a(l4Var);
        String strB = l4Var.b();
        Map<String, String> mapA = l4Var.a();
        if (strB.equals("accepted")) {
            this.f15142h.userRewardVerified(this.f15141g, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.f15142h.userOverQuota(this.f15141g, mapA);
        } else if (strB.equals("rejected")) {
            this.f15142h.userRewardRejected(this.f15141g, mapA);
        } else {
            this.f15142h.validationRequestFailed(this.f15141g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.o6
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            this.f15142h.userRewardRejected(this.f15141g, Collections.EMPTY_MAP);
            str = "rejected";
        } else {
            this.f15142h.validationRequestFailed(this.f15141g, i10);
            str = "network_timeout";
        }
        this.f15141g.a(l4.a(str));
    }
}
