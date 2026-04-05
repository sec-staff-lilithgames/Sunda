package com.inmobi.ads.exceptions;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class SdkNotInitializedException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkNotInitializedException(String adType) {
        super("Please initialize the SDK before creating " + adType + " ad");
        e0.checkNotNullParameter(adType, "adType");
    }
}
