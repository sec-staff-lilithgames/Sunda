package x3;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import x3.e3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2 f91679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f91680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f91681c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f91682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f91683e;

    public t2(s2 s2Var, e3 e3Var, e3 e3Var2, int i10, View view) {
        this.f91679a = s2Var;
        this.f91680b = e3Var;
        this.f91681c = e3Var2;
        this.f91682d = i10;
        this.f91683e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        s2 s2Var = this.f91679a;
        s2Var.setFraction(animatedFraction);
        float interpolatedFraction = s2Var.getInterpolatedFraction();
        PathInterpolator pathInterpolator = x2.f91704f;
        e3 e3Var = this.f91680b;
        e3.a aVar = new e3.a(e3Var);
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.f91682d & i10) == 0) {
                aVar.setInsets(i10, e3Var.getInsets(i10));
            } else {
                o3.c insets = e3Var.getInsets(i10);
                o3.c insets2 = this.f91681c.getInsets(i10);
                float f10 = 1.0f - interpolatedFraction;
                aVar.setInsets(i10, e3.a(insets, (int) (((insets.f77432a - insets2.f77432a) * f10) + 0.5d), (int) (((insets.f77433b - insets2.f77433b) * f10) + 0.5d), (int) (((insets.f77434c - insets2.f77434c) * f10) + 0.5d), (int) (((insets.f77435d - insets2.f77435d) * f10) + 0.5d)));
            }
        }
        x2.c(this.f91683e, aVar.build(), Collections.singletonList(s2Var));
    }
}
