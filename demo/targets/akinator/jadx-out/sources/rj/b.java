package rj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f84433a;

    /* renamed from: b, reason: collision with root package name */
    public final h f84434b;

    public b(String str, h hVar) {
        this.f84433a = str;
        this.f84434b = hVar;
    }

    public static a builder() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        h hVar = bVar.f84434b;
        String str = bVar.f84433a;
        if (hashCode() != bVar.hashCode()) {
            return false;
        }
        String str2 = this.f84433a;
        if ((str2 == null && str != null) || (str2 != null && !str2.equals(str))) {
            return false;
        }
        h hVar2 = this.f84434b;
        return (hVar2 == null && hVar == null) || (hVar2 != null && hVar2.equals(hVar));
    }

    public String getActionUrl() {
        return this.f84433a;
    }

    public h getButton() {
        return this.f84434b;
    }

    public int hashCode() {
        String str = this.f84433a;
        int iHashCode = str != null ? str.hashCode() : 0;
        h hVar = this.f84434b;
        return iHashCode + (hVar != null ? hVar.hashCode() : 0);
    }
}
