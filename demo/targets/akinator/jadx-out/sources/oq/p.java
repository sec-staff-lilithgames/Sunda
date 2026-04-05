package oq;

import android.view.View;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class p extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f79784i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ View f79785j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(View view, zu.d dVar) {
        super(2, dVar);
        this.f79785j = view;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super View> dVar) {
        return ((p) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new p(this.f79785j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f79784i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        this.f79784i = 1;
        Object objAwaitLayout = ir.x.awaitLayout(this.f79785j, this);
        return objAwaitLayout == coroutine_suspended ? coroutine_suspended : objAwaitLayout;
    }
}
