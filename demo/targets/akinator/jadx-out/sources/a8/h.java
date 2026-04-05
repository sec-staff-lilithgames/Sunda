package a8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import r7.a0;
import r7.h0;
import z7.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends a {
    public final t7.e E;
    public final b F;
    public final u7.i G;

    public h(a0 a0Var, f fVar, b bVar, r7.h hVar) {
        super(a0Var, fVar);
        this.F = bVar;
        t7.e eVar = new t7.e(a0Var, this, new t("__container", fVar.f4190a, false), hVar);
        this.E = eVar;
        List<t7.d> list = Collections.EMPTY_LIST;
        eVar.setContents(list, list);
        if (getDropShadowEffect() != null) {
            this.G = new u7.i(this, this, getDropShadowEffect());
        }
    }

    @Override // a8.a, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        super.addValueCallback(t10, cVar);
        PointF pointF = h0.f83915a;
        u7.i iVar = this.G;
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
    public final void d(x7.f fVar, int i10, List list, x7.f fVar2) {
        this.E.resolveKeyPath(fVar, i10, list, fVar2);
    }

    @Override // a8.a
    public final void drawLayer(Canvas canvas, Matrix matrix, int i10, e8.b bVar) {
        u7.i iVar = this.G;
        if (iVar != null) {
            bVar = iVar.evaluate(matrix, i10);
        }
        this.E.draw(canvas, matrix, i10, bVar);
    }

    @Override // a8.a
    public z7.a getBlurEffect() {
        z7.a blurEffect = super.getBlurEffect();
        return blurEffect != null ? blurEffect : this.F.getBlurEffect();
    }

    @Override // a8.a, t7.f
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        super.getBounds(rectF, matrix, z10);
        this.E.getBounds(rectF, this.f4171o, z10);
    }
}
