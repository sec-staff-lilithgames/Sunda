package com.bytedance.sdk.component.adexpress.jj;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.pdm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private TextView f18496cm;

    /* renamed from: jd, reason: collision with root package name */
    private ImageView f18497jd;

    /* renamed from: jj, reason: collision with root package name */
    private AnimatorSet f18498jj;
    private Context jpo;
    private sq my;
    private ImageView wqx;

    public wqx(Context context) {
        super(context);
        this.f18498jj = new AnimatorSet();
        this.jpo = context;
        my();
        jj();
    }

    private void jj() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.wqx, "scaleX", 1.0f, 0.9f);
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.setRepeatMode(2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.wqx, "scaleY", 1.0f, 0.9f);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f18498jj.setDuration(800L);
        this.f18498jj.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void my() {
        FrameLayout frameLayout = new FrameLayout(this.jpo);
        this.my = new sq(this.jpo);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 95.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.my, layoutParams);
        this.f18497jd = new ImageView(this.jpo);
        int iJpo = pdm.jpo(this.jpo, 60.0f);
        this.f18497jd.setImageDrawable(com.bytedance.sdk.component.adexpress.cm.xyk.jpo(1, null, null, new int[]{iJpo, iJpo}, Integer.valueOf(pdm.jpo(this.jpo, 1.0f)), Integer.valueOf(Color.parseColor("#80FFFFFF"))));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 75.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.f18497jd, layoutParams2);
        this.wqx = new ImageView(this.jpo);
        int iJpo2 = pdm.jpo(this.jpo, 50.0f);
        this.wqx.setImageDrawable(com.bytedance.sdk.component.adexpress.cm.xyk.jpo(1, Integer.valueOf(Color.parseColor("#80FFFFFF")), null, new int[]{iJpo2, iJpo2}, null, null));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 63.0f), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.jpo, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.wqx, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.jpo);
        this.f18496cm = textView;
        textView.setTextColor(-1);
        this.f18496cm.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.f18496cm, layoutParams4);
    }

    public void cm() {
        this.my.jd();
        this.my.wqx();
    }

    public void jd() {
        this.f18498jj.cancel();
    }

    public void jpo() {
        this.f18498jj.start();
    }

    public void setGuideText(String str) {
        this.f18496cm.setText(str);
    }

    public void wqx() {
        this.my.jpo();
    }
}
