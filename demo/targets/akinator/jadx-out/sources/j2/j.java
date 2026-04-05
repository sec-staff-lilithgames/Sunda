package j2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f69090a;

    /* renamed from: b, reason: collision with root package name */
    public final float f69091b;

    /* renamed from: c, reason: collision with root package name */
    public final float f69092c;

    /* renamed from: d, reason: collision with root package name */
    public final float f69093d;

    public j(int i10, float f10, float f11, float f12) {
        this.f69090a = i10;
        this.f69091b = f10;
        this.f69092c = f11;
        this.f69093d = f12;
    }

    public final int getColor() {
        return this.f69090a;
    }

    public final float getOffsetX() {
        return this.f69091b;
    }

    public final float getOffsetY() {
        return this.f69092c;
    }

    public final float getRadius() {
        return this.f69093d;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp2) {
        e0.checkNotNullParameter(tp2, "tp");
        tp2.setShadowLayer(this.f69093d, this.f69091b, this.f69092c, this.f69090a);
    }
}
