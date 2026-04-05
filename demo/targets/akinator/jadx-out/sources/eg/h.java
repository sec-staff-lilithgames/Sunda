package eg;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public float f54362a;

    /* renamed from: b, reason: collision with root package name */
    public float f54363b;

    public static float getChildMaskPercentage(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float getSmallItemSizeMax() {
        return this.f54363b;
    }

    public float getSmallItemSizeMin() {
        return this.f54362a;
    }

    public abstract k onFirstChildMeasuredWithMargins(b bVar, View view);

    public void setSmallItemSizeMax(float f10) {
        this.f54363b = f10;
    }

    public void setSmallItemSizeMin(float f10) {
        this.f54362a = f10;
    }

    public boolean shouldRefreshKeylineState(b bVar, int i10) {
        return false;
    }
}
