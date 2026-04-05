package h2;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f58660a;

    /* renamed from: b, reason: collision with root package name */
    public final int f58661b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58662c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f58663d;

    /* renamed from: e, reason: collision with root package name */
    public final int f58664e;

    /* renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f58665f;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f58666g;

    /* renamed from: h, reason: collision with root package name */
    public final int f58667h;

    /* renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f58668i;

    /* renamed from: j, reason: collision with root package name */
    public final int f58669j;

    /* renamed from: k, reason: collision with root package name */
    public final float f58670k;

    /* renamed from: l, reason: collision with root package name */
    public final float f58671l;

    /* renamed from: m, reason: collision with root package name */
    public final int f58672m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f58673n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f58674o;

    /* renamed from: p, reason: collision with root package name */
    public final int f58675p;

    /* renamed from: q, reason: collision with root package name */
    public final int f58676q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f58677r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f58678s;

    public t(CharSequence text, int i10, int i11, TextPaint paint, int i12, TextDirectionHeuristic textDir, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int[] iArr, int[] iArr2) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(paint, "paint");
        e0.checkNotNullParameter(textDir, "textDir");
        e0.checkNotNullParameter(alignment, "alignment");
        this.f58660a = text;
        this.f58661b = i10;
        this.f58662c = i11;
        this.f58663d = paint;
        this.f58664e = i12;
        this.f58665f = textDir;
        this.f58666g = alignment;
        this.f58667h = i13;
        this.f58668i = truncateAt;
        this.f58669j = i14;
        this.f58670k = f10;
        this.f58671l = f11;
        this.f58672m = i15;
        this.f58673n = z10;
        this.f58674o = z11;
        this.f58675p = i16;
        this.f58676q = i17;
        this.f58677r = iArr;
        this.f58678s = iArr2;
        if (i10 < 0 || i10 > i11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int length = text.length();
        if (i11 < 0 || i11 > length) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final Layout.Alignment getAlignment() {
        return this.f58666g;
    }

    public final int getBreakStrategy() {
        return this.f58675p;
    }

    public final TextUtils.TruncateAt getEllipsize() {
        return this.f58668i;
    }

    public final int getEllipsizedWidth() {
        return this.f58669j;
    }

    public final int getEnd() {
        return this.f58662c;
    }

    public final int getHyphenationFrequency() {
        return this.f58676q;
    }

    public final boolean getIncludePadding() {
        return this.f58673n;
    }

    public final int getJustificationMode() {
        return this.f58672m;
    }

    public final int[] getLeftIndents() {
        return this.f58677r;
    }

    public final float getLineSpacingExtra() {
        return this.f58671l;
    }

    public final float getLineSpacingMultiplier() {
        return this.f58670k;
    }

    public final int getMaxLines() {
        return this.f58667h;
    }

    public final TextPaint getPaint() {
        return this.f58663d;
    }

    public final int[] getRightIndents() {
        return this.f58678s;
    }

    public final int getStart() {
        return this.f58661b;
    }

    public final CharSequence getText() {
        return this.f58660a;
    }

    public final TextDirectionHeuristic getTextDir() {
        return this.f58665f;
    }

    public final boolean getUseFallbackLineSpacing() {
        return this.f58674o;
    }

    public final int getWidth() {
        return this.f58664e;
    }

    public /* synthetic */ t(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int[] iArr, int[] iArr2, int i18, kotlin.jvm.internal.u uVar) {
        this(charSequence, (i18 & 2) != 0 ? 0 : i10, i11, textPaint, i12, textDirectionHeuristic, alignment, i13, truncateAt, i14, f10, f11, i15, z10, z11, i16, i17, iArr, iArr2);
    }
}
