package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pg.c f29275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton.b f29276c;

    public a(pg.c cVar, ExtendedFloatingActionButton.b bVar) {
        this.f29275b = cVar;
        this.f29276c = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f29274a = true;
        this.f29275b.onAnimationCancel();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        pg.c cVar = this.f29275b;
        cVar.onAnimationEnd();
        if (this.f29274a) {
            return;
        }
        cVar.onChange(this.f29276c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f29275b.onAnimationStart(animator);
        this.f29274a = false;
    }
}
