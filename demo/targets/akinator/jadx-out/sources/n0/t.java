package n0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f75189i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0.e f75190j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f75191k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c0.e eVar, float f10, zu.d dVar) {
        super(2, dVar);
        this.f75190j = eVar;
        this.f75191k = f10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new t(this.f75190j, this.f75191k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f75189i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            s2.i iVarM6815boximpl = s2.i.m6815boximpl(this.f75191k);
            this.f75189i = 1;
            if (this.f75190j.snapTo(iVarM6815boximpl, this) == coroutine_suspended) {
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
