package a8;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import r7.a0;
import r7.h0;
import u7.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends a {
    public final RectF E;
    public final s7.a F;
    public final float[] G;
    public final Path H;
    public final f I;
    public y J;
    public y K;

    public i(a0 a0Var, f fVar) {
        super(a0Var, fVar);
        this.E = new RectF();
        s7.a aVar = new s7.a();
        this.F = aVar;
        this.G = new float[8];
        this.H = new Path();
        this.I = fVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(fVar.f4201l);
    }

    @Override // a8.a, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        super.addValueCallback(t10, cVar);
        if (t10 == h0.I) {
            if (cVar == null) {
                this.J = null;
                return;
            } else {
                this.J = new y(cVar);
                return;
            }
        }
        if (t10 == 1) {
            if (cVar != null) {
                this.K = new y(cVar);
                return;
            }
            this.K = null;
            this.F.setColor(this.I.f4201l);
        }
    }

    @Override // a8.a
    public void drawLayer(Canvas canvas, Matrix matrix, int i10, e8.b bVar) {
        f fVar = this.I;
        int iAlpha = Color.alpha(fVar.f4201l);
        if (iAlpha == 0) {
            return;
        }
        y yVar = this.K;
        Integer num = yVar == null ? null : (Integer) yVar.getValue();
        s7.a aVar = this.F;
        if (num != null) {
            aVar.setColor(num.intValue());
        } else {
            aVar.setColor(fVar.f4201l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.f4180x.getOpacity() == null ? 100 : ((Integer) r2.getOpacity().getValue()).intValue())) / 100.0f) * (i10 / 255.0f) * 255.0f);
        aVar.setAlpha(iIntValue);
        if (bVar != null) {
            bVar.applyTo(aVar);
        } else {
            aVar.clearShadowLayer();
        }
        y yVar2 = this.J;
        if (yVar2 != null) {
            aVar.setColorFilter((ColorFilter) yVar2.getValue());
        }
        if (iIntValue > 0) {
            float[] fArr = this.G;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f10 = fVar.f4199j;
            fArr[2] = f10;
            fArr[3] = 0.0f;
            fArr[4] = f10;
            float f11 = fVar.f4200k;
            fArr[5] = f11;
            fArr[6] = 0.0f;
            fArr[7] = f11;
            matrix.mapPoints(fArr);
            Path path = this.H;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar);
        }
    }

    @Override // a8.a, t7.f
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        super.getBounds(rectF, matrix, z10);
        f fVar = this.I;
        float f10 = fVar.f4199j;
        float f11 = fVar.f4200k;
        RectF rectF2 = this.E;
        rectF2.set(0.0f, 0.0f, f10, f11);
        this.f4171o.mapRect(rectF2);
        rectF.set(rectF2);
    }
}
