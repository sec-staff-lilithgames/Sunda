package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final s f85355e;

    /* renamed from: a, reason: collision with root package name */
    public final int f85356a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85357b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85358c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85359d;

    static {
        new a(null);
        f85355e = new s(0, 0, 0, 0);
    }

    public s(int i10, int i11, int i12, int i13) {
        this.f85356a = i10;
        this.f85357b = i11;
        this.f85358c = i12;
        this.f85359d = i13;
    }

    public static /* synthetic */ s copy$default(s sVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = sVar.f85356a;
        }
        if ((i14 & 2) != 0) {
            i11 = sVar.f85357b;
        }
        if ((i14 & 4) != 0) {
            i12 = sVar.f85358c;
        }
        if ((i14 & 8) != 0) {
            i13 = sVar.f85359d;
        }
        return sVar.copy(i10, i11, i12, i13);
    }

    public final int component1() {
        return this.f85356a;
    }

    public final int component2() {
        return this.f85357b;
    }

    public final int component3() {
        return this.f85358c;
    }

    public final int component4() {
        return this.f85359d;
    }

    /* renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m6948containsgyyYBs(long j10) {
        return q.m6930getXimpl(j10) >= this.f85356a && q.m6930getXimpl(j10) < this.f85358c && q.m6931getYimpl(j10) >= this.f85357b && q.m6931getYimpl(j10) < this.f85359d;
    }

    public final s copy(int i10, int i11, int i12, int i13) {
        return new s(i10, i11, i12, i13);
    }

    public final s deflate(int i10) {
        return inflate(-i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f85356a == sVar.f85356a && this.f85357b == sVar.f85357b && this.f85358c == sVar.f85358c && this.f85359d == sVar.f85359d;
    }

    public final int getBottom() {
        return this.f85359d;
    }

    /* renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m6949getBottomCenternOccac() {
        return r.IntOffset((getWidth() / 2) + this.f85356a, this.f85359d);
    }

    /* renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m6950getBottomLeftnOccac() {
        return r.IntOffset(this.f85356a, this.f85359d);
    }

    /* renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m6951getBottomRightnOccac() {
        return r.IntOffset(this.f85358c, this.f85359d);
    }

    /* renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m6952getCenternOccac() {
        return r.IntOffset((getWidth() / 2) + this.f85356a, (getHeight() / 2) + this.f85357b);
    }

    /* renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m6953getCenterLeftnOccac() {
        return r.IntOffset(this.f85356a, (getHeight() / 2) + this.f85357b);
    }

    /* renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m6954getCenterRightnOccac() {
        return r.IntOffset(this.f85358c, (getHeight() / 2) + this.f85357b);
    }

    public final int getHeight() {
        return this.f85359d - this.f85357b;
    }

    public final int getLeft() {
        return this.f85356a;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getRight() {
        return this.f85358c;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m6955getSizeYbymL2g() {
        return w.IntSize(getWidth(), getHeight());
    }

    public final int getTop() {
        return this.f85357b;
    }

    /* renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m6956getTopCenternOccac() {
        return r.IntOffset((getWidth() / 2) + this.f85356a, this.f85357b);
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m6957getTopLeftnOccac() {
        return r.IntOffset(this.f85356a, this.f85357b);
    }

    /* renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m6958getTopRightnOccac() {
        return r.IntOffset(this.f85358c, this.f85357b);
    }

    public final int getWidth() {
        return this.f85358c - this.f85356a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f85359d) + e3.g.d(this.f85358c, e3.g.d(this.f85357b, Integer.hashCode(this.f85356a) * 31, 31), 31);
    }

    public final s inflate(int i10) {
        return new s(this.f85356a - i10, this.f85357b - i10, this.f85358c + i10, this.f85359d + i10);
    }

    public final s intersect(s other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return new s(Math.max(this.f85356a, other.f85356a), Math.max(this.f85357b, other.f85357b), Math.min(this.f85358c, other.f85358c), Math.min(this.f85359d, other.f85359d));
    }

    public final boolean isEmpty() {
        return this.f85356a >= this.f85358c || this.f85357b >= this.f85359d;
    }

    public final boolean overlaps(s other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return this.f85358c > other.f85356a && other.f85358c > this.f85356a && this.f85359d > other.f85357b && other.f85359d > this.f85357b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f85356a);
        sb2.append(", ");
        sb2.append(this.f85357b);
        sb2.append(", ");
        sb2.append(this.f85358c);
        sb2.append(", ");
        return e3.g.m(sb2, this.f85359d, ')');
    }

    public final s translate(int i10, int i11) {
        return new s(this.f85356a + i10, this.f85357b + i11, this.f85358c + i10, this.f85359d + i11);
    }

    /* renamed from: translate--gyyYBs, reason: not valid java name */
    public final s m6959translategyyYBs(long j10) {
        return new s(q.m6930getXimpl(j10) + this.f85356a, q.m6931getYimpl(j10) + this.f85357b, q.m6930getXimpl(j10) + this.f85358c, q.m6931getYimpl(j10) + this.f85359d);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final s getZero() {
            return s.f85355e;
        }

        public static /* synthetic */ void getZero$annotations() {
        }
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m6947getSizeYbymL2g$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }
}
