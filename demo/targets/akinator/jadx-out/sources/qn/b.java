package qn;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f83301a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83302b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83303c;

    /* renamed from: d, reason: collision with root package name */
    public final int f83304d;

    public b(String str) {
        this(str, str, Integer.MIN_VALUE, 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f83303c == bVar.f83303c && this.f83304d == bVar.f83304d && Objects.equals(this.f83301a, bVar.f83301a) && Objects.equals(this.f83302b, bVar.f83302b);
    }

    public int hashCode() {
        return Objects.hash(this.f83301a, this.f83302b, Integer.valueOf(this.f83303c), Integer.valueOf(this.f83304d));
    }

    public b(String str, String str2, int i10, int i11) {
        this.f83301a = str;
        this.f83302b = str2;
        this.f83303c = i10;
        this.f83304d = i11;
    }
}
