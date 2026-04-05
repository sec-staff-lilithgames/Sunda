package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna extends View {

    /* renamed from: cm, reason: collision with root package name */
    private Drawable f20887cm;

    /* renamed from: jd, reason: collision with root package name */
    private final boolean f20888jd;

    /* renamed from: jj, reason: collision with root package name */
    private float f20889jj;
    private final Path jpo;
    private Drawable my;
    private int wqx;

    public hna(Context context) {
        this(context, false);
    }

    private void jd() {
        int width = getWidth();
        int height = getHeight();
        if (this.f20889jj <= 0.0f || width <= 0 || height <= 0) {
            return;
        }
        this.jpo.reset();
        this.jpo.addRect(new RectF(0.0f, 0.0f, width * this.f20889jj, height), Path.Direction.CCW);
    }

    private void jpo() {
        Context context = getContext();
        this.f20887cm = dt.wqx(context, this.f20888jd ? "tt_star_thick_dark" : "tt_star_thick");
        this.my = dt.wqx(context, "tt_star");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.wqx <= 0) {
            return;
        }
        int iSave = canvas.save();
        for (int i10 = 0; i10 < 5; i10++) {
            this.f20887cm.draw(canvas);
            canvas.translate(this.wqx, 0.0f);
        }
        canvas.restoreToCount(iSave);
        canvas.clipPath(this.jpo);
        for (int i11 = 0; i11 < 5; i11++) {
            this.my.draw(canvas);
            canvas.translate(this.wqx, 0.0f);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.wqx * 5, 1073741824), View.MeasureSpec.makeMeasureSpec(this.wqx, 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        jd();
    }

    public hna(Context context, boolean z10) {
        super(context);
        this.jpo = new Path();
        this.f20888jd = z10;
        jpo();
    }

    public void jpo(double d10, int i10) {
        int iJpo = (int) va.jpo(getContext(), i10, false);
        this.wqx = iJpo;
        this.f20887cm.setBounds(0, 0, iJpo, iJpo);
        Drawable drawable = this.my;
        int i11 = this.wqx;
        drawable.setBounds(0, 0, i11, i11);
        this.f20889jj = ((float) d10) / 5.0f;
        jd();
        requestLayout();
    }
}
