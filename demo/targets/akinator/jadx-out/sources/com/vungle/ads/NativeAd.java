package com.vungle.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.presenter.NativePresenterDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.internal.util.ImageLoader;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.l;
import kv.p;
import tu.o;
import tu.q;
import tu.s;
import tu.x0;
import uu.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NativeAd extends BaseAd {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "NativeAd";
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private MediaView adContentView;
    private ImageView adIconView;
    private int adOptionsPosition;
    private NativeAdOptionsView adOptionsView;
    private final NativeAd$adPlayCallback$1 adPlayCallback;
    private FrameLayout adRootView;
    private float aspectRatio;
    private Collection<? extends View> clickableViews;
    private final o executors$delegate;
    private final o imageLoader$delegate;
    private final o impressionTracker$delegate;
    private final AtomicBoolean isInvisibleLogged;
    private Map<String, String> nativeAdAssetMap;
    private NativeAdPresenter presenter;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AdOptionsPosition {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.NativeAd$createMediaAspectRatio$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements p {
        public AnonymousClass1() {
            super(2);
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
            return x0.f87415a;
        }

        public final void invoke(int i10, int i11) {
            NativeAd.this.aspectRatio = i10 / i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.NativeAd$displayImage$1, reason: invalid class name and case insensitive filesystem */
    public static final class C38591 extends f0 implements l {
        final /* synthetic */ ImageView $imageView;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.vungle.ads.NativeAd$displayImage$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05531 extends f0 implements kv.a {
            final /* synthetic */ ImageView $imageView;
            final /* synthetic */ Bitmap $it;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05531(ImageView imageView, Bitmap bitmap) {
                super(0);
                this.$imageView = imageView;
                this.$it = bitmap;
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                m3565invoke();
                return x0.f87415a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m3565invoke() {
                this.$imageView.setImageBitmap(this.$it);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38591(ImageView imageView) {
            super(1);
            this.$imageView = imageView;
        }

        @Override // kv.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Bitmap) obj);
            return x0.f87415a;
        }

        public final void invoke(Bitmap it) {
            e0.checkNotNullParameter(it, "it");
            ImageView imageView = this.$imageView;
            if (imageView != null) {
                ThreadUtil.INSTANCE.runOnUiThread(new C05531(imageView, it));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.vungle.ads.NativeAd$adPlayCallback$1] */
    private NativeAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
        this.imageLoader$delegate = q.lazy(new NativeAd$imageLoader$2(this));
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.executors$delegate = q.lazy(s.f87403b, (kv.a) new NativeAd$special$$inlined$inject$1(context));
        this.impressionTracker$delegate = q.lazy(new NativeAd$impressionTracker$2(context));
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.adOptionsPosition = 1;
        this.adOptionsView = new NativeAdOptionsView(context);
        this.adPlayCallback = new AdPlayCallback() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(String str2) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onAdClick$1(this.this$0));
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getDisplayToClickMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str2) throws Throwable {
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.FINISHED);
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onAdEnd$1(this.this$0));
                this.this$0.getShowToCloseMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToCloseMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String str2) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onAdImpression$1(this.this$0));
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getPresentToDisplayMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(String str2) throws Throwable {
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onAdLeftApplication$1(this.this$0));
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getLeaveApplicationMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str2) throws Throwable {
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.PLAYING);
                this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
                this.this$0.getPresentToDisplayMetric$vungle_ads_release().markStart();
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onAdStart$1(this.this$0));
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError error) throws Throwable {
                e0.checkNotNullParameter(error, "error");
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
                ThreadUtil.INSTANCE.runOnUiThread(new NativeAd$adPlayCallback$1$onFailure$1(this.this$0, error));
                this.this$0.getShowToFailMetric$vungle_ads_release().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric$vungle_ads_release(), this.this$0.getLogEntry$vungle_ads_release(), error.getCode() + '-' + error.getErrorMessage());
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(String str2) {
            }
        };
    }

    private final void createMediaAspectRatio() {
        getImageLoader().getImageSize(getMainImagePath(), new AnonymousClass1());
    }

    private final void displayImage(String str, ImageView imageView) {
        getImageLoader().displayImage(str, new C38591(imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Executors getExecutors() {
        return (Executors) this.executors$delegate.getValue();
    }

    private final ImageLoader getImageLoader() {
        return (ImageLoader) this.imageLoader$delegate.getValue();
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker$delegate.getValue();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_MAIN_IMAGE)) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() throws Throwable {
        long j10 = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(Long.valueOf(j10));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        Logger.Companion.d(TAG, "Log metric AD_VISIBILITY: " + j10);
    }

    /* renamed from: registerViewForInteraction$lambda-1, reason: not valid java name */
    private static final Platform m3556registerViewForInteraction$lambda1(o oVar) {
        return (Platform) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerViewForInteraction$lambda-2, reason: not valid java name */
    public static final void m3557registerViewForInteraction$lambda2(NativeAd this$0, View view) throws Throwable {
        e0.checkNotNullParameter(this$0, "this$0");
        NativeAdPresenter nativeAdPresenter = this$0.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand("openPrivacy", this$0.getPrivacyUrl$vungle_ads_release());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerViewForInteraction$lambda-4$lambda-3, reason: not valid java name */
    public static final void m3558registerViewForInteraction$lambda4$lambda3(NativeAd this$0, View view) throws Throwable {
        e0.checkNotNullParameter(this$0, "this$0");
        NativeAdPresenter nativeAdPresenter = this$0.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand(NativeAdPresenter.DOWNLOAD, this$0.getCtaUrl$vungle_ads_release());
        }
    }

    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_DESCRIPTION)) == null) ? "" : str;
    }

    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_CTA_BUTTON_TEXT)) == null) ? "" : str;
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_SPONSORED_BY)) == null) ? "" : str;
    }

    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_RATING_VALUE)) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Double.valueOf(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_NAME)) == null) ? "" : str;
    }

    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_ICON)) == null) ? "" : str;
    }

    public final String getCtaUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_CTA_BUTTON_URL)) == null) ? "" : str;
    }

    public final float getMediaAspectRatio() {
        return this.aspectRatio;
    }

    public final String getPrivacyIconUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("VUNGLE_PRIVACY_ICON_URL")) == null) ? "" : str;
    }

    public final String getPrivacyUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_VUNGLE_PRIVACY_URL)) == null) ? "" : str;
    }

    public final boolean hasCallToAction() {
        return getCtaUrl$vungle_ads_release().length() > 0;
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        e0.checkNotNullParameter(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        this.nativeAdAssetMap = advertisement.getMRAIDArgsInMap();
        createMediaAspectRatio();
    }

    public final void performCTA() throws Throwable {
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand(NativeAdPresenter.DOWNLOAD, getCtaUrl$vungle_ads_release());
        }
    }

    public final void registerViewForInteraction(FrameLayout rootView, MediaView mediaView, ImageView imageView, Collection<? extends View> collection) throws Throwable {
        String str;
        e0.checkNotNullParameter(rootView, "rootView");
        e0.checkNotNullParameter(mediaView, "mediaView");
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getResponseToShowMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markStart();
        getShowToFailMetric$vungle_ads_release().markStart();
        getShowToCloseMetric$vungle_ads_release().markStart();
        final int i10 = 1;
        VungleError vungleErrorCanPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
                Map<String, String> map = this.nativeAdAssetMap;
                if (map != null) {
                    map.clear();
                }
            }
            BaseAdListener adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, vungleErrorCanPlayAd);
                return;
            }
            return;
        }
        this.adRootView = rootView;
        this.adContentView = mediaView;
        this.adIconView = imageView;
        this.clickableViews = collection;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        o oVarLazy = q.lazy(s.f87403b, (kv.a) new NativeAd$registerViewForInteraction$$inlined$inject$1(getContext()));
        Context context = getContext();
        AdLoaderCallback adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        e0.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.presenter.NativePresenterDelegate");
        this.presenter = new NativeAdPresenter(context, (NativePresenterDelegate) adInternal$vungle_ads_release, getAdInternal$vungle_ads_release().getAdvertisement(), m3556registerViewForInteraction$lambda1(oVarLazy));
        Map<String, String> map2 = this.nativeAdAssetMap;
        if (map2 == null || (str = map2.get(NativeAdInternal.TOKEN_OM_SDK_DATA)) == null) {
            str = "";
        }
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.initOMTracker(str);
        }
        NativeAdPresenter nativeAdPresenter2 = this.presenter;
        if (nativeAdPresenter2 != null) {
            nativeAdPresenter2.startTracking(rootView);
        }
        NativeAdPresenter nativeAdPresenter3 = this.presenter;
        if (nativeAdPresenter3 != null) {
            nativeAdPresenter3.setEventListener(new AdEventListener(this.adPlayCallback, getAdInternal$vungle_ads_release().getPlacement()));
        }
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            final int i11 = 0;
            nativeAdOptionsView.setOnClickListener(new View.OnClickListener(this) { // from class: com.vungle.ads.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ NativeAd f50755c;

                {
                    this.f50755c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    switch (i11) {
                        case 0:
                            NativeAd.m3557registerViewForInteraction$lambda2(this.f50755c, view);
                            break;
                        default:
                            NativeAd.m3558registerViewForInteraction$lambda4$lambda3(this.f50755c, view);
                            break;
                    }
                }
            });
        }
        if (collection == null) {
            collection = o0.listOf(mediaView);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: com.vungle.ads.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ NativeAd f50755c;

                {
                    this.f50755c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    switch (i10) {
                        case 0:
                            NativeAd.m3557registerViewForInteraction$lambda2(this.f50755c, view);
                            break;
                        default:
                            NativeAd.m3558registerViewForInteraction$lambda4$lambda3(this.f50755c, view);
                            break;
                    }
                }
            });
        }
        NativeAdOptionsView nativeAdOptionsView2 = this.adOptionsView;
        if (nativeAdOptionsView2 != null) {
            nativeAdOptionsView2.renderTo(rootView, this.adOptionsPosition);
        }
        getImpressionTracker().addView(rootView, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.NativeAd.registerViewForInteraction.3
            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onImpression(View view) throws Throwable {
                Logger.Companion.d(NativeAd.TAG, "ImpressionTracker checked the native ad view become visible.");
                NativeAdPresenter nativeAdPresenter4 = NativeAd.this.presenter;
                if (nativeAdPresenter4 != null) {
                    NativeAdPresenter.processCommand$default(nativeAdPresenter4, NativeAdPresenter.VIDEO_VIEWED, null, 2, null);
                }
                NativeAdPresenter nativeAdPresenter5 = NativeAd.this.presenter;
                if (nativeAdPresenter5 != null) {
                    nativeAdPresenter5.processCommand("tpat", Constants.CHECKPOINT_0);
                }
                NativeAdPresenter nativeAdPresenter6 = NativeAd.this.presenter;
                if (nativeAdPresenter6 != null) {
                    nativeAdPresenter6.onImpression();
                }
                NativeAd.this.logViewVisibleOnPlay();
            }

            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onViewInvisible(View view) throws Throwable {
                if (NativeAd.this.isInvisibleLogged.getAndSet(true)) {
                    return;
                }
                Logger.Companion.d(NativeAd.TAG, "ImpressionTracker checked the native ad view invisible on play, log AD_VISIBILITY_INVISIBLE.");
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                singleValueMetric.setValue(1L);
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient2, singleValueMetric, NativeAd.this.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            }
        });
        displayImage(getMainImagePath(), mediaView.getMainImage$vungle_ads_release());
        displayImage(getAppIcon(), imageView);
        String privacyIconUrl$vungle_ads_release = getPrivacyIconUrl$vungle_ads_release();
        NativeAdOptionsView nativeAdOptionsView3 = this.adOptionsView;
        displayImage(privacyIconUrl$vungle_ads_release, nativeAdOptionsView3 != null ? nativeAdOptionsView3.getPrivacyIcon$vungle_ads_release() : null);
        String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
        if (watermark$vungle_ads_release != null) {
            Context context2 = rootView.getContext();
            e0.checkNotNullExpressionValue(context2, "rootView.context");
            WatermarkView watermarkView = new WatermarkView(context2, watermark$vungle_ads_release);
            rootView.addView(watermarkView);
            watermarkView.bringToFront();
        }
        getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getAdInternal$vungle_ads_release().getShowToValidationMetric$vungle_ads_release(), getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getValidationToPresentMetric$vungle_ads_release().markStart();
        NativeAdPresenter nativeAdPresenter4 = this.presenter;
        if (nativeAdPresenter4 != null) {
            nativeAdPresenter4.prepare();
        }
    }

    public final void setAdOptionsPosition(int i10) {
        this.adOptionsPosition = i10;
    }

    public final void unregisterView() {
        if (getAdInternal$vungle_ads_release().getAdState() == AdInternal.AdState.FINISHED) {
            return;
        }
        Collection<? extends View> collection = this.clickableViews;
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        this.clickableViews = null;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map != null) {
            map.clear();
        }
        getImpressionTracker().destroy();
        MediaView mediaView = this.adContentView;
        if (mediaView != null) {
            mediaView.destroy();
        }
        this.adContentView = null;
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.destroy();
        }
        this.adOptionsView = null;
        try {
            ImageView imageView = this.adIconView;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e10) {
            Logger.Companion.w(TAG, "error msg: " + e10.getLocalizedMessage());
        }
        ImageView imageView2 = this.adIconView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.adIconView = null;
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.detach();
        }
    }

    @Override // com.vungle.ads.BaseAd
    public NativeAdInternal constructAdInternal$vungle_ads_release(Context context) {
        e0.checkNotNullParameter(context, "context");
        return new NativeAdInternal(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAd(Context context, String placementId) {
        this(context, placementId, new AdConfig());
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(placementId, "placementId");
    }

    @AdOptionsPosition
    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }
}
