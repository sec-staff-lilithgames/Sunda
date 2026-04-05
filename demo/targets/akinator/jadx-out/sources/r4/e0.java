package r4;

import android.util.AndroidRuntimeException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 extends y {

    /* renamed from: t, reason: collision with root package name */
    public f0 f83747t;

    /* renamed from: u, reason: collision with root package name */
    public float f83748u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f83749v;

    public e0(b0 b0Var) {
        super(b0Var);
        this.f83747t = null;
        this.f83748u = Float.MAX_VALUE;
        this.f83749v = false;
    }

    public void animateToFinalPosition(float f10) {
        if (isRunning()) {
            this.f83748u = f10;
            return;
        }
        if (this.f83747t == null) {
            this.f83747t = new f0(f10);
        }
        this.f83747t.setFinalPosition(f10);
        start();
    }

    public boolean canSkipToEnd() {
        return this.f83747t.f83751b > 0.0d;
    }

    @Override // r4.y
    public void cancel() {
        super.cancel();
        float f10 = this.f83748u;
        if (f10 != Float.MAX_VALUE) {
            f0 f0Var = this.f83747t;
            if (f0Var == null) {
                this.f83747t = new f0(f10);
            } else {
                f0Var.setFinalPosition(f10);
            }
            this.f83748u = Float.MAX_VALUE;
        }
    }

    public f0 getSpring() {
        return this.f83747t;
    }

    public e0 setSpring(f0 f0Var) {
        this.f83747t = f0Var;
        return this;
    }

    public void skipToEnd() {
        if (!canSkipToEnd()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!((e) getAnimationHandler().f83739e).isCurrentThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f83774f) {
            this.f83749v = true;
        }
    }

    @Override // r4.y
    public void start() {
        f0 f0Var = this.f83747t;
        if (f0Var == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double finalPosition = f0Var.getFinalPosition();
        if (finalPosition > this.f83775g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (finalPosition < this.f83776h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        f0 f0Var2 = this.f83747t;
        double d10 = this.f83778j * 0.75f;
        f0Var2.getClass();
        double dAbs = Math.abs(d10);
        f0Var2.f83753d = dAbs;
        f0Var2.f83754e = dAbs * 62.5d;
        super.start();
    }

    public e0(b0 b0Var, float f10) {
        super(b0Var);
        this.f83747t = null;
        this.f83748u = Float.MAX_VALUE;
        this.f83749v = false;
        this.f83747t = new f0(f10);
    }

    public <K> e0(K k10, a0 a0Var) {
        super(k10, a0Var);
        this.f83747t = null;
        this.f83748u = Float.MAX_VALUE;
        this.f83749v = false;
    }

    public <K> e0(K k10, a0 a0Var, float f10) {
        super(k10, a0Var);
        this.f83747t = null;
        this.f83748u = Float.MAX_VALUE;
        this.f83749v = false;
        this.f83747t = new f0(f10);
    }
}
