package j2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements LineHeightSpan {

    /* renamed from: b, reason: collision with root package name */
    public final float f69068b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69069c;

    /* renamed from: e, reason: collision with root package name */
    public final int f69070e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f69071f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f69072g;

    /* renamed from: h, reason: collision with root package name */
    public final int f69073h;

    /* renamed from: i, reason: collision with root package name */
    public int f69074i;

    /* renamed from: j, reason: collision with root package name */
    public int f69075j;

    /* renamed from: k, reason: collision with root package name */
    public int f69076k;

    /* renamed from: l, reason: collision with root package name */
    public int f69077l;

    /* renamed from: m, reason: collision with root package name */
    public int f69078m;

    /* renamed from: n, reason: collision with root package name */
    public int f69079n;

    public f(float f10, int i10, int i11, boolean z10, boolean z11, int i12) {
        this.f69068b = f10;
        this.f69069c = i10;
        this.f69070e = i11;
        this.f69071f = z10;
        this.f69072g = z11;
        this.f69073h = i12;
        if ((i12 < 0 || i12 >= 101) && i12 != -1) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        if (g.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z10 = i10 == this.f69069c;
        boolean z11 = i11 == this.f69070e;
        boolean z12 = this.f69072g;
        boolean z13 = this.f69071f;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (z10) {
            int iCeil = (int) Math.ceil(this.f69068b);
            int iLineHeight = iCeil - g.lineHeight(fontMetricsInt);
            int iAbs = this.f69073h;
            if (iAbs == -1) {
                iAbs = (int) ((Math.abs(fontMetricsInt.ascent) / g.lineHeight(fontMetricsInt)) * 100.0f);
            }
            int iCeil2 = (int) (iLineHeight <= 0 ? Math.ceil((iLineHeight * iAbs) / 100.0f) : Math.ceil(((100 - iAbs) * iLineHeight) / 100.0f));
            int i14 = fontMetricsInt.descent;
            int i15 = iCeil2 + i14;
            this.f69076k = i15;
            int i16 = i15 - iCeil;
            this.f69075j = i16;
            if (z13) {
                i16 = fontMetricsInt.ascent;
            }
            this.f69074i = i16;
            if (z12) {
                i15 = i14;
            }
            this.f69077l = i15;
            this.f69078m = fontMetricsInt.ascent - i16;
            this.f69079n = i15 - i14;
        }
        fontMetricsInt.ascent = z10 ? this.f69074i : this.f69075j;
        fontMetricsInt.descent = z11 ? this.f69077l : this.f69076k;
    }

    public final int getFirstAscentDiff() {
        return this.f69078m;
    }

    public final int getLastDescentDiff() {
        return this.f69079n;
    }

    public final float getLineHeight() {
        return this.f69068b;
    }
}
