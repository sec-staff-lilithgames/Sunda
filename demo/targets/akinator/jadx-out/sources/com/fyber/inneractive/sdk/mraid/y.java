package com.fyber.inneractive.sdk.mraid;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y {
    public abstract String a();

    public final String toString() {
        String strA = a();
        return strA != null ? strA.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "") : "";
    }
}
