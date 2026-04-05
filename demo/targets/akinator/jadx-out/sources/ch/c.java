package ch;

import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabLayout f12305a;

    public c(TabLayout tabLayout) {
        this.f12305a = tabLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f12305a.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }
}
