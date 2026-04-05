package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 implements j0 {

    /* renamed from: b, reason: collision with root package name */
    public kv.l f87655b;

    /* renamed from: c, reason: collision with root package name */
    public c1 f87656c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f87657e;

    /* renamed from: f, reason: collision with root package name */
    public final p0 f87658f = new p0(this);

    @Override // u1.j0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // u1.j0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // u1.j0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // u1.j0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final boolean getDisallowIntercept$ui_release() {
        return this.f87657e;
    }

    public final kv.l getOnTouchEvent() {
        kv.l lVar = this.f87655b;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("onTouchEvent");
        return null;
    }

    @Override // u1.j0
    public i0 getPointerInputFilter() {
        return this.f87658f;
    }

    public final c1 getRequestDisallowInterceptTouchEvent() {
        return this.f87656c;
    }

    public final void setDisallowIntercept$ui_release(boolean z10) {
        this.f87657e = z10;
    }

    public final void setOnTouchEvent(kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<set-?>");
        this.f87655b = lVar;
    }

    public final void setRequestDisallowInterceptTouchEvent(c1 c1Var) {
        c1 c1Var2 = this.f87656c;
        if (c1Var2 != null) {
            c1Var2.setPointerInteropFilter$ui_release(null);
        }
        this.f87656c = c1Var;
        if (c1Var == null) {
            return;
        }
        c1Var.setPointerInteropFilter$ui_release(this);
    }

    @Override // u1.j0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
