package o5;

import java.util.concurrent.Callable;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Callable f77590i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f77591j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Callable callable, CancellableContinuationImpl cancellableContinuationImpl, zu.d dVar) {
        super(2, dVar);
        this.f77590i = callable;
        this.f77591j = cancellableContinuationImpl;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new i(this.f77590i, this.f77591j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f77591j;
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        try {
            cancellableContinuationImpl.resumeWith(tu.z.m7131constructorimpl(this.f77590i.call()));
        } catch (Throwable th2) {
            int i10 = tu.z.f87419c;
            cancellableContinuationImpl.resumeWith(tu.z.m7131constructorimpl(tu.a0.createFailure(th2)));
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
