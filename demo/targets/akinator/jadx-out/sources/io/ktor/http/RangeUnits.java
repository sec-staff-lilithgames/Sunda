package io.ktor.http;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum RangeUnits {
    Bytes("bytes"),
    None("none");

    private final String unitToken;

    RangeUnits(String str) {
        this.unitToken = str;
    }

    public final String getUnitToken() {
        return this.unitToken;
    }
}
