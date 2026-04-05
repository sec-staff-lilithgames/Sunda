package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends jj {

    /* renamed from: jd, reason: collision with root package name */
    ObjectAnimator f18212jd;
    ObjectAnimator jpo;
    private int nmd;

    /* renamed from: rq, reason: collision with root package name */
    private Runnable f18213rq;

    public cm(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        this.nmd = 0;
        this.f18213rq = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cm.1
            @Override // java.lang.Runnable
            public void run() {
                cm.this.jpo();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nzb
    public void jd() {
        removeCallbacks(this.f18213rq);
        ObjectAnimator objectAnimator = this.jpo;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.jpo.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f18212jd;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f18212jd.cancel();
        }
        super.jd();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.topMargin = (this.xyk - layoutParams.height) / 2;
            childAt.setLayoutParams(layoutParams);
            if (i10 != 0) {
                childAt.setVisibility(8);
            }
        }
        postDelayed(this.f18213rq, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo() {
        final View childAt = getChildAt(this.nmd);
        final View childAt2 = getChildAt((this.nmd + 1) % getChildCount());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, "translationY", 0.0f, (-(getChildAt(this.nmd).getHeight() + this.xyk)) / 2);
        this.jpo = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.jpo.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cm.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt.setVisibility(8);
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
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt2, "translationY", (childAt2.getHeight() + this.xyk) / 2, 0.0f);
        this.f18212jd = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        this.f18212jd.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cm.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt2.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        this.jpo.setDuration(500L);
        this.f18212jd.setDuration(500L);
        this.jpo.start();
        this.f18212jd.start();
        int i10 = this.nmd + 1;
        this.nmd = i10;
        this.nmd = i10 % getChildCount();
        postDelayed(this.f18213rq, 2000L);
    }
}
