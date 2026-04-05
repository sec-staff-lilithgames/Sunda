package p0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f80454i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f80455j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.q f80456k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d2 f80457l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(kv.q qVar, d2 d2Var, zu.d dVar) {
        super(2, dVar);
        this.f80456k = qVar;
        this.f80457l = d2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        s3 s3Var = new s3(this.f80456k, this.f80457l, dVar);
        s3Var.f80455j = obj;
        return s3Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f80454i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f80455j;
            this.f80454i = 1;
            if (this.f80456k.invoke(coroutineScope, this.f80457l, this) == coroutine_suspended) {
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
        return ((s3) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
