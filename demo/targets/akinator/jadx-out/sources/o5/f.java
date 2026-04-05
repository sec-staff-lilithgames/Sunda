package o5;

import java.util.concurrent.Callable;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Callable f77546i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Callable callable, zu.d dVar) {
        super(2, dVar);
        this.f77546i = callable;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new f(this.f77546i, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        return this.f77546i.call();
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
