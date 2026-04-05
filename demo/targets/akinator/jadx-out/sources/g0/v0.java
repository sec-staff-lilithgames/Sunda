package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v0 extends a2.x3 implements x1.p1 {

    /* renamed from: e, reason: collision with root package name */
    public final e1.b f56605e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(e1.b horizontal, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(horizontal, "horizontal");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f56605e = horizontal;
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
        v0 v0Var = obj instanceof v0 ? (v0) obj : null;
        if (v0Var == null) {
            return false;
        }
        return kotlin.jvm.internal.e0.areEqual(this.f56605e, v0Var.f56605e);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final e1.b getHorizontal() {
        return this.f56605e;
    }

    public int hashCode() {
        return this.f56605e.hashCode();
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    public String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.f56605e + ')';
    }

    @Override // x1.p1
    public r2 modifyParentData(s2.e eVar, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        r2 r2Var = obj instanceof r2 ? (r2) obj : null;
        if (r2Var == null) {
            r2Var = new r2(0.0f, false, null, 7, null);
        }
        r2Var.setCrossAxisAlignment(l0.f56514a.horizontal$foundation_layout_release(this.f56605e));
        return r2Var;
    }
}
