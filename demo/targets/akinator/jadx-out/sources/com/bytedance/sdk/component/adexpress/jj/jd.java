package com.bytedance.sdk.component.adexpress.jj;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private View f18443cm;

    /* renamed from: jd, reason: collision with root package name */
    private ObjectAnimator f18444jd;

    /* renamed from: jj, reason: collision with root package name */
    private View f18445jj;
    private AnimatorSet jpo;
    private View my;

    /* renamed from: qk, reason: collision with root package name */
    private ImageView f18446qk;
    private boolean wqx;
    private int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private Context f18447yd;
    private int zz;

    public jd(Context context, int i10, int i11) {
        super(context);
        this.wqx = false;
        this.jpo = new AnimatorSet();
        this.xyk = i10;
        this.zz = i11;
        this.f18447yd = context;
        wqx();
        cm();
    }

    private void cm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f18443cm, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f18443cm, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.my, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.my, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f18445jj, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f18445jj, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f18446qk, "rotation", 0.0f, -20.0f, 0.0f);
        this.f18444jd = objectAnimatorOfFloat7;
        objectAnimatorOfFloat7.setDuration(1000L);
        this.jpo.setDuration(1500L);
        this.jpo.setInterpolator(new AccelerateDecelerateInterpolator());
        this.jpo.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
        this.jpo.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.jj.jd.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                jd.this.wqx = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (jd.this.wqx) {
                    return;
                }
                jd.this.f18444jd.start();
                jd.this.jpo.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void wqx() {
        View view = new View(this.f18447yd);
        this.f18443cm = view;
        view.setBackground(jpo("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.xyk * 0.45d), (int) (this.zz * 0.45d));
        layoutParams.gravity = 17;
        this.f18443cm.setLayoutParams(layoutParams);
        addView(this.f18443cm);
        View view2 = new View(this.f18447yd);
        this.my = view2;
        view2.setBackground(jpo("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.xyk * 0.25d), (int) (this.zz * 0.25d));
        layoutParams2.gravity = 17;
        this.my.setLayoutParams(layoutParams2);
        addView(this.my);
        View view3 = new View(this.f18447yd);
        this.f18445jj = view3;
        view3.setBackground(jpo("#807BBEFF", "#FF7BBEFF"));
        int i10 = this.xyk;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i10 * 0.25d), (int) (i10 * 0.25d));
        layoutParams3.gravity = 17;
        this.f18445jj.setLayoutParams(layoutParams3);
        addView(this.f18445jj);
        ImageView imageView = new ImageView(this.f18447yd);
        this.f18446qk = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.dt.cm(getContext(), "tt_blue_hand"));
        this.f18446qk.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.xyk * 0.62d), (int) (this.zz * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.f18446qk.setLayoutParams(layoutParams4);
        addView(this.f18446qk);
    }

    public void jd() {
        this.wqx = true;
        ObjectAnimator objectAnimator = this.f18444jd;
        if (objectAnimator == null || this.jpo == null) {
            return;
        }
        objectAnimator.cancel();
        this.jpo.cancel();
    }

    private GradientDrawable jpo(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void jpo() {
        this.wqx = false;
        ObjectAnimator objectAnimator = this.f18444jd;
        if (objectAnimator == null || this.jpo == null) {
            return;
        }
        objectAnimator.start();
        this.jpo.start();
    }
}
