package com.fyber.inneractive.sdk.model.vast;

import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.MraidExpandCommand;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum x {
    EVENT_FINAL_RETURN("finalReturn"),
    EVENT_IMPRESSION("impression"),
    EVENT_START("start"),
    EVENT_FIRSTQ("firstQuartile"),
    EVENT_MID(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT),
    EVENT_THIRDQ("thirdQuartile"),
    EVENT_COMPLETE(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE),
    EVENT_MUTE(CampaignEx.JSON_NATIVE_VIDEO_MUTE),
    EVENT_UNMUTE(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE),
    EVENT_PAUSE(CampaignEx.JSON_NATIVE_VIDEO_PAUSE),
    EVENT_RESUME(CampaignEx.JSON_NATIVE_VIDEO_RESUME),
    EVENT_FULLSCREEN(Constants.TEMPLATE_TYPE_FULLSCREEN),
    EVENT_EXIT_FULLSCREEN("exitFullscreen"),
    EVENT_CREATIVE_VIEW("creativeView"),
    EVENT_CLICK("click"),
    EVENT_ERROR("error"),
    EVENT_REWIND("rewind"),
    EVENT_CLOSE("close"),
    EVENT_VERIFICATION_NOT_EXECUTED("verificationNotExecuted"),
    EVENT_EXPAND(MraidExpandCommand.NAME),
    EVENT_COLLAPSE("collapse"),
    EVENT_CLOSE_LINEAR("closeLinear"),
    EVENT_PROGRESS(NotificationCompat.CATEGORY_PROGRESS),
    EVENT_SKIP("skip"),
    UNKNOWN("UnkownEvent");

    private static final Map<String, x> sEventsMap = new HashMap();
    private final String mKey;

    static {
        for (x xVar : values()) {
            sEventsMap.put(xVar.mKey, xVar);
        }
    }

    x(String str) {
        this.mKey = str;
    }

    public final String a() {
        return this.mKey;
    }

    public static x a(String str) {
        Map<String, x> map = sEventsMap;
        return map.containsKey(str) ? map.get(str) : UNKNOWN;
    }
}
