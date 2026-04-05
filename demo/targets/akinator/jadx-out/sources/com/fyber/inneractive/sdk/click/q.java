package com.fyber.inneractive.sdk.click;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum q {
    FAILED(C3191e4.h.f36509t),
    OPEN_GOOGLE_STORE(C3191e4.h.U),
    OPENED_IN_INTERNAL_BROWSER("internal browser"),
    OPENED_IN_EXTERNAL_BROWSER("external browser"),
    INTERNAL_REDIRECT("internal redirect"),
    OPEN_IN_EXTERNAL_APPLICATION("external app"),
    DEEP_LINK("deep link"),
    OPENED_USING_CHROME_NAVIGATE("chrome navigate"),
    OPEN_INTERNAL_STORE("internal store");

    public String simpleName;

    q(String str) {
        this.simpleName = str;
    }
}
