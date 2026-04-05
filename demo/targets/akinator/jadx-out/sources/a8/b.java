package a8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import e8.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r7.a0;
import r7.h0;
import u7.y;
import z.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b extends a {
    public u7.f E;
    public final ArrayList F;
    public final RectF G;
    public final RectF H;
    public final RectF I;
    public final e8.k J;
    public final k.a K;
    public Boolean L;
    public Boolean M;
    public float N;
    public boolean O;
    public final u7.i P;

    public b(a0 a0Var, f fVar, List<f> list, r7.h hVar) {
        int i10;
        a aVar;
        a bVar;
        super(a0Var, fVar);
        this.F = new ArrayList();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new e8.k();
        this.K = new k.a();
        this.O = true;
        y7.b bVar2 = fVar.f4208s;
        if (bVar2 != null) {
            u7.j jVarCreateAnimation = bVar2.createAnimation();
            this.E = jVarCreateAnimation;
            addAnimation(jVarCreateAnimation);
            this.E.addUpdateListener(this);
        } else {
            this.E = null;
        }
        x xVar = new x(hVar.getLayers().size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            f fVar2 = list.get(size);
            int iOrdinal = fVar2.getLayerType().ordinal();
            if (iOrdinal == 0) {
                bVar = new b(a0Var, fVar2, hVar.getPrecomps(fVar2.getRefId()), hVar);
            } else if (iOrdinal == 1) {
                bVar = new i(a0Var, fVar2);
            } else if (iOrdinal == 2) {
                bVar = new c(a0Var, fVar2);
            } else if (iOrdinal == 3) {
                bVar = new g(a0Var, fVar2);
            } else if (iOrdinal == 4) {
                bVar = new h(a0Var, fVar2, this, hVar);
            } else if (iOrdinal != 5) {
                e8.e.warning("Unknown layer type " + fVar2.getLayerType());
                bVar = null;
            } else {
                bVar = new l(a0Var, fVar2);
            }
            if (bVar != null) {
                xVar.put(bVar.f4173q.getId(), bVar);
                if (aVar2 != null) {
                    aVar2.f4176t = bVar;
                    aVar2 = null;
                } else {
                    this.F.add(0, bVar);
                    int iOrdinal2 = fVar2.f4210u.ordinal();
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        aVar2 = bVar;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < xVar.size(); i10++) {
            a aVar3 = (a) xVar.get(xVar.keyAt(i10));
            if (aVar3 != null && (aVar = (a) xVar.get(aVar3.f4173q.f4195f)) != null) {
                aVar3.f4177u = aVar;
            }
        }
        if (getDropShadowEffect() != null) {
            this.P = new u7.i(this, this, getDropShadowEffect());
        }
    }

    @Override // a8.a, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        super.addValueCallback(t10, cVar);
        if (t10 == h0.C) {
            if (cVar == null) {
                u7.f fVar = this.E;
                if (fVar != null) {
                    fVar.setValueCallback(null);
                    return;
                }
                return;
            }
            y yVar = new y(cVar);
            this.E = yVar;
            yVar.addUpdateListener(this);
            addAnimation(this.E);
            return;
        }
        u7.i iVar = this.P;
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
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i11)).resolveKeyPath(fVar, i10, list, fVar2);
            i11++;
        }
    }

    @Override // a8.a
    public final void drawLayer(Canvas canvas, Matrix matrix, int i10, e8.b bVar) {
        Canvas canvasStart;
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("CompositionLayer#draw");
        }
        boolean z10 = false;
        u7.i iVar = this.P;
        boolean z11 = (bVar == null && iVar == null) ? false : true;
        a0 a0Var = this.f4172p;
        boolean zIsApplyingOpacityToLayersEnabled = a0Var.isApplyingOpacityToLayersEnabled();
        ArrayList arrayList = this.F;
        if ((zIsApplyingOpacityToLayersEnabled && arrayList.size() > 1 && i10 != 255) || (z11 && a0Var.isApplyingShadowToLayersEnabled())) {
            z10 = true;
        }
        int i11 = z10 ? 255 : i10;
        if (iVar != null) {
            bVar = iVar.evaluate(matrix, i11);
        }
        boolean z12 = this.O;
        f fVar = this.f4173q;
        RectF rectF = this.H;
        if (z12 || !"__container".equals(fVar.getName())) {
            rectF.set(0.0f, 0.0f, fVar.f4204o, fVar.f4205p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                RectF rectF2 = this.I;
                aVar.getBounds(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        e8.k kVar = this.J;
        if (z10) {
            k.a aVar2 = this.K;
            aVar2.reset();
            aVar2.f53968a = i10;
            if (bVar != null) {
                bVar.applyTo(aVar2);
                bVar = null;
            }
            canvasStart = kVar.start(canvas, rectF, aVar2);
        } else {
            canvasStart = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a) arrayList.get(size)).draw(canvasStart, matrix, i11, bVar);
            }
        }
        if (z10) {
            kVar.finish();
        }
        canvas.restore();
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("CompositionLayer#draw");
        }
    }

    @Override // a8.a, t7.f
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        super.getBounds(rectF, matrix, z10);
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.G;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((a) arrayList.get(size)).getBounds(rectF2, this.f4171o, true);
            rectF.union(rectF2);
        }
    }

    public float getProgress() {
        return this.N;
    }

    public boolean hasMasks() {
        if (this.M == null) {
            ArrayList arrayList = this.F;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                if (aVar instanceof h) {
                    if (aVar.c()) {
                        this.M = Boolean.TRUE;
                        return true;
                    }
                } else if ((aVar instanceof b) && ((b) aVar).hasMasks()) {
                    this.M = Boolean.TRUE;
                    return true;
                }
            }
            this.M = Boolean.FALSE;
        }
        return this.M.booleanValue();
    }

    public boolean hasMatte() {
        if (this.L == null) {
            if (this.f4176t != null) {
                this.L = Boolean.TRUE;
                return true;
            }
            ArrayList arrayList = this.F;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((a) arrayList.get(size)).f4176t != null) {
                    this.L = Boolean.TRUE;
                    return true;
                }
            }
            this.L = Boolean.FALSE;
        }
        return this.L.booleanValue();
    }

    public void setClipToCompositionBounds(boolean z10) {
        this.O = z10;
    }

    @Override // a8.a
    public void setOutlineMasksAndMattes(boolean z10) {
        super.setOutlineMasksAndMattes(z10);
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((a) it.next()).setOutlineMasksAndMattes(z10);
        }
    }

    @Override // a8.a
    public void setProgress(float f10) {
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("CompositionLayer#setProgress");
        }
        this.N = f10;
        super.setProgress(f10);
        u7.f fVar = this.E;
        f fVar2 = this.f4173q;
        if (fVar != null) {
            f10 = ((fVar2.f4191b.getFrameRate() * ((Float) this.E.getValue()).floatValue()) - fVar2.f4191b.getStartFrame()) / (this.f4172p.getComposition().getDurationFrames() + 0.01f);
        }
        if (this.E == null) {
            f10 -= fVar2.f4203n / fVar2.f4191b.getDurationFrames();
        }
        if (fVar2.f4202m != 0.0f && !"__container".equals(fVar2.getName())) {
            f10 /= fVar2.f4202m;
        }
        ArrayList arrayList = this.F;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((a) arrayList.get(size)).setProgress(f10);
        }
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("CompositionLayer#setProgress");
        }
    }
}
