package e4;

import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n implements x3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NestedScrollView f53737a;

    public n(NestedScrollView nestedScrollView) {
        this.f53737a = nestedScrollView;
    }

    @Override // x3.r
    public float getScaledScrollFactor() {
        return -this.f53737a.getVerticalScrollFactorCompat();
    }

    @Override // x3.r
    public boolean startDifferentialMotionFling(float f10) {
        if (f10 == 0.0f) {
            return false;
        }
        stopDifferentialMotionFling();
        this.f53737a.fling((int) f10);
        return true;
    }

    @Override // x3.r
    public void stopDifferentialMotionFling() {
        this.f53737a.f5763f.abortAnimation();
    }
}
