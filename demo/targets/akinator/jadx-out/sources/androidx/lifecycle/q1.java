package androidx.lifecycle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q1 implements u1 {

    /* renamed from: b, reason: collision with root package name */
    public final l1 f6699b;

    /* renamed from: c, reason: collision with root package name */
    public final u1 f6700c;

    /* renamed from: e, reason: collision with root package name */
    public int f6701e = -1;

    public q1(l1 l1Var, u1 u1Var) {
        this.f6699b = l1Var;
        this.f6700c = u1Var;
    }

    @Override // androidx.lifecycle.u1
    public void onChanged(Object obj) {
        int i10 = this.f6701e;
        int i11 = this.f6699b.f6655g;
        if (i10 != i11) {
            this.f6701e = i11;
            this.f6700c.onChanged(obj);
        }
    }
}
