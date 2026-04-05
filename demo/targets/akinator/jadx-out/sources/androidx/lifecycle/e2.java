package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f6558i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6559j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.p f6560k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f6560k = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        e2 e2Var = new e2(this.f6560k, dVar);
        e2Var.f6559j = obj;
        return e2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f6558i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f6559j;
            this.f6558i = 1;
            if (this.f6560k.invoke(coroutineScope, this) == coroutine_suspended) {
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
        return ((e2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
