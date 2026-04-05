package kotlinx.coroutines.flow;

import bv.f;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {TokenParametersOuterClass$TokenParameters.ODT_FIELD_NUMBER}, m = "emitAbort$FlowKt__LimitKt", n = {"ownershipMarker"}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class FlowKt__LimitKt$emitAbort$1<T> extends bv.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public FlowKt__LimitKt$emitAbort$1(zu.d<? super FlowKt__LimitKt$emitAbort$1> dVar) {
        super(dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt__LimitKt.emitAbort$FlowKt__LimitKt(null, null, null, this);
    }
}
