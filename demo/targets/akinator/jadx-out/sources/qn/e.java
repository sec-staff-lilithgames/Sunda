package qn;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f83333a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83334b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83335c;

    public e(String str, String str2, String str3) {
        this.f83333a = str;
        this.f83334b = str2;
        this.f83335c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f83333a, eVar.f83333a) && Objects.equals(this.f83334b, eVar.f83334b) && Objects.equals(this.f83335c, eVar.f83335c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f83333a.hashCode() * 31;
        String str = this.f83334b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f83335c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
