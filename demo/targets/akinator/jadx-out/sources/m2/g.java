package m2;

import g2.a2;
import g2.b2;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f73913a;

    /* renamed from: b, reason: collision with root package name */
    public int f73914b;

    /* renamed from: c, reason: collision with root package name */
    public int f73915c;

    /* renamed from: d, reason: collision with root package name */
    public int f73916d;

    /* renamed from: e, reason: collision with root package name */
    public int f73917e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public g(g2.b bVar, long j10, kotlin.jvm.internal.u uVar) {
        this.f73913a = new a0(bVar.getText());
        this.f73914b = a2.m3958getMinimpl(j10);
        this.f73915c = a2.m3957getMaximpl(j10);
        this.f73916d = -1;
        this.f73917e = -1;
        int iM3958getMinimpl = a2.m3958getMinimpl(j10);
        int iM3957getMaximpl = a2.m3957getMaximpl(j10);
        if (iM3958getMinimpl < 0 || iM3958getMinimpl > bVar.length()) {
            StringBuilder sbT = o2.t(iM3958getMinimpl, "start (", ") offset is outside of text region ");
            sbT.append(bVar.length());
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (iM3957getMaximpl < 0 || iM3957getMaximpl > bVar.length()) {
            StringBuilder sbT2 = o2.t(iM3957getMaximpl, "end (", ") offset is outside of text region ");
            sbT2.append(bVar.length());
            throw new IndexOutOfBoundsException(sbT2.toString());
        }
        if (iM3958getMinimpl > iM3957getMaximpl) {
            throw new IllegalArgumentException(w0.i.a(iM3958getMinimpl, iM3957getMaximpl, "Do not set reversed range: ", " > "));
        }
    }

    public final void cancelComposition$ui_text_release() {
        replace$ui_text_release(this.f73916d, this.f73917e, "");
        this.f73916d = -1;
        this.f73917e = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.f73916d = -1;
        this.f73917e = -1;
    }

    public final void delete$ui_text_release(int i10, int i11) {
        long jTextRange = b2.TextRange(i10, i11);
        this.f73913a.replace(i10, i11, "");
        long jM5585updateRangeAfterDeletepWDy79M = h.m5585updateRangeAfterDeletepWDy79M(b2.TextRange(this.f73914b, this.f73915c), jTextRange);
        this.f73914b = a2.m3958getMinimpl(jM5585updateRangeAfterDeletepWDy79M);
        this.f73915c = a2.m3957getMaximpl(jM5585updateRangeAfterDeletepWDy79M);
        if (hasComposition$ui_text_release()) {
            long jM5585updateRangeAfterDeletepWDy79M2 = h.m5585updateRangeAfterDeletepWDy79M(b2.TextRange(this.f73916d, this.f73917e), jTextRange);
            if (a2.m3954getCollapsedimpl(jM5585updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text_release();
            } else {
                this.f73916d = a2.m3958getMinimpl(jM5585updateRangeAfterDeletepWDy79M2);
                this.f73917e = a2.m3957getMaximpl(jM5585updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final char get$ui_text_release(int i10) {
        return this.f73913a.get(i10);
    }

    /* renamed from: getComposition-MzsxiRA$ui_text_release, reason: not valid java name */
    public final a2 m5583getCompositionMzsxiRA$ui_text_release() {
        if (hasComposition$ui_text_release()) {
            return a2.m3948boximpl(b2.TextRange(this.f73916d, this.f73917e));
        }
        return null;
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.f73917e;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.f73916d;
    }

    public final int getCursor$ui_text_release() {
        int i10 = this.f73914b;
        int i11 = this.f73915c;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final int getLength$ui_text_release() {
        return this.f73913a.getLength();
    }

    /* renamed from: getSelection-d9O1mEE$ui_text_release, reason: not valid java name */
    public final long m5584getSelectiond9O1mEE$ui_text_release() {
        return b2.TextRange(this.f73914b, this.f73915c);
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.f73915c;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.f73914b;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.f73916d != -1;
    }

    public final void replace$ui_text_release(int i10, int i11, g2.b text) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        replace$ui_text_release(i10, i11, text.getText());
    }

    public final void setComposition$ui_text_release(int i10, int i11) {
        a0 a0Var = this.f73913a;
        if (i10 < 0 || i10 > a0Var.getLength()) {
            StringBuilder sbT = o2.t(i10, "start (", ") offset is outside of text region ");
            sbT.append(a0Var.getLength());
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i11 < 0 || i11 > a0Var.getLength()) {
            StringBuilder sbT2 = o2.t(i11, "end (", ") offset is outside of text region ");
            sbT2.append(a0Var.getLength());
            throw new IndexOutOfBoundsException(sbT2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(w0.i.a(i10, i11, "Do not set reversed or empty range: ", " > "));
        }
        this.f73916d = i10;
        this.f73917e = i11;
    }

    public final void setCursor$ui_text_release(int i10) {
        setSelection$ui_text_release(i10, i10);
    }

    public final void setSelection$ui_text_release(int i10, int i11) {
        a0 a0Var = this.f73913a;
        if (i10 < 0 || i10 > a0Var.getLength()) {
            StringBuilder sbT = o2.t(i10, "start (", ") offset is outside of text region ");
            sbT.append(a0Var.getLength());
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i11 < 0 || i11 > a0Var.getLength()) {
            StringBuilder sbT2 = o2.t(i11, "end (", ") offset is outside of text region ");
            sbT2.append(a0Var.getLength());
            throw new IndexOutOfBoundsException(sbT2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(w0.i.a(i10, i11, "Do not set reversed range: ", " > "));
        }
        this.f73914b = i10;
        this.f73915c = i11;
    }

    public final g2.b toAnnotatedString$ui_text_release() {
        return new g2.b(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.f73913a.toString();
    }

    public final void replace$ui_text_release(int i10, int i11, String text) {
        kotlin.jvm.internal.e0.checkNotNullParameter(text, "text");
        a0 a0Var = this.f73913a;
        if (i10 < 0 || i10 > a0Var.getLength()) {
            StringBuilder sbT = o2.t(i10, "start (", ") offset is outside of text region ");
            sbT.append(a0Var.getLength());
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i11 < 0 || i11 > a0Var.getLength()) {
            StringBuilder sbT2 = o2.t(i11, "end (", ") offset is outside of text region ");
            sbT2.append(a0Var.getLength());
            throw new IndexOutOfBoundsException(sbT2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(w0.i.a(i10, i11, "Do not set reversed range: ", " > "));
        }
        a0Var.replace(i10, i11, text);
        this.f73914b = text.length() + i10;
        this.f73915c = text.length() + i10;
        this.f73916d = -1;
        this.f73917e = -1;
    }

    public g(String str, long j10, kotlin.jvm.internal.u uVar) {
        this(new g2.b(str, null, null, 6, null), j10, (kotlin.jvm.internal.u) null);
    }
}
