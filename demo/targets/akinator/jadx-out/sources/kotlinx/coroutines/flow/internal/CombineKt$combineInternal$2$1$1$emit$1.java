package kotlinx.coroutines.flow.internal;

import bv.d;
import bv.f;
import kotlinx.coroutines.flow.internal.CombineKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {29, 30}, m = "emit", n = {}, s = {})
/* loaded from: classes10.dex */
public final class CombineKt$combineInternal$2$1$1$emit$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CombineKt.AnonymousClass2.AnonymousClass1.C07351<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2$1$1$emit$1(CombineKt.AnonymousClass2.AnonymousClass1.C07351<? super T> c07351, zu.d<? super CombineKt$combineInternal$2$1$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = c07351;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
