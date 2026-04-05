package q5;

import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f82515i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f82516j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred f82517k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kv.p f82518l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(CompletableDeferred completableDeferred, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f82517k = completableDeferred;
        this.f82518l = pVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        y yVar = new y(this.f82517k, this.f82518l, dVar);
        yVar.f82516j = obj;
        return yVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        CompletableDeferred completableDeferred;
        Object objM7131constructorimpl;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f82515i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f82516j;
            CompletableDeferred completableDeferred2 = this.f82517k;
            kv.p pVar = this.f82518l;
            try {
                int i11 = tu.z.f87419c;
                this.f82516j = completableDeferred2;
                this.f82515i = 1;
                obj = pVar.invoke(coroutineScope, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                completableDeferred = completableDeferred2;
            } catch (Throwable th2) {
                th = th2;
                completableDeferred = completableDeferred2;
                int i12 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th));
                CompletableDeferredKt.completeWith(completableDeferred, objM7131constructorimpl);
                return x0.f87415a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            completableDeferred = (CompletableDeferred) this.f82516j;
            try {
                tu.a0.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                int i122 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th));
                CompletableDeferredKt.completeWith(completableDeferred, objM7131constructorimpl);
                return x0.f87415a;
            }
        }
        objM7131constructorimpl = tu.z.m7131constructorimpl(obj);
        CompletableDeferredKt.completeWith(completableDeferred, objM7131constructorimpl);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((y) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
