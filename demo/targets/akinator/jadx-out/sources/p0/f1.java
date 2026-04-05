package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f1 implements j4 {

    /* renamed from: b, reason: collision with root package name */
    public final kv.l f80206b;

    /* renamed from: c, reason: collision with root package name */
    public g1 f80207c;

    public f1(kv.l lVar) {
        this.f80206b = lVar;
    }

    @Override // p0.j4
    public void onForgotten() {
        g1 g1Var = this.f80207c;
        if (g1Var != null) {
            g1Var.dispose();
        }
        this.f80207c = null;
    }

    @Override // p0.j4
    public void onRemembered() {
        this.f80207c = (g1) this.f80206b.invoke(k1.f80295a);
    }

    @Override // p0.j4
    public void onAbandoned() {
    }
}
