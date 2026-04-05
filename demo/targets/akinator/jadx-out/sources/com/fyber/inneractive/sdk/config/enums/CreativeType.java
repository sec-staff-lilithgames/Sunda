package com.fyber.inneractive.sdk.config.enums;

import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum CreativeType {
    PLAYABLE,
    NOT_SET;

    public static CreativeType fromValue(String str) {
        return str == null ? NOT_SET : "playable".equals(str.toLowerCase(Locale.US)) ? PLAYABLE : NOT_SET;
    }
}
