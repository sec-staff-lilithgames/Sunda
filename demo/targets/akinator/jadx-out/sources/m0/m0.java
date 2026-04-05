package m0;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f73785i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f73786j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v5 f73787k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c0.e f73788l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(v5 v5Var, c0.e eVar, zu.d dVar) {
        super(2, dVar);
        this.f73787k = v5Var;
        this.f73788l = eVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        m0 m0Var = new m0(this.f73787k, this.f73788l, dVar);
        m0Var.f73786j = obj;
        return m0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f73785i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f73786j;
            Flow flowSnapshotFlow = z4.snapshotFlow(new j0(this.f73787k));
            l0 l0Var = new l0(this.f73788l, coroutineScope);
            this.f73785i = 1;
            if (flowSnapshotFlow.collect(l0Var, this) == coroutine_suspended) {
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
        return ((m0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
