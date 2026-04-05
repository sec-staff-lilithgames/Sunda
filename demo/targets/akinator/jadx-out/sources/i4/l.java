package i4;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class l {
    public int clampViewPositionHorizontal(View view, int i10, int i11) {
        return 0;
    }

    public int clampViewPositionVertical(View view, int i10, int i11) {
        return 0;
    }

    public int getViewHorizontalDragRange(View view) {
        return 0;
    }

    public int getViewVerticalDragRange(View view) {
        return 0;
    }

    public boolean onEdgeLock(int i10) {
        return false;
    }

    public abstract boolean tryCaptureView(View view, int i10);

    public int getOrderedChildIndex(int i10) {
        return i10;
    }

    public void onViewDragStateChanged(int i10) {
    }

    public void onEdgeDragStarted(int i10, int i11) {
    }

    public void onEdgeTouched(int i10, int i11) {
    }

    public void onViewCaptured(View view, int i10) {
    }

    public void onViewReleased(View view, float f10, float f11) {
    }

    public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
    }
}
