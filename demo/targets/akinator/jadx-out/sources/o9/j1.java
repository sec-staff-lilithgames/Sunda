package o9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j1 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Animator f78250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f78251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Animator f78252c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f78253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta.i f78254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m1 f78255f;

    public j1(m1 m1Var, Animator animator, View view, Animator animator2, View view2, ta.i iVar) {
        this.f78255f = m1Var;
        this.f78250a = animator;
        this.f78251b = view;
        this.f78252c = animator2;
        this.f78253d = view2;
        this.f78254e = iVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        View view = this.f78251b;
        Animator animator2 = this.f78250a;
        animator2.setTarget(view);
        View view2 = this.f78253d;
        Animator animator3 = this.f78252c;
        animator3.setTarget(view2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new i1(this));
        animatorSet.play(animator2).with(animator3);
        animatorSet.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
