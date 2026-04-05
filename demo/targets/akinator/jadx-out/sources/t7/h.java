package t7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import r7.a0;
import r7.h0;
import u7.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h implements f, u7.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final Path f86447a;

    /* renamed from: b, reason: collision with root package name */
    public final s7.a f86448b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.a f86449c;

    /* renamed from: d, reason: collision with root package name */
    public final String f86450d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f86451e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f86452f;

    /* renamed from: g, reason: collision with root package name */
    public final u7.f f86453g;

    /* renamed from: h, reason: collision with root package name */
    public final u7.f f86454h;

    /* renamed from: i, reason: collision with root package name */
    public y f86455i;

    /* renamed from: j, reason: collision with root package name */
    public final a0 f86456j;

    /* renamed from: k, reason: collision with root package name */
    public u7.f f86457k;

    /* renamed from: l, reason: collision with root package name */
    public float f86458l;

    public h(a0 a0Var, a8.a aVar, z7.s sVar) {
        Path path = new Path();
        this.f86447a = path;
        this.f86448b = new s7.a(1);
        this.f86452f = new ArrayList();
        this.f86449c = aVar;
        this.f86450d = sVar.getName();
        this.f86451e = sVar.isHidden();
        this.f86456j = a0Var;
        if (aVar.getBlurEffect() != null) {
            u7.j jVarCreateAnimation = aVar.getBlurEffect().getBlurriness().createAnimation();
            this.f86457k = jVarCreateAnimation;
            jVarCreateAnimation.addUpdateListener(this);
            aVar.addAnimation(this.f86457k);
        }
        if (sVar.getColor() == null || sVar.getOpacity() == null) {
            this.f86453g = null;
            this.f86454h = null;
            return;
        }
        path.setFillType(sVar.getFillType());
        u7.f fVarCreateAnimation = sVar.getColor().createAnimation();
        this.f86453g = fVarCreateAnimation;
        fVarCreateAnimation.addUpdateListener(this);
        aVar.addAnimation(fVarCreateAnimation);
        u7.f fVarCreateAnimation2 = sVar.getOpacity().createAnimation();
        this.f86454h = fVarCreateAnimation2;
        fVarCreateAnimation2.addUpdateListener(this);
        aVar.addAnimation(fVarCreateAnimation2);
    }

    @Override // t7.l, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        PointF pointF = h0.f83915a;
        if (t10 == 1) {
            this.f86453g.setValueCallback(cVar);
            return;
        }
        if (t10 == 4) {
            this.f86454h.setValueCallback(cVar);
            return;
        }
        ColorFilter colorFilter = h0.I;
        a8.a aVar = this.f86449c;
        if (t10 == colorFilter) {
            y yVar = this.f86455i;
            if (yVar != null) {
                aVar.removeAnimation(yVar);
            }
            if (cVar == null) {
                this.f86455i = null;
                return;
            }
            y yVar2 = new y(cVar);
            this.f86455i = yVar2;
            yVar2.addUpdateListener(this);
            aVar.addAnimation(this.f86455i);
            return;
        }
        if (t10 == h0.f83919e) {
            u7.f fVar = this.f86457k;
            if (fVar != null) {
                fVar.setValueCallback(cVar);
                return;
            }
            y yVar3 = new y(cVar);
            this.f86457k = yVar3;
            yVar3.addUpdateListener(this);
            aVar.addAnimation(this.f86457k);
        }
    }

    @Override // t7.f
    public void draw(Canvas canvas, Matrix matrix, int i10, e8.b bVar) {
        if (this.f86451e) {
            return;
        }
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("FillContent#draw");
        }
        float fIntValue = ((Integer) this.f86454h.getValue()).intValue() / 100.0f;
        int i11 = 0;
        int iClamp = (e8.j.clamp((int) (i10 * fIntValue), 0, 255) << 24) | (((u7.g) this.f86453g).getIntValue() & 16777215);
        s7.a aVar = this.f86448b;
        aVar.setColor(iClamp);
        y yVar = this.f86455i;
        if (yVar != null) {
            aVar.setColorFilter((ColorFilter) yVar.getValue());
        }
        u7.f fVar = this.f86457k;
        if (fVar != null) {
            float fFloatValue = ((Float) fVar.getValue()).floatValue();
            if (fFloatValue == 0.0f) {
                aVar.setMaskFilter(null);
            } else if (fFloatValue != this.f86458l) {
                aVar.setMaskFilter(this.f86449c.getBlurMaskFilter(fFloatValue));
            }
            this.f86458l = fFloatValue;
        }
        if (bVar != null) {
            bVar.applyWithAlpha((int) (fIntValue * 255.0f), aVar);
        } else {
            aVar.clearShadowLayer();
        }
        Path path = this.f86447a;
        path.reset();
        while (true) {
            ArrayList arrayList = this.f86452f;
            if (i11 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i11)).getPath(), matrix);
            i11++;
        }
        canvas.drawPath(path, aVar);
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("FillContent#draw");
        }
    }

    @Override // t7.f
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        Path path = this.f86447a;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f86452f;
            if (i10 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i10)).getPath(), matrix);
                i10++;
            }
        }
    }

    @Override // t7.f, t7.d
    public String getName() {
        return this.f86450d;
    }

    @Override // u7.a
    public void onValueChanged() {
        this.f86456j.invalidateSelf();
    }

    @Override // t7.l, x7.g
    public void resolveKeyPath(x7.f fVar, int i10, List<x7.f> list, x7.f fVar2) {
        e8.j.resolveKeyPath(fVar, i10, list, fVar2, this);
    }

    @Override // t7.f, t7.d
    public void setContents(List<d> list, List<d> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            d dVar = list2.get(i10);
            if (dVar instanceof n) {
                this.f86452f.add((n) dVar);
            }
        }
    }
}
