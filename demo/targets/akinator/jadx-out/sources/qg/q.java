package qg;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f83218a;

    /* renamed from: b, reason: collision with root package name */
    public final View f83219b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f83220c = new float[2];

    public q(View view, View view2) {
        this.f83218a = view;
        this.f83219b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.f83220c;
        kc.p.b(fFloatValue, fArr);
        View view = this.f83218a;
        if (view != null) {
            view.setAlpha(fArr[0]);
        }
        View view2 = this.f83219b;
        if (view2 != null) {
            view2.setAlpha(fArr[1]);
        }
    }
}
