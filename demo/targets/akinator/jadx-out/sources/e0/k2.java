package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k2 implements o2, n2 {

    /* renamed from: a, reason: collision with root package name */
    public final c2 f53141a;

    /* renamed from: b, reason: collision with root package name */
    public i1 f53142b;

    public k2(c2 origin) {
        kotlin.jvm.internal.e0.checkNotNullParameter(origin, "origin");
        this.f53141a = origin;
    }

    @Override // e0.o2
    public void dispatchRawDelta(float f10) {
        this.f53141a.dispatchRawDelta(f10);
    }

    @Override // e0.o2
    public Object drag(d0.l3 l3Var, kv.p pVar, zu.d<? super tu.x0> dVar) {
        Object objDrag = this.f53141a.drag(l3Var, new j2(this, pVar, null), dVar);
        return objDrag == av.e.getCOROUTINE_SUSPENDED() ? objDrag : tu.x0.f87415a;
    }

    @Override // e0.n2
    /* renamed from: dragBy-Uv8p0NA, reason: not valid java name */
    public void mo3765dragByUv8p0NA(float f10, long j10) {
        i1 i1Var = this.f53142b;
        if (i1Var != null) {
            ((g) i1Var).dragBy(f10);
        }
    }

    public final i1 getLatestConsumptionScope() {
        return this.f53142b;
    }

    public final c2 getOrigin() {
        return this.f53141a;
    }

    public final void setLatestConsumptionScope(i1 i1Var) {
        this.f53142b = i1Var;
    }
}
