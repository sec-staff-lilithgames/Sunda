package com.fyber.inneractive.sdk.config.enums;

import android.text.TextUtils;
import com.ironsource.Q6;
import com.vungle.ads.internal.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum TapAction {
    CTR(Q6.I0),
    FULLSCREEN(Constants.TEMPLATE_TYPE_FULLSCREEN),
    DO_NOTHING("noAction");

    private static final Map<String, TapAction> CONSTANTS = new HashMap();
    private final String value;

    static {
        for (TapAction tapAction : values()) {
            CONSTANTS.put(tapAction.value, tapAction);
        }
    }

    TapAction(String str) {
        this.value = str;
    }

    public static TapAction fromValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }
}
