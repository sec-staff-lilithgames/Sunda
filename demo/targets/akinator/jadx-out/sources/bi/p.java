package bi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f9586a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9587b;

    public p(b0 b0Var, boolean z10) {
        this.f9586a = b0Var;
        this.f9587b = z10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.f9586a.equals(this.f9586a) && pVar.f9587b == this.f9587b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9586a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f9587b).hashCode();
    }
}
