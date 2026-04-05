package com.iab.omid.library.odeeoio.adsession;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum CreativeType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");

    private final String creativeType;

    CreativeType(String str) {
        this.creativeType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.creativeType;
    }
}
