package com.bytedance.sdk.component.adexpress.jj;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends FrameLayout {

    /* renamed from: jd, reason: collision with root package name */
    private AnimatorSet f18464jd;
    private ImageView jpo;

    public my(Context context) {
        super(context);
        wqx();
        cm();
    }

    private void cm() {
        this.f18464jd = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.jpo, "scaleX", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setRepeatMode(2);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.jpo, "scaleY", 1.0f, 1.5f, 1.0f, 1.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(2000L);
        objectAnimatorOfFloat2.setRepeatMode(2);
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.f18464jd.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
    }

    private void wqx() {
        ImageView imageView = new ImageView(getContext());
        this.jpo = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.dt.cm(getContext(), "tt_white_hand"));
        int iJpo = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), 20.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iJpo, iJpo);
        layoutParams.gravity = 17;
        addView(this.jpo, layoutParams);
    }

    public void jd() {
        AnimatorSet animatorSet = this.f18464jd;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void jpo() {
        AnimatorSet animatorSet = this.f18464jd;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
