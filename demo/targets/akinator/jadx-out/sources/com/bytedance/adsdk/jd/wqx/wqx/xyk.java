package com.bytedance.adsdk.jd.wqx.wqx;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends jpo {

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> f21if;

    /* renamed from: ju, reason: collision with root package name */
    private final my f17573ju;

    /* renamed from: qk, reason: collision with root package name */
    private final RectF f17574qk;
    private final Paint xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final Path f17575yd;
    private final float[] zz;

    public xyk(com.bytedance.adsdk.jd.zz zzVar, my myVar) {
        super(zzVar, myVar);
        this.f17574qk = new RectF();
        com.bytedance.adsdk.jd.jpo.jpo jpoVar = new com.bytedance.adsdk.jd.jpo.jpo();
        this.xyk = jpoVar;
        this.zz = new float[8];
        this.f17575yd = new Path();
        this.f17573ju = myVar;
        jpoVar.setAlpha(0);
        jpoVar.setStyle(Paint.Style.FILL);
        jpoVar.setColor(myVar.hna());
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo
    public void jd(Canvas canvas, Matrix matrix, int i10) {
        super.jd(canvas, matrix, i10);
        int iAlpha = Color.alpha(this.f17573ju.hna());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.f17533cm.jpo() == null ? 100 : this.f17533cm.jpo().qk().intValue())) / 100.0f) * (i10 / 255.0f) * 255.0f);
        this.xyk.setAlpha(iIntValue);
        com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> jpoVar = this.f21if;
        if (jpoVar != null) {
            this.xyk.setColorFilter(jpoVar.qk());
        }
        if (iIntValue > 0) {
            float[] fArr = this.zz;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f17573ju.opi();
            float[] fArr2 = this.zz;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f17573ju.opi();
            this.zz[5] = this.f17573ju.sq();
            float[] fArr3 = this.zz;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f17573ju.sq();
            matrix.mapPoints(this.zz);
            this.f17575yd.reset();
            Path path = this.f17575yd;
            float[] fArr4 = this.zz;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f17575yd;
            float[] fArr5 = this.zz;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f17575yd;
            float[] fArr6 = this.zz;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f17575yd;
            float[] fArr7 = this.zz;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f17575yd;
            float[] fArr8 = this.zz;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f17575yd.close();
            canvas.drawPath(this.f17575yd, this.xyk);
        }
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo, com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(RectF rectF, Matrix matrix, boolean z10) {
        super.jpo(rectF, matrix, z10);
        this.f17574qk.set(0.0f, 0.0f, this.f17573ju.opi(), this.f17573ju.sq());
        this.jpo.mapRect(this.f17574qk);
        rectF.set(this.f17574qk);
    }
}
