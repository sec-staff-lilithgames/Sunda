package com.applovin.shadow.okio;

import java.util.zip.Deflater;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.-DeflaterSinkExtensions, reason: invalid class name */
/* loaded from: classes4.dex */
public final class DeflaterSinkExtensions {
    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        e0.checkNotNullParameter(sink, "<this>");
        e0.checkNotNullParameter(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deflater = new Deflater();
        }
        e0.checkNotNullParameter(sink, "<this>");
        e0.checkNotNullParameter(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
