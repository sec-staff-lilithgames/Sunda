package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c2 extends a2.x3 implements x1.p1 {

    /* renamed from: e, reason: collision with root package name */
    public final float f56375e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f56376f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(float f10, boolean z10, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f56375e = f10;
        this.f56376f = z10;
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        c2 c2Var = obj instanceof c2 ? (c2) obj : null;
        return c2Var != null && this.f56375e == c2Var.f56375e && this.f56376f == c2Var.f56376f;
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final boolean getFill() {
        return this.f56376f;
    }

    public final float getWeight() {
        return this.f56375e;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f56376f) + (Float.hashCode(this.f56375e) * 31);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LayoutWeightImpl(weight=");
        sb2.append(this.f56375e);
        sb2.append(", fill=");
        return a.b.p(sb2, this.f56376f, ')');
    }

    @Override // x1.p1
    public r2 modifyParentData(s2.e eVar, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        r2 r2Var = obj instanceof r2 ? (r2) obj : null;
        if (r2Var == null) {
            r2Var = new r2(0.0f, false, null, 7, null);
        }
        r2Var.setWeight(this.f56375e);
        r2Var.setFill(this.f56376f);
        return r2Var;
    }
}
