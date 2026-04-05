package com.vungle.ads.internal.privacy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum COPPA {
    COPPA_ENABLED(Boolean.TRUE),
    COPPA_DISABLED(Boolean.FALSE),
    COPPA_NOTSET(null);

    private final Boolean value;

    COPPA(Boolean bool) {
        this.value = bool;
    }

    public final Boolean getValue() {
        return this.value;
    }
}
