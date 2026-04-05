package tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public static final m f87391g;

    /* renamed from: b, reason: collision with root package name */
    public final int f87392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87393c;

    /* renamed from: e, reason: collision with root package name */
    public final int f87394e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87395f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f87391g = n.get();
    }

    public m(int i10, int i11, int i12) {
        this.f87392b = i10;
        this.f87393c = i11;
        this.f87394e = i12;
        if (i10 >= 0 && i10 < 256 && i11 >= 0 && i11 < 256 && i12 >= 0 && i12 < 256) {
            this.f87395f = (i10 << 16) + (i11 << 8) + i12;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        m mVar = obj instanceof m ? (m) obj : null;
        return mVar != null && this.f87395f == mVar.f87395f;
    }

    public final int getMajor() {
        return this.f87392b;
    }

    public final int getMinor() {
        return this.f87393c;
    }

    public final int getPatch() {
        return this.f87394e;
    }

    public int hashCode() {
        return this.f87395f;
    }

    public final boolean isAtLeast(int i10, int i11) {
        int i12 = this.f87392b;
        if (i12 <= i10) {
            return i12 == i10 && this.f87393c >= i11;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f87392b);
        sb2.append('.');
        sb2.append(this.f87393c);
        sb2.append('.');
        sb2.append(this.f87394e);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(m other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return this.f87395f - other.f87395f;
    }

    public final boolean isAtLeast(int i10, int i11, int i12) {
        int i13 = this.f87392b;
        if (i13 > i10) {
            return true;
        }
        if (i13 != i10) {
            return false;
        }
        int i14 = this.f87393c;
        if (i14 <= i11) {
            return i14 == i11 && this.f87394e >= i12;
        }
        return true;
    }

    public m(int i10, int i11) {
        this(i10, i11, 0);
    }
}
