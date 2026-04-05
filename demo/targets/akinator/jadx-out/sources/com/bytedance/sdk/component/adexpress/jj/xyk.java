package com.bytedance.sdk.component.adexpress.jj;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends tu {

    /* renamed from: cm, reason: collision with root package name */
    private ImageView f18499cm;

    /* renamed from: jd, reason: collision with root package name */
    private ImageView f18500jd;

    /* renamed from: jj, reason: collision with root package name */
    private AnimatorSet f18501jj;
    private TextView jpo;
    private int my;
    private ImageView wqx;

    public xyk(Context context) {
        super(context);
        this.f18501jj = new AnimatorSet();
        jd(context);
    }

    private void cm() {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "alphaColor", 0, 60);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.setDuration(2000L);
        objectAnimatorOfInt.setRepeatCount(-1);
        objectAnimatorOfInt.start();
    }

    private void jd(Context context) {
        addView(com.bytedance.sdk.component.adexpress.wqx.jpo.jd(context));
        this.f18500jd = (ImageView) findViewById(2097610751);
        this.wqx = (ImageView) findViewById(2097610750);
        this.f18499cm = (ImageView) findViewById(2097610749);
        this.jpo = (TextView) findViewById(2097610748);
    }

    public float getAlphaColor() {
        return this.my;
    }

    @Override // com.bytedance.sdk.component.adexpress.jj.tu
    public void jpo(Context context) {
    }

    public void setAlphaColor(int i10) {
        if (i10 < 0 || i10 > 60) {
            return;
        }
        int i11 = i10 + 195;
        ImageView imageView = this.f18499cm;
        int iRgb = Color.rgb(i11, i11, i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(iRgb, mode);
        int i12 = ((i10 + 20) % 60) + 195;
        this.wqx.setColorFilter(Color.rgb(i12, i12, i12), mode);
        int i13 = ((i10 + 40) % 60) + 195;
        this.f18500jd.setColorFilter(Color.rgb(i13, i13, i13), mode);
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
        this.f18501jj.cancel();
    }
}
