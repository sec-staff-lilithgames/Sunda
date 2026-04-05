package com.bytedance.adsdk.jd.wqx.wqx;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd extends cm {
    private Path xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f17576yd;
    private int zz;

    public yd(com.bytedance.adsdk.jd.zz zzVar, my myVar, Context context) {
        super(zzVar, myVar);
        this.xyk = null;
        this.zz = -1;
        this.f17576yd = -1;
        if (((cm) this).f17527qk != null) {
            float fJpo = com.bytedance.adsdk.jd.jj.jj.jpo();
            this.zz = (int) (((cm) this).f17527qk.jpo() * fJpo);
            this.f17576yd = (int) (((cm) this).f17527qk.jd() * fJpo);
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, this.zz, this.f17576yd);
            Path path = new Path();
            this.xyk = path;
            float f10 = fJpo * 40.0f;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        }
    }

    private static void jpo(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.cm, com.bytedance.adsdk.jd.wqx.wqx.jpo
    public void jd(Canvas canvas, Matrix matrix, int i10) {
        View viewJpo = this.f17536jd.jpo();
        if (this.zz <= 0 || viewJpo == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        jpo(i10);
        float fJj = jj();
        jpo(viewJpo, this.zz, this.f17576yd);
        viewJpo.setAlpha(fJj);
        canvas.clipPath(this.xyk);
        viewJpo.draw(canvas);
        canvas.restore();
    }
}
