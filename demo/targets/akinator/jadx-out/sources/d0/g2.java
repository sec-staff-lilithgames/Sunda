package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g2 implements y1.b, x1.i1 {

    /* renamed from: b, reason: collision with root package name */
    public kv.l f51379b;

    /* renamed from: c, reason: collision with root package name */
    public x1.d0 f51380c;

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

    @Override // x1.i1
    public void onGloballyPositioned(x1.d0 coordinates) {
        kv.l lVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(coordinates, "coordinates");
        this.f51380c = coordinates;
        if (!coordinates.isAttached()) {
            kv.l lVar2 = this.f51379b;
            if (lVar2 != null) {
                lVar2.invoke(null);
                return;
            }
            return;
        }
        x1.d0 d0Var = this.f51380c;
        if (d0Var != null) {
            kotlin.jvm.internal.e0.checkNotNull(d0Var);
            if (!d0Var.isAttached() || (lVar = this.f51379b) == null) {
                return;
            }
            lVar.invoke(this.f51380c);
        }
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        kv.l lVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kv.l lVar2 = (kv.l) scope.getCurrent(e2.getModifierLocalFocusedBoundsObserver());
        if (lVar2 == null && (lVar = this.f51379b) != null) {
            lVar.invoke(null);
        }
        this.f51379b = lVar2;
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
