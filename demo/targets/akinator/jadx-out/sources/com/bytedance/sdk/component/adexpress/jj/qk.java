package com.bytedance.sdk.component.adexpress.jj;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends tu {

    /* renamed from: jd, reason: collision with root package name */
    private View f18477jd;
    private TextView jpo;
    private AnimatorSet wqx;

    public qk(Context context) {
        super(context);
        this.wqx = new AnimatorSet();
        jd(context);
    }

    private void cm() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f18477jd, "translationY", 0.0f, com.bytedance.sdk.component.adexpress.cm.qk.jpo(getContext(), -3.0f));
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setRepeatCount(-1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f18477jd, "alpha", 1.0f, 0.8f);
        objectAnimatorOfFloat2.setDuration(1000L);
        objectAnimatorOfFloat2.setInterpolator(new CycleInterpolator(1.0f));
        objectAnimatorOfFloat2.setRepeatCount(-1);
        this.wqx.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        this.wqx.setDuration(1000L);
        this.wqx.start();
    }

    private void jd(Context context) {
        View viewJpo = com.bytedance.sdk.component.adexpress.wqx.jpo.jpo(context);
        this.f18477jd = viewJpo;
        addView(viewJpo);
        setClipChildren(false);
        this.jpo = (TextView) findViewById(2097610748);
    }

    @Override // com.bytedance.sdk.component.adexpress.jj.tu
    public void jpo(Context context) {
    }

    public void setButtonText(String str) {
        if (this.jpo == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.jpo.setText(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.jj.tu
    public void jpo() {
        cm();
    }

    @Override // com.bytedance.sdk.component.adexpress.jj.tu
    public void jd() {
        this.wqx.cancel();
    }
}
