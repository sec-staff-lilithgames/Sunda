package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f7205b;

    public o0(s0 s0Var) {
        this.f7205b = s0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        s0 s0Var = this.f7205b;
        ValueAnimator valueAnimator = s0Var.f7265z;
        int i10 = s0Var.A;
        if (i10 == 1) {
            valueAnimator.cancel();
        } else if (i10 != 2) {
            return;
        }
        s0Var.A = 3;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        valueAnimator.setDuration(500);
        valueAnimator.start();
    }
}
