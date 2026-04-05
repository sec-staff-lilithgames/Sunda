package a2;

import android.view.View;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y5 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f3893i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p0.n3 f3894j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f3895k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(p0.n3 n3Var, View view, zu.d dVar) {
        super(2, dVar);
        this.f3894j = n3Var;
        this.f3895k = view;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new y5(this.f3894j, this.f3895k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f3893i;
        p0.n3 n3Var = this.f3894j;
        View view = this.f3895k;
        try {
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                this.f3893i = 1;
                if (n3Var.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            if (i6.getCompositionContext(view) == n3Var) {
                i6.setCompositionContext(view, null);
            }
            return tu.x0.f87415a;
        } finally {
            if (i6.getCompositionContext(view) == n3Var) {
                i6.setCompositionContext(view, null);
            }
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((y5) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
