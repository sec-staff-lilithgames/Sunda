package t7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import r7.a0;
import r7.h0;
import u7.y;
import z7.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class u extends b {

    /* renamed from: q, reason: collision with root package name */
    public final a8.a f86545q;

    /* renamed from: r, reason: collision with root package name */
    public final String f86546r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f86547s;

    /* renamed from: t, reason: collision with root package name */
    public final u7.f f86548t;

    /* renamed from: u, reason: collision with root package name */
    public y f86549u;

    public u(a0 a0Var, a8.a aVar, x xVar) {
        super(a0Var, aVar, xVar.getCapType().toPaintCap(), xVar.getJoinType().toPaintJoin(), xVar.getMiterLimit(), xVar.getOpacity(), xVar.getWidth(), xVar.getLineDashPattern(), xVar.getDashOffset());
        this.f86545q = aVar;
        this.f86546r = xVar.getName();
        this.f86547s = xVar.isHidden();
        u7.f fVarCreateAnimation = xVar.getColor().createAnimation();
        this.f86548t = fVarCreateAnimation;
        fVarCreateAnimation.addUpdateListener(this);
        aVar.addAnimation(fVarCreateAnimation);
    }

    @Override // t7.b, t7.l, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        super.addValueCallback(t10, cVar);
        PointF pointF = h0.f83915a;
        u7.f fVar = this.f86548t;
        if (t10 == 2) {
            fVar.setValueCallback(cVar);
            return;
        }
        if (t10 == h0.I) {
            y yVar = this.f86549u;
            a8.a aVar = this.f86545q;
            if (yVar != null) {
                aVar.removeAnimation(yVar);
            }
            if (cVar == null) {
                this.f86549u = null;
                return;
            }
            y yVar2 = new y(cVar);
            this.f86549u = yVar2;
            yVar2.addUpdateListener(this);
            aVar.addAnimation(fVar);
        }
    }

    @Override // t7.b, t7.f
    public void draw(Canvas canvas, Matrix matrix, int i10, e8.b bVar) {
        if (this.f86547s) {
            return;
        }
        int intValue = ((u7.g) this.f86548t).getIntValue();
        s7.a aVar = this.f86418i;
        aVar.setColor(intValue);
        y yVar = this.f86549u;
        if (yVar != null) {
            aVar.setColorFilter((ColorFilter) yVar.getValue());
        }
        super.draw(canvas, matrix, i10, bVar);
    }

    @Override // t7.b, t7.l, t7.d
    public String getName() {
        return this.f86546r;
    }
}
