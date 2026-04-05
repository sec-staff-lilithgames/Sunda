package androidx.recyclerview.widget;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public int f7223b;

    /* renamed from: c, reason: collision with root package name */
    public int f7224c;

    /* renamed from: e, reason: collision with root package name */
    public OverScroller f7225e;

    /* renamed from: f, reason: collision with root package name */
    public Interpolator f7226f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7227g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7228h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7229i;

    public q2(RecyclerView recyclerView) {
        this.f7229i = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f7226f = interpolator;
        this.f7227g = false;
        this.f7228h = false;
        this.f7225e = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void a() {
        if (this.f7227g) {
            this.f7228h = true;
            return;
        }
        RecyclerView recyclerView = this.f7229i;
        recyclerView.removeCallbacks(this);
        x3.z1.postOnAnimation(recyclerView, this);
    }

    public void fling(int i10, int i11) {
        RecyclerView recyclerView = this.f7229i;
        recyclerView.setScrollState(2);
        this.f7224c = 0;
        this.f7223b = 0;
        Interpolator interpolator = this.f7226f;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f7226f = interpolator2;
            this.f7225e = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f7225e.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        a();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        RecyclerView recyclerView = this.f7229i;
        if (recyclerView.mLayout == null) {
            stop();
            return;
        }
        this.f7228h = false;
        this.f7227g = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f7225e;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.f7223b;
            int i15 = currY - this.f7224c;
            this.f7223b = currX;
            this.f7224c = currY;
            int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i14);
            int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i15);
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                iConsumeFlingInHorizontalStretch -= iArr2[0];
                iConsumeFlingInVerticalStretch -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i16 = iArr4[0];
                int i17 = iArr4[1];
                int i18 = iConsumeFlingInHorizontalStretch - i16;
                int i19 = iConsumeFlingInVerticalStretch - i17;
                RecyclerView.k kVar = recyclerView.mLayout.mSmoothScroller;
                if (kVar != null && !kVar.isPendingInitialRun() && kVar.isRunning()) {
                    int itemCount = recyclerView.mState.getItemCount();
                    if (itemCount == 0) {
                        kVar.stop();
                    } else if (kVar.getTargetPosition() >= itemCount) {
                        kVar.setTargetPosition(itemCount - 1);
                        kVar.onAnimation(i16, i17);
                    } else {
                        kVar.onAnimation(i16, i17);
                    }
                }
                i10 = i18;
                i12 = i16;
                i11 = i19;
                i13 = i17;
            } else {
                i10 = iConsumeFlingInHorizontalStretch;
                i11 = iConsumeFlingInVerticalStretch;
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i12, i13, i10, i11, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i20 = i10 - iArr6[0];
            int i21 = i11 - iArr6[1];
            if (i12 != 0 || i13 != 0) {
                recyclerView.dispatchOnScrolled(i12, i13);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i20 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i21 != 0));
            RecyclerView.k kVar2 = recyclerView.mLayout.mSmoothScroller;
            if ((kVar2 == null || !kVar2.isPendingInitialRun()) && z10) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i22 = i20 < 0 ? -currVelocity : i20 > 0 ? currVelocity : 0;
                    if (i21 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i21 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i22, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    u0 u0Var = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = u0Var.f7280c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    u0Var.f7281d = 0;
                }
            } else {
                a();
                w0 w0Var = recyclerView.mGapWorker;
                if (w0Var != null) {
                    w0Var.a(recyclerView, i12, i13);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                a2.setFrameContentVelocity(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        RecyclerView.k kVar3 = recyclerView.mLayout.mSmoothScroller;
        if (kVar3 != null && kVar3.isPendingInitialRun()) {
            kVar3.onAnimation(0, 0);
        }
        this.f7227g = false;
        if (this.f7228h) {
            recyclerView.removeCallbacks(this);
            x3.z1.postOnAnimation(recyclerView, this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        }
    }

    public void smoothScrollBy(int i10, int i11, int i12, Interpolator interpolator) {
        RecyclerView recyclerView = this.f7229i;
        if (i12 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            i12 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i13 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f7226f != interpolator) {
            this.f7226f = interpolator;
            this.f7225e = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f7224c = 0;
        this.f7223b = 0;
        recyclerView.setScrollState(2);
        this.f7225e.startScroll(0, 0, i10, i11, i13);
        a();
    }

    public void stop() {
        this.f7229i.removeCallbacks(this);
        this.f7225e.abortAnimation();
    }
}
