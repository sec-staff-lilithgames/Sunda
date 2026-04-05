package ch;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f12310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f12311c;

    public f(g gVar, View view, View view2) {
        this.f12311c = gVar;
        this.f12309a = view;
        this.f12310b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f12311c.c(this.f12309a, this.f12310b, valueAnimator.getAnimatedFraction());
    }
}
