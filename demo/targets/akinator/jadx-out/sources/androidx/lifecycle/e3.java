package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e3 implements u1 {

    /* renamed from: b, reason: collision with root package name */
    public l1 f6561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.a f6562c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1 f6563e;

    public e3(t.a aVar, r1 r1Var) {
        this.f6562c = aVar;
        this.f6563e = r1Var;
    }

    public final l1 getLiveData() {
        return this.f6561b;
    }

    @Override // androidx.lifecycle.u1
    public void onChanged(Object obj) {
        l1 l1Var = (l1) this.f6562c.apply(obj);
        l1 l1Var2 = this.f6561b;
        if (l1Var2 == l1Var) {
            return;
        }
        r1 r1Var = this.f6563e;
        if (l1Var2 != null) {
            kotlin.jvm.internal.e0.checkNotNull(l1Var2);
            r1Var.removeSource(l1Var2);
        }
        this.f6561b = l1Var;
        if (l1Var != null) {
            kotlin.jvm.internal.e0.checkNotNull(l1Var);
            r1Var.addSource(l1Var, new d3(new n(r1Var, 2)));
        }
    }

    public final void setLiveData(l1 l1Var) {
        this.f6561b = l1Var;
    }
}
