package l0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72045i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0.e f72046j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c0.e eVar, zu.d dVar) {
        super(2, dVar);
        this.f72046j = eVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new a1(this.f72046j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72045i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            Float fBoxFloat = bv.b.boxFloat(0.0f);
            c0.n nVarM178infiniteRepeatable9IiC70o$default = c0.o.m178infiniteRepeatable9IiC70o$default(c0.o.keyframes(d1.f72072e), null, 0L, 6, null);
            this.f72045i = 1;
            if (c0.e.animateTo$default(this.f72046j, fBoxFloat, nVarM178infiniteRepeatable9IiC70o$default, null, null, this, 12, null) == coroutine_suspended) {
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
        return ((a1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
