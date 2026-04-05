package com.applovin.impl;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.b6;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class w1 extends v1 {
    private final x1 M;
    private g0 N;
    private long O;
    private final AtomicBoolean P;

    public w1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.M = new x1(this.f15831a, this.f15834d, this.f15832b);
        this.P = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f15833c.a("AppLovinFullscreenActivity", "Marking ad as fully watched");
        }
        this.P.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.f15847q = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        ArrayList arrayList = new ArrayList();
        com.applovin.impl.adview.g gVar = this.f15841k;
        if (gVar != null) {
            arrayList.add(new e4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
        }
        com.applovin.impl.adview.k kVar = this.f15840j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.f15840j;
            arrayList.add(new e4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.f15831a.getAdEventTracker().b(this.f15839i, arrayList);
    }

    public void H() {
        long jZ;
        long millis = 0;
        if (this.f15831a.Y() >= 0 || this.f15831a.Z() >= 0) {
            if (this.f15831a.Y() >= 0) {
                jZ = this.f15831a.Y();
            } else {
                if (this.f15831a.j1()) {
                    int iT1 = (int) ((com.applovin.impl.sdk.ad.a) this.f15831a).t1();
                    if (iT1 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(iT1);
                    } else {
                        int iS = (int) this.f15831a.s();
                        if (iS > 0) {
                            millis = TimeUnit.SECONDS.toMillis(iS);
                        }
                    }
                }
                jZ = (long) ((this.f15831a.Z() / 100.0d) * millis);
            }
            c(jZ);
        }
    }

    @Override // com.applovin.impl.v1
    public void a(ViewGroup viewGroup) {
        this.M.a(this.f15841k, this.f15840j, this.f15839i, viewGroup);
        if (((Boolean) this.f15832b.a(v4.L5)).booleanValue() || !a(false)) {
            com.applovin.impl.adview.k kVar = this.f15840j;
            if (kVar != null) {
                kVar.b();
            }
            this.f15839i.renderAd(this.f15831a);
            a("javascript:al_onPoststitialShow();", this.f15831a.H());
            if (g()) {
                long jB = B();
                this.O = jB;
                if (jB > 0) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f15833c.a("AppLovinFullscreenActivity", a.b.g(this.O, "ms...", new StringBuilder("Scheduling timer for ad fully watched in ")));
                    }
                    final int i10 = 0;
                    this.N = g0.a(this.O, this.f15832b, new Runnable(this) { // from class: com.applovin.impl.ma

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ w1 f14464c;

                        {
                            this.f14464c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.f14464c.E();
                                    break;
                                case 1:
                                    this.f14464c.F();
                                    break;
                                default:
                                    this.f14464c.G();
                                    break;
                            }
                        }
                    });
                }
            }
            if (this.f15841k != null) {
                if (this.f15831a.s() >= 0) {
                    final int i11 = 1;
                    a(this.f15841k, this.f15831a.s(), new Runnable(this) { // from class: com.applovin.impl.ma

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ w1 f14464c;

                        {
                            this.f14464c = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.f14464c.E();
                                    break;
                                case 1:
                                    this.f14464c.F();
                                    break;
                                default:
                                    this.f14464c.G();
                                    break;
                            }
                        }
                    });
                } else {
                    this.f15841k.setVisibility(0);
                }
            }
            H();
            final int i12 = 2;
            this.f15832b.r0().a(new p6(this.f15832b, "updateMainViewOM", new Runnable(this) { // from class: com.applovin.impl.ma

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w1 f14464c;

                {
                    this.f14464c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.f14464c.E();
                            break;
                        case 1:
                            this.f14464c.F();
                            break;
                        default:
                            this.f14464c.G();
                            break;
                    }
                }
            }), b6.b.OTHER, TimeUnit.SECONDS.toMillis(1L));
            o();
            super.c(k7.e(this.f15832b));
        }
    }

    @Override // com.applovin.impl.v1
    public void d() {
        super.d();
        z();
    }

    @Override // com.applovin.impl.v1
    public void e() {
        super.e();
        z();
    }

    @Override // com.applovin.impl.v1
    public void l() {
        super.a(C(), false, D(), -2L);
    }

    @Override // com.applovin.impl.v1
    public void v() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.v1
    public void w() {
        super.w();
        this.P.set(true);
    }

    @Override // com.applovin.impl.v1
    public void z() {
        this.M.a(this.f15842l);
        this.f15847q = SystemClock.elapsedRealtime();
        this.P.set(true);
    }

    private long B() {
        com.applovin.impl.sdk.ad.b bVar = this.f15831a;
        if (!(bVar instanceof com.applovin.impl.sdk.ad.a)) {
            return 0L;
        }
        float fT1 = ((com.applovin.impl.sdk.ad.a) bVar).t1();
        if (fT1 <= 0.0f) {
            fT1 = this.f15831a.s();
        }
        return (long) ((this.f15831a.I() / 100.0d) * k7.c(fT1));
    }

    private int C() {
        g0 g0Var;
        int iMin = 100;
        if (g()) {
            if (!D() && (g0Var = this.N) != null) {
                iMin = (int) Math.min(100.0d, ((this.O - g0Var.b()) / this.O) * 100.0d);
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f15833c.a("AppLovinFullscreenActivity", "Ad engaged at " + iMin + "%");
            }
        }
        return iMin;
    }

    public boolean D() {
        if (!(this.J && this.f15831a.n1()) && g()) {
            return this.P.get();
        }
        return true;
    }

    @Override // com.applovin.impl.v1
    public void u() {
    }

    @Override // com.applovin.impl.v1
    public void a(String str) {
        if (!((Boolean) this.f15832b.a(v4.D6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar = this.f15831a;
            if (bVar != null) {
                bVar.a(str);
            }
            l();
        }
        g0 g0Var = this.N;
        if (g0Var != null) {
            g0Var.a();
            this.N = null;
        }
        super.a(str);
    }

    @Override // com.applovin.impl.v1
    public void b(long j10) {
    }
}
