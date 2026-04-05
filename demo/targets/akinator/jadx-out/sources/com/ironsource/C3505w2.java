package com.ironsource;

import com.ironsource.AbstractC3279j3;
import com.ironsource.Za;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.w2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3505w2 extends AbstractC3329m implements P2, InterfaceC3315l3, InterfaceC3375o7 {

    /* renamed from: b, reason: collision with root package name */
    private final C3350n0 f39155b;

    /* renamed from: c, reason: collision with root package name */
    private final K2 f39156c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<InterfaceC3522x2> f39157d;

    /* renamed from: e, reason: collision with root package name */
    private LevelPlayAdInfo f39158e;

    /* renamed from: f, reason: collision with root package name */
    private LevelPlayAdInfo f39159f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC3279j3 f39160g;

    public C3505w2(InterfaceC3522x2 listener, C3350n0 adTools, K2 bannerAdProperties, X2 bannerViewContainer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        this.f39155b = adTools;
        this.f39156c = bannerAdProperties;
        this.f39157d = new WeakReference<>(listener);
        this.f39158e = r();
        this.f39159f = r();
        this.f39160g = AbstractC3279j3.f36985c.a(adTools, bannerViewContainer, q(), bannerAdProperties, this, p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M2 a(C3505w2 this$0, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        return this$0.a(this$0.f39155b, this$0.f39156c, z10);
    }

    private final O2 p() {
        return new ah(this, 5);
    }

    private final AbstractC3279j3.b q() {
        Za.a aVarD = this.f39155b.d(this.f39156c.c());
        Long lJ = this.f39156c.j();
        long jLongValue = lJ != null ? lJ.longValue() : aVarD.d();
        Boolean boolI = this.f39156c.i();
        return new AbstractC3279j3.b(jLongValue, boolI != null ? boolI.booleanValue() : aVarD.f());
    }

    private final LevelPlayAdInfo r() {
        String string = this.f39156c.b().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
        String strC = this.f39156c.c();
        String string2 = this.f39156c.a().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, null, 248, null);
    }

    @Override // com.ironsource.InterfaceC3375o7
    public void c() {
        this.f39160g.c();
    }

    @Override // com.ironsource.InterfaceC3375o7
    public void d() {
        this.f39160g.d();
    }

    @Override // com.ironsource.InterfaceC3375o7
    public void e() {
        this.f39160g.e();
    }

    @Override // com.ironsource.InterfaceC3315l3
    public void f(IronSourceError ironSourceError) {
        InterfaceC3522x2 interfaceC3522x2 = this.f39157d.get();
        if (interfaceC3522x2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f39158e;
            String string = this.f39156c.b().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC3522x2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, string, this.f39156c.c()));
        }
    }

    @Override // com.ironsource.J0
    public void g() {
        InterfaceC3522x2 interfaceC3522x2 = this.f39157d.get();
        if (interfaceC3522x2 != null) {
            interfaceC3522x2.d(this.f39158e);
        }
    }

    @Override // com.ironsource.InterfaceC3315l3
    public void h() {
        this.f39158e = this.f39159f;
        this.f39159f = r();
        InterfaceC3522x2 interfaceC3522x2 = this.f39157d.get();
        if (interfaceC3522x2 != null) {
            interfaceC3522x2.b(this.f39158e);
        }
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ tu.x0 i() {
        s();
        return tu.x0.f87415a;
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ tu.x0 j() {
        u();
        return tu.x0.f87415a;
    }

    @Override // com.ironsource.P2
    public /* bridge */ /* synthetic */ tu.x0 m() {
        t();
        return tu.x0.f87415a;
    }

    public void s() {
        InterfaceC3522x2 interfaceC3522x2 = this.f39157d.get();
        if (interfaceC3522x2 != null) {
            interfaceC3522x2.e(this.f39158e);
        }
    }

    public void t() {
        InterfaceC3522x2 interfaceC3522x2 = this.f39157d.get();
        if (interfaceC3522x2 != null) {
            interfaceC3522x2.c(this.f39158e);
        }
    }

    public void u() {
        InterfaceC3522x2 interfaceC3522x2 = this.f39157d.get();
        if (interfaceC3522x2 != null) {
            interfaceC3522x2.a(this.f39158e);
        }
    }

    private final M2 a(C3350n0 c3350n0, K2 k22, boolean z10) {
        IronLog.INTERNAL.verbose();
        return new M2(c3350n0, N2.f35028z.a(k22, o().a(), z10), this);
    }

    @Override // com.ironsource.InterfaceC3375o7
    public void b() {
        this.f39160g.b();
    }

    @Override // com.ironsource.InterfaceC3315l3
    public void c(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f39159f = levelPlayAdInfoC;
            InterfaceC3522x2 interfaceC3522x2 = this.f39157d.get();
            if (interfaceC3522x2 != null) {
                interfaceC3522x2.a(levelPlayAdInfoC, false);
            }
        }
    }

    @Override // com.ironsource.InterfaceC3315l3
    public void d(IronSourceError ironSourceError) {
        InterfaceC3522x2 interfaceC3522x2 = this.f39157d.get();
        if (interfaceC3522x2 != null) {
            String string = this.f39156c.b().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "bannerAdProperties.adId.toString()");
            interfaceC3522x2.a(new LevelPlayAdError(ironSourceError, string, this.f39156c.c()));
        }
    }
}
