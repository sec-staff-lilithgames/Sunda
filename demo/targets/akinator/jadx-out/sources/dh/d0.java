package dh;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f52227a;

    public d0(TextInputLayout textInputLayout) {
        this.f52227a = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f52227a.f29514y0.setExpansionFraction(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
