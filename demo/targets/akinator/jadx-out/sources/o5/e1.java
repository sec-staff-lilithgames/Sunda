package o5;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77538i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0 f77539j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f77540k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String[] f77541l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(y0 y0Var, boolean z10, String[] strArr, zu.d dVar) {
        super(2, dVar);
        this.f77539j = y0Var;
        this.f77540k = z10;
        this.f77541l = strArr;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new e1(this.f77539j, this.f77540k, this.f77541l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77538i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            y0 y0Var = this.f77539j;
            u0 u0Var = y0Var.f77812e;
            if (u0Var == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("connectionManager");
                u0Var = null;
            }
            d1 d1Var = new d1(y0Var, this.f77540k, this.f77541l, null);
            this.f77538i = 1;
            if (u0Var.useConnection(false, d1Var, this) == coroutine_suspended) {
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
        return ((e1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
