package com.bytedance.sdk.component.adexpress.jj;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jr extends LinearLayout {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.utils.hmu f18455cm;

    /* renamed from: if, reason: not valid java name */
    private JSONObject f61if;

    /* renamed from: jd, reason: collision with root package name */
    private TextView f18456jd;

    /* renamed from: jj, reason: collision with root package name */
    private TextView f18457jj;
    private TextView jpo;

    /* renamed from: ju, reason: collision with root package name */
    private int f18458ju;
    private TextView my;

    /* renamed from: qk, reason: collision with root package name */
    private jpo f18459qk;
    private ImageView wqx;
    private LinearLayout xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f18460yd;
    private int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.adexpress.jj.jr$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (jr.this.wqx != null) {
                final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                rotateAnimation.setInterpolator(new jd(null));
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.component.adexpress.jj.jr.1.1
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        jr.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.jj.jr.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                jr.this.wqx.startAnimation(rotateAnimation);
                            }
                        }, 250L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                jr.this.wqx.startAnimation(rotateAnimation);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements Interpolator {
        private jd() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return f10 <= 0.25f ? (f10 * (-2.0f)) + 0.5f : f10 <= 0.5f ? (f10 * 4.0f) - 1.0f : f10 <= 0.75f ? (f10 * (-4.0f)) + 3.0f : (f10 * 2.0f) - 1.5f;
        }

        public /* synthetic */ jd(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
    }

    public jr(Context context, View view, int i10, int i11, int i12, JSONObject jSONObject) {
        super(context);
        this.zz = i10;
        this.f18460yd = i11;
        this.f18458ju = i12;
        this.f61if = jSONObject;
        jpo(context, view);
    }

    public LinearLayout getShakeLayout() {
        return this.xyk;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f18455cm == null) {
                this.f18455cm = new com.bytedance.sdk.component.utils.hmu(getContext().getApplicationContext(), 1);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.jj.jr.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setOnShakeViewListener(jpo jpoVar) {
        this.f18459qk = jpoVar;
    }

    public void setShakeText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.my.setText(str);
        } else {
            this.my.setVisibility(8);
            this.f18457jj.setVisibility(8);
        }
    }

    public void jpo(Context context, View view) {
        addView(view);
        this.xyk = (LinearLayout) findViewById(2097610727);
        this.wqx = (ImageView) findViewById(2097610725);
        this.jpo = (TextView) findViewById(2097610724);
        this.f18456jd = (TextView) findViewById(2097610726);
        this.my = (TextView) findViewById(2097610723);
        this.f18457jj = (TextView) findViewById(2097610728);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.xyk.setBackground(gradientDrawable);
    }

    public void jpo() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
        postDelayed(new AnonymousClass1(), 500L);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }
}
