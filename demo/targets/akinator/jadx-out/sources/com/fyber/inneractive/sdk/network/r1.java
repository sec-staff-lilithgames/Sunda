package com.fyber.inneractive.sdk.network;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum r1 {
    EVENT_TABLE("sdk_event_"),
    ERROR_TABLE("sdk_error_");

    private final String tableName;

    r1(String str) {
        this.tableName = str;
    }

    public final String a() {
        return this.tableName;
    }
}
