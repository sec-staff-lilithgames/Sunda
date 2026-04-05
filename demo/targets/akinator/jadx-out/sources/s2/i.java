package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final h f85335c = new h(null);

    /* renamed from: e, reason: collision with root package name */
    public static final float f85336e = m6817constructorimpl(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final float f85337f = m6817constructorimpl(Float.POSITIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final float f85338g = m6817constructorimpl(Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    public final float f85339b;

    public /* synthetic */ i(float f10) {
        this.f85339b = f10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ i m6815boximpl(float f10) {
        return new i(f10);
    }

    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m6818div0680j_4(float f10, float f11) {
        return f10 / f11;
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m6819divu2uoSUM(float f10, float f11) {
        return m6817constructorimpl(f10 / f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6821equalsimpl(float f10, Object obj) {
        if (obj instanceof i) {
            return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(f10), (Object) Float.valueOf(((i) obj).m6831unboximpl()));
        }
        return false;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6822equalsimpl0(float f10, float f11) {
        return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(f10), (Object) Float.valueOf(f11));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6823hashCodeimpl(float f10) {
        return Float.hashCode(f10);
    }

    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m6824minus5rwHm24(float f10, float f11) {
        return m6817constructorimpl(f10 - f11);
    }

    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m6825plus5rwHm24(float f10, float f11) {
        return m6817constructorimpl(f10 + f11);
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m6826timesu2uoSUM(float f10, float f11) {
        return m6817constructorimpl(f10 * f11);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6828toStringimpl(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m6829unaryMinusD9Ej5fM(float f10) {
        return m6817constructorimpl(-f10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m6830compareTo0680j_4(((i) obj).m6831unboximpl());
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m6830compareTo0680j_4(float f10) {
        return m6816compareTo0680j_4(this.f85339b, f10);
    }

    public boolean equals(Object obj) {
        return m6821equalsimpl(this.f85339b, obj);
    }

    public final float getValue() {
        return this.f85339b;
    }

    public int hashCode() {
        return m6823hashCodeimpl(this.f85339b);
    }

    public String toString() {
        return m6828toStringimpl(this.f85339b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m6831unboximpl() {
        return this.f85339b;
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m6816compareTo0680j_4(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m6820divu2uoSUM(float f10, int i10) {
        return m6817constructorimpl(f10 / i10);
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m6827timesu2uoSUM(float f10, int i10) {
        return m6817constructorimpl(f10 * i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m6817constructorimpl(float f10) {
        return f10;
    }
}
