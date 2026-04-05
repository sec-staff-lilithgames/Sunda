package d0;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends a2.x3 implements g1.i {

    /* renamed from: e, reason: collision with root package name */
    public final j1.m0 f51405e;

    /* renamed from: f, reason: collision with root package name */
    public final j1.b0 f51406f;

    /* renamed from: g, reason: collision with root package name */
    public final float f51407g;

    /* renamed from: h, reason: collision with root package name */
    public final j1.f2 f51408h;

    /* renamed from: i, reason: collision with root package name */
    public i1.o f51409i;

    /* renamed from: j, reason: collision with root package name */
    public j1.g1 f51410j;

    public /* synthetic */ j(j1.m0 m0Var, j1.b0 b0Var, float f10, j1.f2 f2Var, kv.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : m0Var, (i10 & 2) != 0 ? null : b0Var, (i10 & 4) != 0 ? 1.0f : f10, f2Var, lVar, null);
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // g1.i
    public void draw(l1.e eVar) {
        j1.g1 g1VarMo3688createOutlinePq9zytI;
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        j1.f2 rectangleShape = j1.y1.getRectangleShape();
        j1.b0 b0Var = this.f51406f;
        j1.m0 m0Var = this.f51405e;
        j1.f2 f2Var = this.f51408h;
        if (f2Var == rectangleShape) {
            if (m0Var != null) {
                l1.i.m5411drawRectnJ9OG0$default(eVar, m0Var.m4868unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
            if (b0Var != null) {
                l1.i.m5410drawRectAsUm42w$default(eVar, b0Var, 0L, 0L, this.f51407g, null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
            }
        } else {
            if (i1.o.m4247equalsimpl(eVar.mo5314getSizeNHjbRc(), this.f51409i) && eVar.getLayoutDirection() == null) {
                g1VarMo3688createOutlinePq9zytI = this.f51410j;
                kotlin.jvm.internal.e0.checkNotNull(g1VarMo3688createOutlinePq9zytI);
            } else {
                g1VarMo3688createOutlinePq9zytI = f2Var.mo3688createOutlinePq9zytI(eVar.mo5314getSizeNHjbRc(), eVar.getLayoutDirection(), eVar);
            }
            if (m0Var != null) {
                m0Var.m4868unboximpl();
                j1.h1.m4764drawOutlinewDX37Ww$default(eVar, g1VarMo3688createOutlinePq9zytI, m0Var.m4868unboximpl(), 0.0f, null, null, 0, 60, null);
            }
            if (b0Var != null) {
                j1.h1.m4762drawOutlinehn5TExg$default(eVar, g1VarMo3688createOutlinePq9zytI, b0Var, this.f51407g, null, null, 0, 56, null);
            }
            this.f51410j = g1VarMo3688createOutlinePq9zytI;
            this.f51409i = i1.o.m4240boximpl(eVar.mo5314getSizeNHjbRc());
        }
        eVar.drawContent();
    }

    public boolean equals(Object obj) {
        j jVar = obj instanceof j ? (j) obj : null;
        return jVar != null && kotlin.jvm.internal.e0.areEqual(this.f51405e, jVar.f51405e) && kotlin.jvm.internal.e0.areEqual(this.f51406f, jVar.f51406f) && this.f51407g == jVar.f51407g && kotlin.jvm.internal.e0.areEqual(this.f51408h, jVar.f51408h);
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public int hashCode() {
        j1.m0 m0Var = this.f51405e;
        int iM4865hashCodeimpl = (m0Var != null ? j1.m0.m4865hashCodeimpl(m0Var.m4868unboximpl()) : 0) * 31;
        j1.b0 b0Var = this.f51406f;
        return this.f51408h.hashCode() + b0.e2.b(this.f51407g, (iM4865hashCodeimpl + (b0Var != null ? b0Var.hashCode() : 0)) * 31, 31);
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    public String toString() {
        return "Background(color=" + this.f51405e + ", brush=" + this.f51406f + ", alpha = " + this.f51407g + ", shape=" + this.f51408h + ')';
    }

    public j(j1.m0 m0Var, j1.b0 b0Var, float f10, j1.f2 f2Var, kv.l lVar, kotlin.jvm.internal.u uVar) {
        super(lVar);
        this.f51405e = m0Var;
        this.f51406f = b0Var;
        this.f51407g = f10;
        this.f51408h = f2Var;
    }
}
