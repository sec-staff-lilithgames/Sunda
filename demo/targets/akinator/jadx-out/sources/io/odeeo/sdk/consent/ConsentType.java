package io.odeeo.sdk.consent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum ConsentType {
    Undefined("Undefined"),
    None("None"),
    Gdpr("Gdpr"),
    Ccpa("Ccpa");


    /* renamed from: a, reason: collision with root package name */
    public final String f68075a;

    ConsentType(String str) {
        this.f68075a = str;
    }

    public final String getValue() {
        return this.f68075a;
    }
}
