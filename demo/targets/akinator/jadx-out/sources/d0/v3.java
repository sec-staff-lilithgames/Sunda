package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v3 implements y1.b {

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f51648b;

    public v3(kv.l onPinnableParentAvailable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onPinnableParentAvailable, "onPinnableParentAvailable");
        this.f51648b = onPinnableParentAvailable;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public boolean equals(Object obj) {
        return (obj instanceof v3) && kotlin.jvm.internal.e0.areEqual(((v3) obj).f51648b, this.f51648b);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final kv.l getOnPinnableParentAvailable() {
        return this.f51648b;
    }

    public int hashCode() {
        return this.f51648b.hashCode();
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        this.f51648b.invoke(scope.getCurrent(h0.c.getModifierLocalPinnableParent()));
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
