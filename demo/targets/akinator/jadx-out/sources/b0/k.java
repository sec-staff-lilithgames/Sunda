package b0;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f8403i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0.z1 f8404j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f8405k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c0.z1 z1Var, p0.j2 j2Var, zu.d dVar) {
        super(2, dVar);
        this.f8404j = z1Var;
        this.f8405k = j2Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new k(this.f8404j, this.f8405k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f8403i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            Flow flowSnapshotFlow = z4.snapshotFlow(new i(this.f8404j));
            j jVar = new j(this.f8405k);
            this.f8403i = 1;
            if (flowSnapshotFlow.collect(jVar, this) == coroutine_suspended) {
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
        return ((k) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
