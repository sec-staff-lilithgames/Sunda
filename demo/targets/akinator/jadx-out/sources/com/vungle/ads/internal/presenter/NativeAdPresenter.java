package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.LinkError;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.omsdk.NativeOMTracker;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.ExternalRouter;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u;
import tu.e0;
import tu.o;
import tu.q;
import tu.s;
import uu.p1;
import zk.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NativeAdPresenter {
    public static final String DOWNLOAD = "download";
    public static final String OPEN_PRIVACY = "openPrivacy";
    private static final String TAG = "NativeAdPresenter";
    public static final String TPAT = "tpat";
    public static final String VIDEO_VIEWED = "videoViewed";
    private Long adStartTime;
    private boolean adViewed;
    private final AdPayload advertisement;
    private AdEventListener bus;
    private final Context context;
    private Dialog currentDialog;
    private final NativePresenterDelegate delegate;
    private final o logEntry$delegate;
    private NativeOMTracker omTracker;
    private final Platform platform;
    private final o tpatSender$delegate;
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Sdk.SDKMetric.SDKMetricType> eventMap = p1.mapOf(e0.to(Constants.CHECKPOINT_0, Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), e0.to(Constants.CLICK_URL, Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final Map<String, Sdk.SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return NativeAdPresenter.eventMap;
        }

        private Companion() {
        }

        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }
    }

    public NativeAdPresenter(Context context, NativePresenterDelegate delegate, AdPayload adPayload, Platform platform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        kotlin.jvm.internal.e0.checkNotNullParameter(platform, "platform");
        this.context = context;
        this.delegate = delegate;
        this.advertisement = adPayload;
        this.platform = platform;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.tpatSender$delegate = q.lazy(s.f87403b, (kv.a) new NativeAdPresenter$special$$inlined$inject$1(context));
        this.logEntry$delegate = q.lazy(new NativeAdPresenter$logEntry$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEntry getLogEntry() {
        return (LogEntry) this.logEntry$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TpatSender getTpatSender() {
        return (TpatSender) this.tpatSender$delegate.getValue();
    }

    /* renamed from: initOMTracker$lambda-10, reason: not valid java name */
    private static final OMInjector m3635initOMTracker$lambda10(o oVar) {
        return (OMInjector) oVar.getValue();
    }

    private final boolean needShowGdpr() {
        return ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && kotlin.jvm.internal.e0.areEqual("unknown", PrivacyManager.INSTANCE.getConsentStatus());
    }

    private final void onDownload(String str) {
        AdEventListener adEventListener;
        AdPayload.AdUnit adUnit;
        AdPayload adPayload = this.advertisement;
        final String deeplinkUrl = null;
        List tpatUrls$default = adPayload != null ? AdPayload.getTpatUrls$default(adPayload, Constants.CLICK_URL, null, null, 6, null) : null;
        List list = tpatUrls$default;
        if (list == null || list.isEmpty()) {
            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key: clickUrl").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
        } else {
            Iterator it = tpatUrls$default.iterator();
            while (it.hasNext()) {
                TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.CLICK_URL).withLogEntry(getLogEntry()).build(), false, 2, null);
            }
        }
        if (str != null) {
            TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder(str).tpatKey(Constants.CTA_URL).withLogEntry(getLogEntry()).build(), false, 2, null);
        }
        AdPayload adPayload2 = this.advertisement;
        if (adPayload2 != null && (adUnit = adPayload2.adUnit()) != null) {
            deeplinkUrl = adUnit.getDeeplinkUrl();
        }
        boolean zLaunch = ExternalRouter.launch(deeplinkUrl, str, this.context, getLogEntry(), new PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$onDownload$launched$1
            @Override // com.vungle.ads.internal.ui.PresenterAdOpenCallback
            public void onDeeplinkClick(boolean z10) {
                if (!z10) {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }
                AdPayload adPayload3 = this.advertisement;
                List tpatUrls$default2 = adPayload3 != null ? AdPayload.getTpatUrls$default(adPayload3, Constants.DEEPLINK_CLICK, String.valueOf(z10), null, 4, null) : null;
                if (tpatUrls$default2 != null) {
                    NativeAdPresenter nativeAdPresenter = this;
                    Iterator it2 = tpatUrls$default2.iterator();
                    while (it2.hasNext()) {
                        TpatSender.sendTpat$default(nativeAdPresenter.getTpatSender(), new TpatRequest.Builder((String) it2.next()).tpatKey(Constants.DEEPLINK_CLICK).withLogEntry(nativeAdPresenter.getLogEntry()).build(), false, 2, null);
                    }
                }
            }
        });
        AdEventListener adEventListener2 = this.bus;
        if (adEventListener2 != null) {
            adEventListener2.onNext("open", "adClick", this.delegate.getPlacementRefId());
        }
        if (!zLaunch || (adEventListener = this.bus) == null) {
            return;
        }
        adEventListener.onNext("open", "adLeftApplication", this.delegate.getPlacementRefId());
    }

    private final void onPrivacy(String str) throws Throwable {
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), getLogEntry(), (String) null, 4, (Object) null);
        if (str != null) {
            if (!FileUtility.INSTANCE.isValidUrl(str)) {
                new PrivacyUrlError(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            if (!ExternalRouter.launch$default(null, str, this.context, getLogEntry(), null, 16, null)) {
                new PrivacyUrlError(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            AdEventListener adEventListener = this.bus;
            if (adEventListener != null) {
                adEventListener.onNext("open", "adLeftApplication", this.delegate.getPlacementRefId());
            }
        }
    }

    public static /* synthetic */ void processCommand$default(NativeAdPresenter nativeAdPresenter, String str, String str2, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        nativeAdPresenter.processCommand(str, str2);
    }

    private final void showGdpr() {
        PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof Activity)) {
            Logger.Companion.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        s0 s0Var = new s0(this, 3);
        ConfigManager configManager = ConfigManager.INSTANCE;
        String gDPRConsentTitle = configManager.getGDPRConsentTitle();
        String gDPRConsentMessage = configManager.getGDPRConsentMessage();
        String gDPRButtonAccept = configManager.getGDPRButtonAccept();
        String gDPRButtonDeny = configManager.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        if (gDPRConsentTitle != null && gDPRConsentTitle.length() != 0) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, s0Var);
        builder.setNegativeButton(gDPRButtonDeny, s0Var);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.ads.internal.presenter.c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NativeAdPresenter.m3637showGdpr$lambda9(this.f50778b, dialogInterface);
            }
        });
        this.currentDialog = alertDialogCreate;
        alertDialogCreate.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGdpr$lambda-8, reason: not valid java name */
    public static final void m3636showGdpr$lambda8(NativeAdPresenter this$0, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        PrivacyManager.INSTANCE.updateGdprConsent(i10 != -2 ? i10 != -1 ? "opted_out_by_timeout" : PrivacyConsent.OPT_IN.getValue() : PrivacyConsent.OPT_OUT.getValue(), "vungle_modal", null);
        this$0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showGdpr$lambda-9, reason: not valid java name */
    public static final void m3637showGdpr$lambda9(NativeAdPresenter this$0, DialogInterface dialogInterface) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.currentDialog = null;
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    private final void triggerEventMetricForTpat(String str) throws Throwable {
        Sdk.SDKMetric.SDKMetricType sDKMetricType = eventMap.get(str);
        if (sDKMetricType != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(sDKMetricType), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    public final void detach() {
        List<String> tpatUrls;
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.stop();
        }
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        Long l9 = this.adStartTime;
        if (l9 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l9.longValue();
            AdPayload adPayload = this.advertisement;
            if (adPayload != null && (tpatUrls = adPayload.getTpatUrls(Constants.AD_CLOSE, String.valueOf(jCurrentTimeMillis), String.valueOf(this.platform.getVolumeLevel()))) != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext(TtmlNode.END, null, this.delegate.getPlacementRefId());
        }
    }

    public final void initOMTracker(String omSdkData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(omSdkData, "omSdkData");
        AdPayload adPayload = this.advertisement;
        boolean zOmEnabled = adPayload != null ? adPayload.omEnabled() : false;
        if (omSdkData.length() <= 0 || !zOmEnabled) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        o oVarLazy = q.lazy(s.f87403b, (kv.a) new NativeAdPresenter$initOMTracker$$inlined$inject$1(this.context));
        m3635initOMTracker$lambda10(oVarLazy).init();
        String oMSDKJS$vungle_ads_release = m3635initOMTracker$lambda10(oVarLazy).getOMSDKJS$vungle_ads_release();
        if (oMSDKJS$vungle_ads_release != null) {
            this.omTracker = new NativeOMTracker(omSdkData, oMSDKJS$vungle_ads_release);
        }
    }

    public final void onImpression() {
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.impressionOccurred();
        }
    }

    public final void prepare() {
        start();
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.delegate.getPlacementRefId());
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void processCommand(java.lang.String r11, java.lang.String r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.NativeAdPresenter.processCommand(java.lang.String, java.lang.String):void");
    }

    public final void setEventListener(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void startTracking(View rootView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rootView, "rootView");
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.start(rootView);
        }
    }
}
