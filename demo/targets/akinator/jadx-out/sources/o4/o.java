package o4;

import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77488i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77489j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.p f77490k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f77490k = pVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        o oVar = new o(this.f77490k, dVar);
        oVar.f77489j = obj;
        return oVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77488i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d dVar = (d) this.f77489j;
            a0.throwOnFailure(obj);
            return dVar;
        }
        a0.throwOnFailure(obj);
        d mutablePreferences = ((j) this.f77489j).toMutablePreferences();
        this.f77489j = mutablePreferences;
        this.f77488i = 1;
        return this.f77490k.invoke(mutablePreferences, this) == coroutine_suspended ? coroutine_suspended : mutablePreferences;
    }

    @Override // kv.p
    public final Object invoke(j jVar, zu.d<? super j> dVar) {
        return ((o) create(jVar, dVar)).invokeSuspend(x0.f87415a);
    }
}
