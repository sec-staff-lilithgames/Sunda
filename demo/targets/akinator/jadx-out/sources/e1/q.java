package e1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q extends h {

    /* renamed from: f, reason: collision with root package name */
    public final String f53487f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f53488g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f53489h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String fqName, Object obj, Object obj2, kv.l inspectorInfo, kv.q factory) {
        super(inspectorInfo, factory);
        e0.checkNotNullParameter(fqName, "fqName");
        e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        e0.checkNotNullParameter(factory, "factory");
        this.f53487f = fqName;
        this.f53488g = obj;
        this.f53489h = obj2;
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
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return e0.areEqual(this.f53487f, qVar.f53487f) && e0.areEqual(this.f53488g, qVar.f53488g) && e0.areEqual(this.f53489h, qVar.f53489h);
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
        return this.f53487f;
    }

    public final Object getKey1() {
        return this.f53488g;
    }

    public final Object getKey2() {
        return this.f53489h;
    }

    public int hashCode() {
        int iHashCode = this.f53487f.hashCode() * 31;
        Object obj = this.f53488g;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f53489h;
        return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }
}
