package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f56360a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56361b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56362c;

    /* renamed from: d, reason: collision with root package name */
    public final int f56363d;

    public b1(int i10, int i11, int i12, int i13) {
        this.f56360a = i10;
        this.f56361b = i11;
        this.f56362c = i12;
        this.f56363d = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f56360a == b1Var.f56360a && this.f56361b == b1Var.f56361b && this.f56362c == b1Var.f56362c && this.f56363d == b1Var.f56363d;
    }

    public final int getBottom() {
        return this.f56363d;
    }

    public final int getLeft() {
        return this.f56360a;
    }

    public final int getRight() {
        return this.f56362c;
    }

    public final int getTop() {
        return this.f56361b;
    }

    public int hashCode() {
        return (((((this.f56360a * 31) + this.f56361b) * 31) + this.f56362c) * 31) + this.f56363d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("InsetsValues(left=");
        sb2.append(this.f56360a);
        sb2.append(", top=");
        sb2.append(this.f56361b);
        sb2.append(", right=");
        sb2.append(this.f56362c);
        sb2.append(", bottom=");
        return e3.g.m(sb2, this.f56363d, ')');
    }
}
