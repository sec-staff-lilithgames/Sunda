package ri;

import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import o4.j;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f84422i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f84423j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j.a f84424k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f84425l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, j.a aVar, Object obj, zu.d dVar) {
        super(2, dVar);
        this.f84423j = iVar;
        this.f84424k = aVar;
        this.f84425l = obj;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new h(this.f84423j, this.f84424k, this.f84425l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f84422i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        k4.n nVar = this.f84423j.f84430d;
        g gVar = new g(this.f84424k, this.f84425l, null);
        this.f84422i = 1;
        Object objEdit = o4.p.edit(nVar, gVar, this);
        return objEdit == coroutine_suspended ? coroutine_suspended : objEdit;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super o4.j> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
