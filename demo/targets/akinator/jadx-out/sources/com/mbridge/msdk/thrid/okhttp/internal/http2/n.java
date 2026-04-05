package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final b f43605a;

    public n(b bVar) {
        super("stream was reset: " + bVar);
        this.f43605a = bVar;
    }
}
