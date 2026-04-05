package zi;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f97979a;

    /* renamed from: b, reason: collision with root package name */
    public final List f97980b;

    public a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f97979a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f97980b = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f97979a.equals(kVar.getUserAgent()) && this.f97980b.equals(kVar.getUsedDates())) {
                return true;
            }
        }
        return false;
    }

    @Override // zi.k
    public List<String> getUsedDates() {
        return this.f97980b;
    }

    @Override // zi.k
    public String getUserAgent() {
        return this.f97979a;
    }

    public int hashCode() {
        return ((this.f97979a.hashCode() ^ 1000003) * 1000003) ^ this.f97980b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f97979a + ", usedDates=" + this.f97980b + "}";
    }
}
