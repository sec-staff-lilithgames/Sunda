package qg;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f83117a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f83118b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83119c;

    /* renamed from: e, reason: collision with root package name */
    public int f83121e;

    /* renamed from: l, reason: collision with root package name */
    public boolean f83128l;

    /* renamed from: n, reason: collision with root package name */
    public e0 f83130n;

    /* renamed from: d, reason: collision with root package name */
    public int f83120d = 0;

    /* renamed from: f, reason: collision with root package name */
    public Layout.Alignment f83122f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    public int f83123g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public float f83124h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f83125i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f83126j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f83127k = true;

    /* renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f83129m = null;

    public d0(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f83117a = charSequence;
        this.f83118b = textPaint;
        this.f83119c = i10;
        this.f83121e = charSequence.length();
    }

    public static d0 obtain(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new d0(charSequence, textPaint, i10);
    }

    public StaticLayout build() throws c0 {
        if (this.f83117a == null) {
            this.f83117a = "";
        }
        int iMax = Math.max(0, this.f83119c);
        CharSequence charSequenceEllipsize = this.f83117a;
        int i10 = this.f83123g;
        TextPaint textPaint = this.f83118b;
        if (i10 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f83129m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f83121e);
        this.f83121e = iMin;
        if (this.f83128l && this.f83123g == 1) {
            this.f83122f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f83120d, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f83122f);
        builderObtain.setIncludePad(this.f83127k);
        builderObtain.setTextDirection(this.f83128l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f83129m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f83123g);
        float f10 = this.f83124h;
        if (f10 != 0.0f || this.f83125i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f83125i);
        }
        if (this.f83123g > 1) {
            builderObtain.setHyphenationFrequency(this.f83126j);
        }
        e0 e0Var = this.f83130n;
        if (e0Var != null) {
            ((af.g) e0Var).configure(builderObtain);
        }
        return builderObtain.build();
    }

    public d0 setAlignment(Layout.Alignment alignment) {
        this.f83122f = alignment;
        return this;
    }

    public d0 setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f83129m = truncateAt;
        return this;
    }

    public d0 setEnd(int i10) {
        this.f83121e = i10;
        return this;
    }

    public d0 setHyphenationFrequency(int i10) {
        this.f83126j = i10;
        return this;
    }

    public d0 setIncludePad(boolean z10) {
        this.f83127k = z10;
        return this;
    }

    public d0 setIsRtl(boolean z10) {
        this.f83128l = z10;
        return this;
    }

    public d0 setLineSpacing(float f10, float f11) {
        this.f83124h = f10;
        this.f83125i = f11;
        return this;
    }

    public d0 setMaxLines(int i10) {
        this.f83123g = i10;
        return this;
    }

    public d0 setStart(int i10) {
        this.f83120d = i10;
        return this;
    }

    public d0 setStaticLayoutBuilderConfigurer(e0 e0Var) {
        this.f83130n = e0Var;
        return this;
    }
}
