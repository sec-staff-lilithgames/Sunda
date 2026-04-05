package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends a2.x3 implements x1.p1 {

    /* renamed from: e, reason: collision with root package name */
    public e1.d f56603e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f56604f;

    public /* synthetic */ v(e1.d dVar, boolean z10, kv.l lVar, int i10, kotlin.jvm.internal.u uVar) {
        this(dVar, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? a2.t3.getNoInspectorInfo() : lVar);
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
        v vVar = obj instanceof v ? (v) obj : null;
        return vVar != null && kotlin.jvm.internal.e0.areEqual(this.f56603e, vVar.f56603e) && this.f56604f == vVar.f56604f;
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final e1.d getAlignment() {
        return this.f56603e;
    }

    public final boolean getMatchParentSize() {
        return this.f56604f;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f56604f) + (this.f56603e.hashCode() * 31);
    }

    @Override // x1.p1
    public v modifyParentData(s2.e eVar, Object obj) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        return this;
    }

    public final void setAlignment(e1.d dVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(dVar, "<set-?>");
        this.f56603e = dVar;
    }

    public final void setMatchParentSize(boolean z10) {
        this.f56604f = z10;
    }

    @Override // x1.p1, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BoxChildData(alignment=");
        sb2.append(this.f56603e);
        sb2.append(", matchParentSize=");
        return a.b.p(sb2, this.f56604f, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e1.d alignment, boolean z10, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f56603e = alignment;
        this.f56604f = z10;
    }
}
