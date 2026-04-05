package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InvalidAdStateError extends VungleError {
    public /* synthetic */ InvalidAdStateError(Sdk.SDKError.Reason reason, String str, int i10, u uVar) {
        this(reason, (i10 & 2) != 0 ? "Ad state is invalid" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidAdStateError(Sdk.SDKError.Reason loggableReason, String errorMessage) {
        super(loggableReason, errorMessage, null);
        e0.checkNotNullParameter(loggableReason, "loggableReason");
        e0.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
