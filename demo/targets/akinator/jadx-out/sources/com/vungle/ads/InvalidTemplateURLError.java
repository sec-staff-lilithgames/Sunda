package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InvalidTemplateURLError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidTemplateURLError(String msg) {
        super(Sdk.SDKError.Reason.INVALID_TEMPLATE_URL, msg, null);
        e0.checkNotNullParameter(msg, "msg");
    }
}
