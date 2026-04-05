package hj;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup.LayoutParams f58942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f58943b;

    public d0(f0 f0Var, ViewGroup.LayoutParams layoutParams) {
        this.f58943b = f0Var;
        this.f58942a = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.f58942a;
        layoutParams.height = iIntValue;
        this.f58943b.f58950g.setLayoutParams(layoutParams);
    }
}
