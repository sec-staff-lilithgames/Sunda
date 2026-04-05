package io.odeeo.sdk.consent;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum ConsentStringSource {
    Function("function"),
    Device(C3191e4.h.G),
    None("");


    /* renamed from: a, reason: collision with root package name */
    public final String f68073a;

    ConsentStringSource(String str) {
        this.f68073a = str;
    }

    public final String getValue() {
        return this.f68073a;
    }
}
