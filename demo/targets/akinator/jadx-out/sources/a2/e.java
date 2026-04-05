package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: e, reason: collision with root package name */
    public static e f3525e;

    /* renamed from: c, reason: collision with root package name */
    public g2.x1 f3528c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f3524d = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final r2.k f3526f = r2.k.f83699c;

    /* renamed from: g, reason: collision with root package name */
    public static final r2.k f3527g = r2.k.f83698b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final e getInstance() {
            if (e.f3525e == null) {
                e.f3525e = new e(null);
            }
            e eVar = e.f3525e;
            if (eVar != null) {
                return eVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
        }
    }

    public e(kotlin.jvm.internal.u uVar) {
    }

    public final int c(int i10, r2.k kVar) {
        g2.x1 x1Var = this.f3528c;
        g2.x1 x1Var2 = null;
        if (x1Var == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
            x1Var = null;
        }
        int lineStart = x1Var.getLineStart(i10);
        g2.x1 x1Var3 = this.f3528c;
        if (x1Var3 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
            x1Var3 = null;
        }
        if (kVar != x1Var3.getParagraphDirection(lineStart)) {
            g2.x1 x1Var4 = this.f3528c;
            if (x1Var4 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
            } else {
                x1Var2 = x1Var4;
            }
            return x1Var2.getLineStart(i10);
        }
        g2.x1 x1Var5 = this.f3528c;
        if (x1Var5 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
            x1Var5 = null;
        }
        return g2.x1.getLineEnd$default(x1Var5, i10, false, 2, null) - 1;
    }

    @Override // a2.c, a2.h
    public int[] following(int i10) {
        int lineForOffset;
        if (b().length() <= 0 || i10 >= b().length()) {
            return null;
        }
        r2.k kVar = f3526f;
        if (i10 < 0) {
            g2.x1 x1Var = this.f3528c;
            if (x1Var == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                x1Var = null;
            }
            lineForOffset = x1Var.getLineForOffset(0);
        } else {
            g2.x1 x1Var2 = this.f3528c;
            if (x1Var2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                x1Var2 = null;
            }
            int lineForOffset2 = x1Var2.getLineForOffset(i10);
            lineForOffset = c(lineForOffset2, kVar) == i10 ? lineForOffset2 : lineForOffset2 + 1;
        }
        g2.x1 x1Var3 = this.f3528c;
        if (x1Var3 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
            x1Var3 = null;
        }
        if (lineForOffset >= x1Var3.getLineCount()) {
            return null;
        }
        return a(c(lineForOffset, kVar), c(lineForOffset, f3527g) + 1);
    }

    public final void initialize(String text, g2.x1 layoutResult) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutResult, "layoutResult");
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "<set-?>");
        this.f3464a = text;
        this.f3528c = layoutResult;
    }

    @Override // a2.c, a2.h
    public int[] preceding(int i10) {
        int lineForOffset;
        if (b().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = b().length();
        r2.k kVar = f3527g;
        if (i10 > length) {
            g2.x1 x1Var = this.f3528c;
            if (x1Var == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                x1Var = null;
            }
            lineForOffset = x1Var.getLineForOffset(b().length());
        } else {
            g2.x1 x1Var2 = this.f3528c;
            if (x1Var2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                x1Var2 = null;
            }
            int lineForOffset2 = x1Var2.getLineForOffset(i10);
            lineForOffset = c(lineForOffset2, kVar) + 1 == i10 ? lineForOffset2 : lineForOffset2 - 1;
        }
        if (lineForOffset < 0) {
            return null;
        }
        return a(c(lineForOffset, f3526f), c(lineForOffset, kVar) + 1);
    }
}
