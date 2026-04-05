package oa;

import android.animation.Animator;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuationImpl;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f78743a;

    public g(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f78743a = cancellableContinuationImpl;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator anim) {
        e0.checkNotNullParameter(anim, "anim");
        CancellableContinuationImpl cancellableContinuationImpl = this.f78743a;
        if (cancellableContinuationImpl.isActive()) {
            int i10 = z.f87419c;
            cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(x0.f87415a));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator anim) {
        e0.checkNotNullParameter(anim, "anim");
        CancellableContinuationImpl cancellableContinuationImpl = this.f78743a;
        if (cancellableContinuationImpl.isActive()) {
            int i10 = z.f87419c;
            cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(x0.f87415a));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator anim) {
        e0.checkNotNullParameter(anim, "anim");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator anim) {
        e0.checkNotNullParameter(anim, "anim");
    }
}
