package e1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends h {

    /* renamed from: f, reason: collision with root package name */
    public final String f53490f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f53491g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f53492h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f53493i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String fqName, Object obj, Object obj2, Object obj3, kv.l inspectorInfo, kv.q factory) {
        super(inspectorInfo, factory);
        e0.checkNotNullParameter(fqName, "fqName");
        e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        e0.checkNotNullParameter(factory, "factory");
        this.f53490f = fqName;
        this.f53491g = obj;
        this.f53492h = obj2;
        this.f53493i = obj3;
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return e0.areEqual(this.f53490f, rVar.f53490f) && e0.areEqual(this.f53491g, rVar.f53491g) && e0.areEqual(this.f53492h, rVar.f53492h) && e0.areEqual(this.f53493i, rVar.f53493i);
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final String getFqName() {
        return this.f53490f;
    }

    public final Object getKey1() {
        return this.f53491g;
    }

    public final Object getKey2() {
        return this.f53492h;
    }

    public final Object getKey3() {
        return this.f53493i;
    }

    public int hashCode() {
        int iHashCode = this.f53490f.hashCode() * 31;
        Object obj = this.f53491g;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f53492h;
        int iHashCode3 = (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.f53493i;
        return iHashCode3 + (obj3 != null ? obj3.hashCode() : 0);
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }
}
