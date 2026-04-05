package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.ironsource.C3271ic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class n6 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final p7 f14865g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f14866h;

    public n6(p7 p7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.f14866h = appLovinAdLoadListener;
        this.f14865g = p7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = x7.a(this.f14865g);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Resolving VAST ad with depth " + this.f14865g.d() + " at " + strA);
        }
        try {
            this.f14003a.r0().a(new a(com.applovin.impl.sdk.network.a.a(this.f14003a).b(strA).c(C3271ic.f36943a).a(m8.f14455f).a(((Integer) this.f14003a.a(v4.K4)).intValue()).c(((Integer) this.f14003a.a(v4.L4)).intValue()).a(false).a(), this.f14003a));
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Unable to resolve VAST wrapper", th2);
            }
            a(-1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends j6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, m8 m8Var, int i10) {
            this.f14003a.r0().a(f6.a(m8Var, n6.this.f14865g, n6.this.f14866h, n6.this.f14003a));
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, m8 m8Var) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, "Unable to resolve VAST wrapper. Server returned " + i10);
            }
            n6.this.a(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.b(this.f14004b, "Failed to resolve VAST wrapper due to error code " + i10);
        }
        if (i10 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f14866h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
                return;
            }
            return;
        }
        x7.a(this.f14865g, this.f14866h, i10 == -1001 ? q7.TIMED_OUT : q7.GENERAL_WRAPPER_ERROR, i10, this.f14003a);
    }
}
