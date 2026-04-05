package com.unity3d.services.core.properties;

import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SessionIdReader {
    public static final SessionIdReader INSTANCE = new SessionIdReader();
    private static final String sessionId = i.c("randomUUID().toString()");

    private SessionIdReader() {
    }

    public final String getSessionId() {
        return sessionId;
    }
}
