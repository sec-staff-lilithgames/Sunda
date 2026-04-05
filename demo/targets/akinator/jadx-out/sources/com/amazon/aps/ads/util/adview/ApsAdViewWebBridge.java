package com.amazon.aps.ads.util.adview;

import af.n;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import androidx.core.app.NotificationCompat;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DtbCommonUtils;
import com.amazon.device.ads.MraidCommand;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsAdViewWebBridge {
    private Exception executionException;
    private final ApsWebBridgeListener listener;

    public ApsAdViewWebBridge(ApsWebBridgeListener listener) {
        e0.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void echo$lambda$8(ApsAdViewWebBridge apsAdViewWebBridge, String str) {
        apsAdViewWebBridge.listener.evaluateApsJavascript(str, null);
    }

    private final void logFromJavasScript(String str) {
        ApsAdExtensionsKt.d(this, "mraid:JSNative: " + str);
    }

    public final void echo(JSONObject json) throws JSONException {
        e0.checkNotNullParameter(json, "json");
        try {
            String str = String.format("window.promiseResolve(%d, '%s');", Arrays.copyOf(new Object[]{Integer.valueOf(json.getInt("promiseId")), json.getJSONObject("arguments").getString("greeting") + " Returned"}, 2));
            e0.checkNotNullExpressionValue(str, "format(...)");
            new Handler(Looper.getMainLooper()).post(new n(15, this, str));
        } catch (JSONException e10) {
            ApsAdExtensionsKt.d(this, "JSON conversion failed:" + e10);
        }
    }

    public final Exception getExecutionException() {
        return this.executionException;
    }

    public final ApsWebBridgeListener getListener() {
        return this.listener;
    }

    public final void handleApsCommand(JSONObject apsEvent) throws JSONException {
        e0.checkNotNullParameter(apsEvent, "apsEvent");
        String string = apsEvent.getString("subtype");
        if (DtbCommonUtils.isNullOrWhiteSpace(string) || this.listener.getApsMraidHandler() == null) {
            return;
        }
        if (e0.areEqual(string, "onAdLoaded")) {
            DTBAdMRAIDController apsMraidHandler = this.listener.getApsMraidHandler();
            if (apsMraidHandler != null) {
                apsMraidHandler.onAdLoaded();
                return;
            }
            return;
        }
        if (e0.areEqual(string, "onAdFailedToLoad")) {
            DTBAdMRAIDController apsMraidHandler2 = this.listener.getApsMraidHandler();
            if (apsMraidHandler2 != null) {
                apsMraidHandler2.onAdFailedToLoad();
                return;
            }
            return;
        }
        ApsAdExtensionsKt.i(this, string + " aps event not supported");
    }

    public final void handleMraidCommand(JSONObject request) throws JSONException, IllegalAccessException, InstantiationException {
        e0.checkNotNullParameter(request, "request");
        this.executionException = null;
        String string = request.getString("subtype");
        Class<MraidCommand> clsFindMraidCommandByName = MraidCommand.findMraidCommandByName(string);
        if (clsFindMraidCommandByName == null) {
            ApsAdExtensionsKt.e(this, "MRAID Command:" + string + " is not found");
            DTBAdMRAIDController apsMraidHandler = this.listener.getApsMraidHandler();
            e0.checkNotNull(apsMraidHandler);
            apsMraidHandler.fireErrorEvent(string, string + " is not supported");
            DTBAdMRAIDController apsMraidHandler2 = this.listener.getApsMraidHandler();
            e0.checkNotNull(apsMraidHandler2);
            apsMraidHandler2.commandCompleted(string);
            return;
        }
        try {
            MraidCommand mraidCommandNewInstance = clsFindMraidCommandByName.newInstance();
            e0.checkNotNull(mraidCommandNewInstance, "null cannot be cast to non-null type com.amazon.device.ads.MraidCommand");
            MraidCommand mraidCommand = mraidCommandNewInstance;
            ApsAdExtensionsKt.d(this, "execute command " + mraidCommand.getName());
            mraidCommand.execute(request.getJSONObject("arguments"), this.listener.getApsMraidHandler());
        } catch (JSONException e10) {
            throw e10;
        } catch (Exception e11) {
            this.executionException = e11;
            ApsAdExtensionsKt.e(this, "Error execution command " + string + " " + e11.getLocalizedMessage());
        }
    }

    public final void handleServiceCall(JSONObject request) throws JSONException {
        e0.checkNotNullParameter(request, "request");
        if (e0.areEqual("log", request.getString("subtype"))) {
            String string = request.getJSONObject("arguments").getString(PglCryptUtils.KEY_MESSAGE);
            e0.checkNotNullExpressionValue(string, "getString(...)");
            logFromJavasScript(string);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void handleVideoEvent(JSONObject videoEvent) throws JSONException {
        e0.checkNotNullParameter(videoEvent, "videoEvent");
        String string = videoEvent.getString("subtype");
        if (DtbCommonUtils.isNullOrWhiteSpace(string) || this.listener.getApsMraidHandler() == null) {
            return;
        }
        if (string != null) {
            switch (string.hashCode()) {
                case -1928679091:
                    if (string.equals("AD_VIDEO_PLAYER_COMPLETED")) {
                        DTBAdMRAIDController apsMraidHandler = this.listener.getApsMraidHandler();
                        if (apsMraidHandler != null) {
                            apsMraidHandler.onVideoCompleted();
                            return;
                        }
                        return;
                    }
                    break;
                case -100915287:
                    if (string.equals("AD_VIDEO_PLAYER_CLICKED")) {
                        DTBAdMRAIDController apsMraidHandler2 = this.listener.getApsMraidHandler();
                        if (apsMraidHandler2 != null) {
                            apsMraidHandler2.onAdClicked();
                            return;
                        }
                        return;
                    }
                    break;
                case 252691236:
                    if (string.equals("END_CARD_COMPANION_AD_START")) {
                        DTBAdMRAIDController apsMraidHandler3 = this.listener.getApsMraidHandler();
                        if (apsMraidHandler3 != null) {
                            apsMraidHandler3.startEndCardDisplayOMSDKSession();
                            return;
                        }
                        return;
                    }
                    break;
                case 604315076:
                    if (string.equals("AD_FAILED_TO_LOAD")) {
                        DTBAdMRAIDController apsMraidHandler4 = this.listener.getApsMraidHandler();
                        if (apsMraidHandler4 != null) {
                            apsMraidHandler4.onAdFailedToLoad();
                            return;
                        }
                        return;
                    }
                    break;
                case 1135343643:
                    if (string.equals("END_CARD_VIDEO_CLOSED")) {
                        DTBAdMRAIDController apsMraidHandler5 = this.listener.getApsMraidHandler();
                        if (apsMraidHandler5 != null) {
                            apsMraidHandler5.stopOMSDKSession();
                            return;
                        }
                        return;
                    }
                    break;
                case 1690844065:
                    if (string.equals("AD_LOADED")) {
                        DTBAdMRAIDController apsMraidHandler6 = this.listener.getApsMraidHandler();
                        if (apsMraidHandler6 != null) {
                            apsMraidHandler6.onAdLoaded();
                            return;
                        }
                        return;
                    }
                    break;
            }
        }
        ApsAdExtensionsKt.i(this, string + " video event not supported");
    }

    @JavascriptInterface
    public final void postMessage(String str) throws JSONException, IllegalAccessException, InstantiationException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("type")) {
                ApsAdExtensionsKt.e(this, "Unrecognized bridge call");
                return;
            }
            String string = jSONObject.getString("type");
            if (e0.areEqual(NotificationCompat.CATEGORY_SERVICE, string)) {
                handleServiceCall(jSONObject);
                return;
            }
            if (e0.areEqual(CampaignEx.JSON_KEY_MRAID, string)) {
                handleMraidCommand(jSONObject);
            } else if (e0.areEqual(ApsMetricsDataMap.APSMETRICS_FIELD_APS, string)) {
                handleApsCommand(jSONObject);
            } else if (e0.areEqual("apsvid", string)) {
                handleVideoEvent(jSONObject);
            }
        } catch (JSONException e10) {
            ApsAdExtensionsKt.d(this, "JSON conversion failed:" + e10);
        }
    }

    public final void setExecutionException(Exception exc) {
        this.executionException = exc;
    }
}
