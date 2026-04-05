package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f80147a;

    public b(int i10) {
        this.f80147a = i10;
    }

    public final int getLocation$runtime() {
        return this.f80147a;
    }

    public final boolean getValid() {
        return this.f80147a != Integer.MIN_VALUE;
    }

    public final void setLocation$runtime(int i10) {
        this.f80147a = i10;
    }

    public final int toIndexFor(s4 s4Var) {
        return s4Var.anchorIndex(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return a.b.f(this.f80147a, " }", sb2);
    }

    public final int toIndexFor(v4 v4Var) {
        return v4Var.anchorIndex(this);
    }
}
