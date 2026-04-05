package uu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z1 extends b {

    /* renamed from: e, reason: collision with root package name */
    public int f88803e;

    /* renamed from: f, reason: collision with root package name */
    public int f88804f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a2 f88805g;

    public z1(a2 a2Var) {
        this.f88805g = a2Var;
        this.f88803e = a2Var.size();
        this.f88804f = a2Var.f88701e;
    }

    @Override // uu.b
    public final void a() {
        if (this.f88803e == 0) {
            this.f88703b = 2;
            return;
        }
        a2 a2Var = this.f88805g;
        Object[] objArr = a2Var.f88699b;
        int i10 = this.f88804f;
        this.f88704c = objArr[i10];
        this.f88703b = 1;
        this.f88804f = (i10 + 1) % a2Var.f88700c;
        this.f88803e--;
    }
}
