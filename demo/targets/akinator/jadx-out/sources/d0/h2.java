package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h2 implements y1.b, y1.d, kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f51386b;

    /* renamed from: c, reason: collision with root package name */
    public kv.l f51387c;

    public h2(kv.l handler) {
        kotlin.jvm.internal.e0.checkNotNullParameter(handler, "handler");
        this.f51386b = handler;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // y1.d
    public y1.f getKey() {
        return e2.getModifierLocalFocusedBoundsObserver();
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((x1.d0) obj);
        return tu.x0.f87415a;
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kv.l lVar = (kv.l) scope.getCurrent(e2.getModifierLocalFocusedBoundsObserver());
        if (kotlin.jvm.internal.e0.areEqual(lVar, this.f51387c)) {
            return;
        }
        this.f51387c = lVar;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    @Override // y1.d
    public kv.l getValue() {
        return this;
    }

    public void invoke(x1.d0 d0Var) {
        this.f51386b.invoke(d0Var);
        kv.l lVar = this.f51387c;
        if (lVar != null) {
            lVar.invoke(d0Var);
        }
    }
}
