package io.ktor.http.auth;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AuthScheme {
    public static final String Basic = "Basic";
    public static final String Bearer = "Bearer";
    public static final String Digest = "Digest";
    public static final AuthScheme INSTANCE = new AuthScheme();
    public static final String Negotiate = "Negotiate";
    public static final String OAuth = "OAuth";

    private AuthScheme() {
    }
}
