package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class MraidOpenCommand extends MraidCommand {
    public static final String NAME = "open";

    public static String getMraidName() {
        return "open";
    }

    @Override // com.amazon.device.ads.MraidCommand
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException, UnsupportedEncodingException {
        if (!jSONObject.has("options") || !jSONObject.getJSONObject("options").has("inAppNativeBrowser")) {
            dTBAdMRAIDController.openUrl(jSONObject.getString("url"));
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("options").getJSONObject("inAppNativeBrowser");
        try {
            if (jSONObject2.has("enabled") && jSONObject2.getBoolean("enabled")) {
                dTBAdMRAIDController.openUrl(jSONObject.getString("url"), jSONObject2.getBoolean("enabled"));
            }
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to execute Open command with inAppNativeBrowser", e10);
        }
    }

    @Override // com.amazon.device.ads.MraidCommand
    public String getName() {
        return "open";
    }
}
