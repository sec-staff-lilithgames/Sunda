package com.applovin.impl;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13782a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13783b;

    /* renamed from: c, reason: collision with root package name */
    private List f13784c;

    public c7(com.applovin.impl.sdk.k kVar) {
        this.f13782a = kVar;
        x4 x4Var = x4.H;
        this.f13783b = ((Boolean) kVar.a(x4Var, Boolean.FALSE)).booleanValue() || y.a(com.applovin.impl.sdk.k.o()).a("applovin.sdk.is_test_environment") || AppLovinSdkUtils.isEmulator() || kVar.B().R();
        kVar.c(x4Var);
    }

    private void e() {
        com.applovin.impl.sdk.j jVarU = this.f13782a.u();
        if (this.f13783b) {
            jVarU.b(this.f13784c);
        } else {
            jVarU.a(this.f13784c);
        }
    }

    public void a(String str) {
        if (StringUtils.isValidString(str)) {
            a(Collections.singletonList(str));
        } else {
            a((List) null);
        }
    }

    public List b() {
        return this.f13784c;
    }

    public boolean c() {
        return this.f13783b;
    }

    public boolean d() {
        List list = this.f13784c;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void a(List list) {
        if (list == null && this.f13784c == null) {
            return;
        }
        if (list == null || !list.equals(this.f13784c)) {
            this.f13784c = list;
            e();
        }
    }

    public void a() {
        this.f13782a.b(x4.H, Boolean.TRUE);
    }

    public void a(JSONObject jSONObject) {
        if (this.f13783b) {
            return;
        }
        JSONArray jSONArrayT = b0.e2.t(jSONObject, "test_mode_idfas");
        com.applovin.impl.sdk.l lVarB = this.f13782a.B();
        boolean zR = lVarB.R();
        String strA = lVarB.f().a();
        l.b bVarF = lVarB.F();
        this.f13783b = zR || JsonUtils.containsCaseInsensitiveString(strA, jSONArrayT) || JsonUtils.containsCaseInsensitiveString(bVarF != null ? bVarF.f15517a : null, jSONArrayT);
    }
}
