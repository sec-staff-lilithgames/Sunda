package r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final i f83693b = new i(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f83694c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f83695d = 16;

    /* renamed from: e, reason: collision with root package name */
    public static final int f83696e = 17;

    /* renamed from: a, reason: collision with root package name */
    public final int f83697a;

    public /* synthetic */ j(int i10) {
        this.f83697a = i10;
    }

    public static final /* synthetic */ int access$getNone$cp() {
        return 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ j m6058boximpl(int i10) {
        return new j(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6059equalsimpl(int i10, Object obj) {
        return (obj instanceof j) && i10 == ((j) obj).m6065unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6060equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6061hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isTrimFirstLineTop-impl$ui_text_release, reason: not valid java name */
    public static final boolean m6062isTrimFirstLineTopimpl$ui_text_release(int i10) {
        return (i10 & 1) > 0;
    }

    /* renamed from: isTrimLastLineBottom-impl$ui_text_release, reason: not valid java name */
    public static final boolean m6063isTrimLastLineBottomimpl$ui_text_release(int i10) {
        return (i10 & 16) > 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6064toStringimpl(int i10) {
        return i10 == f83694c ? "LineHeightStyle.Trim.FirstLineTop" : i10 == f83695d ? "LineHeightStyle.Trim.LastLineBottom" : i10 == f83696e ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m6059equalsimpl(this.f83697a, obj);
    }

    public int hashCode() {
        return m6061hashCodeimpl(this.f83697a);
    }

    public String toString() {
        return m6064toStringimpl(this.f83697a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6065unboximpl() {
        return this.f83697a;
    }
}
