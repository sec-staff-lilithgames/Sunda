package com.amazon.device.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.iab.omid.library.amazon.Omid;
import com.iab.omid.library.amazon.adsession.AdEvents;
import com.iab.omid.library.amazon.adsession.AdSession;
import com.iab.omid.library.amazon.adsession.AdSessionConfiguration;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.CreativeType;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.amazon.adsession.ImpressionType;
import com.iab.omid.library.amazon.adsession.Owner;
import com.iab.omid.library.amazon.adsession.Partner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DtbOmSdkSessionManager {
    public static final String APS_OMSDK_ACTIVATION_NOT_INITIALIZED_MESSAGE = "OMIDSDK Activation failed to initialize";
    public static final String APS_OM_SDK_ACTIVATION_ERROR_MESSAGE = "OMIDSDK Failed to activate";
    public static final String APS_OM_SDK_ADD_FRIENDLY_OBSTRUCTION_ERROR_MESSAGE = "OMIDSDK Failed to add friendly obstruction";
    public static final String APS_OM_SDK_AD_EVENTS_CREATION_ERROR_MESSAGE = "OMIDSDK Failed to create ad event";
    public static final String APS_OM_SDK_AD_SESSION_CONFIG_ERROR_MESSAGE = "OMIDSDK Failed to initialize config for ";
    public static final String APS_OM_SDK_AD_SESSION_CREATION_ERROR_MESSAGE = "OMIDSDK Failed to create ad session";
    public static final String APS_OM_SDK_IMPRESSION_ERROR_MESSAGE = "OMIDSDK Failed to trigger impression event";
    public static final String APS_OM_SDK_LOAD_EVENT_ERROR_MESSAGE = "OMIDSDK Failed to load ad event";
    public static final String APS_OM_SDK_PARTNER_OBJECT_ERROR_MESSAGE = "OMIDSDK Failed to create partner object";
    public static final String APS_OM_SDK_REGISTER_AD_VIEW_ERROR_MESSAGE = "OMIDSDK Failed to register ad view";
    public static final String APS_OM_SDK_START_AD_SESSION_ERROR_MESSAGE = "OMIDSDK Failed to start ad session";
    public static final String APS_OM_SDK_STOP_AD_SESSION_ERROR_MESSAGE = "OMIDSDK Failed to stop ad session";
    public static final String LOGTAG = "DtbOmSdkSessionManager";
    public static boolean featureEnabled;
    public static boolean isOmSdkActive;
    public AdSessionConfiguration adSessionConfiguration;
    public AdSessionContext adSessionContext;
    public AdEvents dtbOmSdkAdEvents;
    public AdSession dtbOmSdkAdSession;
    public Partner dtbOmSdkPartner;

    public DtbOmSdkSessionManager() {
        computeFeatureEnabledFlag();
        if (featureEnabled) {
            DtbThreadService.executeOnMainThread(new n(this, 1));
        }
    }

    public static void activateOMSDK(Context context) {
        DtbThreadService.executeOnMainThread(new l(context, 4));
    }

    private void computeFeatureEnabledFlag() {
        if (DTBMetricsConfiguration.getDeniedOmSdkVersionList(DTBMetricsConfiguration.OM_SDK_DENIED_VERSION_KEY_NAME).isEmpty()) {
            featureEnabled = true;
        } else {
            featureEnabled = !r0.contains(DtbConstants.INTEGRATED_OM_VERSION.replaceAll("_", "."));
        }
    }

    private void createOmAdEvents() {
        AdSession adSession = this.dtbOmSdkAdSession;
        if (adSession == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad event on create Ad Event");
        } else {
            this.dtbOmSdkAdEvents = AdEvents.createAdEvents(adSession);
            DtbLog.info(LOGTAG, "OMSDK : Open measurement ad Event created");
        }
    }

    private void createOmAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        if (adSessionConfiguration == null || adSessionContext == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, APS_OM_SDK_AD_SESSION_CREATION_ERROR_MESSAGE);
        } else {
            this.dtbOmSdkAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
            DtbLog.info(LOGTAG, "OMSDK : Open measurement ad Session Created");
        }
    }

    public static boolean getFeatureEnableFlag() {
        return featureEnabled;
    }

    public static DtbOmSdkSessionManager getNewInstance() {
        if (isOmSdkActive) {
            return new DtbOmSdkSessionManager();
        }
        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, APS_OMSDK_ACTIVATION_NOT_INITIALIZED_MESSAGE);
        return null;
    }

    private void initOmAdSession(WebView webView, String str, CreativeType creativeType, Owner owner, Owner owner2, boolean z10) {
        if (featureEnabled) {
            DtbThreadService.executeOnMainThread(new m(this, creativeType, owner, owner2, z10, webView, str));
        } else {
            DtbLog.error(LOGTAG, "OM SDK Feature Turned Off");
        }
    }

    public static boolean isOmSdkActive() {
        return isOmSdkActive;
    }

    public static /* synthetic */ void lambda$activateOMSDK$1(Context context) {
        try {
            Omid.activate(context);
            isOmSdkActive = Omid.isActive();
        } catch (Throwable th2) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_ACTIVATION_ERROR_MESSAGE, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addFriendlyObstruction$8(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.dtbOmSdkAdSession;
        if (adSession == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad session on add Friendly Obstruction");
            return;
        }
        try {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        } catch (RuntimeException unused) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_ADD_FRIENDLY_OBSTRUCTION_ERROR_MESSAGE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$displayAdEventLoaded$5() {
        AdEvents adEvents = this.dtbOmSdkAdEvents;
        if (adEvents == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad event on adLoaded event");
            return;
        }
        try {
            adEvents.loaded();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_LOAD_EVENT_ERROR_MESSAGE, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$impressionOccured$6() {
        AdEvents adEvents = this.dtbOmSdkAdEvents;
        if (adEvents == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad event on impressionOccured");
            return;
        }
        try {
            adEvents.impressionOccurred();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_IMPRESSION_ERROR_MESSAGE, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOmAdSession$2(CreativeType creativeType, Owner owner, Owner owner2, boolean z10, WebView webView, String str) {
        if (this.dtbOmSdkPartner == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, APS_OM_SDK_PARTNER_OBJECT_ERROR_MESSAGE);
            return;
        }
        try {
            this.adSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, owner, owner2, z10);
            AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(this.dtbOmSdkPartner, webView, str, "");
            this.adSessionContext = adSessionContextCreateHtmlAdSessionContext;
            createOmAdSession(this.adSessionConfiguration, adSessionContextCreateHtmlAdSessionContext);
            if (CreativeType.HTML_DISPLAY.equals(creativeType)) {
                createOmAdEvents();
            }
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_AD_SESSION_CONFIG_ERROR_MESSAGE + creativeType, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        try {
            this.dtbOmSdkPartner = Partner.createPartner(DTBMetricsConfiguration.getClientConfigVal(DTBMetricsConfiguration.OM_SDK_CONFIGURABLE_PARTNER_KEY_NAME, DtbConstants.OM_SDK_DEFAULT_PARTNER_NAME, DTBMetricsConfiguration.OM_SDK_FEATURE_KEY_NAME), DtbCommonUtils.getSDKVersion());
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, APS_OM_SDK_PARTNER_OBJECT_ERROR_MESSAGE, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerAdView$3(WebView webView) {
        AdSession adSession = this.dtbOmSdkAdSession;
        if (adSession == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad session on register Ad View");
            return;
        }
        try {
            adSession.registerAdView(webView);
            DtbLog.info(LOGTAG, "OMSDK : Open measurement ad view registered");
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_REGISTER_AD_VIEW_ERROR_MESSAGE, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startAdSession$4() {
        AdSession adSession = this.dtbOmSdkAdSession;
        if (adSession == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.LOG, "OMIDSDK Failed to create ad session on start Ad Session");
            return;
        }
        try {
            adSession.start();
            DtbLog.info(LOGTAG, "OMSDK : Open measurement ad session id: " + this.dtbOmSdkAdSession.getAdSessionId());
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_START_AD_SESSION_ERROR_MESSAGE, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stopOmAdSession$7() {
        AdSession adSession = this.dtbOmSdkAdSession;
        if (adSession == null || !isOmSdkActive) {
            DtbLog.error(LOGTAG, "OMSDK : Open measurement ad Session not active");
            return;
        }
        try {
            adSession.finish();
            this.adSessionContext = null;
            this.dtbOmSdkAdSession = null;
            this.dtbOmSdkAdEvents = null;
            this.adSessionConfiguration = null;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, APS_OM_SDK_STOP_AD_SESSION_ERROR_MESSAGE, e10);
        }
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        DtbThreadService.executeOnMainThread(new androidx.browser.customtabs.g(this, 5, view, friendlyObstructionPurpose));
    }

    public void displayAdEventLoaded() {
        DtbThreadService.executeOnMainThread(new n(this, 0));
    }

    public AdEvents getCurrentAdEvents() {
        return this.dtbOmSdkAdEvents;
    }

    public AdSession getCurrentAdSession() {
        return this.dtbOmSdkAdSession;
    }

    public void impressionOccured() {
        DtbThreadService.executeOnMainThread(new n(this, 4));
    }

    public void initHtmlDisplayOmAdSession(WebView webView, String str) {
        initOmAdSession(webView, str, CreativeType.HTML_DISPLAY, Owner.NATIVE, Owner.NONE, false);
    }

    public void initJavaScriptOmAdSession(WebView webView, String str) {
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        initOmAdSession(webView, str, creativeType, owner, owner, true);
    }

    public void registerAdView(WebView webView) {
        DtbThreadService.executeOnMainThread(new k(5, this, webView));
    }

    public void startAdSession() {
        DtbThreadService.executeOnMainThread(new n(this, 2));
    }

    public synchronized void stopOmAdSession() {
        DtbThreadService.executeOnMainThread(new n(this, 3));
    }
}
