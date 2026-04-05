package g3;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public float f56948a = Float.NaN;

    /* renamed from: b, reason: collision with root package name */
    public float f56949b = Float.NaN;

    /* renamed from: c, reason: collision with root package name */
    public int f56950c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f56951d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f56952e;

    public f0(i0 i0Var) {
        this.f56952e = i0Var;
    }

    public final void a() {
        int i10 = this.f56950c;
        i0 i0Var = this.f56952e;
        if (i10 != -1 || this.f56951d != -1) {
            if (i10 == -1) {
                i0Var.transitionToState(this.f56951d);
            } else {
                int i11 = this.f56951d;
                if (i11 == -1) {
                    i0Var.setState(i10, -1, -1);
                } else {
                    i0Var.setTransition(i10, i11);
                }
            }
            i0Var.setState(h0.f56974c);
        }
        if (Float.isNaN(this.f56949b)) {
            if (Float.isNaN(this.f56948a)) {
                return;
            }
            i0Var.setProgress(this.f56948a);
        } else {
            i0Var.setProgress(this.f56948a, this.f56949b);
            this.f56948a = Float.NaN;
            this.f56949b = Float.NaN;
            this.f56950c = -1;
            this.f56951d = -1;
        }
    }

    public Bundle getTransitionState() {
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", this.f56948a);
        bundle.putFloat("motion.velocity", this.f56949b);
        bundle.putInt("motion.StartState", this.f56950c);
        bundle.putInt("motion.EndState", this.f56951d);
        return bundle;
    }

    public void recordState() {
        i0 i0Var = this.f56952e;
        this.f56951d = i0Var.f56995i;
        this.f56950c = i0Var.f56991g;
        this.f56949b = i0Var.getVelocity();
        this.f56948a = i0Var.getProgress();
    }

    public void setEndState(int i10) {
        this.f56951d = i10;
    }

    public void setProgress(float f10) {
        this.f56948a = f10;
    }

    public void setStartState(int i10) {
        this.f56950c = i10;
    }

    public void setTransitionState(Bundle bundle) {
        this.f56948a = bundle.getFloat("motion.progress");
        this.f56949b = bundle.getFloat("motion.velocity");
        this.f56950c = bundle.getInt("motion.StartState");
        this.f56951d = bundle.getInt("motion.EndState");
    }

    public void setVelocity(float f10) {
        this.f56949b = f10;
    }
}
