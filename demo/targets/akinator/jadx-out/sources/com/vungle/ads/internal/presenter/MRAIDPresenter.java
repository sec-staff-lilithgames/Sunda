package com.vungle.ads.internal.presenter;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.IndexHtmlError;
import com.vungle.ads.MraidTemplateError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewError;
import com.vungle.ads.WebViewRenderProcessUnresponsive;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.SuspendableTimer;
import com.vungle.ads.internal.util.ThreadUtil;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import j1.o2;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import tu.e0;
import tu.o;
import tu.q;
import tu.s;
import tu.x0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MRAIDPresenter implements WebViewAPI.MraidDelegate, WebViewAPI.WebClientErrorHandler {
    private static final String ACTION = "action";
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    public static final String CLOSE = "close";
    public static final String CONSENT_ACTION = "consentAction";
    public static final String CREATIVE_HEARTBEAT = "creativeHeartbeat";
    public static final String ERROR = "error";
    public static final String GET_AVAILABLE_DISK_SPACE = "getAvailableDiskSpace";
    private static final double HEARTBEAT_INTERVAL = 6.0d;
    public static final String OPEN = "open";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String PING_URL = "pingUrl";
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "MRAIDPresenter";
    public static final String TPAT = "tpat";
    public static final String UPDATE_SIGNALS = "updateSignals";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final String VIDEO_LENGTH = "videoLength";
    private Long adStartTime;
    private final MRAIDAdWidget adWidget;
    private final AdPayload advertisement;
    private boolean backEnabled;
    private AdEventListener bus;
    private final o clickCoordinateTracker$delegate;
    private boolean cp0Fired;
    private Executor executor;
    private boolean heartbeatEnabled;
    private final AtomicBoolean isDestroying;
    private long lastUserInteractionTimestamp;
    private final o logEntry$delegate;
    private final OMTracker omTracker;
    private final o pathProvider$delegate;
    private final Placement placement;
    private final Platform platform;
    private PresenterDelegate presenterDelegate;
    private final o scheduler$delegate;
    private final AtomicBoolean sendReportIncentivized;
    private final o signalManager$delegate;
    private final o suspendableTimer$delegate;
    private final o tpatSender$delegate;
    private String userId;
    private long videoLength;
    private final o vungleApiClient$delegate;
    private final VungleWebClient vungleWebClient;
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Sdk.SDKMetric.SDKMetricType> eventMap = p1.mapOf(e0.to(Constants.CHECKPOINT_0, Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), e0.to(Constants.CLICK_URL, Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Map<String, Sdk.SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return MRAIDPresenter.eventMap;
        }

        private Companion() {
        }

        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCREATIVE_HEARTBEAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getGET_AVAILABLE_DISK_SPACE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getPING_URL$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getUPDATE_SIGNALS$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.internal.presenter.MRAIDPresenter$closeView$2, reason: invalid class name */
    public static final class AnonymousClass2 extends f0 implements kv.a {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3632invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3632invoke() {
            MRAIDPresenter.this.adWidget.close();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$7, reason: invalid class name */
    public static final class AnonymousClass7 extends f0 implements kv.a {
        final /* synthetic */ MraidTemplateError $exception;
        final /* synthetic */ boolean $isFatal;
        final /* synthetic */ String $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(MraidTemplateError mraidTemplateError, boolean z10, String str) {
            super(0);
            this.$exception = mraidTemplateError;
            this.$isFatal = z10;
            this.$message = str;
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3633invoke();
            return x0.f87415a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3633invoke() {
            MRAIDPresenter.this.handleWebViewException(this.$exception, this.$isFatal, this.$message);
        }
    }

    public MRAIDPresenter(MRAIDAdWidget adWidget, AdPayload advertisement, Placement placement, VungleWebClient vungleWebClient, Executor executor, OMTracker omTracker, Platform platform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adWidget, "adWidget");
        kotlin.jvm.internal.e0.checkNotNullParameter(advertisement, "advertisement");
        kotlin.jvm.internal.e0.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.e0.checkNotNullParameter(vungleWebClient, "vungleWebClient");
        kotlin.jvm.internal.e0.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.e0.checkNotNullParameter(omTracker, "omTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(platform, "platform");
        this.adWidget = adWidget;
        this.advertisement = advertisement;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = omTracker;
        this.platform = platform;
        this.isDestroying = new AtomicBoolean(false);
        this.sendReportIncentivized = new AtomicBoolean(false);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        Context context = adWidget.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "adWidget.context");
        s sVar = s.f87403b;
        this.vungleApiClient$delegate = q.lazy(sVar, (kv.a) new MRAIDPresenter$special$$inlined$inject$1(context));
        Context context2 = adWidget.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context2, "adWidget.context");
        this.pathProvider$delegate = q.lazy(sVar, (kv.a) new MRAIDPresenter$special$$inlined$inject$2(context2));
        Context context3 = adWidget.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context3, "adWidget.context");
        this.signalManager$delegate = q.lazy(sVar, (kv.a) new MRAIDPresenter$special$$inlined$inject$3(context3));
        Context context4 = adWidget.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context4, "adWidget.context");
        this.tpatSender$delegate = q.lazy(sVar, (kv.a) new MRAIDPresenter$special$$inlined$inject$4(context4));
        this.scheduler$delegate = q.lazy(MRAIDPresenter$scheduler$2.INSTANCE);
        this.logEntry$delegate = q.lazy(new MRAIDPresenter$logEntry$2(this));
        this.suspendableTimer$delegate = q.lazy(new MRAIDPresenter$suspendableTimer$2(this));
        this.clickCoordinateTracker$delegate = q.lazy(new MRAIDPresenter$clickCoordinateTracker$2(this));
    }

    private final void closeView() {
        Long l9 = this.adStartTime;
        if (l9 != null) {
            List<String> tpatUrls = this.advertisement.getTpatUrls(Constants.AD_CLOSE, String.valueOf(System.currentTimeMillis() - l9.longValue()), String.valueOf(this.platform.getVolumeLevel()));
            if (tpatUrls != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
        ThreadUtil.INSTANCE.runOnUiThread(new AnonymousClass2());
    }

    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBus$annotations() {
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLastUserInteractionTimestamp$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEntry getLogEntry() {
        return (LogEntry) this.logEntry$delegate.getValue();
    }

    private final PathProvider getPathProvider() {
        return (PathProvider) this.pathProvider$delegate.getValue();
    }

    private final HandlerScheduler getScheduler() {
        return (HandlerScheduler) this.scheduler$delegate.getValue();
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager$delegate.getValue();
    }

    public static /* synthetic */ void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TpatSender getTpatSender() {
        return (TpatSender) this.tpatSender$delegate.getValue();
    }

    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVideoLength$vungle_ads_release$annotations() {
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleWebViewException(VungleError vungleError, boolean z10, String str) {
        Logger.Companion.e(TAG, "handleWebViewException: " + vungleError.getLocalizedMessage() + ", fatal: " + z10 + ", errorMsg: " + str);
        vungleError.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        if (z10) {
            makeBusError(vungleError);
            closeView();
        }
    }

    public static /* synthetic */ void handleWebViewException$default(MRAIDPresenter mRAIDPresenter, VungleError vungleError, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = null;
        }
        mRAIDPresenter.handleWebViewException(vungleError, z10, str);
    }

    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    private final VungleError loadMraidAd() {
        String indexFilePath = this.advertisement.getIndexFilePath();
        File file = indexFilePath != null ? new File(indexFilePath) : null;
        if (file == null || !file.exists()) {
            Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD;
            StringBuilder sb2 = new StringBuilder("Fail to load html ");
            sb2.append(file != null ? file.getPath() : null);
            return new IndexHtmlError(reason, sb2.toString());
        }
        this.adWidget.linkWebView(this.vungleWebClient, this.advertisement.getWebViewSettings());
        this.adWidget.showWebsite(AdPayload.FILE_SCHEME + file.getPath());
        return null;
    }

    private final void makeBusError(VungleError vungleError) {
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onError(vungleError, this.placement.getReferenceId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: prepare$lambda-14, reason: not valid java name */
    public static final void m3627prepare$lambda14(MRAIDPresenter this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.backEnabled = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-10, reason: not valid java name */
    public static final void m3628processCommand$lambda10(MRAIDPresenter this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.getSuspendableTimer$vungle_ads_release().reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-11, reason: not valid java name */
    public static final void m3629processCommand$lambda11(MRAIDPresenter this$0, long j10, long j11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.vungleWebClient.notifyDiskAvailableSize(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-5, reason: not valid java name */
    public static final void m3630processCommand$lambda5(MRAIDPresenter this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.adWidget.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processCommand$lambda-9, reason: not valid java name */
    public static final void m3631processCommand$lambda9(final MRAIDPresenter this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        List list = null;
        CommonRequestBody.AdSizeParam adSizeParam = null;
        Call<Void> callRi = this$0.getVungleApiClient().ri(new CommonRequestBody.RequestParam(list, adSizeParam, this$0.adStartTime, this$0.advertisement.advAppId(), this$0.placement.getReferenceId(), this$0.userId, 3, (u) null));
        if (callRi != null) {
            callRi.enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$6$1
                @Override // com.vungle.ads.internal.network.Callback
                public void onFailure(Call<Void> call, Throwable th2) {
                    Logger.Companion.d("MRAIDPresenter", "send RI Failure");
                    StringBuilder sb2 = new StringBuilder("Error RI API calls: ");
                    sb2.append(th2 != null ? th2.getLocalizedMessage() : null);
                    new NetworkUnreachable(sb2.toString()).setLogEntry$vungle_ads_release(this.this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }

                @Override // com.vungle.ads.internal.network.Callback
                public void onResponse(Call<Void> call, Response<Void> response) {
                    Logger.Companion.d("MRAIDPresenter", "send RI success");
                }
            });
            return;
        }
        Logger.Companion.e(TAG, "Invalid ri call.");
        new NetworkUnreachable("Error RI API for placement: " + this$0.placement.getReferenceId()).setLogEntry$vungle_ads_release(this$0.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportErrorAndCloseAd(VungleError vungleError) {
        vungleError.setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        makeBusError(vungleError);
        closeView();
    }

    private final void triggerEventMetricForTpat(String str) throws Throwable {
        Sdk.SDKMetric.SDKMetricType sDKMetricType = eventMap.get(str);
        if (sDKMetricType != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(sDKMetricType), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    public final void detach(@MRAIDAdWidget.AdStopReason int i10) {
        AdEventListener adEventListener;
        Logger.Companion.d(TAG, "detach()");
        boolean z10 = (i10 & 1) != 0;
        boolean z11 = (i10 & 2) != 0;
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z10 && z11 && !this.isDestroying.getAndSet(true) && (adEventListener = this.bus) != null) {
            adEventListener.onNext(TtmlNode.END, null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop(), this.platform.isProblematicMaliDevice());
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().cancel();
        }
    }

    public final Long getAdStartTime$vungle_ads_release() {
        return this.adStartTime;
    }

    public final boolean getBackEnabled$vungle_ads_release() {
        return this.backEnabled;
    }

    public final AdEventListener getBus() {
        return this.bus;
    }

    public final ClickCoordinateTracker getClickCoordinateTracker$vungle_ads_release() {
        return (ClickCoordinateTracker) this.clickCoordinateTracker$delegate.getValue();
    }

    public final boolean getHeartbeatEnabled$vungle_ads_release() {
        return this.heartbeatEnabled;
    }

    public final long getLastUserInteractionTimestamp$vungle_ads_release() {
        return this.lastUserInteractionTimestamp;
    }

    public final SuspendableTimer getSuspendableTimer$vungle_ads_release() {
        return (SuspendableTimer) this.suspendableTimer$delegate.getValue();
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    public final long getVideoLength$vungle_ads_release() {
        return this.videoLength;
    }

    public final Long getViewStatus() {
        return !this.cp0Fired ? 1L : null;
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final AtomicBoolean isDestroying$vungle_ads_release() {
        return this.isDestroying;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String errorDesc, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorDesc, "errorDesc");
        if (z10) {
            reportErrorAndCloseAd(new WebViewError(errorDesc));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new WebViewRenderProcessUnresponsive("fatal=true"), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(MotionEvent motionEvent) {
        if (motionEvent != null) {
            Logger.Companion.d(TAG, "user interaction");
            this.lastUserInteractionTimestamp = System.currentTimeMillis();
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(motionEvent);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView webView, Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        handleWebViewException$default(this, new WebViewRenderingProcessGone(o2.n("didCrash=", zBooleanValue)), zBooleanValue, null, 4, null);
        return true;
    }

    public final void prepare() {
        String alertTitleText;
        String alertBodyText;
        String alertContinueButtonText;
        String alertCloseButtonText;
        VungleError vungleErrorLoadMraidAd;
        int settings;
        this.isDestroying.set(false);
        AdConfig adConfig = this.advertisement.getAdConfig();
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            this.backEnabled = (settings & 2) == 2;
        }
        this.heartbeatEnabled = this.advertisement.heartbeatEnabled();
        AdConfig adConfig2 = this.advertisement.getAdConfig();
        Integer numValueOf = adConfig2 != null ? Integer.valueOf(adConfig2.getAdOrientation()) : null;
        this.adWidget.setOrientation((numValueOf != null && numValueOf.intValue() == 0) ? 7 : (numValueOf != null && numValueOf.intValue() == 1) ? 6 : 4);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        this.vungleWebClient.setAdVisibility(false);
        if (!this.advertisement.usePreloading() && (vungleErrorLoadMraidAd = loadMraidAd()) != null) {
            reportErrorAndCloseAd(vungleErrorLoadMraidAd);
            return;
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
        PresenterDelegate presenterDelegate = this.presenterDelegate;
        this.userId = presenterDelegate != null ? presenterDelegate.getUserId() : null;
        PresenterDelegate presenterDelegate2 = this.presenterDelegate;
        if (presenterDelegate2 == null || (alertTitleText = presenterDelegate2.getAlertTitleText()) == null) {
            alertTitleText = "";
        }
        PresenterDelegate presenterDelegate3 = this.presenterDelegate;
        if (presenterDelegate3 == null || (alertBodyText = presenterDelegate3.getAlertBodyText()) == null) {
            alertBodyText = "";
        }
        PresenterDelegate presenterDelegate4 = this.presenterDelegate;
        if (presenterDelegate4 == null || (alertContinueButtonText = presenterDelegate4.getAlertContinueButtonText()) == null) {
            alertContinueButtonText = "";
        }
        PresenterDelegate presenterDelegate5 = this.presenterDelegate;
        if (presenterDelegate5 == null || (alertCloseButtonText = presenterDelegate5.getAlertCloseButtonText()) == null) {
            alertCloseButtonText = "";
        }
        this.advertisement.setIncentivizedText(alertTitleText, alertBodyText, alertContinueButtonText, alertCloseButtonText);
        ConfigManager configManager = ConfigManager.INSTANCE;
        boolean z10 = configManager.getGDPRIsCountryDataProtected() && kotlin.jvm.internal.e0.areEqual("unknown", PrivacyManager.INSTANCE.getConsentStatus());
        this.vungleWebClient.setConsentStatus(z10, configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
        if (z10) {
            PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
        }
        int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isRewardedVideo()));
        if (showCloseDelay > 0) {
            getScheduler().schedule(new a(this, 3), showCloseDelay);
        } else {
            this.backEnabled = true;
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.placement.getReferenceId());
        }
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().start();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0249, code lost:
    
        if (r24.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN_NON_MRAID) == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x024d, code lost:
    
        r0 = r23.advertisement.adUnit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0253, code lost:
    
        if (r0 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0255, code lost:
    
        r11 = r0.getDeeplinkUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0259, code lost:
    
        r0 = com.vungle.ads.internal.util.JsonUtil.INSTANCE.getContentStringValue(r25, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0265, code lost:
    
        if (com.vungle.ads.internal.util.FileUtility.INSTANCE.isValidUrl(r0) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0267, code lost:
    
        new com.vungle.ads.InvalidCTAUrl(j1.o2.f(')', "Unable to open CTA Url (", r0)).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0283, code lost:
    
        if (shouldBlockAutoRedirect$vungle_ads_release() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0285, code lost:
    
        r23.lastUserInteractionTimestamp = 0;
        com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT), getLogEntry(), (java.lang.String) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02a2, code lost:
    
        r23.lastUserInteractionTimestamp = 0;
        r2 = r23.adWidget.getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(r2, "adWidget.context");
        r0 = com.vungle.ads.internal.util.ExternalRouter.launch(r11, r0, r2, getLogEntry(), new com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$launched$1(r11, r23));
        r2 = r23.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02be, code lost:
    
        if (r2 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02c0, code lost:
    
        r2.onNext("open", "adClick", r23.placement.getReferenceId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02cb, code lost:
    
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02cd, code lost:
    
        r0 = r23.bus;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02cf, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02d1, code lost:
    
        r0.onNext("open", "adLeftApplication", r23.placement.getReferenceId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r24.equals("useCustomClose") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0511, code lost:
    
        if (r24.equals("action") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0235, code lost:
    
        if (r24.equals("open") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x023f, code lost:
    
        if (r24.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.USE_CUSTOM_PRIVACY) == false) goto L218;
     */
    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean processCommand(java.lang.String r24, kotlinx.serialization.json.JsonObject r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.MRAIDPresenter.processCommand(java.lang.String, kotlinx.serialization.json.JsonObject):boolean");
    }

    public final void setAdStartTime$vungle_ads_release(Long l9) {
        this.adStartTime = l9;
    }

    public final void setAdVisibility(boolean z10) {
        this.vungleWebClient.setAdVisibility(z10);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z10) {
        this.backEnabled = z10;
    }

    public final void setBus(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void setEventListener(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z10) {
        this.heartbeatEnabled = z10;
    }

    public final void setLastUserInteractionTimestamp$vungle_ads_release(long j10) {
        this.lastUserInteractionTimestamp = j10;
    }

    public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
        this.presenterDelegate = presenterDelegate;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final void setVideoLength$vungle_ads_release(long j10) {
        this.videoLength = j10;
    }

    public final boolean shouldBlockAutoRedirect$vungle_ads_release() {
        ConfigManager configManager = ConfigManager.INSTANCE;
        return !configManager.allowAutoRedirects() && (this.lastUserInteractionTimestamp == 0 || System.currentTimeMillis() - this.lastUserInteractionTimestamp > configManager.afterClickDuration());
    }

    public final void stop() {
        Logger.Companion.d(TAG, "stop()");
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }

    public final void start() {
        Logger.Companion.d(TAG, QCmNMSGd.MfveqXtpKEtTGcG);
        this.adWidget.resumeWeb();
        setAdVisibility(true);
    }
}
