package com.bytedance.sdk.component.adexpress.jj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz extends View {

    /* renamed from: cm, reason: collision with root package name */
    private Paint f18506cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f18507jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f18508jj;
    private int jpo;
    private Paint my;

    /* renamed from: qk, reason: collision with root package name */
    private Paint f18509qk;
    private final RectF wqx;
    private int xyk;

    public zz(Context context) {
        super(context);
        this.wqx = new RectF();
        jpo();
    }

    private void jpo() {
        Paint paint = new Paint();
        this.f18506cm = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f18509qk = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.my = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.wqx;
        int i10 = this.f18508jj;
        canvas.drawRoundRect(rectF, i10, i10, this.my);
        RectF rectF2 = this.wqx;
        int i11 = this.f18508jj;
        canvas.drawRoundRect(rectF2, i11, i11, this.f18506cm);
        int i12 = this.jpo;
        int i13 = this.f18507jd;
        canvas.drawLine(i12 * 0.3f, i13 * 0.3f, i12 * 0.7f, i13 * 0.7f, this.f18509qk);
        int i14 = this.jpo;
        int i15 = this.f18507jd;
        canvas.drawLine(i14 * 0.7f, i15 * 0.3f, i14 * 0.3f, i15 * 0.7f, this.f18509qk);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.jpo = i10;
        this.f18507jd = i11;
        RectF rectF = this.wqx;
        int i14 = this.xyk;
        rectF.set(i14, i14, i10 - i14, i11 - i14);
    }

    public void setBgColor(int i10) {
        this.my.setStyle(Paint.Style.FILL);
        this.my.setColor(i10);
    }

    public void setDislikeColor(int i10) {
        this.f18509qk.setColor(i10);
    }

    public void setDislikeWidth(int i10) {
        this.f18509qk.setStrokeWidth(i10);
    }

    public void setRadius(int i10) {
        this.f18508jj = i10;
    }

    public void setStrokeColor(int i10) {
        this.f18506cm.setStyle(Paint.Style.STROKE);
        this.f18506cm.setColor(i10);
    }

    public void setStrokeWidth(int i10) {
        this.f18506cm.setStrokeWidth(i10);
        this.xyk = i10;
    }
}
