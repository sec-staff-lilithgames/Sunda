package io.ktor.client.plugins.logging;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum LogLevel {
    ALL(true, true, true),
    HEADERS(true, true, false),
    BODY(true, false, true),
    INFO(true, false, false),
    NONE(false, false, false);

    private final boolean body;
    private final boolean headers;
    private final boolean info;

    LogLevel(boolean z10, boolean z11, boolean z12) {
        this.info = z10;
        this.headers = z11;
        this.body = z12;
    }

    public final boolean getBody() {
        return this.body;
    }

    public final boolean getHeaders() {
        return this.headers;
    }

    public final boolean getInfo() {
        return this.info;
    }
}
