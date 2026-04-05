package com.unity3d.ads.adplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum HandlerType {
    CALLBACK("handleCallback"),
    INVOCATION("handleInvocation"),
    EVENT("handleEvent");

    private final String jsPath;

    HandlerType(String str) {
        this.jsPath = str;
    }

    public final String getJsPath() {
        return this.jsPath;
    }
}
