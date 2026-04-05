package da;

import android.animation.ValueAnimator;
import com.digidust.elokence.akinator.graphic.AkinatorLoadingBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AkinatorLoadingBar f51953b;

    public b(AkinatorLoadingBar akinatorLoadingBar, int i10) {
        this.f51953b = akinatorLoadingBar;
        this.f51952a = i10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        AkinatorLoadingBar akinatorLoadingBar = this.f51953b;
        akinatorLoadingBar.f21752f[this.f51952a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        akinatorLoadingBar.postInvalidate();
    }
}
