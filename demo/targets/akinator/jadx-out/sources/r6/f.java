package r6;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProducerScope;
import kv.p;
import n6.c0;
import r6.c;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends bv.n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f83813i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f83814j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f83815k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ProducerScope producerScope, zu.d dVar) {
        super(2, dVar);
        this.f83814j = hVar;
        this.f83815k = producerScope;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new f(this.f83814j, this.f83815k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f83813i;
        h hVar = this.f83814j;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            long j10 = hVar.f83821b;
            this.f83813i = 1;
            if (DelayKt.delay(j10, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        c0.get().debug(o.f83843a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + hVar.f83821b + " ms");
        this.f83815k.mo5139trySendJP2dKIU(new c.a(7));
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
