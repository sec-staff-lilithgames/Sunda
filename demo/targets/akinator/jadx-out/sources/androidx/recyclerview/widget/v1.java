package androidx.recyclerview.widget;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v1 implements x3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7292a;

    public v1(RecyclerView recyclerView) {
        this.f7292a = recyclerView;
    }

    @Override // x3.r
    public float getScaledScrollFactor() {
        float f10;
        RecyclerView recyclerView = this.f7292a;
        if (recyclerView.mLayout.canScrollVertically()) {
            f10 = recyclerView.mScaledVerticalScrollFactor;
        } else {
            if (!recyclerView.mLayout.canScrollHorizontally()) {
                return 0.0f;
            }
            f10 = recyclerView.mScaledHorizontalScrollFactor;
        }
        return -f10;
    }

    @Override // x3.r
    public boolean startDifferentialMotionFling(float f10) {
        int i10;
        int i11;
        RecyclerView recyclerView = this.f7292a;
        if (recyclerView.mLayout.canScrollVertically()) {
            i11 = (int) f10;
            i10 = 0;
        } else if (recyclerView.mLayout.canScrollHorizontally()) {
            i10 = (int) f10;
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        recyclerView.stopScroll();
        return recyclerView.flingNoThresholdCheck(i10, i11);
    }

    @Override // x3.r
    public void stopDifferentialMotionFling() {
        this.f7292a.stopScroll();
    }
}
