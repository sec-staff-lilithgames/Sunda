package com.fyber.inneractive.sdk.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatorSet f26740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f26741b;

    public d(FyberAdIdentifierLocal fyberAdIdentifierLocal, AnimatorSet animatorSet) {
        this.f26741b = fyberAdIdentifierLocal;
        this.f26740a = animatorSet;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f26741b;
        if (fyberAdIdentifierLocal.f26713o) {
            fyberAdIdentifierLocal.f26711m.setImageResource(R.drawable.ia_fyber_info_button);
            FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f26741b;
            FyberAdIdentifierLocal.a(fyberAdIdentifierLocal2.f26711m, fyberAdIdentifierLocal2.f26729g);
        } else {
            Bitmap bitmap = fyberAdIdentifierLocal.f26716r;
            if (bitmap != null) {
                fyberAdIdentifierLocal.f26711m.setImageBitmap(bitmap);
            } else {
                fyberAdIdentifierLocal.f26711m.setImageResource(R.drawable.ia_digital_turbine_logo);
            }
            FyberAdIdentifierLocal.a(this.f26741b.f26711m, null);
        }
        this.f26740a.start();
        this.f26741b.f26714p = this.f26740a;
    }
}
