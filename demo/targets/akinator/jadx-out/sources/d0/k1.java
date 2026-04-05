package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k1 extends a2.x3 implements g1.i {

    /* renamed from: e, reason: collision with root package name */
    public final b f51459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(b overscrollEffect, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(overscrollEffect, "overscrollEffect");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f51459e = overscrollEffect;
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
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        eVar.drawContent();
        this.f51459e.drawOverscroll(eVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        return kotlin.jvm.internal.e0.areEqual(this.f51459e, ((k1) obj).f51459e);
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
        return this.f51459e.hashCode();
    }

    @Override // g1.i, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f51459e + ')';
    }
}
