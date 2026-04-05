package ub;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p0 implements Comparable, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final p0 f88319i = new p0(0, 0, 0, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final int f88320b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88321c;

    /* renamed from: e, reason: collision with root package name */
    public final int f88322e;

    /* renamed from: f, reason: collision with root package name */
    public final String f88323f;

    /* renamed from: g, reason: collision with root package name */
    public final String f88324g;

    /* renamed from: h, reason: collision with root package name */
    public final String f88325h;

    @Deprecated
    public p0(int i10, int i11, int i12, String str) {
        this(i10, i11, i12, str, null, null);
    }

    public static p0 unknownVersion() {
        return f88319i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p0Var.f88320b == this.f88320b && p0Var.f88321c == this.f88321c && p0Var.f88322e == this.f88322e && Objects.equals(p0Var.f88325h, this.f88325h) && p0Var.f88324g.equals(this.f88324g) && p0Var.f88323f.equals(this.f88323f);
    }

    public String getArtifactId() {
        return this.f88324g;
    }

    public String getGroupId() {
        return this.f88323f;
    }

    public int getMajorVersion() {
        return this.f88320b;
    }

    public int getMinorVersion() {
        return this.f88321c;
    }

    public int getPatchLevel() {
        return this.f88322e;
    }

    public int hashCode() {
        return (this.f88324g.hashCode() ^ this.f88323f.hashCode()) ^ (((Objects.hashCode(this.f88325h) + this.f88320b) - this.f88321c) + this.f88322e);
    }

    public boolean isSnapshot() {
        String str = this.f88325h;
        return (str == null || str.isEmpty()) ? false : true;
    }

    @Deprecated
    public boolean isUknownVersion() {
        return isUnknownVersion();
    }

    public boolean isUnknownVersion() {
        return this == f88319i;
    }

    public String toFullString() {
        return this.f88323f + '/' + this.f88324g + '/' + toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f88320b);
        sb2.append('.');
        sb2.append(this.f88321c);
        sb2.append('.');
        sb2.append(this.f88322e);
        if (isSnapshot()) {
            sb2.append('-');
            sb2.append(this.f88325h);
        }
        return sb2.toString();
    }

    public p0(int i10, int i11, int i12, String str, String str2, String str3) {
        this.f88320b = i10;
        this.f88321c = i11;
        this.f88322e = i12;
        this.f88325h = str;
        this.f88323f = str2 == null ? "" : str2;
        this.f88324g = str3 == null ? "" : str3;
    }

    @Override // java.lang.Comparable
    public int compareTo(p0 p0Var) {
        if (p0Var == this) {
            return 0;
        }
        int iCompareTo = this.f88323f.compareTo(p0Var.f88323f);
        if (iCompareTo != 0 || (iCompareTo = this.f88324g.compareTo(p0Var.f88324g)) != 0 || (iCompareTo = this.f88320b - p0Var.f88320b) != 0 || (iCompareTo = this.f88321c - p0Var.f88321c) != 0 || (iCompareTo = this.f88322e - p0Var.f88322e) != 0) {
            return iCompareTo;
        }
        if (!isSnapshot()) {
            return p0Var.isSnapshot() ? 1 : 0;
        }
        if (p0Var.isSnapshot()) {
            return this.f88325h.compareTo(p0Var.f88325h);
        }
        return -1;
    }
}
