package k4;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f70452i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.p f70453j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f70454k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kv.p pVar, g gVar, zu.d dVar) {
        super(2, dVar);
        this.f70453j = pVar;
        this.f70454k = gVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new p0(this.f70453j, this.f70454k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70452i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        Object value = this.f70454k.getValue();
        this.f70452i = 1;
        Object objInvoke = this.f70453j.invoke(value, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((p0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
