package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends jj {

    /* renamed from: jd, reason: collision with root package name */
    ObjectAnimator f18260jd;
    ObjectAnimator jpo;
    private int nmd;

    /* renamed from: rq, reason: collision with root package name */
    private boolean f18261rq;

    /* renamed from: tu, reason: collision with root package name */
    private Runnable f18262tu;

    public wqx(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        this.nmd = 0;
        this.f18261rq = false;
        this.f18262tu = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wqx.1
            @Override // java.lang.Runnable
            public void run() {
                wqx.this.jpo();
            }
        };
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nzb
    public void jd() {
        removeCallbacks(this.f18262tu);
        ObjectAnimator objectAnimator = this.jpo;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.jpo.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f18260jd;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllUpdateListeners();
            this.f18260jd.cancel();
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
        postDelayed(this.f18262tu, 2500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo() {
        final View childAt;
        final View childAt2 = getChildAt(this.nmd);
        if (childAt2 == null) {
            return;
        }
        int i10 = this.nmd;
        if (i10 == 0) {
            this.f18261rq = false;
        }
        if (i10 + 1 >= getChildCount() || ((ViewGroup) getChildAt(this.nmd + 1)).getChildCount() <= 0) {
            this.f18261rq = true;
            childAt = getChildAt(this.nmd - 1);
            this.jpo = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (getChildAt(this.nmd).getWidth() + this.f18242qk) / 2);
        } else {
            childAt = getChildAt(this.nmd + 1);
            this.jpo = ObjectAnimator.ofFloat(childAt2, "translationX", 0.0f, (-(getChildAt(this.nmd).getWidth() + this.f18242qk)) / 2);
        }
        if (childAt == null) {
            return;
        }
        this.jpo.setInterpolator(new LinearInterpolator());
        this.jpo.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wqx.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                childAt2.setVisibility(8);
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
        if (this.f18261rq) {
            this.f18260jd = ObjectAnimator.ofFloat(childAt, "translationX", (-(childAt.getWidth() + this.f18242qk)) / 2, 0.0f);
        } else {
            this.f18260jd = ObjectAnimator.ofFloat(childAt, "translationX", (childAt.getWidth() + this.f18242qk) / 2, 0.0f);
        }
        this.f18260jd.setInterpolator(new LinearInterpolator());
        this.f18260jd.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wqx.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                childAt.setVisibility(0);
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
        this.f18260jd.setDuration(500L);
        this.jpo.start();
        this.f18260jd.start();
        if (this.f18261rq) {
            this.nmd--;
        } else {
            this.nmd++;
        }
        postDelayed(this.f18262tu, 2000L);
    }
}
