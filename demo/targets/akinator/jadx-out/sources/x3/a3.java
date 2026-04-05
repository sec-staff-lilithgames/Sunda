package x3;

import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import x3.s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a3 extends b3 {

    /* renamed from: f, reason: collision with root package name */
    public final WindowInsetsAnimation f91535f;

    public a3(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f91535f = windowInsetsAnimation;
    }

    public static WindowInsetsAnimation.Bounds createPlatformBounds(s2.a aVar) {
        y2.c();
        return y2.a(aVar.getLowerBound().toPlatformInsets(), aVar.getUpperBound().toPlatformInsets());
    }

    public static o3.c getHigherBounds(WindowInsetsAnimation.Bounds bounds) {
        return o3.c.toCompatInsets(bounds.getUpperBound());
    }

    public static o3.c getLowerBounds(WindowInsetsAnimation.Bounds bounds) {
        return o3.c.toCompatInsets(bounds.getLowerBound());
    }

    public static void setCallback(View view, s2.b bVar) {
        view.setWindowInsetsAnimationCallback(bVar != null ? new z2(bVar) : null);
    }

    @Override // x3.b3
    public float getAlpha() {
        return this.f91535f.getAlpha();
    }

    @Override // x3.b3
    public long getDurationMillis() {
        return this.f91535f.getDurationMillis();
    }

    @Override // x3.b3
    public float getFraction() {
        return this.f91535f.getFraction();
    }

    @Override // x3.b3
    public float getInterpolatedFraction() {
        return this.f91535f.getInterpolatedFraction();
    }

    @Override // x3.b3
    public Interpolator getInterpolator() {
        return this.f91535f.getInterpolator();
    }

    @Override // x3.b3
    public int getTypeMask() {
        return this.f91535f.getTypeMask();
    }

    @Override // x3.b3
    public void setAlpha(float f10) {
        this.f91535f.setAlpha(f10);
    }

    @Override // x3.b3
    public void setFraction(float f10) {
        this.f91535f.setFraction(f10);
    }
}
