package s4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f85439d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f85440a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f85441b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f85442c = 0;

    public r0(o0 o0Var, int i10) {
        this.f85441b = o0Var;
        this.f85440a = i10;
    }

    public final t4.e a() {
        ThreadLocal threadLocal = f85439d;
        t4.e eVar = (t4.e) threadLocal.get();
        if (eVar == null) {
            eVar = new t4.e();
            threadLocal.set(eVar);
        }
        this.f85441b.getMetadataList().list(eVar, this.f85440a);
        return eVar;
    }

    public void draw(Canvas canvas, float f10, float f11, Paint paint) {
        o0 o0Var = this.f85441b;
        Typeface typeface = o0Var.f85434d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(o0Var.getEmojiCharArray(), this.f85440a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface2);
    }

    public int getCodepointAt(int i10) {
        return a().codepoints(i10);
    }

    public int getCodepointsLength() {
        return a().codepointsLength();
    }

    public short getCompatAdded() {
        return a().compatAdded();
    }

    public int getHasGlyph() {
        return this.f85442c & 3;
    }

    public int getHeight() {
        return a().height();
    }

    public int getId() {
        return a().id();
    }

    public short getSdkAdded() {
        return a().sdkAdded();
    }

    public Typeface getTypeface() {
        return this.f85441b.f85434d;
    }

    public int getWidth() {
        return a().width();
    }

    public boolean isDefaultEmoji() {
        return a().emojiStyle();
    }

    public boolean isPreferredSystemRender() {
        return (this.f85442c & 4) > 0;
    }

    public void resetHasGlyphCache() {
        if (isPreferredSystemRender()) {
            this.f85442c = 4;
        } else {
            this.f85442c = 0;
        }
    }

    public void setExclusion(boolean z10) {
        int hasGlyph = getHasGlyph();
        if (z10) {
            this.f85442c = hasGlyph | 4;
        } else {
            this.f85442c = hasGlyph;
        }
    }

    public void setHasGlyph(boolean z10) {
        int i10 = this.f85442c & 4;
        this.f85442c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(getId()));
        sb2.append(", codepoints:");
        int codepointsLength = getCodepointsLength();
        for (int i10 = 0; i10 < codepointsLength; i10++) {
            sb2.append(Integer.toHexString(getCodepointAt(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
