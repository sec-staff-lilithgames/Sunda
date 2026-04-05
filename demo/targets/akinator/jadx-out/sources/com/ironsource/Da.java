package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.D0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Da implements InterfaceC3522x2 {

    /* renamed from: n, reason: collision with root package name */
    public static final a f34180n = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final UUID f34181a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34182b;

    /* renamed from: c, reason: collision with root package name */
    private final X2 f34183c;

    /* renamed from: d, reason: collision with root package name */
    private final LevelPlayBannerAdView.Config f34184d;

    /* renamed from: e, reason: collision with root package name */
    private final C3350n0 f34185e;

    /* renamed from: f, reason: collision with root package name */
    private final U8 f34186f;

    /* renamed from: g, reason: collision with root package name */
    private final LevelPlayAdSize f34187g;

    /* renamed from: h, reason: collision with root package name */
    private LevelPlayBannerAdViewListener f34188h;

    /* renamed from: i, reason: collision with root package name */
    private final String f34189i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC3375o7 f34190j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f34191k;

    /* renamed from: l, reason: collision with root package name */
    private C3325ld f34192l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f34193m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final tu.v a(Context context, AttributeSet attributeSet) {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            String str = "";
            if (attributeSet == null) {
                return tu.e0.to("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LevelPlayBannerAdView);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (typedArrayObtainStyledAttributes.hasValue(R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(typedArrayObtainStyledAttributes.getFloat(R.styleable.LevelPlayBannerAdView_bidFloor, -1.0f));
                }
                String string = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                tu.v vVar = tu.e0.to(str, builder.build());
                typedArrayObtainStyledAttributes.recycle();
                return vVar;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }

        private a() {
        }
    }

    public Da(UUID adId, String adUnitId, X2 bannerContainer, LevelPlayBannerAdView.Config config, C3350n0 adTools) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(bannerContainer, "bannerContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        this.f34181a = adId;
        this.f34182b = adUnitId;
        this.f34183c = bannerContainer;
        this.f34184d = config;
        this.f34185e = adTools;
        this.f34186f = Mb.f34856s.d().A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.f34187g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.f34189i = placementName == null ? "" : placementName;
        adTools.e().a(new C3349n(IronSource.a.BANNER, adId, adUnitId));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            adTools.e().f().a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Da this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (!this$0.f34193m) {
            IronLog.INTERNAL.warning(C3350n0.a(this$0.f34185e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.f34190j == null) {
            IronLog.INTERNAL.warning(C3350n0.a(this$0.f34185e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C3514wb.a(this$0.f34185e, new gh(this$0, 1), 0L, 2, (Object) null);
        InterfaceC3375o7 interfaceC3375o7 = this$0.f34190j;
        if (interfaceC3375o7 != null) {
            interfaceC3375o7.c();
        }
        this$0.f34190j = null;
        this$0.f34191k = null;
        this$0.f34188h = null;
    }

    public final void b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.f34185e.d(new gh(this, 0));
    }

    private final boolean h() {
        if (this.f34182b.length() == 0) {
            String string = this.f34181a.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "adId.toString()");
            a(new LevelPlayAdError(string, this.f34182b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.f34185e.g()) {
            String string2 = this.f34181a.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "adId.toString()");
            a(new LevelPlayAdError(string2, this.f34182b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
            return false;
        }
        C3126ab c3126abA = Mb.f34856s.d().e().a();
        if (c3126abA != null && c3126abA.a(this.f34182b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.f34188h;
        if (levelPlayBannerAdViewListener != null) {
            String string3 = this.f34181a.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string3, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(string3, this.f34182b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    public final UUID c() {
        return this.f34181a;
    }

    public final LevelPlayAdSize d() {
        return this.f34187g;
    }

    public final String e() {
        return this.f34182b;
    }

    public final LevelPlayBannerAdViewListener f() {
        return this.f34188h;
    }

    public final String g() {
        return this.f34189i;
    }

    public final void i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.f34185e.d(new gh(this, 2));
    }

    public final void j() {
        tu.x0 x0Var;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        InterfaceC3375o7 interfaceC3375o7 = this.f34190j;
        if (interfaceC3375o7 != null) {
            this.f34185e.d(new hh(this, interfaceC3375o7, 1));
            x0Var = tu.x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            this.f34191k = Boolean.FALSE;
        }
    }

    public final void k() {
        tu.x0 x0Var;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        InterfaceC3375o7 interfaceC3375o7 = this.f34190j;
        if (interfaceC3375o7 != null) {
            this.f34185e.d(new hh(this, interfaceC3375o7, 0));
            x0Var = tu.x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            this.f34191k = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Da this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f34183c.removeAllViews();
        ViewParent parent = this$0.f34183c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.f34183c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Da this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        if (this$0.f34193m) {
            IronLog.INTERNAL.warning(C3350n0.a(this$0.f34185e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.f34193m = true;
        if (this$0.h()) {
            InterfaceC3375o7 interfaceC3375o7A = this$0.a();
            this$0.f34190j = interfaceC3375o7A;
            Boolean bool = this$0.f34191k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    interfaceC3375o7A.e();
                } else {
                    interfaceC3375o7A.d();
                }
            }
            interfaceC3375o7A.b();
        }
    }

    @Override // com.ironsource.InterfaceC3522x2
    public void d(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34185e.e(new fh(adInfo, this, 2));
    }

    @Override // com.ironsource.InterfaceC3522x2
    public void e(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34185e.e(new fh(adInfo, this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LevelPlayAdInfo adInfo, Da this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f34188h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(LevelPlayAdInfo adInfo, Da this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f34188h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Da this$0, InterfaceC3375o7 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "$it");
        this$0.f34185e.e().f().c();
        it.e();
    }

    @Override // com.ironsource.InterfaceC3522x2
    public void b(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34185e.e(new fh(adInfo, this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayAdInfo adInfo, Da this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f34188h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    public final void a(LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.f34185e.d(new gi(4, this, levelPlayBannerAdViewListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Da this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.f34188h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LevelPlayAdInfo adInfo, Da this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f34188h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Da this$0, InterfaceC3375o7 it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "$it");
        this$0.f34185e.e().f().b();
        it.d();
    }

    public /* synthetic */ Da(UUID uuid, String str, X2 x22, LevelPlayBannerAdView.Config config, C3350n0 c3350n0, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? C3561z7.f39356a.a() : uuid, str, x22, config, (i10 & 16) != 0 ? new C3350n0(IronSource.a.BANNER, D0.b.MEDIATION) : c3350n0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final InterfaceC3375o7 a() {
        C3325ld c3325ld;
        this.f34192l = this.f34185e.a(this.f34189i);
        Context context = this.f34183c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.f34181a;
        String str = this.f34182b;
        C3325ld c3325ld2 = this.f34192l;
        if (c3325ld2 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("bannerPlacement");
            c3325ld = null;
        } else {
            c3325ld = c3325ld2;
        }
        K2 k22 = new K2(uuid, str, c3325ld, this.f34187g, null, null, this.f34186f.a(), this.f34184d.getBidFloor(), 48, null);
        this.f34185e.e().a(new B0(this.f34185e, k22, null, 4, 0 == true ? 1 : 0));
        ISBannerSize iSBannerSizeA = this.f34185e.a(k22.h());
        E5 e5E = this.f34185e.e();
        C3350n0 c3350n0 = this.f34185e;
        C3325ld c3325ld3 = this.f34192l;
        if (c3325ld3 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("bannerPlacement");
            c3325ld3 = null;
        }
        e5E.a(new Z2(c3350n0, iSBannerSizeA, c3325ld3.c()));
        if (Mb.f34856s.d().g().c()) {
            IronLog.INTERNAL.verbose(C3350n0.a(this.f34185e, "Using legacy BannerAdController", (String) null, 2, (Object) null));
            return new C3505w2(this, this.f34185e, k22, this.f34183c);
        }
        IronLog.INTERNAL.verbose(C3350n0.a(this.f34185e, "Using new LevelPlayBannerAdController", (String) null, 2, (Object) null));
        return new Aa(this, this.f34185e, k22, this.f34183c);
    }

    @Override // com.ironsource.InterfaceC3522x2
    public void c(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34185e.e(new fh(adInfo, this, 0));
    }

    @Override // com.ironsource.InterfaceC3522x2
    public void a(LevelPlayAdInfo adInfo, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34185e.e(new com.applovin.impl.d9(z10, adInfo, this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z10, LevelPlayAdInfo adInfo, Da this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z10 + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f34188h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3522x2
    public void a(LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.f34185e.e(new gi(3, levelPlayAdError, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdError it, Da this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "$it");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f34188h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.InterfaceC3522x2
    public void a(LevelPlayAdInfo adInfo, LevelPlayAdError levelPlayAdError) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.f34185e.e(new androidx.browser.customtabs.g(adInfo, 29, levelPlayAdError, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, LevelPlayAdError it, Da this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "$it");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f34188h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayAdInfo adInfo, Da this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "$adInfo");
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f34188h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3522x2
    public void a(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInfo, "adInfo");
        this.f34185e.e(new fh(adInfo, this, 3));
    }
}
