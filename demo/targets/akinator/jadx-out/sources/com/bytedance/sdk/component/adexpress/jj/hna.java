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
public class hna extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private AnimatorSet f18432cm;

    /* renamed from: jd, reason: collision with root package name */
    private ImageView f18433jd;

    /* renamed from: jj, reason: collision with root package name */
    private TextView f18434jj;
    private Context jpo;
    private boolean my;
    private dt wqx;

    public hna(Context context) {
        super(context);
        this.my = true;
        this.jpo = context;
        this.f18432cm = new AnimatorSet();
        wqx();
        cm();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jj.hna.1
            @Override // java.lang.Runnable
            public void run() {
                int iJpo = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(hna.this.jpo, 50.0f);
                int iJpo2 = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(hna.this.jpo, 50.0f);
                if (hna.this.wqx.getMeasuredHeight() > 0) {
                    iJpo = hna.this.wqx.getMeasuredHeight();
                }
                if (hna.this.wqx.getMeasuredWidth() > 0) {
                    iJpo2 = hna.this.wqx.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) hna.this.f18433jd.getLayoutParams();
                layoutParams.topMargin = ((int) ((iJpo / 2.0f) - com.bytedance.sdk.component.adexpress.cm.qk.jpo(hna.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(hna.this.jpo, 40.0f));
                layoutParams.leftMargin = ((int) ((iJpo2 / 2.0f) - com.bytedance.sdk.component.adexpress.cm.qk.jpo(hna.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(hna.this.jpo, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.cm.qk.jpo(hna.this.getContext(), 5.0f) + ((-iJpo) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.cm.qk.jpo(hna.this.getContext(), 5.0f) + ((-iJpo2) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                hna.this.f18433jd.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.f18434jj.setVisibility(0);
        this.f18434jj.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.f18434jj.setTextColor(i10);
    }

    private void cm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f18433jd, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat.setDuration(600L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.jj.hna.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (hna.this.my) {
                    hna.this.wqx.jpo();
                }
                hna.this.my = !r2.my;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(hna.this.f18433jd, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(200L);
                objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat2.start();
                hna.this.f18433jd.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f18433jd, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        objectAnimatorOfFloat2.setDuration(600L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f18432cm.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void wqx() {
        this.wqx = new dt(this.jpo);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 50.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 40.0f);
        int iJpo = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 20.0f);
        layoutParams.leftMargin = iJpo;
        layoutParams.setMarginStart(iJpo);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.wqx, layoutParams);
        this.f18433jd = new ImageView(this.jpo);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 78.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 78.0f));
        this.f18433jd.setImageResource(com.bytedance.sdk.component.utils.dt.cm(this.jpo, "tt_splash_hand"));
        addView(this.f18433jd, layoutParams2);
        TextView textView = new TextView(this.jpo);
        this.f18434jj = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 10.0f);
        addView(this.f18434jj, layoutParams3);
        this.f18434jj.setVisibility(8);
    }

    public void jd() {
        AnimatorSet animatorSet = this.f18432cm;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        dt dtVar = this.wqx;
        if (dtVar != null) {
            dtVar.jd();
        }
        ImageView imageView = this.f18433jd;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void jpo() {
        this.f18432cm.start();
    }
}
