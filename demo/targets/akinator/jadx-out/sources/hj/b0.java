package hj;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class b0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f58932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f58933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f58934c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f58935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f58936e;

    public b0(f0 f0Var, float f10, float f11, float f12, float f13) {
        this.f58936e = f0Var;
        this.f58932a = f10;
        this.f58933b = f11;
        this.f58934c = f12;
        this.f58935d = f13;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = (valueAnimator.getAnimatedFraction() * this.f58933b) + this.f58932a;
        float animatedFraction2 = (valueAnimator.getAnimatedFraction() * this.f58935d) + this.f58934c;
        f0 f0Var = this.f58936e;
        f0Var.c(animatedFraction);
        f0Var.f58950g.setAlpha(animatedFraction2);
    }
}
