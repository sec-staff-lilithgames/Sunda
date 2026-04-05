package com.fyber.inneractive.sdk.config.enums;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum Orientation {
    LANDSCAPE("landscape", false),
    PORTRAIT("portrait", false),
    USER("user", true),
    NONE("none", true);

    private static final Map<String, Orientation> CONSTANTS = new HashMap();
    public boolean allowOrientationChange;
    private final String value;

    static {
        for (Orientation orientation : values()) {
            CONSTANTS.put(orientation.value, orientation);
        }
    }

    Orientation(String str, boolean z10) {
        this.value = str;
        this.allowOrientationChange = z10;
    }

    public static Orientation fromValue(String str) {
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
