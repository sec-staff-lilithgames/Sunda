package kotlinx.coroutines.flow;

import bv.f;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlinx.coroutines.flow.DistinctFlowImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER}, m = "emit", n = {}, s = {})
/* loaded from: classes10.dex */
public final class DistinctFlowImpl$collect$2$emit$1 extends bv.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DistinctFlowImpl.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl$collect$2$emit$1(DistinctFlowImpl.AnonymousClass2<? super T> anonymousClass2, zu.d<? super DistinctFlowImpl$collect$2$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass2;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
