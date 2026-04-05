package com.vungle.ads.internal.ui;

import a.b;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.model.UnclosedAd;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.PresenterDelegate;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.RingerModeReceiver;
import e3.g;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import o3.c;
import tu.a0;
import tu.o;
import tu.q;
import tu.s;
import tu.x0;
import tu.z;
import x3.d4;
import x3.e3;
import x3.r2;
import x3.t3;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AdActivity extends Activity {
    public static final String AD_INVISIBLE_LOGGED_KEY = "ad_invisible_logged";
    public static final Companion Companion = new Companion(null);
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    public static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "AdActivity";
    private static AdPayload advertisement;
    private static BidPayload bidPayload;
    private static AdEventListener eventListener;
    private static PresenterDelegate presenterDelegate;
    private MRAIDAdWidget mraidAdWidget;
    private MRAIDPresenter mraidPresenter;
    private UnclosedAd unclosedAd;
    private String placementRefId = "";
    private final RingerModeReceiver ringerModeReceiver = new RingerModeReceiver();
    private final AdActivity$lifeCycleCallback$1 lifeCycleCallback = new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.ui.AdActivity$lifeCycleCallback$1
        @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
        public void onBackground() throws Throwable {
            MRAIDPresenter mraidPresenter$vungle_ads_release = this.this$0.getMraidPresenter$vungle_ads_release();
            Long viewStatus = mraidPresenter$vungle_ads_release != null ? mraidPresenter$vungle_ads_release.getViewStatus() : null;
            Logger.Companion.d("AdActivity", "App is in background, status: " + viewStatus);
            if (viewStatus != null) {
                long jLongValue = viewStatus.longValue();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_BACKGROUND_BEFORE_IMPRESSION;
                AdPayload advertisement$vungle_ads_release = AdActivity.Companion.getAdvertisement$vungle_ads_release();
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, sDKMetricType, jLongValue, advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getLogEntry$vungle_ads_release() : null, null, 8, null);
            }
        }

        @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
        public void onForeground() {
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEventId(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPlacement(Intent intent) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras.getString(AdActivity.REQUEST_KEY_EXTRA);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        public final Intent createIntent(Context context, String placement, String str) {
            e0.checkNotNullParameter(placement, "placement");
            Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            Bundle bundle = new Bundle();
            bundle.putString(AdActivity.REQUEST_KEY_EXTRA, placement);
            bundle.putString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA, str);
            intent.putExtras(bundle);
            return intent;
        }

        public final AdPayload getAdvertisement$vungle_ads_release() {
            return AdActivity.advertisement;
        }

        public final BidPayload getBidPayload$vungle_ads_release() {
            return AdActivity.bidPayload;
        }

        public final AdEventListener getEventListener$vungle_ads_release() {
            return AdActivity.eventListener;
        }

        public final PresenterDelegate getPresenterDelegate$vungle_ads_release() {
            return AdActivity.presenterDelegate;
        }

        public final void setAdvertisement$vungle_ads_release(AdPayload adPayload) {
            AdActivity.advertisement = adPayload;
        }

        public final void setBidPayload$vungle_ads_release(BidPayload bidPayload) {
            AdActivity.bidPayload = bidPayload;
        }

        public final void setEventListener$vungle_ads_release(AdEventListener adEventListener) {
            AdActivity.eventListener = adEventListener;
        }

        public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
            AdActivity.presenterDelegate = presenterDelegate;
        }

        private Companion() {
        }

        public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
        }
    }

    private final void hideSystemUi() {
        d4 insetsController = r2.getInsetsController(getWindow(), getWindow().getDecorView());
        e0.checkNotNullExpressionValue(insetsController, "getInsetsController(window, window.decorView)");
        insetsController.setSystemBarsBehavior(2);
        insetsController.hide(t3.systemBars());
    }

    private final void onConcurrentPlaybackError(String str) {
        ConcurrentPlaybackUnsupported concurrentPlaybackUnsupported = new ConcurrentPlaybackUnsupported(o2.o(g.o("Trying to show ", str, " but "), this.placementRefId, " is already showing"));
        AdPayload adPayload = advertisement;
        VungleError vungleErrorLogError$vungle_ads_release = concurrentPlaybackUnsupported.setLogEntry$vungle_ads_release(adPayload != null ? adPayload.getLogEntry$vungle_ads_release() : null).logError$vungle_ads_release();
        AdEventListener adEventListener = eventListener;
        if (adEventListener != null) {
            adEventListener.onError(vungleErrorLogError$vungle_ads_release, str);
        }
        Logger.Companion.e(TAG, "onConcurrentPlaybackError: " + vungleErrorLogError$vungle_ads_release.getLocalizedMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final SignalManager m3649onCreate$lambda1(o oVar) {
        return (SignalManager) oVar.getValue();
    }

    /* renamed from: onCreate$lambda-5, reason: not valid java name */
    private static final Executors m3650onCreate$lambda5(o oVar) {
        return (Executors) oVar.getValue();
    }

    /* renamed from: onCreate$lambda-6, reason: not valid java name */
    private static final Platform m3651onCreate$lambda6(o oVar) {
        return (Platform) oVar.getValue();
    }

    /* renamed from: onCreate$lambda-7, reason: not valid java name */
    private static final OMTracker.Factory m3652onCreate$lambda7(o oVar) {
        return (OMTracker.Factory) oVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-9, reason: not valid java name */
    public static final e3 m3653onCreate$lambda9(View v10, e3 insets) {
        e0.checkNotNullParameter(v10, "v");
        e0.checkNotNullParameter(insets, "insets");
        c insets2 = insets.getInsets(t3.systemBars() | t3.displayCutout());
        e0.checkNotNullExpressionValue(insets2, "insets.getInsets(\n      …utout()\n                )");
        v10.setPadding(insets2.f77432a, insets2.f77433b, insets2.f77434c, insets2.f77435d);
        return e3.f91568b;
    }

    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    public final MRAIDAdWidget getMraidAdWidget$vungle_ads_release() {
        return this.mraidAdWidget;
    }

    public final MRAIDPresenter getMraidPresenter$vungle_ads_release() {
        return this.mraidPresenter;
    }

    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        e0.checkNotNullParameter(newConfig, "newConfig");
        try {
            super.onConfigurationChanged(newConfig);
            int i10 = newConfig.orientation;
            if (i10 == 2) {
                Logger.Companion.d(TAG, "landscape");
            } else if (i10 == 1) {
                Logger.Companion.d(TAG, "portrait");
            }
            MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.onViewConfigurationChanged();
            }
        } catch (Exception e10) {
            Logger.Companion.e(TAG, "onConfigurationChanged: " + e10.getLocalizedMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String, kotlin.jvm.internal.u] */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        String watermark$vungle_ads_release;
        View decorView;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        Companion companion = Companion;
        Intent intent = getIntent();
        e0.checkNotNullExpressionValue(intent, "intent");
        String placement = companion.getPlacement(intent);
        if (placement == null) {
            placement = "";
        }
        this.placementRefId = placement;
        AdPayload adPayload = advertisement;
        Placement placement2 = ConfigManager.INSTANCE.getPlacement(placement);
        frameLayout = null;
        FrameLayout frameLayout = null;
        if (placement2 == null || adPayload == null) {
            AdEventListener adEventListener = eventListener;
            if (adEventListener != null) {
                adEventListener.onError(new AdNotLoadedCantPlay("Can not play fullscreen ad. placement=" + placement2 + " adv=" + adPayload).setLogEntry$vungle_ads_release(adPayload != null ? adPayload.getLogEntry$vungle_ads_release() : 0).logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
            return;
        }
        try {
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(this, adPayload.eventId());
            long j10 = getIntent().getBooleanExtra(AD_INVISIBLE_LOGGED_KEY, false) ? 3L : 2L;
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            singleValueMetric.setValue(Long.valueOf(j10));
            AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, adPayload.getLogEntry$vungle_ads_release(), (String) null, 4, (Object) null);
            Logger.Companion.d(TAG, "Log metric AD_VISIBILITY: " + j10);
            ServiceLocator.Companion companion2 = ServiceLocator.Companion;
            s sVar = s.f87403b;
            final o oVarLazy = q.lazy(sVar, (kv.a) new AdActivity$onCreate$$inlined$inject$1(this));
            Intent intent2 = getIntent();
            e0.checkNotNullExpressionValue(intent2, "intent");
            String eventId = companion.getEventId(intent2);
            UnclosedAd unclosedAd = eventId != null ? new UnclosedAd(eventId, (String) logEntry, 2, (u) logEntry) : null;
            this.unclosedAd = unclosedAd;
            if (unclosedAd != null) {
                m3649onCreate$lambda1(oVarLazy).recordUnclosedAd(unclosedAd);
            }
            mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$4$1
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() throws Throwable {
                    MRAIDPresenter mraidPresenter$vungle_ads_release = this.this$0.getMraidPresenter$vungle_ads_release();
                    Long viewStatus = mraidPresenter$vungle_ads_release != null ? mraidPresenter$vungle_ads_release.getViewStatus() : null;
                    if (viewStatus != null) {
                        long jLongValue = viewStatus.longValue();
                        AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_CLOSED_BEFORE_IMPRESSION;
                        AdPayload advertisement$vungle_ads_release = AdActivity.Companion.getAdvertisement$vungle_ads_release();
                        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient2, sDKMetricType, jLongValue, advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getLogEntry$vungle_ads_release() : null, null, 8, null);
                    }
                    UnclosedAd unclosedAd2 = this.this$0.unclosedAd;
                    if (unclosedAd2 != null) {
                        AdActivity.m3649onCreate$lambda1(oVarLazy).removeUnclosedAd(unclosedAd2);
                    }
                    this.this$0.finish();
                }
            });
            mRAIDAdWidget.setOnViewTouchListener(new MRAIDAdWidget.OnViewTouchListener() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$4$2
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
                public boolean onTouch(MotionEvent motionEvent) {
                    MRAIDPresenter mraidPresenter$vungle_ads_release = this.this$0.getMraidPresenter$vungle_ads_release();
                    if (mraidPresenter$vungle_ads_release == null) {
                        return false;
                    }
                    mraidPresenter$vungle_ads_release.onViewTouched(motionEvent);
                    return false;
                }
            });
            mRAIDAdWidget.setOrientationDelegate(new MRAIDAdWidget.OrientationDelegate() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$4$3
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OrientationDelegate
                public void setOrientation(int i10) {
                    this.this$0.setRequestedOrientation(i10);
                }
            });
            o oVarLazy2 = q.lazy(sVar, (kv.a) new AdActivity$onCreate$$inlined$inject$2(this));
            o oVarLazy3 = q.lazy(sVar, (kv.a) new AdActivity$onCreate$$inlined$inject$3(this));
            VungleWebClient orCreateWebViewClient = WebViewManager.INSTANCE.getOrCreateWebViewClient(adPayload, placement2, m3650onCreate$lambda5(oVarLazy2).getOffloadExecutor(), m3651onCreate$lambda6(oVarLazy3));
            OMTracker oMTrackerMake = m3652onCreate$lambda7(q.lazy(sVar, (kv.a) new AdActivity$onCreate$$inlined$inject$4(this))).make(adPayload.omEnabled());
            VungleThreadPoolExecutor jobExecutor = m3650onCreate$lambda5(oVarLazy2).getJobExecutor();
            orCreateWebViewClient.setWebViewObserver(oMTrackerMake);
            this.ringerModeReceiver.setWebClient(orCreateWebViewClient);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, adPayload, placement2, orCreateWebViewClient, jobExecutor, oMTrackerMake, m3651onCreate$lambda6(oVarLazy3));
            mRAIDPresenter.setEventListener(eventListener);
            mRAIDPresenter.setPresenterDelegate$vungle_ads_release(presenterDelegate);
            mRAIDPresenter.prepare();
            setContentView(mRAIDAdWidget, mRAIDAdWidget.getLayoutParams());
            try {
                int i10 = z.f87419c;
                getWindow().getDecorView().setBackgroundColor(-16777216);
                z.m7131constructorimpl(x0.f87415a);
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                z.m7131constructorimpl(a0.createFailure(th2));
            }
            z1.setOnApplyWindowInsetsListener(mRAIDAdWidget, new com.google.android.gms.internal.ads.a(16));
            AdConfig adConfig = adPayload.getAdConfig();
            if (adConfig != null && (watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release()) != null) {
                Window window = getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
                }
                if (frameLayout != null) {
                    WatermarkView watermarkView = new WatermarkView(this, watermark$vungle_ads_release);
                    frameLayout.addView(watermarkView);
                    watermarkView.bringToFront();
                }
            }
            this.mraidAdWidget = mRAIDAdWidget;
            this.mraidPresenter = mRAIDPresenter;
            ActivityManager.Companion.addLifecycleListener(this.lifeCycleCallback);
            try {
                z.m7131constructorimpl(registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED")));
            } catch (Throwable th3) {
                int i12 = z.f87419c;
                z.m7131constructorimpl(a0.createFailure(th3));
            }
        } catch (InstantiationException e10) {
            AdEventListener adEventListener2 = eventListener;
            if (adEventListener2 != null) {
                adEventListener2.onError(new AdCantPlayWithoutWebView(e10.getMessage()).setLogEntry$vungle_ads_release(adPayload.getLogEntry$vungle_ads_release()).logError$vungle_ads_release(), this.placementRefId);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.detach((isChangingConfigurations() ? 1 : 0) | 2);
        }
        ActivityManager.Companion.removeLifecycleListener(this.lifeCycleCallback);
        try {
            int i10 = z.f87419c;
            unregisterReceiver(this.ringerModeReceiver);
            z.m7131constructorimpl(x0.f87415a);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            z.m7131constructorimpl(a0.createFailure(th2));
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        e0.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Companion companion = Companion;
        Intent intent2 = getIntent();
        e0.checkNotNullExpressionValue(intent2, "getIntent()");
        String placement = companion.getPlacement(intent2);
        String placement2 = companion.getPlacement(intent);
        Intent intent3 = getIntent();
        e0.checkNotNullExpressionValue(intent3, "getIntent()");
        String eventId = companion.getEventId(intent3);
        String eventId2 = companion.getEventId(intent);
        if ((placement == null || placement2 == null || e0.areEqual(placement, placement2)) && (eventId == null || eventId2 == null || e0.areEqual(eventId, eventId2))) {
            return;
        }
        Logger.Companion.d(TAG, b.m("Tried to play another placement ", placement2, " while playing ", placement));
        onConcurrentPlaybackError(placement2);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        hideSystemUi();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.start();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(MRAIDAdWidget mRAIDAdWidget) {
        this.mraidAdWidget = mRAIDAdWidget;
    }

    public final void setMraidPresenter$vungle_ads_release(MRAIDPresenter mRAIDPresenter) {
        this.mraidPresenter = mRAIDPresenter;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.placementRefId = str;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(i10);
        }
    }

    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPlacementRefId$vungle_ads_release$annotations() {
    }
}
