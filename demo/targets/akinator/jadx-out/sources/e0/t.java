package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53309i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u1.k0 f53310j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f53311k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f53312l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u1.k0 k0Var, kotlin.jvm.internal.b1 b1Var, kotlin.jvm.internal.b1 b1Var2, zu.d dVar) {
        super(2, dVar);
        this.f53310j = k0Var;
        this.f53311k = b1Var;
        this.f53312l = b1Var2;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new t(this.f53310j, this.f53311k, this.f53312l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f53309i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            s sVar = new s(this.f53311k, this.f53312l, null);
            this.f53309i = 1;
            if (this.f53310j.awaitPointerEventScope(sVar, this) == coroutine_suspended) {
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
        return ((t) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
