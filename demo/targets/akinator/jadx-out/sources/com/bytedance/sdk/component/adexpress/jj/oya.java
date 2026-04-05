package com.bytedance.sdk.component.adexpress.jj;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private AnimatorSet f18472cm;

    /* renamed from: jd, reason: collision with root package name */
    private ImageView f18473jd;

    /* renamed from: jj, reason: collision with root package name */
    private TextView f18474jj;
    private Context jpo;
    private boolean my;
    private cm wqx;

    public oya(Context context) {
        super(context);
        this.my = true;
        this.jpo = context;
        this.f18472cm = new AnimatorSet();
        wqx();
        cm();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jj.oya.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oya.this.f18473jd.getLayoutParams();
                layoutParams.topMargin = ((int) ((oya.this.wqx.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.cm.qk.jpo(oya.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(oya.this.jpo, 20.0f));
                layoutParams.leftMargin = ((int) ((oya.this.wqx.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.cm.qk.jpo(oya.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(oya.this.jpo, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.cm.qk.jpo(oya.this.getContext(), 5.0f) + ((-oya.this.wqx.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.cm.qk.jpo(oya.this.getContext(), 5.0f) + ((-oya.this.wqx.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                oya.this.f18473jd.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.f18474jj.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.f18474jj.setTextColor(i10);
    }

    private void cm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f18473jd, "scaleX", 1.0f, 0.8f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.jj.oya.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (oya.this.my) {
                    oya.this.wqx.jpo();
                    oya.this.wqx.setAlpha(1.0f);
                } else {
                    oya.this.wqx.jd();
                    oya.this.wqx.setAlpha(0.0f);
                }
                oya.this.my = !r2.my;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(oya.this.f18473jd, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                oya.this.f18473jd.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f18473jd, "scaleY", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f18472cm.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void wqx() {
        this.wqx = new cm(this.jpo);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 80.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 20.0f);
        int iJpo = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 20.0f);
        layoutParams.leftMargin = iJpo;
        layoutParams.setMarginStart(iJpo);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.wqx, layoutParams);
        this.wqx.jpo();
        this.f18473jd = new ImageView(this.jpo);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 80.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 80.0f));
        this.f18473jd.setImageResource(com.bytedance.sdk.component.utils.dt.cm(this.jpo, "tt_splash_hand"));
        addView(this.f18473jd, layoutParams2);
        TextView textView = new TextView(this.jpo);
        this.f18474jj = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 10.0f);
        addView(this.f18474jj, layoutParams3);
    }

    public void jd() {
        AnimatorSet animatorSet = this.f18472cm;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        cm cmVar = this.wqx;
        if (cmVar != null) {
            cmVar.jd();
        }
    }

    public void jpo() {
        this.f18472cm.start();
    }
}
