package com.applovin.impl;

import com.applovin.impl.b6;
import com.applovin.impl.l7;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
class i6 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final p7 f14142g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f14143h;

    public i6(p7 p7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderVastAd", kVar);
        this.f14143h = appLovinAdLoadListener;
        this.f14142g = p7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Rendering VAST ad...");
        }
        int size = this.f14142g.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strA = "";
        u7 u7VarA = null;
        y7 y7VarA = null;
        o7 o7VarA = null;
        n7 n7VarA = null;
        String strA2 = "";
        for (m8 m8Var : this.f14142g.a()) {
            if (x7.b(m8Var)) {
                str = "Wrapper";
            } else {
                str = "InLine";
            }
            m8 m8VarB = m8Var.b(str);
            if (m8VarB != null) {
                m8 m8VarB2 = m8VarB.b("AdSystem");
                if (m8VarB2 != null) {
                    u7VarA = u7.a(m8VarB2, u7VarA, this.f14003a);
                }
                strA = x7.a(m8VarB, "AdTitle", strA);
                strA2 = x7.a(m8VarB, "Description", strA2);
                x7.a(m8VarB.a("Impression"), hashSet, this.f14142g, this.f14003a);
                m8 m8VarC = m8VarB.c("ViewableImpression");
                if (m8VarC != null) {
                    x7.a(m8VarC.a("Viewable"), hashSet, this.f14142g, this.f14003a);
                }
                m8 m8VarB3 = m8VarB.b("AdVerifications");
                if (m8VarB3 != null) {
                    n7VarA = n7.a(m8VarB3, n7VarA, this.f14142g, this.f14003a);
                }
                x7.a(m8VarB.a("Error"), hashSet2, this.f14142g, this.f14003a);
                m8 m8VarC2 = m8VarB.c("Creatives");
                if (m8VarC2 != null) {
                    for (m8 m8Var2 : m8VarC2.b()) {
                        m8 m8VarC3 = m8Var2.c("Linear");
                        if (m8VarC3 != null) {
                            y7VarA = y7.a(m8VarC3, y7VarA, this.f14142g, this.f14003a);
                        } else {
                            m8 m8VarB4 = m8Var2.b("CompanionAds");
                            if (m8VarB4 != null) {
                                m8 m8VarB5 = m8VarB4.b("Companion");
                                if (m8VarB5 != null) {
                                    o7VarA = o7.a(m8VarB5, o7VarA, this.f14142g, this.f14003a);
                                }
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.f14005c.b(this.f14004b, "Received and will skip rendering for an unidentified creative: " + m8Var2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.b(this.f14004b, KGUkpTlXZlJLy.DHPMbpgIDmOmc + m8Var);
            }
        }
        l7 l7VarA = new l7.b().a(this.f14003a).a(this.f14142g.b()).b(this.f14142g.e()).a(this.f14142g.c()).b(strA).a(strA2).a(u7VarA).a(y7VarA).a(o7VarA).a(n7VarA).b(hashSet).a(n7VarA).a(hashSet2).a();
        q7 q7VarC = x7.c(l7VarA);
        if (q7VarC == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f14005c.a(this.f14004b, "Finished rendering VAST ad: " + l7VarA);
            }
            l7VarA.getAdEventTracker().e();
            this.f14003a.r0().a((g5) new l5(l7VarA, this.f14003a, this.f14143h), b6.b.CACHING);
            return;
        }
        x7.a(this.f14142g, this.f14143h, q7VarC, -6, this.f14003a);
    }
}
