package io.odeeo.internal.w1;

import android.animation.ValueAnimator;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public ValueAnimator f67453a;

    public static final void a(kv.l updateAction, ValueAnimator animation) {
        e0.checkNotNullParameter(updateAction, "$updateAction");
        e0.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        updateAction.invoke((Float) animatedValue);
    }

    public final void setSmoothProgress(float f10, long j10, kv.l updateAction) {
        ValueAnimator valueAnimator;
        e0.checkNotNullParameter(updateAction, "updateAction");
        ValueAnimator valueAnimator2 = this.f67453a;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.f67453a) != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator3 = this.f67453a;
        Object animatedValue = valueAnimator3 == null ? null : valueAnimator3.getAnimatedValue();
        Float f11 = animatedValue instanceof Float ? (Float) animatedValue : null;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11 == null ? 0.0f : f11.floatValue(), f10);
        this.f67453a = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(j10 / 100);
        }
        ValueAnimator valueAnimator4 = this.f67453a;
        if (valueAnimator4 != null) {
            valueAnimator4.addUpdateListener(new com.google.android.exoplayer2.ui.g(updateAction, 3));
        }
        ValueAnimator valueAnimator5 = this.f67453a;
        if (valueAnimator5 == null) {
            return;
        }
        valueAnimator5.start();
    }
}
