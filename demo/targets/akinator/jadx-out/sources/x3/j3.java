package x3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j3 extends i3 {
    public j3() {
    }

    @Override // x3.h3, x3.k3
    public void d(int i10, o3.c cVar) {
        this.f91585c.setInsets(v3.a(i10), cVar.toPlatformInsets());
    }

    @Override // x3.h3, x3.k3
    public void e(int i10, o3.c cVar) throws IllegalArgumentException {
        this.f91585c.setInsetsIgnoringVisibility(v3.a(i10), cVar.toPlatformInsets());
    }

    @Override // x3.h3, x3.k3
    public void m(int i10, boolean z10) {
        this.f91585c.setVisible(v3.a(i10), z10);
    }

    public j3(e3 e3Var) {
        super(e3Var);
    }
}
