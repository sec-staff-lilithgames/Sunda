package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.y2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3539y2 extends AbstractC3553z implements BannerAdListener {

    /* renamed from: x, reason: collision with root package name */
    private WeakReference<A2> f39247x;

    /* renamed from: y, reason: collision with root package name */
    private View f39248y;

    /* renamed from: z, reason: collision with root package name */
    private FrameLayout.LayoutParams f39249z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3539y2(V0 adTools, A instanceData, G adInstancePayload, A2 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f39247x = new WeakReference<>(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3539y2 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3539y2 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.L();
    }

    @Override // com.ironsource.AbstractC3553z
    public void A() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData adDataI = i();
        ISBannerSize iSBannerSizeI = I();
        Map<String, Object> adUnitData = adDataI.getAdUnitData();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(adUnitData, "adData.adUnitData");
        adUnitData.put(L2.f34791t, new com.ironsource.mediationsdk.q(ContextProvider.getInstance().getApplicationContext(), iSBannerSizeI));
        Object objG = g();
        kotlin.jvm.internal.e0.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) objG).loadAd(adDataI, ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeI, this);
    }

    @Override // com.ironsource.AbstractC3553z
    public void a(I adInstancePresenter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.AbstractC3553z
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        C3514wb.a(f(), new mi(this, 0), 0L, 2, (Object) null);
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterBannerInterface) {
                Object objG = g();
                kotlin.jvm.internal.e0.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((AdapterBannerInterface) objG).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String strK = a.b.k("destroyBanner - exception = ", th2.getLocalizedMessage());
            IronLog.INTERNAL.error(a(strK));
            f().e().h().g(strK);
        }
        super.b();
    }

    @Override // com.ironsource.AbstractC3553z
    public LevelPlayAdInfo e() {
        String string = n().i().b().b().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = n().i().b().c();
        String string2 = n().h().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "instanceData.adFormat.toString()");
        Y8 y8A = n().n().a(k());
        Bb bbD = n().n().d();
        AbstractC3486v0 abstractC3486v0I = n().i();
        kotlin.jvm.internal.e0.checkNotNull(abstractC3486v0I, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(string, strC, string2, y8A, bbD, ((N2) abstractC3486v0I).b().h(), n().i().l(), null, 128, null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new mi(this, 3));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View adView, FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.e0.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        C3514wb.a(f(), new lh(this, 10, adView, frameLayoutParams), 0L, 2, (Object) null);
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new mi(this, 2));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new mi(this, 4));
    }

    private final ISBannerSize I() {
        V0 v0F = f();
        AbstractC3486v0 abstractC3486v0I = n().i();
        kotlin.jvm.internal.e0.checkNotNull(abstractC3486v0I, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return v0F.a(((N2) abstractC3486v0I).b().h());
    }

    private final void J() {
        C3325ld c3325ldJ = j();
        if (c3325ldJ != null) {
            f().e().a().f(c3325ldJ.c());
        }
        A2 a22 = this.f39247x.get();
        if (a22 != null) {
            a22.a(this);
        }
    }

    private final void K() {
        C3325ld c3325ldJ = j();
        if (c3325ldJ != null) {
            f().e().a().c(c3325ldJ.c());
        }
        A2 a22 = this.f39247x.get();
        if (a22 != null) {
            a22.b(this);
        }
    }

    private final void L() {
        C3325ld c3325ldJ = j();
        if (c3325ldJ != null) {
            f().e().a().h(c3325ldJ.c());
        }
        A2 a22 = this.f39247x.get();
        if (a22 != null) {
            a22.c(this);
        }
    }

    public final void a(pg viewBinder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewBinder, "viewBinder");
        C3514wb.a(f(), new gi(28, this, viewBinder), 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3539y2 this$0, pg viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewBinder, "$viewBinder");
        View view = this$0.f39248y;
        if (view == null || (layoutParams = this$0.f39249z) == null) {
            return;
        }
        viewBinder.a(view, layoutParams, this$0.f());
        IronLog.INTERNAL.verbose(C3350n0.a(this$0.f(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.f().d(new mi(this$0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3539y2 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f39248y = null;
        this$0.f39249z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3539y2 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adView, "$adView");
        kotlin.jvm.internal.e0.checkNotNullParameter(frameLayoutParams, "$frameLayoutParams");
        this$0.f39248y = adView;
        this$0.f39249z = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C3539y2 this$0) {
        String strC;
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        M mA = this$0.f().e().a();
        C3325ld c3325ldJ = this$0.j();
        if (c3325ldJ == null || (strC = c3325ldJ.c()) == null) {
            strC = "";
        }
        mA.j(strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3539y2 this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }
}
