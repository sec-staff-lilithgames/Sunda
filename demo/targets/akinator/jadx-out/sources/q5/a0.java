package q5;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f82405i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.p f82406j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f82406j = pVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        a0 a0Var = new a0(this.f82406j, dVar);
        a0Var.f82405i = obj;
        return a0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        tu.a0.throwOnFailure(obj);
        zu.k kVar = ((CoroutineScope) this.f82405i).getCoroutineContext().get(zu.f.f98853b);
        e0.checkNotNull(kVar);
        zu.g gVar = (zu.g) kVar;
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        BuildersKt.launch(GlobalScope.INSTANCE, gVar, CoroutineStart.UNDISPATCHED, new y(completableDeferredCompletableDeferred$default, this.f82406j, null));
        while (!completableDeferredCompletableDeferred$default.isCompleted()) {
            try {
                return BuildersKt.runBlocking(gVar, new z(completableDeferredCompletableDeferred$default, null));
            } catch (InterruptedException unused) {
            }
        }
        return completableDeferredCompletableDeferred$default.getCompleted();
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((a0) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
