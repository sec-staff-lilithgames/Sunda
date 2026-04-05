package g3;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f56931b = new e0();

    /* renamed from: a, reason: collision with root package name */
    public VelocityTracker f56932a;

    public static e0 obtain() {
        VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
        e0 e0Var = f56931b;
        e0Var.f56932a = velocityTrackerObtain;
        return e0Var;
    }

    @Override // g3.d0
    public void addMovement(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f56932a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
    }

    @Override // g3.d0
    public void clear() {
        VelocityTracker velocityTracker = this.f56932a;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
    }

    @Override // g3.d0
    public void computeCurrentVelocity(int i10) {
        VelocityTracker velocityTracker = this.f56932a;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(i10);
        }
    }

    @Override // g3.d0
    public float getXVelocity() {
        VelocityTracker velocityTracker = this.f56932a;
        if (velocityTracker != null) {
            return velocityTracker.getXVelocity();
        }
        return 0.0f;
    }

    @Override // g3.d0
    public float getYVelocity() {
        VelocityTracker velocityTracker = this.f56932a;
        if (velocityTracker != null) {
            return velocityTracker.getYVelocity();
        }
        return 0.0f;
    }

    @Override // g3.d0
    public void recycle() {
        VelocityTracker velocityTracker = this.f56932a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f56932a = null;
        }
    }

    @Override // g3.d0
    public void computeCurrentVelocity(int i10, float f10) {
        VelocityTracker velocityTracker = this.f56932a;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(i10, f10);
        }
    }

    @Override // g3.d0
    public float getXVelocity(int i10) {
        VelocityTracker velocityTracker = this.f56932a;
        if (velocityTracker != null) {
            return velocityTracker.getXVelocity(i10);
        }
        return 0.0f;
    }

    @Override // g3.d0
    public float getYVelocity(int i10) {
        if (this.f56932a != null) {
            return getYVelocity(i10);
        }
        return 0.0f;
    }
}
