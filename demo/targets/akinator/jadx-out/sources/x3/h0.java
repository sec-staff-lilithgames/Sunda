package x3;

import android.view.MotionEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h0 {
    @Deprecated
    public static int findPointerIndex(MotionEvent motionEvent, int i10) {
        return motionEvent.findPointerIndex(i10);
    }

    @Deprecated
    public static int getActionIndex(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int getActionMasked(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static float getAxisValue(MotionEvent motionEvent, int i10) {
        return motionEvent.getAxisValue(i10);
    }

    @Deprecated
    public static int getButtonState(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    @Deprecated
    public static int getPointerCount(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    public static int getPointerId(MotionEvent motionEvent, int i10) {
        return motionEvent.getPointerId(i10);
    }

    @Deprecated
    public static int getSource(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    @Deprecated
    public static float getX(MotionEvent motionEvent, int i10) {
        return motionEvent.getX(i10);
    }

    @Deprecated
    public static float getY(MotionEvent motionEvent, int i10) {
        return motionEvent.getY(i10);
    }

    public static boolean isFromSource(MotionEvent motionEvent, int i10) {
        return (motionEvent.getSource() & i10) == i10;
    }

    @Deprecated
    public static float getAxisValue(MotionEvent motionEvent, int i10, int i11) {
        return motionEvent.getAxisValue(i10, i11);
    }
}
