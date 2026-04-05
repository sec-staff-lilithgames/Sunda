package com.bytedance.sdk.component.adexpress.jj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class tu extends RelativeLayout {

    /* renamed from: cm, reason: collision with root package name */
    private TextView f18490cm;

    /* renamed from: jd, reason: collision with root package name */
    private ImageView f18491jd;

    /* renamed from: jj, reason: collision with root package name */
    private AnimatorSet f18492jj;
    private ImageView jpo;

    /* renamed from: ju, reason: collision with root package name */
    private int f18493ju;
    private TextView my;

    /* renamed from: qk, reason: collision with root package name */
    private AnimatorSet f18494qk;
    private ImageView wqx;
    private AnimatorSet xyk;

    /* renamed from: yd, reason: collision with root package name */
    private String f18495yd;
    private AnimatorSet zz;

    public tu(Context context) {
        super(context);
        this.f18492jj = new AnimatorSet();
        this.f18494qk = new AnimatorSet();
        this.xyk = new AnimatorSet();
        this.zz = new AnimatorSet();
        this.f18493ju = 100;
        jpo(context);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.f18492jj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jd();
    }

    public void setGuideText(String str) {
        TextView textView = this.f18490cm;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.my != null) {
            if (TextUtils.isEmpty(str)) {
                this.my.setText("");
            } else {
                this.my.setText(str);
            }
        }
    }

    public void wqx() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.jpo, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.jpo, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.jpo, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), -this.f18493ju));
        objectAnimatorOfFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), this.f18493ju));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.jj.tu.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (tu.this.wqx != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) tu.this.wqx.getLayoutParams();
                    layoutParams.height = num.intValue();
                    tu.this.wqx.setLayoutParams(layoutParams);
                }
            }
        });
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.wqx, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.wqx, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f18491jd, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.f18491jd, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.f18491jd, "scaleX", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.f18491jd, "scaleY", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.f18491jd, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), -this.f18493ju));
        objectAnimatorOfFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.f18494qk.setDuration(50L);
        this.zz.setDuration(1500L);
        this.xyk.setDuration(50L);
        this.f18494qk.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat7, objectAnimatorOfFloat5);
        this.xyk.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat6, objectAnimatorOfFloat8, objectAnimatorOfFloat9, objectAnimatorOfFloat4);
        this.zz.playTogether(objectAnimatorOfFloat3, valueAnimatorOfInt, objectAnimatorOfFloat10);
        this.f18492jj.playSequentially(this.xyk, this.zz, this.f18494qk);
    }

    public void jd() {
        try {
            AnimatorSet animatorSet = this.f18492jj;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.xyk;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.f18494qk;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.zz;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public void jpo(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.cm.jpo();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.f18495yd)) {
            addView(com.bytedance.sdk.component.adexpress.wqx.jpo.jj(context));
            this.f18493ju = (int) (this.f18493ju * 1.25d);
        } else {
            addView(com.bytedance.sdk.component.adexpress.wqx.jpo.my(context));
        }
        this.jpo = (ImageView) findViewById(2097610734);
        this.f18491jd = (ImageView) findViewById(2097610735);
        this.f18490cm = (TextView) findViewById(2097610730);
        this.wqx = (ImageView) findViewById(2097610733);
        this.my = (TextView) findViewById(2097610731);
    }

    public tu(Context context, String str) {
        super(context);
        this.f18492jj = new AnimatorSet();
        this.f18494qk = new AnimatorSet();
        this.xyk = new AnimatorSet();
        this.zz = new AnimatorSet();
        this.f18493ju = 100;
        setClipChildren(false);
        this.f18495yd = str;
        jpo(context);
    }

    public void jpo() {
        wqx();
        this.f18492jj.start();
        this.f18492jj.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.jj.tu.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                tu.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jj.tu.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        tu.this.f18492jj.start();
                    }
                }, 200L);
            }
        });
    }
}
