package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Lf {

    /* renamed from: a, reason: collision with root package name */
    private final Gf f34806a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements Fa {
        public c() {
        }

        @Override // com.ironsource.Fa
        public void b(IronSourceError ironSourceError) {
            Lf.this.a(Mf.f34994b, LevelPlay.AdFormat.BANNER, Pf.f35205a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.Fa
        public void d(AdInfo adInfo) {
            Lf.this.a(Mf.f34998f, LevelPlay.AdFormat.BANNER, Pf.f35205a.a(adInfo));
        }

        @Override // com.ironsource.Fa
        public void e(AdInfo adInfo) {
            Lf.this.a("onAdLoaded", LevelPlay.AdFormat.BANNER, Pf.f35205a.a(adInfo));
        }

        @Override // com.ironsource.Fa
        public void f(AdInfo adInfo) {
            Lf.this.a(Mf.f35005m, LevelPlay.AdFormat.BANNER, Pf.f35205a.a(adInfo));
        }

        @Override // com.ironsource.Fa
        public void g(AdInfo adInfo) {
            Lf.this.a(Mf.f35003k, LevelPlay.AdFormat.BANNER, Pf.f35205a.a(adInfo));
        }

        @Override // com.ironsource.Fa
        public void h(AdInfo adInfo) {
            Lf.this.a(Mf.f35004l, LevelPlay.AdFormat.BANNER, Pf.f35205a.a(adInfo));
        }
    }

    public Lf(Gf javaScriptEvaluator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f34806a = javaScriptEvaluator;
    }

    private final void b() {
        Kf kf2 = Kf.f34769a;
        kf2.a((InterfaceC3252hb) null);
        kf2.a((InterfaceC3446sb) null);
        kf2.a((Fa) null);
    }

    private final void c() {
        Kf.f34769a.e();
    }

    public final void d() {
        Kf kf2 = Kf.f34769a;
        kf2.a(new a());
        kf2.a(new b());
        kf2.a(new c());
    }

    public final void a() {
        b();
        c();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements InterfaceC3252hb {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3252hb
        public void a(AdInfo adInfo) {
            Lf.this.a(Mf.f34993a, LevelPlay.AdFormat.INTERSTITIAL, Pf.f35205a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3252hb
        public void b(IronSourceError ironSourceError) {
            Lf.this.a(Mf.f34994b, LevelPlay.AdFormat.INTERSTITIAL, Pf.f35205a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC3252hb
        public void c(AdInfo adInfo) {
            Lf.this.a(Mf.f34995c, LevelPlay.AdFormat.INTERSTITIAL, Pf.f35205a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3252hb
        public void d(AdInfo adInfo) {
            Lf.this.a(Mf.f34998f, LevelPlay.AdFormat.INTERSTITIAL, Pf.f35205a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3252hb
        public void e(AdInfo adInfo) {
            Lf.this.a(Mf.f34996d, LevelPlay.AdFormat.INTERSTITIAL, Pf.f35205a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3252hb
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Lf.this.a(Mf.f34997e, LevelPlay.AdFormat.INTERSTITIAL, Pf.f35205a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC3252hb
        public void b(AdInfo adInfo) {
            Lf.this.a(Mf.f34999g, LevelPlay.AdFormat.INTERSTITIAL, Pf.f35205a.a(adInfo));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements InterfaceC3480ub, InterfaceC3463tb {
        public b() {
        }

        @Override // com.ironsource.InterfaceC3480ub
        public void a(AdInfo adInfo) {
            Lf.this.a(Mf.f34993a, LevelPlay.AdFormat.REWARDED, Pf.f35205a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3480ub
        public void b(IronSourceError ironSourceError) {
            Lf.this.a(Mf.f34994b, LevelPlay.AdFormat.REWARDED, Pf.f35205a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC3446sb
        public void c(AdInfo adInfo) {
            Lf.this.a(Mf.f34995c, LevelPlay.AdFormat.REWARDED, Pf.f35205a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3463tb
        public void d(AdInfo adInfo) {
            Lf.this.a(Mf.f35000h, LevelPlay.AdFormat.REWARDED, Pf.f35205a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC3463tb
        public void a() {
            Lf.this.a(Mf.f35006n, LevelPlay.AdFormat.REWARDED, Pf.f35205a.a(new Object[0]));
        }

        @Override // com.ironsource.InterfaceC3446sb
        public void b(C3325ld c3325ld, AdInfo adInfo) {
            Lf.this.a(Mf.f35001i, LevelPlay.AdFormat.REWARDED, Pf.f35205a.a(Kf.f34769a.a(c3325ld), adInfo));
        }

        @Override // com.ironsource.InterfaceC3446sb
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Lf.this.a(Mf.f34997e, LevelPlay.AdFormat.REWARDED, Pf.f35205a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC3446sb
        public void a(C3325ld c3325ld, AdInfo adInfo) {
            Lf.this.a(Mf.f34998f, LevelPlay.AdFormat.REWARDED, Pf.f35205a.a(Kf.f34769a.a(c3325ld), adInfo));
        }

        @Override // com.ironsource.InterfaceC3446sb
        public void b(AdInfo adInfo) {
            Lf.this.a(Mf.f34999g, LevelPlay.AdFormat.REWARDED, Pf.f35205a.a(adInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f34806a.a(str, adFormat, list);
    }
}
