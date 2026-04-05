package com.applovin.shadow.okio;

import java.util.zip.Inflater;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.applovin.shadow.okio.-InflaterSourceExtensions, reason: invalid class name */
/* loaded from: classes4.dex */
public final class InflaterSourceExtensions {
    public static final InflaterSource inflate(Source source, Inflater inflater) {
        e0.checkNotNullParameter(source, "<this>");
        e0.checkNotNullParameter(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inflater = new Inflater();
        }
        e0.checkNotNullParameter(source, "<this>");
        e0.checkNotNullParameter(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }
}
