package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j2 extends w0 {

    /* renamed from: f, reason: collision with root package name */
    public final i2 f56491f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(i2 paddingValues, kv.l inspectorInfo) {
        super(inspectorInfo, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(paddingValues, "paddingValues");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f56491f = paddingValues;
    }

    @Override // g0.w0, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // g0.w0, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // g0.w0
    public v3 calculateInsets(v3 modifierLocalInsets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(modifierLocalInsets, "modifierLocalInsets");
        return y3.add(y3.asInsets(this.f56491f), modifierLocalInsets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j2) {
            return kotlin.jvm.internal.e0.areEqual(((j2) obj).f56491f, this.f56491f);
        }
        return false;
    }

    @Override // g0.w0, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // g0.w0, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public int hashCode() {
        return this.f56491f.hashCode();
    }

    @Override // g0.w0, y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
