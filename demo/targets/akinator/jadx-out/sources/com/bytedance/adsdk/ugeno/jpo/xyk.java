package com.bytedance.adsdk.ugeno.jpo;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk implements qk {

    /* renamed from: cm, reason: collision with root package name */
    private float f17916cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f17917jd;

    /* renamed from: jj, reason: collision with root package name */
    private float f17918jj;
    private View jpo;
    private float my;
    private float wqx;

    public xyk(View view) {
        this.jpo = view;
    }

    public void cm(float f10) {
        this.my = f10;
        this.jpo.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getRipple() {
        return this.wqx;
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getRubIn() {
        return this.f17918jj;
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getShine() {
        return this.f17916cm;
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getStretch() {
        return this.my;
    }

    public void jd(float f10) {
        View view = this.jpo;
        if (view == null) {
            return;
        }
        this.wqx = f10;
        view.postInvalidate();
    }

    public void jpo(float f10) {
        View view = this.jpo;
        if (view == null) {
            return;
        }
        this.f17917jd = f10;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f10);
        }
    }

    public void my(float f10) {
        this.f17918jj = f10;
        this.jpo.postInvalidate();
    }

    public void wqx(float f10) {
        View view = this.jpo;
        if (view == null) {
            return;
        }
        this.f17916cm = f10;
        view.postInvalidate();
    }

    public float jpo() {
        return this.f17917jd;
    }

    public void jpo(int i10) {
        View view = this.jpo;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i10);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i10);
        }
    }
}
