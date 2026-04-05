package x3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a4 extends z3 {
    @Override // x3.z3, x3.b4
    public final int c() {
        return this.f91725a.getSystemBarsBehavior();
    }

    @Override // x3.z3, x3.b4
    public final void f(int i10) {
        this.f91725a.setSystemBarsBehavior(i10);
    }

    @Override // x3.z3, x3.b4
    public boolean isAppearanceLightNavigationBars() {
        return (this.f91725a.getSystemBarsAppearance() & 16) != 0;
    }

    @Override // x3.z3, x3.b4
    public boolean isAppearanceLightStatusBars() {
        return (this.f91725a.getSystemBarsAppearance() & 8) != 0;
    }
}
