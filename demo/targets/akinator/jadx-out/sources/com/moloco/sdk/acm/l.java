package com.moloco.sdk.acm;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class l {
    public static final i a(f fVar) {
        e0.checkNotNullParameter(fVar, "<this>");
        return new i(fVar.getAppId(), fVar.getPostAnalyticsUrl(), fVar.getRequestPeriodSeconds(), fVar.getClientOptions());
    }
}
