package rj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f84503a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84504b;

    public x(String str, String str2) {
        this.f84503a = str;
        this.f84504b = str2;
    }

    public static w builder() {
        return new w();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        String str = xVar.f84503a;
        if (hashCode() != xVar.hashCode()) {
            return false;
        }
        String str2 = this.f84503a;
        return (str2 != null || str == null) && (str2 == null || str2.equals(str)) && this.f84504b.equals(xVar.f84504b);
    }

    public String getHexColor() {
        return this.f84504b;
    }

    public String getText() {
        return this.f84503a;
    }

    public int hashCode() {
        String str = this.f84504b;
        String str2 = this.f84503a;
        if (str2 == null) {
            return str.hashCode();
        }
        return str.hashCode() + str2.hashCode();
    }
}
