package com.bytedance.sdk.component.adexpress.jj;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private AnimatorSet f18475cm;

    /* renamed from: jd, reason: collision with root package name */
    private ImageView f18476jd;
    private Context jpo;
    private boolean my;
    private dt wqx;

    public prr(Context context) {
        super(context);
        this.my = true;
        this.jpo = context;
        this.f18475cm = new AnimatorSet();
        wqx();
        cm();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jj.prr.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) prr.this.f18476jd.getLayoutParams();
                layoutParams.topMargin = (int) ((prr.this.wqx.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.cm.qk.jpo(prr.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((prr.this.wqx.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.cm.qk.jpo(prr.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.cm.qk.jpo(prr.this.getContext(), 5.0f) + ((-prr.this.wqx.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.cm.qk.jpo(prr.this.getContext(), 5.0f) + ((-prr.this.wqx.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                prr.this.f18476jd.setLayoutParams(layoutParams);
            }
        });
    }

    private void cm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f18476jd, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.jj.prr.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (prr.this.my) {
                    prr.this.wqx.jpo();
                }
                prr.this.my = !r2.my;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(prr.this.f18476jd, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat2.start();
                prr.this.f18476jd.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f18476jd, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(800L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f18475cm.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void wqx() {
        this.wqx = new dt(this.jpo);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 40.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.wqx, layoutParams);
        this.f18476jd = new ImageView(this.jpo);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 62.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 62.0f));
        layoutParams2.gravity = 16;
        this.f18476jd.setImageResource(com.bytedance.sdk.component.utils.dt.cm(this.jpo, "tt_splash_hand"));
        addView(this.f18476jd, layoutParams2);
    }

    public void jd() {
        AnimatorSet animatorSet = this.f18475cm;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        dt dtVar = this.wqx;
        if (dtVar != null) {
            dtVar.jd();
        }
        ImageView imageView = this.f18476jd;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void jpo() {
        this.f18475cm.start();
    }
}
