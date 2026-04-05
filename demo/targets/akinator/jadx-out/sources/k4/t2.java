package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t2 extends bv.n implements kv.q {

    /* renamed from: i, reason: collision with root package name */
    public int f70523i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ e2 f70524j;

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e2) obj, ((Boolean) obj2).booleanValue(), (zu.d<Object>) obj3);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70523i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            return obj;
        }
        tu.a0.throwOnFailure(obj);
        e2 e2Var = this.f70524j;
        this.f70523i = 1;
        Object data = e2Var.readData(this);
        return data == coroutine_suspended ? coroutine_suspended : data;
    }

    public final Object invoke(e2 e2Var, boolean z10, zu.d<Object> dVar) {
        t2 t2Var = new t2(3, dVar);
        t2Var.f70524j = e2Var;
        return t2Var.invokeSuspend(tu.x0.f87415a);
    }
}
