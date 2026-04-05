package j2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69095a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69096b;

    public l(boolean z10, boolean z11) {
        this.f69095a = z10;
        this.f69096b = z11;
    }

    public final boolean isStrikethroughText() {
        return this.f69096b;
    }

    public final boolean isUnderlineText() {
        return this.f69095a;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        e0.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f69095a);
        textPaint.setStrikeThruText(this.f69096b);
    }
}
