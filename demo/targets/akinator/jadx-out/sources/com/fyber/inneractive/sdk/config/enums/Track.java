package com.fyber.inneractive.sdk.config.enums;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum Track {
    ERRORS("errors"),
    NETWORKING("networking"),
    VIEWABILITY("viewability");

    private static final Map<String, Track> CONSTANTS = new HashMap();
    private final String stringValue;

    static {
        for (Track track : values()) {
            CONSTANTS.put(track.stringValue, track);
        }
    }

    Track(String str) {
        this.stringValue = str;
    }

    public static Track fromValue(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return CONSTANTS.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.stringValue;
    }

    public String value() {
        return this.stringValue;
    }
}
