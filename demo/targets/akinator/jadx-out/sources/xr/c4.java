package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f92304a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92305b;

    public c4(String str, int i10) {
        this.f92304a = str;
        this.f92305b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c4.class == obj.getClass()) {
            c4 c4Var = (c4) obj;
            if (this.f92305b == c4Var.f92305b && this.f92304a.equals(c4Var.f92304a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f92304a, Integer.valueOf(this.f92305b));
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("host", this.f92304a).add("port", this.f92305b).toString();
    }
}
