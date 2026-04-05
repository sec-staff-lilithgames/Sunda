package g3;

import android.view.MotionEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface d0 {
    void addMovement(MotionEvent motionEvent);

    void clear();

    void computeCurrentVelocity(int i10);

    void computeCurrentVelocity(int i10, float f10);

    float getXVelocity();

    float getXVelocity(int i10);

    float getYVelocity();

    float getYVelocity(int i10);

    void recycle();
}
