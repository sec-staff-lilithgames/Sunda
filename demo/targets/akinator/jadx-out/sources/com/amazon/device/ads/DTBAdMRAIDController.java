package com.amazon.device.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.browser.customtabs.y;
import b0.e2;
import com.amazon.aps.ads.R;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.SDKUtilities;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import j1.o2;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class DTBAdMRAIDController implements DTBActivityListener {
    public static final String LOG_TAG = "DTBAdMRAIDController";
    public static final String MRAID_CLOSE = "window.mraid.close();";
    public static final String MRAID_READY = "window.mraidBridge.event.ready();";
    public DTBAdView adView;
    public LinearLayout closeIndicatorRegion;
    public DTBMRAIDCloseButtonListener customButtonListener;
    public DtbOmSdkSessionManager dtbOmSdkSessionManager;
    public Rect lastRect;
    public MraidExposure lastReportedExposure;
    public Boolean lastViewabilityState;
    public boolean loadReportSubmitted;
    public boolean pageLoaded = false;
    public boolean useCustomClose = false;
    public int lastReportedSizeChangeWidth = -1;
    public int lastReportedSizeChangeHeight = -1;
    public MraidStateType state = MraidStateType.LOADING;
    public boolean jsReady = false;
    public boolean isTwoPartExpand = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.amazon.device.ads.DTBAdMRAIDController$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MraidStateType;

        static {
            int[] iArr = new int[MraidStateType.values().length];
            $SwitchMap$com$amazon$device$ads$MraidStateType = iArr;
            try {
                iArr[MraidStateType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.RESIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.EXPANDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class MraidExposure {
        public int percent;
        public Rect rect;

        public MraidExposure(int i10, Rect rect) {
            this.percent = i10;
            this.rect = new Rect(rect);
        }
    }

    static {
        MraidCommand.registerCommand(MraidOpenCommand.getMraidName(), MraidOpenCommand.class);
        MraidCommand.registerCommand(MraidCloseCommand.getMraidName(), MraidCloseCommand.class);
        MraidCommand.registerCommand(MraidUnloadCommand.getMraidName(), MraidUnloadCommand.class);
        MraidCommand.registerCommand(MraidResizeCommand.getMraidName(), MraidResizeCommand.class);
        MraidCommand.registerCommand(MraidExpandCommand.getMraidName(), MraidExpandCommand.class);
        MraidCommand.registerCommand(MraidUseCustomCloseCommand.getMraidName(), MraidUseCustomCloseCommand.class);
        MraidCommand.registerCommand(MraidJSReadyCommand.getMraidName(), MraidJSReadyCommand.class);
        MraidCommand.registerCommand(MraidFirePixelCommand.getMraidName(), MraidFirePixelCommand.class);
    }

    public DTBAdMRAIDController(DTBAdView dTBAdView) {
        this.adView = dTBAdView;
        this.dtbOmSdkSessionManager = dTBAdView.getOmSdkManager();
    }

    private void evaluateJavascriptMethod(String str, JSONObject jSONObject) {
        evaluateJavascript(String.format(o2.l(str, "(%s);"), jSONObject.toString()));
    }

    private void fireEnforcedExposureChange(int i10, Rect rect) {
        evaluateJavascript(String.format("window.mraidBridge.event.exposureChange(%d, { x:%d, y:%d, width:%d, height: %d}, null);", Integer.valueOf(i10), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.left)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.top)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.right - rect.left)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.bottom - rect.top))));
    }

    private void fireMaxSizeEvent() {
        SDKUtilities.SimpleSize maxSize = DTBAdUtil.getMaxSize(getAdView());
        evaluateJavascript(String.format("window.mraidBridge.property.setMaxSize({'width':%d, 'height':%d});", Integer.valueOf(maxSize.getWidth()), Integer.valueOf(maxSize.getHeight())));
    }

    private JSONObject formProperties(MraidProperty[] mraidPropertyArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (MraidProperty mraidProperty : mraidPropertyArr) {
            mraidProperty.formJSON(jSONObject);
        }
        return jSONObject;
    }

    private MraidProperty getCurrentStateProperty() {
        int i10 = AnonymousClass2.$SwitchMap$com$amazon$device$ads$MraidStateType[this.state.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MraidProperty.STATE_DEFAULT_PROPERTY : MraidProperty.STATE_HIDDEN_PROPERTY : MraidProperty.STATE_EXPANDED_PROPERTY : MraidProperty.STATE_RESIZED_PROPERTY : MraidProperty.STATE_DEFAULT_PROPERTY : MraidProperty.STATE_LOADING_PROPERTY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$evaluateJavascript$0(final String str) {
        if (getAdView() != null) {
            getAdView().evaluateJavascript(str, new ValueCallback<String>() { // from class: com.amazon.device.ads.DTBAdMRAIDController.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                    if (str2 == null || AbstractJsonLexerKt.NULL.equals(str2)) {
                        return;
                    }
                    String str3 = DTBAdMRAIDController.LOG_TAG;
                    StringBuilder sbO = e3.g.o("Value received:", str2, " for script ");
                    sbO.append(str);
                    DtbLog.debug(str3, sbO.toString());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMRAIDUnload$2() {
        getAdView().loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setCloseIndicatorContent$3(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return true;
        }
        evaluateJavascript(MRAID_CLOSE);
        ((ViewGroup) view.getParent()).removeView(view);
        this.closeIndicatorRegion = null;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setState$1() {
        DTBAdView adView = getAdView();
        if (adView != null) {
            adView.setVisibility(8);
        }
    }

    public void addCloseIndicator(int i10, int i11) {
        removeCloseIndicator();
        addCloseIndicator(i10, i11, false);
    }

    public void cleanup() {
        this.closeIndicatorRegion = null;
        this.adView = null;
        this.customButtonListener = null;
    }

    public void closeExpandedPartTwo() {
    }

    public void commandCompleted(String str) {
        evaluateJavascript("window.mraidBridge.service.acknowledgement('" + str + "');");
    }

    public void createContentIndicator() {
        LinearLayout linearLayout = new LinearLayout(getAdView().getContext());
        this.closeIndicatorRegion = linearLayout;
        linearLayout.setVisibility(this.useCustomClose ? 4 : 0);
        this.closeIndicatorRegion.setOrientation(1);
    }

    public void createLoadReport() {
        String bidId = this.adView.getBidId();
        String hostname = this.adView.getHostname();
        if (bidId == null || this.loadReportSubmitted) {
            return;
        }
        DTBMetricsProcessor.getInstance().submitLatencyReportBidId(DTBMetricReport.addBid(bidId, hostname), DTBMetricsProcessor.REPORT_LOAD_LATENCY, (int) (e2.c() - this.adView.getStartTime()));
        this.loadReportSubmitted = true;
    }

    public void evaluateJavascript(String str) {
        DtbLog.debug(LOG_TAG, "MRAID Evaluate JSScript:" + str);
        new Handler(Looper.getMainLooper()).post(new k(3, this, str));
    }

    public abstract void expand(Map<String, Object> map);

    public void fireEnforcedSizeChange(int i10, int i11) {
        evaluateJavascript(String.format("window.mraidBridge.event.sizeChange(%d, %d);", Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    public void fireEnforcedViewableChange(boolean z10) {
        evaluateJavascript("window.mraidBridge.event.viewableChange(" + (z10 ? "true" : "false") + ");");
    }

    public void fireErrorEvent(String str, String str2) {
        evaluateJavascript(e3.g.l("window.mraidBridge.event.error('", str2, "','", str, "');"));
    }

    public void fireExposureChange(int i10, Rect rect) {
        int i11 = rect.right;
        if (this.jsReady) {
            fireEnforcedExposureChange(i10, rect);
        } else {
            this.lastReportedExposure = new MraidExposure(i10, rect);
        }
    }

    public void fireMRAIDReadyEvent() {
        evaluateJavascript(MRAID_READY);
    }

    public void fireMRAIDSupports() {
        evaluateJavascriptMethod("window.mraidBridge.property.setSupports", MraidProperty.SUPPORTS_PROPERTY.getData());
    }

    public void firePlacementType() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", getPlacementType());
        evaluateJavascriptMethod("window.mraidBridge.property.setPlacementType", jSONObject);
    }

    public void fireScreenSizeEvent() {
        SDKUtilities.SimpleSize screenSize = DTBAdUtil.getScreenSize(getAdView());
        evaluateJavascript(String.format("window.mraidBridge.property.setScreenSize({'width':%d, 'height':%d});", Integer.valueOf(screenSize.getWidth()), Integer.valueOf(screenSize.getHeight())));
    }

    public void fireSizeChange(int i10, int i11) {
        if (this.lastReportedSizeChangeWidth == i10 && this.lastReportedSizeChangeHeight == i11) {
            return;
        }
        this.lastReportedSizeChangeWidth = i10;
        this.lastReportedSizeChangeHeight = i11;
        if (this.jsReady) {
            fireEnforcedSizeChange(i10, i11);
        }
    }

    public void fireStateChangeEvent() {
        try {
            JSONObject jSONObjectFormProperties = formProperties(new MraidProperty[]{getCurrentStateProperty()});
            DtbLog.debug(LOG_TAG, "State was changed to " + jSONObjectFormProperties.toString() + " for controller " + this);
            evaluateJavascript("window.mraidBridge.event.stateChange(" + jSONObjectFormProperties.toString() + ");");
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void fireViewableChange(boolean z10) {
        Boolean bool = this.lastViewabilityState;
        if (bool == null || bool.booleanValue() != z10) {
            if (this.jsReady) {
                fireEnforcedViewableChange(z10);
            }
            this.lastViewabilityState = Boolean.valueOf(z10);
        }
    }

    public DTBAdView getAdView() {
        return this.adView;
    }

    public Context getContext() {
        return getAdView().getContext();
    }

    public DtbOmSdkSessionManager getDtbOmSdkSessionManager() {
        return this.dtbOmSdkSessionManager;
    }

    public MraidStateType getInitialStateType() {
        return MraidStateType.DEFAULT;
    }

    public String getPlacementType() {
        return "";
    }

    public void impressionFired() {
        if (!getAdView().isVideo() && getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().impressionOccured();
        }
        commandCompleted(MraidFirePixelCommand.getMraidName());
    }

    public boolean isTwoPartExpand() {
        return this.isTwoPartExpand;
    }

    public boolean isUseCustomClose() {
        return this.useCustomClose;
    }

    public void jsReady() {
        int i10;
        commandCompleted(MraidJSReadyCommand.NAME);
        this.jsReady = true;
        Boolean bool = this.lastViewabilityState;
        if (bool != null) {
            fireEnforcedViewableChange(bool.booleanValue());
        }
        MraidExposure mraidExposure = this.lastReportedExposure;
        if (mraidExposure != null) {
            fireEnforcedExposureChange(mraidExposure.percent, mraidExposure.rect);
        }
        int i11 = this.lastReportedSizeChangeWidth;
        if (i11 <= 0 || (i10 = this.lastReportedSizeChangeHeight) <= 0) {
            return;
        }
        fireEnforcedSizeChange(i11, i10);
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityPaused(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityResumed(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityStopped(Activity activity) {
    }

    public void onAdClicked() {
    }

    public void onAdFailedToLoad() {
    }

    public abstract void onAdLeftApplication();

    public void onAdLoaded() {
    }

    public void onAdOpened() {
    }

    public void onAdRemoved() {
    }

    public void onLoadError(String str, int i10) {
        onLoadError();
    }

    public abstract void onMRAIDClose();

    public void onMRAIDUnload() {
        new Handler(Looper.getMainLooper()).post(new h(this, 0));
    }

    public abstract void onPageLoad();

    public void onPositionChanged(Rect rect) {
        Rect rect2 = this.lastRect;
        if (rect2 == null || !rect2.equals(rect)) {
            int i10 = rect.right - rect.left;
            int i11 = rect.bottom - rect.top;
            Rect rect3 = this.lastRect;
            boolean z10 = true;
            if (rect3 != null) {
                int i12 = rect3.right - rect3.left;
                int i13 = rect3.bottom - rect3.top;
                if (Math.abs(i12 - i10) <= 1 && Math.abs(i13 - i11) <= 1) {
                    z10 = false;
                }
            }
            setCurrentPositionProperty();
            if (z10) {
                fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(i10), DTBAdUtil.pixelsToDeviceIndependenPixels(i11));
            }
            this.lastRect = rect;
        }
    }

    public abstract void onResize(Map<String, Object> map);

    public void onVideoCompleted() {
    }

    public void onViewabilityChanged(boolean z10) {
        DtbLog.debug("SET MRAID Visible " + z10);
        fireViewableChange(z10);
    }

    public void openUrl(String str) throws UnsupportedEncodingException {
        openUrl(str, false);
    }

    public void passLoadError() {
    }

    public void prepareMraid() throws JSONException {
        createLoadReport();
        this.pageLoaded = true;
        fireMaxSizeEvent();
        fireScreenSizeEvent();
        if (getAdView().isAdViewVisible()) {
            setCurrentPositionProperty();
        }
        fireMRAIDSupports();
        firePlacementType();
        setCurrentAppOrientation();
        setState(getInitialStateType());
        fireMRAIDReadyEvent();
        if (AdRegistration.isTestMode()) {
            evaluateJavascript("window.mraidBridge.service.debug('enable');");
        }
    }

    public void removeCloseIndicator() {
        ViewGroup viewGroup;
        LinearLayout linearLayout = this.closeIndicatorRegion;
        if (linearLayout == null || (viewGroup = (ViewGroup) linearLayout.getParent()) == null) {
            return;
        }
        viewGroup.removeView(this.closeIndicatorRegion);
    }

    public void setCloseIndicatorContent(View.OnTouchListener onTouchListener) {
        this.closeIndicatorRegion.setBackgroundColor(0);
        this.closeIndicatorRegion.setId(R.id.mraid_close_indicator);
        ImageView imageView = new ImageView(getAdView().getContext());
        imageView.setId(R.id.mraid_close_indicator);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(24), DTBAdUtil.sizeToDevicePixels(24));
        layoutParams.setMargins(DTBAdUtil.sizeToDevicePixels(14), DTBAdUtil.sizeToDevicePixels(14), 0, 0);
        this.closeIndicatorRegion.addView(imageView, layoutParams);
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().addFriendlyObstruction(this.closeIndicatorRegion.findViewById(R.id.mraid_close_indicator), FriendlyObstructionPurpose.CLOSE_AD);
        }
        imageView.setImageDrawable(l.a.getDrawable(getAdView().getContext(), R.drawable.mraid_close));
        if (onTouchListener != null) {
            this.closeIndicatorRegion.setOnTouchListener(onTouchListener);
        } else {
            this.closeIndicatorRegion.setOnTouchListener(new g(this, 0));
        }
    }

    public void setCurrentAppOrientation() throws JSONException {
        int iDetermineSimpleOrientation = DisplayUtils.determineSimpleOrientation();
        String str = iDetermineSimpleOrientation != 1 ? iDetermineSimpleOrientation != 2 ? "unspecified" : "landscape" : "portrait";
        boolean zIsRotationLocked = DisplayUtils.isRotationLocked();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orientation", str);
        jSONObject.put("locked", zIsRotationLocked);
        evaluateJavascriptMethod("window.mraidBridge.property.setCurrentAppOrientation", jSONObject);
    }

    public void setCurrentPositionProperty() {
        if (this.pageLoaded) {
            int[] iArr = new int[2];
            getAdView().getLocationOnScreen(iArr);
            setCurrentPositionProperty(iArr[0], iArr[1], getAdView().getWidth(), getAdView().getHeight());
        }
    }

    public void setCustomButtonListener(DTBMRAIDCloseButtonListener dTBMRAIDCloseButtonListener) {
        this.customButtonListener = dTBMRAIDCloseButtonListener;
    }

    public void setState(MraidStateType mraidStateType) {
        this.state = mraidStateType;
        if (mraidStateType == MraidStateType.HIDDEN) {
            new Handler(Looper.getMainLooper()).post(new h(this, 1));
        }
        fireStateChangeEvent();
    }

    public void setTwoPartExpand(boolean z10) {
        this.isTwoPartExpand = z10;
    }

    public void setUseCustomClose(boolean z10) {
        DtbLog.debug("Set useCustomClose to " + z10);
        this.useCustomClose = z10;
        commandCompleted(MraidUseCustomCloseCommand.NAME);
        DTBMRAIDCloseButtonListener dTBMRAIDCloseButtonListener = this.customButtonListener;
        if (dTBMRAIDCloseButtonListener != null) {
            dTBMRAIDCloseButtonListener.useCustomButtonUpdated();
        }
    }

    public void startEndCardDisplayOMSDKSession() {
    }

    public void startOMSDKSession() {
    }

    public void stopOMSDKSession() {
    }

    public void onLoadError() {
        String bidId = this.adView.getBidId();
        String hostname = this.adView.getHostname();
        if (bidId != null) {
            DTBMetricsProcessor.getInstance().submitSimpleReportBidId(DTBMetricReport.addBid(bidId, hostname), DTBMetricsProcessor.REPORT_LOAD_FAILURE);
        }
        passLoadError();
    }

    public void openUrl(String str, boolean z10) throws UnsupportedEncodingException {
        PackageManager packageManager = this.adView.getContext().getPackageManager();
        try {
            Uri uri = Uri.parse(str);
            if (DtbConstants.AMAZON_MOBILE.equals(uri.getScheme()) && uri.getHost().equals("intent")) {
                String[] strArrSplit = str.split("intent=");
                if (strArrSplit.length > 1) {
                    String strDecode = null;
                    for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                        try {
                            String strSubstring = strArrSplit[i10];
                            if (strSubstring.lastIndexOf(C3191e4.i.f36527c) == strSubstring.length() - 1) {
                                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                            }
                            strDecode = URLDecoder.decode(strSubstring, C.UTF8_NAME);
                            getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(strDecode)));
                            onAdLeftApplication();
                            break;
                        } catch (ActivityNotFoundException unused) {
                            DtbLog.debug("Intent:" + strDecode + " not found.");
                            fireErrorEvent("open", "requested activity not found");
                        } catch (UnsupportedEncodingException unused2) {
                            DtbLog.debug("Unsupported encoding");
                        }
                    }
                }
            } else if (ApsAdWebViewSupportClient.MOBILE_SHOPPING_SCHEME.equals(uri.getScheme())) {
                try {
                    if (packageManager.getLaunchIntentForPackage("com.amazon.mShop.android.shopping") != null) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(uri);
                        AdRegistration.getCurrentActivity().startActivity(intent);
                    } else {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(uri);
                        int iIndexOf = str.indexOf("products/");
                        if (iIndexOf > 0) {
                            intent2.setData(Uri.parse("https://www.amazon.com/dp/" + str.substring(iIndexOf + 9)));
                            AdRegistration.getCurrentActivity().startActivity(intent2);
                        }
                    }
                    onAdLeftApplication();
                } catch (ActivityNotFoundException unused3) {
                    DtbLog.debug(LOG_TAG, "Activity not found com.amazon.mobile.shopping");
                    fireErrorEvent("open", "mshop activity not found");
                } catch (NullPointerException unused4) {
                    DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                    fireErrorEvent("open", "current activity from AdRegistration not found");
                }
            } else if (ApsAdWebViewSupportClient.MARKET_SCHEME.equals(uri.getScheme()) || ApsAdWebViewSupportClient.AMAZON_SCHEME.equals(uri.getScheme())) {
                try {
                    try {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        AdRegistration.getCurrentActivity().startActivity(intent3);
                        onAdLeftApplication();
                    } catch (ActivityNotFoundException unused5) {
                        DTBAdUtil.directAppStoreLinkToBrowser(this, uri);
                    } catch (NullPointerException unused6) {
                        DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                        fireErrorEvent("open", "current activity from AdRegistration not found");
                    }
                } catch (ActivityNotFoundException unused7) {
                    DtbLog.debug(LOG_TAG, "App stores and browsers not found");
                    fireErrorEvent("open", "app stores and browsers not found");
                } catch (NullPointerException unused8) {
                    DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                    fireErrorEvent("open", "current activity from AdRegistration not found");
                }
            } else {
                if (uri.getScheme() == null) {
                    uri = Uri.parse("https:" + str);
                }
                if (z10) {
                    try {
                        new y().build().launchUrl(getContext(), uri);
                        onAdLeftApplication();
                    } catch (Exception e10) {
                        String str2 = "Failed to execute open command: invalid url " + str;
                        fireErrorEvent("open", str2);
                        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, str2, e10);
                    }
                } else {
                    try {
                        Intent intent4 = new Intent("android.intent.action.VIEW", uri);
                        intent4.addFlags(268435456);
                        getContext().startActivity(intent4);
                        onAdLeftApplication();
                    } catch (Exception e11) {
                        String str3 = "Failed to execute open command: invalid url " + str;
                        fireErrorEvent("open", str3);
                        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, str3, e11);
                    }
                }
            }
            commandCompleted("open");
        } catch (Exception unused9) {
            fireErrorEvent("open", "invalid url " + str);
            commandCompleted("open");
        }
    }

    public void addCloseIndicator(int i10, int i11, boolean z10) {
        removeCloseIndicator();
        addCloseIndicator(i10, i11, null, z10);
    }

    public void addCloseIndicator(int i10, int i11, View.OnTouchListener onTouchListener, boolean z10) {
        createContentIndicator();
        DTBAdUtil.getRootView(getAdView()).addView(this.closeIndicatorRegion, DTBAdUtil.sizeToDevicePixels(50), DTBAdUtil.sizeToDevicePixels(50));
        this.closeIndicatorRegion.setX(i10 - DTBAdUtil.sizeToDevicePixels(50));
        this.closeIndicatorRegion.setY(i11);
        setCloseIndicatorContent(onTouchListener);
    }

    public void setCurrentPositionProperty(float f10, float f11) {
        if (this.pageLoaded) {
            int[] iArr = new int[2];
            getAdView().getLocationOnScreen(iArr);
            setCurrentPositionProperty(iArr[0], iArr[1], f10, f11);
        }
    }

    public void setCurrentPositionProperty(int i10, int i11, float f10, float f11) {
        if (this.pageLoaded) {
            evaluateJavascript(String.format("window.mraidBridge.property.setCurrentPosition({'xPos':%.1f, 'yPos':%.1f, 'width': %.1f, 'height': %.1f});", Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(i10)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(i11)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels((int) f10)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels((int) f11))));
        }
    }
}
