package o9;

import com.digidust.elokence.akinator.activities.HomeActivity;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class x2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78658i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78659j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(HomeActivity homeActivity, zu.d dVar) {
        super(2, dVar);
        this.f78659j = homeActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new x2(this.f78659j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f78658i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            w2 w2Var = new w2(this.f78659j, null);
            this.f78658i = 1;
            if (BuildersKt.withContext(io2, w2Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((x2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
