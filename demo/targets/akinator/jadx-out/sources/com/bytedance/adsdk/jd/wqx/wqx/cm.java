package com.bytedance.adsdk.jd.wqx.wqx;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends jpo {

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Bitmap, Bitmap> f16if;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> f17526ju;

    /* renamed from: qk, reason: collision with root package name */
    protected final com.bytedance.adsdk.jd.yd f17527qk;
    private final Paint xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final Rect f17528yd;
    private final Rect zz;

    public cm(com.bytedance.adsdk.jd.zz zzVar, my myVar) {
        super(zzVar, myVar);
        this.xyk = new com.bytedance.adsdk.jd.jpo.jpo(3);
        this.zz = new Rect();
        this.f17528yd = new Rect();
        this.f17527qk = zzVar.jj(myVar.qk());
    }

    /* renamed from: if, reason: not valid java name */
    private Bitmap m382if() {
        Bitmap bitmapQk;
        com.bytedance.adsdk.jd.jpo.jd.jpo<Bitmap, Bitmap> jpoVar = this.f16if;
        if (jpoVar != null && (bitmapQk = jpoVar.qk()) != null) {
            return bitmapQk;
        }
        Bitmap bitmapMy = this.f17536jd.my(this.wqx.qk());
        if (bitmapMy != null) {
            return bitmapMy;
        }
        com.bytedance.adsdk.jd.yd ydVar = this.f17527qk;
        if (ydVar != null) {
            return ydVar.ju();
        }
        return null;
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo
    public void jd(Canvas canvas, Matrix matrix, int i10) {
        super.jd(canvas, matrix, i10);
        Bitmap bitmapM382if = m382if();
        if (bitmapM382if == null || bitmapM382if.isRecycled() || this.f17527qk == null) {
            return;
        }
        float fJpo = com.bytedance.adsdk.jd.jj.jj.jpo();
        this.xyk.setAlpha(i10);
        com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> jpoVar = this.f17526ju;
        if (jpoVar != null) {
            this.xyk.setColorFilter(jpoVar.qk());
        }
        canvas.save();
        canvas.concat(matrix);
        this.zz.set(0, 0, bitmapM382if.getWidth(), bitmapM382if.getHeight());
        if (this.f17536jd.my()) {
            this.f17528yd.set(0, 0, (int) (this.f17527qk.jpo() * fJpo), (int) (this.f17527qk.jd() * fJpo));
        } else {
            this.f17528yd.set(0, 0, (int) (bitmapM382if.getWidth() * fJpo), (int) (bitmapM382if.getHeight() * fJpo));
        }
        canvas.drawBitmap(bitmapM382if, this.zz, this.f17528yd, this.xyk);
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.jd.wqx.wqx.jpo, com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(RectF rectF, Matrix matrix, boolean z10) {
        super.jpo(rectF, matrix, z10);
        if (this.f17527qk != null) {
            float fJpo = com.bytedance.adsdk.jd.jj.jj.jpo();
            rectF.set(0.0f, 0.0f, this.f17527qk.jpo() * fJpo, this.f17527qk.jd() * fJpo);
            this.jpo.mapRect(rectF);
        }
    }
}
