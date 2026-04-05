package k4;

import java.util.List;
import k4.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f70360i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f70361j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f70362k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, zu.d dVar) {
        super(2, dVar);
        this.f70362k = list;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        i iVar = new i(this.f70362k, dVar);
        iVar.f70361j = obj;
        return iVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70360i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            k1 k1Var = (k1) this.f70361j;
            m.a aVar = m.f70413a;
            this.f70360i = 1;
            if (m.a.access$runMigrations(aVar, this.f70362k, k1Var, this) == coroutine_suspended) {
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
    public final Object invoke(k1 k1Var, zu.d<? super tu.x0> dVar) {
        return ((i) create(k1Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
