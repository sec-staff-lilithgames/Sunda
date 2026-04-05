package e1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends h {

    /* renamed from: f, reason: collision with root package name */
    public final String f53485f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f53486g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String fqName, Object obj, kv.l inspectorInfo, kv.q factory) {
        super(inspectorInfo, factory);
        e0.checkNotNullParameter(fqName, "fqName");
        e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        e0.checkNotNullParameter(factory, "factory");
        this.f53485f = fqName;
        this.f53486g = obj;
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
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return e0.areEqual(this.f53485f, pVar.f53485f) && e0.areEqual(this.f53486g, pVar.f53486g);
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
        return this.f53485f;
    }

    public final Object getKey1() {
        return this.f53486g;
    }

    public int hashCode() {
        int iHashCode = this.f53485f.hashCode() * 31;
        Object obj = this.f53486g;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @Override // e1.h, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }
}
