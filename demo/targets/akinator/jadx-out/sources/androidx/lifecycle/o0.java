package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f6684i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q0 f6685j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.p f6686k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f6685j = q0Var;
        this.f6686k = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new o0(this.f6685j, this.f6686k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f6684i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            k0 lifecycle$lifecycle_common = this.f6685j.getLifecycle$lifecycle_common();
            this.f6684i = 1;
            if (y1.whenResumed(lifecycle$lifecycle_common, this.f6686k, this) == coroutine_suspended) {
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
        return ((o0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
