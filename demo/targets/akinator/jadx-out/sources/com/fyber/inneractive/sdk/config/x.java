package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.d1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f23419a;

    public x(IAConfigManager iAConfigManager) {
        this.f23419a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public final void onGlobalConfigChanged(s sVar, o oVar) {
        if (oVar.a("dv_enabled_v3", 0, 0) == 1) {
            this.f23419a.G.a();
        }
        com.fyber.inneractive.sdk.network.f fVar = this.f23419a.I;
        fVar.getClass();
        int iA = IAConfigManager.O.f23226u.f23394b.a("send_events_batch_interval", 30, -1);
        int i10 = iA >= 0 ? iA : 30;
        String property = System.getProperty("fyber.marketplace.use_batch_interval");
        int i11 = (property == null || Boolean.getBoolean(property)) ? i10 : 0;
        fVar.f24218f = true;
        fVar.f24217e = i11;
        d1 d1Var = fVar.f24216d;
        if (d1Var != null && d1Var.hasMessages(12312329)) {
            fVar.f24216d.removeMessages(12312329);
        }
        long j10 = fVar.f24217e * 1000;
        d1 d1Var2 = fVar.f24216d;
        if (d1Var2 != null) {
            d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, j10));
        }
    }
}
