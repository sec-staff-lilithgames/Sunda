package a8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import e8.k;
import e8.n;
import r7.a0;
import r7.d0;
import r7.h0;
import u7.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends a {
    public final s7.a E;
    public final Rect F;
    public final Rect G;
    public final RectF H;
    public final d0 I;
    public y J;
    public y K;
    public final u7.i L;
    public e8.k M;
    public k.a N;

    public c(a0 a0Var, f fVar) {
        super(a0Var, fVar);
        this.E = new s7.a(3);
        this.F = new Rect();
        this.G = new Rect();
        this.H = new RectF();
        this.I = a0Var.getLottieImageAssetForId(fVar.getRefId());
        if (getDropShadowEffect() != null) {
            this.L = new u7.i(this, this, getDropShadowEffect());
        }
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
        if (t10 == h0.L) {
            if (cVar == null) {
                this.K = null;
                return;
            } else {
                this.K = new y(cVar);
                return;
            }
        }
        u7.i iVar = this.L;
        if (t10 == 5 && iVar != null) {
            iVar.setColorCallback(cVar);
            return;
        }
        if (t10 == h0.E && iVar != null) {
            iVar.setOpacityCallback(cVar);
            return;
        }
        if (t10 == h0.F && iVar != null) {
            iVar.setDirectionCallback(cVar);
            return;
        }
        if (t10 == h0.G && iVar != null) {
            iVar.setDistanceCallback(cVar);
        } else {
            if (t10 != h0.H || iVar == null) {
                return;
            }
            iVar.setRadiusCallback(cVar);
        }
    }

    @Override // a8.a
    public void drawLayer(Canvas canvas, Matrix matrix, int i10, e8.b bVar) {
        d0 d0Var;
        Bitmap bitmapE = e();
        if (bitmapE == null || bitmapE.isRecycled() || (d0Var = this.I) == null) {
            return;
        }
        float fDpScale = n.dpScale();
        s7.a aVar = this.E;
        aVar.setAlpha(i10);
        y yVar = this.J;
        if (yVar != null) {
            aVar.setColorFilter((ColorFilter) yVar.getValue());
        }
        u7.i iVar = this.L;
        if (iVar != null) {
            bVar = iVar.evaluate(matrix, i10);
        }
        int width = bitmapE.getWidth();
        int height = bitmapE.getHeight();
        Rect rect = this.F;
        rect.set(0, 0, width, height);
        boolean maintainOriginalImageBounds = this.f4172p.getMaintainOriginalImageBounds();
        Rect rect2 = this.G;
        if (maintainOriginalImageBounds) {
            rect2.set(0, 0, (int) (d0Var.getWidth() * fDpScale), (int) (d0Var.getHeight() * fDpScale));
        } else {
            rect2.set(0, 0, (int) (bitmapE.getWidth() * fDpScale), (int) (bitmapE.getHeight() * fDpScale));
        }
        boolean z10 = bVar != null;
        if (z10) {
            if (this.M == null) {
                this.M = new e8.k();
            }
            if (this.N == null) {
                this.N = new k.a();
            }
            this.N.reset();
            bVar.applyWithAlpha(i10, this.N);
            float f10 = rect2.left;
            float f11 = rect2.top;
            float f12 = rect2.right;
            float f13 = rect2.bottom;
            RectF rectF = this.H;
            rectF.set(f10, f11, f12, f13);
            matrix.mapRect(rectF);
            canvas = this.M.start(canvas, rectF, this.N);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapE, rect, rect2, aVar);
        if (z10) {
            this.M.finish();
            if (this.M.finishDecrementsCanvasSaveCount()) {
                return;
            }
        }
        canvas.restore();
    }

    public final Bitmap e() {
        Bitmap bitmap;
        y yVar = this.K;
        if (yVar != null && (bitmap = (Bitmap) yVar.getValue()) != null) {
            return bitmap;
        }
        Bitmap bitmapForId = this.f4172p.getBitmapForId(this.f4173q.getRefId());
        if (bitmapForId != null) {
            return bitmapForId;
        }
        d0 d0Var = this.I;
        if (d0Var != null) {
            return d0Var.getBitmap();
        }
        return null;
    }

    @Override // a8.a, t7.f
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        Bitmap bitmapE;
        super.getBounds(rectF, matrix, z10);
        if (this.I != null) {
            float fDpScale = n.dpScale();
            if (this.f4172p.getMaintainOriginalImageBounds() || (bitmapE = e()) == null) {
                rectF.set(0.0f, 0.0f, r4.getWidth() * fDpScale, r4.getHeight() * fDpScale);
            } else {
                rectF.set(0.0f, 0.0f, bitmapE.getWidth() * fDpScale, bitmapE.getHeight() * fDpScale);
            }
            this.f4171o.mapRect(rectF);
        }
    }
}
