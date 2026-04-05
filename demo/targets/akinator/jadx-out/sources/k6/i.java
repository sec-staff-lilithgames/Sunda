package k6;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f70596a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70597b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70598c;

    public i(String str, String str2, String str3) {
        this.f70596a = str;
        this.f70597b = str2;
        this.f70598c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Objects.equals(this.f70596a, iVar.f70596a) && Objects.equals(this.f70597b, iVar.f70597b) && Objects.equals(this.f70598c, iVar.f70598c);
    }

    public String getBrand() {
        return this.f70596a;
    }

    public String getFullVersion() {
        return this.f70598c;
    }

    public String getMajorVersion() {
        return this.f70597b;
    }

    public int hashCode() {
        return Objects.hash(this.f70596a, this.f70597b, this.f70598c);
    }

    public String toString() {
        return this.f70596a + "," + this.f70597b + "," + this.f70598c;
    }
}
