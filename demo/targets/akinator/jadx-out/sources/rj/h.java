package rj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final x f84454a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84455b;

    public h(x xVar, String str) {
        this.f84454a = xVar;
        this.f84455b = str;
    }

    public static g builder() {
        return new g();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hashCode() == hVar.hashCode() && this.f84454a.equals(hVar.f84454a) && this.f84455b.equals(hVar.f84455b);
    }

    public String getButtonHexColor() {
        return this.f84455b;
    }

    public x getText() {
        return this.f84454a;
    }

    public int hashCode() {
        return this.f84455b.hashCode() + this.f84454a.hashCode();
    }
}
