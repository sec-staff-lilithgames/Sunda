package com.bytedance.sdk.component.adexpress.jj;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hmu extends FrameLayout {

    /* renamed from: cm, reason: collision with root package name */
    private float f18428cm;

    /* renamed from: jd, reason: collision with root package name */
    LinearLayout f18429jd;

    /* renamed from: jj, reason: collision with root package name */
    private Drawable f18430jj;
    LinearLayout jpo;
    private Drawable my;

    /* renamed from: qk, reason: collision with root package name */
    private double f18431qk;
    private float wqx;
    private float xyk;
    private static final int zz = (com.bytedance.sdk.component.adexpress.dynamic.my.ju.jd("", 0.0f, true)[1] / 2) + 1;

    /* renamed from: yd, reason: collision with root package name */
    private static final int f18427yd = (com.bytedance.sdk.component.adexpress.dynamic.my.ju.jd("", 0.0f, true)[1] / 2) + 3;

    public hmu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.jpo = new LinearLayout(getContext());
        this.f18429jd = new LinearLayout(getContext());
        this.jpo.setOrientation(0);
        this.jpo.setGravity(8388611);
        this.f18429jd.setOrientation(0);
        this.f18429jd.setGravity(8388611);
        this.my = com.bytedance.sdk.component.utils.dt.wqx(context, "tt_star_thick");
        this.f18430jj = com.bytedance.sdk.component.utils.dt.wqx(context, "tt_star");
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.wqx, (int) this.f18428cm));
        imageView.setPadding(1, zz, 1, f18427yd);
        return imageView;
    }

    public Drawable getStarEmptyDrawable() {
        return this.my;
    }

    public Drawable getStarFillDrawable() {
        return this.f18430jj;
    }

    public void jpo(double d10, int i10, int i11, int i12) {
        float f10 = i11;
        this.wqx = (int) com.bytedance.sdk.component.adexpress.cm.qk.wqx(getContext(), f10);
        this.f18428cm = (int) com.bytedance.sdk.component.adexpress.cm.qk.wqx(getContext(), f10);
        this.f18431qk = d10;
        this.xyk = i12;
        removeAllViews();
        for (int i13 = 0; i13 < 5; i13++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f18429jd.addView(starImageView);
        }
        for (int i14 = 0; i14 < 5; i14++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.jpo.addView(starImageView2);
        }
        addView(this.jpo);
        addView(this.f18429jd);
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.jpo.measure(i10, i11);
        double d10 = this.f18431qk;
        float f10 = this.wqx;
        this.f18429jd.measure(View.MeasureSpec.makeMeasureSpec((int) (((d10 - ((int) d10)) * (f10 - 2.0f)) + (((int) d10) * f10) + 1.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(this.jpo.getMeasuredHeight(), 1073741824));
        if (this.xyk > 0.0f) {
            this.jpo.setPadding(0, ((int) (r7.getMeasuredHeight() - this.xyk)) / 2, 0, 0);
            this.f18429jd.setPadding(0, ((int) (this.jpo.getMeasuredHeight() - this.xyk)) / 2, 0, 0);
        }
    }
}
