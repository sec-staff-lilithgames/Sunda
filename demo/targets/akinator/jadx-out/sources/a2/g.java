package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3582c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static g f3583d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final g getInstance() {
            if (g.f3583d == null) {
                g.f3583d = new g(null);
            }
            g gVar = g.f3583d;
            if (gVar != null) {
                return gVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
        }
    }

    public g(kotlin.jvm.internal.u uVar) {
    }

    public final boolean c(int i10) {
        if (i10 <= 0 || b().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == b().length() || b().charAt(i10) == '\n';
    }

    @Override // a2.c, a2.h
    public int[] following(int i10) {
        int length = b().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && b().charAt(i10) == '\n' && (b().charAt(i10) == '\n' || (i10 != 0 && b().charAt(i10 - 1) != '\n'))) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !c(i11)) {
            i11++;
        }
        return a(i10, i11);
    }

    @Override // a2.c, a2.h
    public int[] preceding(int i10) {
        int length = b().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && b().charAt(i10 - 1) == '\n' && !c(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && (b().charAt(i11) == '\n' || (i11 != 0 && b().charAt(i11 - 1) != '\n'))) {
            i11--;
        }
        return a(i11, i10);
    }
}
