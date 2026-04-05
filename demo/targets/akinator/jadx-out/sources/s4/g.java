package s4;

import android.text.TextPaint;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements m {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f85389b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f85390a;

    public g() {
        TextPaint textPaint = new TextPaint();
        this.f85390a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // s4.m
    public boolean hasGlyph(CharSequence charSequence, int i10, int i11, int i12) {
        ThreadLocal threadLocal = f85389b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb2 = (StringBuilder) threadLocal.get();
        sb2.setLength(0);
        while (i10 < i11) {
            sb2.append(charSequence.charAt(i10));
            i10++;
        }
        return o3.d.hasGlyph(this.f85390a, sb2.toString());
    }
}
