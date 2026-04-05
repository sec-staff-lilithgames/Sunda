package kotlinx.coroutines.flow;

import bv.f;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER}, m = "emit", n = {}, s = {})
/* loaded from: classes10.dex */
public final class FlowKt__TransformKt$withIndex$1$1$emit$1 extends bv.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__TransformKt$withIndex$1$1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$withIndex$1$1$emit$1(FlowKt__TransformKt$withIndex$1$1<? super T> flowKt__TransformKt$withIndex$1$1, zu.d<? super FlowKt__TransformKt$withIndex$1$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = flowKt__TransformKt$withIndex$1$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
