package com.sfbx.appconsent.core.exception;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ACExceptionKt {
    private static final String appKeyNotFoundMessage = "Your Appkey was not found." + System.lineSeparator() + "Please check that it matches the one generated on your board";
    private static final String certificationPathValidationMessage = "An SSL or Proxy error has been intercepted." + System.lineSeparator() + "Please check your device's connectivity";
    public static final String unknownMessage = "An unknown error has occurred";

    public static final String getAppKeyNotFoundMessage() {
        return appKeyNotFoundMessage;
    }

    public static final String getCertificationPathValidationMessage() {
        return certificationPathValidationMessage;
    }
}
