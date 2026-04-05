package r2;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final f f83684b = new f(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f83685c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f83686d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f83687e;

    /* renamed from: a, reason: collision with root package name */
    public final int f83688a;

    static {
        a(0);
        a(50);
        f83685c = 50;
        a(-1);
        f83686d = -1;
        a(100);
        f83687e = 100;
    }

    public /* synthetic */ g(int i10) {
        this.f83688a = i10;
    }

    public static void a(int i10) {
        if ((i10 < 0 || i10 >= 101) && i10 != -1) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1");
        }
    }

    public static final /* synthetic */ int access$getTop$cp() {
        return 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ g m6046boximpl(int i10) {
        return new g(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6047equalsimpl(int i10, Object obj) {
        return (obj instanceof g) && i10 == ((g) obj).m6051unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6048equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6049hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6050toStringimpl(int i10) {
        return i10 == 0 ? "LineHeightStyle.Alignment.Top" : i10 == f83685c ? "LineHeightStyle.Alignment.Center" : i10 == f83686d ? "LineHeightStyle.Alignment.Proportional" : i10 == f83687e ? "LineHeightStyle.Alignment.Bottom" : e2.h(')', "LineHeightStyle.Alignment(topPercentage = ", i10);
    }

    public boolean equals(Object obj) {
        return m6047equalsimpl(this.f83688a, obj);
    }

    public int hashCode() {
        return m6049hashCodeimpl(this.f83688a);
    }

    public String toString() {
        return m6050toStringimpl(this.f83688a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6051unboximpl() {
        return this.f83688a;
    }
}
