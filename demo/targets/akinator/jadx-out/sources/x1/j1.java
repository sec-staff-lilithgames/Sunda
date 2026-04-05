package x1;

import a2.x3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 extends x3 implements i1 {

    /* renamed from: e, reason: collision with root package name */
    public final kv.l f91375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(kv.l callback, kv.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.e0.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f91375e = callback;
    }

    @Override // x1.i1, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.i1, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        return kotlin.jvm.internal.e0.areEqual(this.f91375e, ((j1) obj).f91375e);
    }

    @Override // x1.i1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.i1, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final kv.l getCallback() {
        return this.f91375e;
    }

    public int hashCode() {
        return this.f91375e.hashCode();
    }

    @Override // x1.i1
    public void onGloballyPositioned(d0 coordinates) {
        kotlin.jvm.internal.e0.checkNotNullParameter(coordinates, "coordinates");
        this.f91375e.invoke(coordinates);
    }

    @Override // x1.i1, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
