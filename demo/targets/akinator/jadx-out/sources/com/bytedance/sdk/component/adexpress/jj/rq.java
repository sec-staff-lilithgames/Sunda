package com.bytedance.sdk.component.adexpress.jj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class rq extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private ImageView f18478cm;

    /* renamed from: jd, reason: collision with root package name */
    private ImageView f18479jd;

    /* renamed from: jj, reason: collision with root package name */
    private AnimatorSet f18480jj;
    private Context jpo;
    private TextView my;

    /* renamed from: qk, reason: collision with root package name */
    private AnimatorSet f18481qk;
    private ImageView wqx;
    private AnimatorSet xyk;
    private AnimatorSet zz;

    public rq(Context context) {
        super(context);
        this.f18480jj = new AnimatorSet();
        this.f18481qk = new AnimatorSet();
        this.xyk = new AnimatorSet();
        this.zz = new AnimatorSet();
        this.jpo = context;
        wqx();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void setGuideText(String str) {
        this.my.setText(str);
    }

    private void cm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f18479jd, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.wqx, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.wqx, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f18478cm, "alpha", 0.0f, 1.0f);
        this.xyk.setDuration(300L);
        this.xyk.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f18479jd, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), 90.0f));
        objectAnimatorOfFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), 90.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.jj.rq.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rq.this.f18478cm.getLayoutParams();
                layoutParams.width = num.intValue();
                rq.this.f18478cm.setLayoutParams(layoutParams);
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.wqx, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), 90.0f));
        objectAnimatorOfFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.zz.setDuration(1500L);
        this.zz.playTogether(objectAnimatorOfFloat5, valueAnimatorOfInt, objectAnimatorOfFloat6);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f18479jd, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f18478cm, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.wqx, "alpha", 1.0f, 0.0f);
        this.f18481qk.setDuration(50L);
        this.f18481qk.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, objectAnimatorOfFloat9);
        this.f18480jj.playSequentially(this.xyk, this.zz, this.f18481qk);
    }

    private void wqx() {
        ImageView imageView = new ImageView(this.jpo);
        this.f18478cm = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.dt.cm(this.jpo, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 30.0f);
        addView(this.f18478cm, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.jpo);
        this.wqx = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.dt.cm(this.jpo, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 50.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 30.0f);
        addView(this.wqx, layoutParams2);
        ImageView imageView3 = new ImageView(this.jpo);
        this.f18479jd = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.dt.cm(this.jpo, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 80.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 30.0f);
        addView(this.f18479jd, layoutParams3);
        TextView textView = new TextView(this.jpo);
        this.my = textView;
        textView.setTextColor(-1);
        this.my.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.my, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jj.rq.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) rq.this.f18479jd.getLayoutParams();
                layoutParams5.topMargin = (int) ((rq.this.wqx.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.cm.qk.jpo(rq.this.getContext(), 7.0f));
                int iJpo = (-rq.this.wqx.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(rq.this.jpo, 30.0f));
                layoutParams5.leftMargin = iJpo;
                layoutParams5.setMarginStart(iJpo);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                rq.this.f18479jd.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) rq.this.f18478cm.getLayoutParams();
                layoutParams6.topMargin = (int) ((rq.this.wqx.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.cm.qk.jpo(rq.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((rq.this.wqx.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(rq.this.jpo, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                rq.this.f18478cm.setLayoutParams(layoutParams6);
            }
        });
    }

    public void jd() {
        try {
            AnimatorSet animatorSet = this.f18480jj;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.xyk;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.zz;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.f18481qk;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void jpo() {
        cm();
        this.f18480jj.start();
        this.f18480jj.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.jj.rq.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                rq.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jj.rq.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        rq.this.f18480jj.start();
                    }
                }, 200L);
            }
        });
    }
}
