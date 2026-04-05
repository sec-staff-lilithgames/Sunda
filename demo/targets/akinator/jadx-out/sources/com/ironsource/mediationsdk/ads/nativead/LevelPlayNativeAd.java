package com.ironsource.mediationsdk.ads.nativead;

import android.app.Activity;
import com.ironsource.C3127ac;
import com.ironsource.C3163cc;
import com.ironsource.C3325ld;
import com.ironsource.C3422r4;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.r;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.banners.view.a;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class LevelPlayNativeAd implements NativeAdInterface, NativeAdDataInterface, InternalNativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    private String f37274a;

    /* renamed from: b, reason: collision with root package name */
    private C3325ld f37275b;

    /* renamed from: c, reason: collision with root package name */
    private LevelPlayNativeAdListener f37276c;

    /* renamed from: d, reason: collision with root package name */
    private C3127ac f37277d;

    /* renamed from: e, reason: collision with root package name */
    private AdapterNativeAdData f37278e;

    /* renamed from: f, reason: collision with root package name */
    private AdapterNativeAdViewBinder f37279f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f37280g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f37281a;

        /* renamed from: b, reason: collision with root package name */
        private LevelPlayNativeAdListener f37282b;

        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, null);
        }

        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.f37282b;
        }

        public final String getMPlacementName$mediationsdk_release() {
            return this.f37281a;
        }

        public final void setMListener$mediationsdk_release(LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.f37282b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(String str) {
            this.f37281a = str;
        }

        public final Builder withActivity(Activity activity) {
            ContextProvider.getInstance().updateActivity(activity);
            IronLog.INTERNAL.verbose("activity is updated to: " + (activity != null ? activity.hashCode() : 0));
            return this;
        }

        public final Builder withListener(LevelPlayNativeAdListener listener) {
            e0.checkNotNullParameter(listener, "listener");
            this.f37282b = listener;
            return this;
        }

        public final Builder withPlacementName(String str) {
            this.f37281a = str;
            return this;
        }
    }

    public /* synthetic */ LevelPlayNativeAd(Builder builder, u uVar) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0) {
        x0 x0Var;
        e0.checkNotNullParameter(this$0, "this$0");
        this$0.b();
        C3127ac c3127ac = this$0.f37277d;
        if (c3127ac != null) {
            c3127ac.a(this$0.f37275b);
            x0Var = x0.f87415a;
        } else {
            x0Var = null;
        }
        if (x0Var == null) {
            this$0.a();
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            C3127ac c3127ac = this.f37277d;
            if (c3127ac != null) {
                c3127ac.M();
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.f37278e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.f37278e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.f37278e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.f37278e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f37279f;
    }

    public final UUID getObjectId() {
        C3127ac c3127ac = this.f37277d;
        if (c3127ac != null) {
            return c3127ac.k();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        AdapterNativeAdData adapterNativeAdData = this.f37278e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        IronLog.API.info(String.valueOf(this));
        String initError = r.m().e();
        e0.checkNotNullExpressionValue(initError, "initError");
        if (initError.length() <= 0) {
            IronSourceThreadManager.INSTANCE.getInitHandler().post(new a(this, 10));
            return;
        }
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f37276c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("loadAd(): ".concat(initError), IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new dl.a(this, adInfo, 0), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new dl.a(this, adInfo, 1), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new com.ironsource.environment.thread.a(21, this, ironSourceError), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(AdInfo adInfo, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        e0.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        e0.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new al.a(21, this, adapterNativeAdData, nativeAdViewBinder, adInfo), 0L, 2, null);
    }

    public final void setListener(LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.f37276c = levelPlayNativeAdListener;
    }

    private LevelPlayNativeAd(Builder builder) {
        this.f37280g = new AtomicBoolean(false);
        this.f37274a = builder.getMPlacementName$mediationsdk_release();
        this.f37276c = builder.getMListener$mediationsdk_release();
    }

    private final void b() {
        if (this.f37280g.compareAndSet(false, true)) {
            C3127ac c3127acF = r.m().f();
            this.f37277d = c3127acF;
            if (c3127acF != null) {
                c3127acF.a(this);
                C3163cc c3163ccM = r.m().m(this.f37274a);
                e0.checkNotNullExpressionValue(c3163ccM, "getInstance().getNativeAdPlacement(mPlacementName)");
                this.f37275b = new C3325ld(c3163ccM);
            }
        }
    }

    private final void a() {
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f37276c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        e0.checkNotNullParameter(this$0, "this$0");
        e0.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        e0.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.f37278e = adapterNativeAdData;
        this$0.f37279f = nativeAdViewBinder;
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f37276c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayNativeAd this$0, AdInfo adInfo) {
        e0.checkNotNullParameter(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f37276c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, IronSourceError ironSourceError) {
        e0.checkNotNullParameter(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f37276c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this$0, ironSourceError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, AdInfo adInfo) {
        e0.checkNotNullParameter(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f37276c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(this$0, adInfo);
        }
    }
}
