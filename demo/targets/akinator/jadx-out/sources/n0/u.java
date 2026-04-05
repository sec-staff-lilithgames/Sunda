package n0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f75194i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0.e f75195j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v f75196k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f75197l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f0.n f75198m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(c0.e eVar, v vVar, float f10, f0.n nVar, zu.d dVar) {
        super(2, dVar);
        this.f75195j = eVar;
        this.f75196k = vVar;
        this.f75197l = f10;
        this.f75198m = nVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new u(this.f75195j, this.f75196k, this.f75197l, this.f75198m, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f75194i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            c0.e eVar = this.f75195j;
            float fM6831unboximpl = ((s2.i) eVar.getTargetValue()).m6831unboximpl();
            v vVar = this.f75196k;
            f0.n dVar = null;
            if (s2.i.m6822equalsimpl0(fM6831unboximpl, vVar.f75201b)) {
                dVar = new f0.t(i1.h.f59344b.m4173getZeroF1C5BW0(), null);
            } else if (s2.i.m6822equalsimpl0(fM6831unboximpl, vVar.f75203d)) {
                dVar = new f0.i();
            } else if (s2.i.m6822equalsimpl0(fM6831unboximpl, vVar.f75204e)) {
                dVar = new f0.d();
            }
            this.f75194i = 1;
            if (y.m5705animateElevationrAjV9yQ(eVar, this.f75197l, dVar, this.f75198m, this) == coroutine_suspended) {
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
        return ((u) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
