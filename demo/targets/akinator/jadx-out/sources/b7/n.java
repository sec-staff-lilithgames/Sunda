package b7;

import b7.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p0.z4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f8873i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f8874j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, zu.d dVar) {
        super(2, dVar);
        this.f8874j = iVar;
    }

    public static final /* synthetic */ Object access$invokeSuspend$updateState(i iVar, i.b bVar, zu.d dVar) {
        iVar.f(bVar);
        return x0.f87415a;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new n(this.f8874j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f8873i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            i iVar = this.f8874j;
            Flow flowMapLatest = FlowKt.mapLatest(z4.snapshotFlow(new k(iVar)), new l(iVar, null));
            m mVar = new m(iVar);
            this.f8873i = 1;
            if (flowMapLatest.collect(mVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((n) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
