package com.unity3d.ads.core.data.model;

import java.util.Locale;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum InitializationState {
    NOT_INITIALIZED,
    INITIALIZING,
    INITIALIZED,
    FAILED;

    @Override // java.lang.Enum
    public String toString() {
        String string = super.toString();
        Locale locale = Locale.getDefault();
        e0.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = string.toLowerCase(locale);
        e0.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
