package um;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f88567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f88568b;

    public f(i iVar, h hVar) {
        this.f88568b = iVar;
        this.f88567a = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        h hVar = this.f88567a;
        i.b(fFloatValue, hVar);
        i iVar = this.f88568b;
        i.a(iVar, fFloatValue, hVar, false);
        iVar.invalidateSelf();
    }
}
