package com.ironsource;

import com.ironsource.InterfaceC3456t4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Aa extends AbstractC3329m implements P2, Ca, InterfaceC3375o7 {

    /* renamed from: b, reason: collision with root package name */
    private final C3350n0 f33831b;

    /* renamed from: c, reason: collision with root package name */
    private final K2 f33832c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<InterfaceC3522x2> f33833d;

    /* renamed from: e, reason: collision with root package name */
    private LevelPlayAdInfo f33834e;

    /* renamed from: f, reason: collision with root package name */
    private final Ba f33835f;

    public Aa(InterfaceC3522x2 listener, C3350n0 adTools, K2 bannerAdProperties, X2 bannerViewContainer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        this.f33831b = adTools;
        this.f33832c = bannerAdProperties;
        this.f33833d = new WeakReference<>(listener);
        this.f33834e = q();
        this.f33835f = Za.f35878a.a(adTools, bannerViewContainer, adTools.d(bannerAdProperties.c()), bannerAdProperties, this, p(), (64 & 64) != 0 ? new InterfaceC3456t4.a() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M2 a(Aa this$0, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        return this$0.a(this$0.f33831b, this$0.f33832c, z10);
    }

    private final O2 p() {
        return new ah(this, 0);
    }

    private final LevelPlayAdInfo q() {
        String string = this.f33832c.b().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
        String strC = this.f33832c.c();
        String string2 = this.f33832c.a().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, null, 248, null);
    }

    @Override // com.ironsource.InterfaceC3375o7
    public void c() {
        this.f33835f.c();
    }

    @Override // com.ironsource.InterfaceC3375o7
    public void d() {
        this.f33835f.d();
    }

    @Override // com.ironsource.InterfaceC3375o7
    public void e() {
        this.f33835f.e();
    }

    @Override // com.ironsource.J0
    public void g() {
        onAdClicked();
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ tu.x0 i() {
        r();
        return tu.x0.f87415a;
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ tu.x0 j() {
        t();
        return tu.x0.f87415a;
    }

    @Override // com.ironsource.Ca
    public void k() {
        InterfaceC3522x2 interfaceC3522x2 = this.f33833d.get();
        if (interfaceC3522x2 != null) {
            interfaceC3522x2.b(this.f33834e);
        }
    }

    @Override // com.ironsource.Ca
    public void l() {
        InterfaceC3522x2 interfaceC3522x2 = this.f33833d.get();
        if (interfaceC3522x2 != null) {
            interfaceC3522x2.a(this.f33834e);
        }
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ tu.x0 m() {
        s();
        return tu.x0.f87415a;
    }

    @Override // com.ironsource.Ca
    public void n() {
        InterfaceC3522x2 interfaceC3522x2 = this.f33833d.get();
        if (interfaceC3522x2 != null) {
            interfaceC3522x2.c(this.f33834e);
        }
    }

    @Override // com.ironsource.Ca
    public void onAdClicked() {
        InterfaceC3522x2 interfaceC3522x2 = this.f33833d.get();
        if (interfaceC3522x2 != null) {
            interfaceC3522x2.d(this.f33834e);
        }
    }

    @Override // com.ironsource.Ca
    public void onAdLeftApplication() {
        InterfaceC3522x2 interfaceC3522x2 = this.f33833d.get();
        if (interfaceC3522x2 != null) {
            interfaceC3522x2.e(this.f33834e);
        }
    }

    @Override // com.ironsource.Ca
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f33834e = adInfo;
        InterfaceC3522x2 interfaceC3522x2 = this.f33833d.get();
        if (interfaceC3522x2 != null) {
            interfaceC3522x2.a(adInfo, false);
        }
    }

    public void r() {
        onAdLeftApplication();
    }

    public void s() {
        n();
    }

    public void t() {
        l();
    }

    private final M2 a(C3350n0 c3350n0, K2 k22, boolean z10) {
        IronLog.INTERNAL.verbose();
        return new M2(c3350n0, N2.f35028z.a(k22, o().a(), z10), this);
    }

    @Override // com.ironsource.InterfaceC3375o7
    public void b() {
        this.f33835f.b();
    }

    @Override // com.ironsource.Ca
    public void e(IronSourceError ironSourceError) {
        InterfaceC3522x2 interfaceC3522x2 = this.f33833d.get();
        if (interfaceC3522x2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f33834e;
            String string = this.f33832c.b().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC3522x2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.f33832c.c()));
        }
    }

    @Override // com.ironsource.Ca
    public void b(IronSourceError ironSourceError) {
        InterfaceC3522x2 interfaceC3522x2 = this.f33833d.get();
        if (interfaceC3522x2 != null) {
            String string = this.f33832c.b().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC3522x2.a(new LevelPlayAdError(ironSourceError, string, this.f33832c.c()));
        }
    }
}
