package c0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends bv.n implements kv.l {

    /* renamed from: i, reason: collision with root package name */
    public p f11397i;

    /* renamed from: j, reason: collision with root package name */
    public kotlin.jvm.internal.w0 f11398j;

    /* renamed from: k, reason: collision with root package name */
    public int f11399k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f11400l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f11401m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f11402n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f11403o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kv.l f11404p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Object obj, g gVar, long j10, kv.l lVar, zu.d dVar) {
        super(1, dVar);
        this.f11400l = eVar;
        this.f11401m = obj;
        this.f11402n = gVar;
        this.f11403o = j10;
        this.f11404p = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(zu.d<?> dVar) {
        return new b(this.f11400l, this.f11401m, this.f11402n, this.f11403o, this.f11404p, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        p pVar;
        kotlin.jvm.internal.w0 w0Var;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f11399k;
        e eVar = this.f11400l;
        try {
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                eVar.getInternalState$animation_core_release().setVelocityVector$animation_core_release((v) eVar.getTypeConverter().getConvertToVector().invoke(this.f11401m));
                eVar.f11444e.setValue(this.f11402n.getTargetValue());
                eVar.f11443d.setValue(Boolean.valueOf(true));
                p pVarCopy$default = q.copy$default(eVar.getInternalState$animation_core_release(), (Object) null, (v) null, 0L, Long.MIN_VALUE, false, 23, (Object) null);
                kotlin.jvm.internal.w0 w0Var2 = new kotlin.jvm.internal.w0();
                g gVar = this.f11402n;
                long j10 = this.f11403o;
                a aVar = new a(eVar, pVarCopy$default, this.f11404p, w0Var2);
                this.f11397i = pVarCopy$default;
                this.f11398j = w0Var2;
                this.f11399k = 1;
                if (x1.animate(pVarCopy$default, gVar, j10, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pVar = pVarCopy$default;
                w0Var = w0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w0Var = this.f11398j;
                pVar = this.f11397i;
                tu.a0.throwOnFailure(obj);
            }
            h hVar = w0Var.f71863b ? h.f11480b : h.f11481c;
            e.access$endAnimation(eVar);
            return new l(pVar, hVar);
        } catch (CancellationException e10) {
            e.access$endAnimation(eVar);
            throw e10;
        }
    }

    @Override // kv.l
    public final Object invoke(zu.d<? super l> dVar) {
        return ((b) create(dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
