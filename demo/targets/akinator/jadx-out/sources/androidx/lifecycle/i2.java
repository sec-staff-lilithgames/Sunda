package androidx.lifecycle;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f6603i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6604j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k0 f6605k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j0 f6606l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.p f6607m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(k0 k0Var, j0 j0Var, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f6605k = k0Var;
        this.f6606l = j0Var;
        this.f6607m = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        i2 i2Var = new i2(this.f6605k, this.f6606l, this.f6607m, dVar);
        i2Var.f6604j = obj;
        return i2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f6603i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f6604j;
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            h2 h2Var = new h2(this.f6605k, this.f6606l, coroutineScope, this.f6607m, null);
            this.f6603i = 1;
            if (BuildersKt.withContext(immediate, h2Var, this) == coroutine_suspended) {
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
        return ((i2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
