package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t3 extends a2.x3 implements x1.p1 {

    /* renamed from: e, reason: collision with root package name */
    public final e1.c f56587e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(e1.c vertical, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(vertical, "vertical");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f56587e = vertical;
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
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var == null) {
            return false;
        }
        return kotlin.jvm.internal.e0.areEqual(this.f56587e, t3Var.f56587e);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final e1.c getVertical() {
        return this.f56587e;
    }

    public int hashCode() {
        return this.f56587e.hashCode();
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    public String toString() {
        return "VerticalAlignModifier(vertical=" + this.f56587e + ')';
    }

    @Override // x1.p1
    public r2 modifyParentData(s2.e eVar, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        r2 r2Var = obj instanceof r2 ? (r2) obj : null;
        if (r2Var == null) {
            r2Var = new r2(0.0f, false, null, 7, null);
        }
        r2Var.setCrossAxisAlignment(l0.f56514a.vertical$foundation_layout_release(this.f56587e));
        return r2Var;
    }
}
