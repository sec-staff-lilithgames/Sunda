package com.applovin.impl;

import android.app.Activity;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.b6;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import hr.kNq.ikJMrW;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class a6 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13416g;

    public a6(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.f13416g = kVar;
    }

    private void f() {
        if (this.f13416g.S().c()) {
            return;
        }
        Activity activityV0 = this.f13416g.v0();
        if (activityV0 != null) {
            this.f13416g.S().a(activityV0);
            return;
        }
        this.f13416g.E().a(c2.f13730p0, this.f14004b + ":maybeInitializeAdapters()");
        this.f13416g.r0().a(new p6(this.f13416g, true, "initializeAdapters", new m9(this, 3)), b6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }

    @Override // java.lang.Runnable
    public void run() {
        com.applovin.impl.sdk.o oVar;
        String str;
        StringBuilder sbU;
        String str2 = C3191e4.h.f36509t;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.a(this.f14004b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        try {
            this.f13416g.H().b(a());
            this.f13416g.H().e(a());
            this.f13416g.r0().a((g5) new h5(this.f13416g), b6.b.OTHER);
            this.f13416g.B().U();
            this.f13416g.m0().c();
            this.f13416g.z().l();
            if (k7.c(this.f13416g)) {
                this.f13416g.a();
            }
            this.f13416g.Z0();
            this.f13416g.p().collectAppHubData();
            g();
            f();
            this.f13416g.a(true);
            this.f13416g.f0().b();
            this.f13416g.k().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.f13416g.a(v4.A2)).booleanValue()) {
                this.f13416g.X().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.f13416g.G().maybeTrackAppOpenEvent();
            this.f13416g.A().a();
            if (((Boolean) this.f13416g.a(v4.N2)).booleanValue()) {
                this.f13416g.y0().b();
            }
            if (((Boolean) this.f13416g.a(v4.W0)).booleanValue()) {
                this.f13416g.h().b();
            } else {
                this.f13416g.h().g();
            }
            if (this.f13416g.U().g() || (((Boolean) this.f13416g.a(o3.f14956l7)).booleanValue() && k7.c(this.f13416g) && this.f13416g.H0())) {
                this.f13416g.U().e();
            }
            if (this.f13416g.h0() != null) {
                this.f13416g.h0().b((String) this.f13416g.a(v4.f16039u));
            }
            this.f13416g.e0().i();
        } catch (Throwable th2) {
            try {
                com.applovin.impl.sdk.o.c("AppLovinSdk", "Failed to initialize SDK!", th2);
                this.f13416g.a(false);
                a(th2);
                if (((Boolean) this.f13416g.a(v4.f15943i)).booleanValue()) {
                    this.f13416g.f0().a();
                }
                if (((Boolean) this.f13416g.a(v4.f15935h)).booleanValue()) {
                    this.f13416g.V0();
                }
                if (this.f13416g.h0() != null) {
                    this.f13416g.h0().b((String) this.f13416g.a(v4.f16039u));
                }
                this.f13416g.e0().i();
                if (!com.applovin.impl.sdk.o.a()) {
                    return;
                }
                oVar = this.f14005c;
                str = this.f14004b;
                sbU = p0.o2.u("AppLovin SDK ");
                sbU.append(AppLovinSdk.VERSION);
                sbU.append(" initialization ");
                if (this.f13416g.C0()) {
                }
            } catch (Throwable th3) {
                if (this.f13416g.h0() != null) {
                    this.f13416g.h0().b((String) this.f13416g.a(v4.f16039u));
                }
                this.f13416g.e0().i();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar2 = this.f14005c;
                    String str3 = this.f14004b;
                    StringBuilder sb2 = new StringBuilder("AppLovin SDK ");
                    sb2.append(AppLovinSdk.VERSION);
                    sb2.append(" initialization ");
                    if (this.f13416g.C0()) {
                        str2 = "succeeded";
                    }
                    sb2.append(str2);
                    sb2.append(" in ");
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    b0.e2.B(sb2, "ms", oVar2, str3);
                }
                throw th3;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            oVar = this.f14005c;
            str = this.f14004b;
            sbU = p0.o2.u("AppLovin SDK ");
            sbU.append(AppLovinSdk.VERSION);
            sbU.append(" initialization ");
            if (this.f13416g.C0()) {
                str2 = "succeeded";
            }
            sbU.append(str2);
            sbU.append(" in ");
            sbU.append(System.currentTimeMillis() - jCurrentTimeMillis);
            b0.e2.B(sbU, "ms", oVar, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f13416g.S().a(this.f13416g.e().b());
    }

    private void g() {
        String str;
        boolean zC = this.f13416g.p0().c();
        Map mapO = this.f13416g.B().o();
        Map mapK = this.f13416g.B().K();
        String strA = zC ? this.f13416g.B().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zC) {
            str = mapO.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        s2 s2Var = new s2();
        s2Var.a().a("=====AppLovin SDK=====");
        s2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f13416g.a(v4.I3)).a("Ad Review Version", j.b()).a("OM SDK Version", this.f13416g.e0().c());
        s2Var.a("===Device Info===").a("OS", k7.d()).a(IronSourceConstants.TYPE_GAID, strA).a(ikJMrW.cymdKXxzqIdYk, str).a("Model", mapO.get("model")).a("Locale", mapO.get("locale")).a("Emulator", mapO.get("sim")).a("Tablet", mapO.get("is_tablet"));
        s2Var.a("===App Info===").a("Application ID", mapK.get("package_name")).a("Target SDK", mapK.get("target_sdk"));
        s2Var.a("===SDK Settings===").a("SDK Key", this.f13416g.j0()).a("Mediation Provider", this.f13416g.V()).a("TG", j7.a(this.f13416g)).a("MD", this.f13416g.a(v4.f16031t)).a("Test Mode On", Boolean.valueOf(this.f13416g.t0().c())).a("Verbose Logging On", Boolean.valueOf(zC));
        s2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(p0.a(a()));
        s2Var.a("===MAX Terms and Privcay Policy Flow===");
        t0 t0VarY = this.f13416g.y();
        boolean zJ = t0VarY.j();
        s2Var.a("Enabled", Boolean.valueOf(zJ));
        if (zJ) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f13416g.w().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = t0VarY.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            s2Var.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
            if (k7.c(this.f13416g)) {
                if (consentFlowUserGeographyD == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = "None";
                }
                s2Var.a("Debug User Geography", str2);
            }
        }
        s2Var.a("Privacy Policy URI", t0VarY.f()).a("Terms of Service URI", t0VarY.h());
        s2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f13416g.s0().i());
        s2Var.a();
        com.applovin.impl.sdk.o.g("AppLovinSdk", s2Var.toString());
    }
}
