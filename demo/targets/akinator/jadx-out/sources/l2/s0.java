package l2;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72370i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f72371j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(m mVar, zu.d dVar) {
        super(2, dVar);
        this.f72371j = mVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new s0(this.f72371j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72370i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f72370i = 1;
            if (this.f72371j.load(this) == coroutine_suspended) {
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
        return ((s0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
