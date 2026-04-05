package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.applovin.impl.adview.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j extends e {

    /* renamed from: e, reason: collision with root package name */
    private static final Paint f13546e = new Paint(1);

    /* renamed from: f, reason: collision with root package name */
    private static final Paint f13547f = new Paint(1);

    /* renamed from: c, reason: collision with root package name */
    private final float[] f13548c;

    /* renamed from: d, reason: collision with root package name */
    private Path f13549d;

    public j(Context context) {
        super(context);
        this.f13548c = new float[]{30.0f, 30.0f, 50.0f, 50.0f, 30.0f, 70.0f, 55.0f, 30.0f, 75.0f, 50.0f, 55.0f, 70.0f};
        f13546e.setARGB(80, 0, 0, 0);
        Paint paint = f13547f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // com.applovin.impl.adview.e
    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        a();
    }

    public float getCenter() {
        return getSize() / 2.0f;
    }

    public float getStrokeWidth() {
        return this.f13526a * 2.0f;
    }

    @Override // com.applovin.impl.adview.e
    public e.a getStyle() {
        return e.a.TRANSPARENT_SKIP;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f13546e);
        Paint paint = f13547f;
        paint.setStrokeWidth(getStrokeWidth());
        canvas.drawPath(this.f13549d, paint);
    }

    private void a() {
        int i10 = 0;
        while (true) {
            float[] fArr = this.f13548c;
            if (i10 < fArr.length) {
                fArr[i10] = fArr[i10] * 0.3f * this.f13526a;
                i10++;
            } else {
                Path path = new Path();
                this.f13549d = path;
                float[] fArr2 = this.f13548c;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f13549d;
                float[] fArr3 = this.f13548c;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f13549d;
                float[] fArr4 = this.f13548c;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f13549d;
                float[] fArr5 = this.f13548c;
                path4.moveTo(fArr5[6], fArr5[7]);
                Path path5 = this.f13549d;
                float[] fArr6 = this.f13548c;
                path5.lineTo(fArr6[8], fArr6[9]);
                Path path6 = this.f13549d;
                float[] fArr7 = this.f13548c;
                path6.lineTo(fArr7[10], fArr7[11]);
                return;
            }
        }
    }
}
