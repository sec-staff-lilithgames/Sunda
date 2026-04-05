package com.bytedance.adsdk.ugeno.zz.my;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.cm;
import com.bytedance.adsdk.ugeno.qk.xyk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private float f18105cm;

    /* renamed from: jd, reason: collision with root package name */
    private float f18106jd;

    /* renamed from: jj, reason: collision with root package name */
    private LinearLayout f18107jj;
    private float jpo;
    private LinearLayout my;

    /* renamed from: qk, reason: collision with root package name */
    private Context f18108qk;
    private double wqx;
    private cm xyk;

    public jpo(Context context) {
        super(context);
        this.f18108qk = context;
        this.my = new LinearLayout(context);
        this.f18107jj = new LinearLayout(context);
        this.my.setOrientation(0);
        this.my.setGravity(8388611);
        this.f18107jj.setOrientation(0);
        this.f18107jj.setGravity(8388611);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) this.jpo, (int) this.f18106jd);
        float f10 = this.f18105cm;
        layoutParams.leftMargin = (int) f10;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = (int) f10;
        layoutParams.bottomMargin = 1;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public void jpo(double d10, int i10, int i11, float f10, int i12) {
        removeAllViews();
        this.my.removeAllViews();
        this.f18107jj.removeAllViews();
        this.jpo = (int) xyk.jpo(this.f18108qk, f10);
        this.f18106jd = (int) xyk.jpo(this.f18108qk, f10);
        this.wqx = d10;
        this.f18105cm = i12;
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setImageResource(com.bytedance.adsdk.ugeno.qk.cm.jd(this.f18108qk, "tt_ugen_rating_star"));
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            this.f18107jj.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageResource(com.bytedance.adsdk.ugeno.qk.cm.jd(this.f18108qk, "tt_ugen_rating_star"));
            starImageView2.setColorFilter(i11);
            this.my.addView(starImageView2);
        }
        addView(this.my);
        addView(this.f18107jj);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cm cmVar = this.xyk;
        if (cmVar != null) {
            cmVar.qk();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cm cmVar = this.xyk;
        if (cmVar != null) {
            cmVar.xyk();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        cm cmVar = this.xyk;
        if (cmVar != null) {
            cmVar.jpo(i10, i11, i12, i13);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        cm cmVar = this.xyk;
        if (cmVar != null) {
            cmVar.jpo(i10, i11);
        }
        super.onMeasure(i10, i11);
        this.my.measure(i10, i11);
        double dFloor = Math.floor(this.wqx);
        float f10 = this.f18105cm;
        this.f18107jj.measure(View.MeasureSpec.makeMeasureSpec((int) (((this.wqx - dFloor) * this.jpo) + ((f10 + f10 + r2) * dFloor) + f10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.my.getMeasuredHeight(), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        cm cmVar = this.xyk;
        if (cmVar != null) {
            cmVar.jd(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void jpo(cm cmVar) {
        this.xyk = cmVar;
    }
}
