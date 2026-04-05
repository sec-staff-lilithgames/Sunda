package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f57690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f57691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f57692c;

    public c(boolean z10, View view, View view2) {
        this.f57690a = z10;
        this.f57691b = view;
        this.f57692c = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f57690a) {
            return;
        }
        this.f57691b.setVisibility(4);
        View view = this.f57692c;
        view.setAlpha(1.0f);
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (this.f57690a) {
            this.f57691b.setVisibility(0);
            View view = this.f57692c;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
