package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: b, reason: collision with root package name */
    public static final c4 f56385b = new c4(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f56386c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final int f56387d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f56388e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f56389f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f56390g = m3866plusgK_yJZ4(8, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final int f56391h = m3866plusgK_yJZ4(4, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final int f56392i = 16;

    /* renamed from: j, reason: collision with root package name */
    public static final int f56393j = 32;

    /* renamed from: k, reason: collision with root package name */
    public static final int f56394k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f56395l;

    /* renamed from: m, reason: collision with root package name */
    public static final int f56396m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f56397n;

    /* renamed from: a, reason: collision with root package name */
    public final int f56398a;

    static {
        int iM3866plusgK_yJZ4 = m3866plusgK_yJZ4(8, 2);
        f56394k = iM3866plusgK_yJZ4;
        int iM3866plusgK_yJZ42 = m3866plusgK_yJZ4(4, 1);
        f56395l = iM3866plusgK_yJZ42;
        f56396m = m3866plusgK_yJZ4(iM3866plusgK_yJZ4, iM3866plusgK_yJZ42);
        f56397n = m3866plusgK_yJZ4(16, 32);
    }

    public /* synthetic */ d4(int i10) {
        this.f56398a = i10;
    }

    public static final void a(String str, StringBuilder sb2) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ d4 m3861boximpl(int i10) {
        return new d4(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3862equalsimpl(int i10, Object obj) {
        return (obj instanceof d4) && i10 == ((d4) obj).m3868unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3863equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release, reason: not valid java name */
    public static final boolean m3864hasAnybkgdKaI$foundation_layout_release(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3865hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m3866plusgK_yJZ4(int i10, int i11) {
        return i10 | i11;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3867toStringimpl(int i10) {
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i11 = f56390g;
        if ((i10 & i11) == i11) {
            a("Start", sb3);
        }
        int i12 = f56394k;
        if ((i10 & i12) == i12) {
            a("Left", sb3);
        }
        int i13 = f56392i;
        if ((i10 & i13) == i13) {
            a("Top", sb3);
        }
        int i14 = f56391h;
        if ((i10 & i14) == i14) {
            a("End", sb3);
        }
        int i15 = f56395l;
        if ((i10 & i15) == i15) {
            a("Right", sb3);
        }
        int i16 = f56393j;
        if ((i10 & i16) == i16) {
            a("Bottom", sb3);
        }
        String string = sb3.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        sb2.append(string);
        sb2.append(')');
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        return m3862equalsimpl(this.f56398a, obj);
    }

    public int hashCode() {
        return m3865hashCodeimpl(this.f56398a);
    }

    public String toString() {
        return m3867toStringimpl(this.f56398a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3868unboximpl() {
        return this.f56398a;
    }
}
