package kotlinx.coroutines.flow;

import bv.f;
import kotlinx.coroutines.flow.StartedLazily;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {154}, m = "emit", n = {}, s = {})
/* loaded from: classes10.dex */
public final class StartedLazily$command$1$1$emit$1 extends bv.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StartedLazily.AnonymousClass1.C07341<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StartedLazily$command$1$1$emit$1(StartedLazily.AnonymousClass1.C07341<? super T> c07341, zu.d<? super StartedLazily$command$1$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = c07341;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(0, this);
    }
}
