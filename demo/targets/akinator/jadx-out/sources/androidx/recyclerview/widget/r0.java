package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f7231a;

    public r0(s0 s0Var) {
        this.f7231a = s0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        s0 s0Var = this.f7231a;
        s0Var.f7242c.setAlpha(iFloatValue);
        s0Var.f7243d.setAlpha(iFloatValue);
        s0Var.f7258s.invalidate();
    }
}
