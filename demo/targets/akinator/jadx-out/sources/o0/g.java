package o0;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77328i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77329j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0.o f77330k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f77331l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements FlowCollector {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v f77332b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f77333c;

        public a(v vVar, CoroutineScope coroutineScope) {
            this.f77332b = vVar;
            this.f77333c = coroutineScope;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(f0.n nVar, zu.d<? super x0> dVar) {
            f0.n nVar2 = nVar;
            boolean z10 = nVar2 instanceof f0.t;
            CoroutineScope coroutineScope = this.f77333c;
            v vVar = this.f77332b;
            if (z10) {
                vVar.addRipple((f0.t) nVar2, coroutineScope);
            } else if (nVar2 instanceof f0.u) {
                vVar.removeRipple(((f0.u) nVar2).getPress());
            } else if (nVar2 instanceof f0.s) {
                vVar.removeRipple(((f0.s) nVar2).getPress());
            } else {
                vVar.updateStateLayer$material_ripple_release(nVar2, coroutineScope);
            }
            return x0.f87415a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f0.o oVar, v vVar, zu.d dVar) {
        super(2, dVar);
        this.f77330k = oVar;
        this.f77331l = vVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        g gVar = new g(this.f77330k, this.f77331l, dVar);
        gVar.f77329j = obj;
        return gVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77328i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f77329j;
            Flow<f0.n> interactions = this.f77330k.getInteractions();
            a aVar = new a(this.f77331l, coroutineScope);
            this.f77328i = 1;
            if (interactions.collect(aVar, this) == coroutine_suspended) {
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
        return ((g) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
