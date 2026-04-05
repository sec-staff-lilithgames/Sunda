package k4;

import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f70533i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f70534j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p pVar, zu.d dVar) {
        super(2, dVar);
        this.f70534j = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new v(this.f70534j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f70533i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            this.f70533i = 1;
            if (p.access$incrementCollector(this.f70534j, this) == coroutine_suspended) {
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
    public final Object invoke(FlowCollector<? super q2> flowCollector, zu.d<? super tu.x0> dVar) {
        return ((v) create(flowCollector, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
