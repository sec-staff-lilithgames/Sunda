package a2;

import android.graphics.Rect;
import androidx.activity.result.HM.OIPXcgrVyyxoLF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class f extends c {

    /* renamed from: f, reason: collision with root package name */
    public static f f3546f;

    /* renamed from: c, reason: collision with root package name */
    public g2.x1 f3549c;

    /* renamed from: d, reason: collision with root package name */
    public e2.c0 f3550d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3545e = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final r2.k f3547g = r2.k.f83699c;

    /* renamed from: h, reason: collision with root package name */
    public static final r2.k f3548h = r2.k.f83698b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final f getInstance() {
            if (f.f3546f == null) {
                f.f3546f = new f(null);
            }
            f fVar = f.f3546f;
            if (fVar != null) {
                return fVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
        }
    }

    public f(kotlin.jvm.internal.u uVar) {
        new Rect();
    }

    public final int c(int i10, r2.k kVar) {
        g2.x1 x1Var = this.f3549c;
        g2.x1 x1Var2 = null;
        if (x1Var == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
            x1Var = null;
        }
        int lineStart = x1Var.getLineStart(i10);
        g2.x1 x1Var3 = this.f3549c;
        if (x1Var3 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
            x1Var3 = null;
        }
        if (kVar != x1Var3.getParagraphDirection(lineStart)) {
            g2.x1 x1Var4 = this.f3549c;
            if (x1Var4 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
            } else {
                x1Var2 = x1Var4;
            }
            return x1Var2.getLineStart(i10);
        }
        g2.x1 x1Var5 = this.f3549c;
        if (x1Var5 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
            x1Var5 = null;
        }
        return g2.x1.getLineEnd$default(x1Var5, i10, false, 2, null) - 1;
    }

    @Override // a2.c, a2.h
    public int[] following(int i10) {
        int lineCount;
        g2.x1 x1Var = null;
        if (b().length() <= 0 || i10 >= b().length()) {
            return null;
        }
        try {
            e2.c0 c0Var = this.f3550d;
            if (c0Var == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("node");
                c0Var = null;
            }
            int iRoundToInt = mv.d.roundToInt(c0Var.getBoundsInRoot().getHeight());
            int iCoerceAtLeast = qv.v.coerceAtLeast(0, i10);
            g2.x1 x1Var2 = this.f3549c;
            if (x1Var2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                x1Var2 = null;
            }
            int lineForOffset = x1Var2.getLineForOffset(iCoerceAtLeast);
            g2.x1 x1Var3 = this.f3549c;
            if (x1Var3 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                x1Var3 = null;
            }
            float lineTop = x1Var3.getLineTop(lineForOffset) + iRoundToInt;
            g2.x1 x1Var4 = this.f3549c;
            if (x1Var4 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                x1Var4 = null;
            }
            g2.x1 x1Var5 = this.f3549c;
            if (x1Var5 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                x1Var5 = null;
            }
            if (lineTop < x1Var4.getLineTop(x1Var5.getLineCount() - 1)) {
                g2.x1 x1Var6 = this.f3549c;
                if (x1Var6 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    x1Var = x1Var6;
                }
                lineCount = x1Var.getLineForVerticalPosition(lineTop);
            } else {
                g2.x1 x1Var7 = this.f3549c;
                if (x1Var7 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    x1Var = x1Var7;
                }
                lineCount = x1Var.getLineCount();
            }
            return a(iCoerceAtLeast, c(lineCount - 1, f3548h) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // a2.c, a2.h
    public int[] preceding(int i10) {
        int lineForVerticalPosition;
        g2.x1 x1Var = null;
        if (b().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            e2.c0 c0Var = this.f3550d;
            if (c0Var == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("node");
                c0Var = null;
            }
            int iRoundToInt = mv.d.roundToInt(c0Var.getBoundsInRoot().getHeight());
            int iCoerceAtMost = qv.v.coerceAtMost(b().length(), i10);
            g2.x1 x1Var2 = this.f3549c;
            if (x1Var2 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                x1Var2 = null;
            }
            int lineForOffset = x1Var2.getLineForOffset(iCoerceAtMost);
            g2.x1 x1Var3 = this.f3549c;
            if (x1Var3 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                x1Var3 = null;
            }
            float lineTop = x1Var3.getLineTop(lineForOffset) - iRoundToInt;
            if (lineTop > 0.0f) {
                g2.x1 x1Var4 = this.f3549c;
                if (x1Var4 == null) {
                    kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    x1Var = x1Var4;
                }
                lineForVerticalPosition = x1Var.getLineForVerticalPosition(lineTop);
            } else {
                lineForVerticalPosition = 0;
            }
            if (iCoerceAtMost == b().length() && lineForVerticalPosition < lineForOffset) {
                lineForVerticalPosition++;
            }
            return a(c(lineForVerticalPosition, f3547g), iCoerceAtMost);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void initialize(String text, g2.x1 x1Var, e2.c0 node) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        kotlin.jvm.internal.e0.checkNotNullParameter(x1Var, OIPXcgrVyyxoLF.VTgfZwHZjchYsWw);
        kotlin.jvm.internal.e0.checkNotNullParameter(node, "node");
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "<set-?>");
        this.f3464a = text;
        this.f3549c = x1Var;
        this.f3550d = node;
    }
}
