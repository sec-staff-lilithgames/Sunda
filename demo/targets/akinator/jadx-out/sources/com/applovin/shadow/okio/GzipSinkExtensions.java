package com.applovin.shadow.okio;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.-GzipSinkExtensions, reason: invalid class name */
/* loaded from: classes4.dex */
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink sink) {
        e0.checkNotNullParameter(sink, "<this>");
        return new GzipSink(sink);
    }
}
