package t7;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import r7.a0;
import r7.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p implements u7.a, l, n {

    /* renamed from: c, reason: collision with root package name */
    public final String f86515c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f86516d;

    /* renamed from: e, reason: collision with root package name */
    public final a0 f86517e;

    /* renamed from: f, reason: collision with root package name */
    public final u7.f f86518f;

    /* renamed from: g, reason: collision with root package name */
    public final u7.f f86519g;

    /* renamed from: h, reason: collision with root package name */
    public final u7.j f86520h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f86523k;

    /* renamed from: a, reason: collision with root package name */
    public final Path f86513a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f86514b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    public final c f86521i = new c();

    /* renamed from: j, reason: collision with root package name */
    public u7.f f86522j = null;

    public p(a0 a0Var, a8.a aVar, z7.o oVar) {
        this.f86515c = oVar.getName();
        this.f86516d = oVar.isHidden();
        this.f86517e = a0Var;
        u7.f fVarCreateAnimation = oVar.getPosition().createAnimation();
        this.f86518f = fVarCreateAnimation;
        u7.f fVarCreateAnimation2 = oVar.getSize().createAnimation();
        this.f86519g = fVarCreateAnimation2;
        u7.j jVarCreateAnimation = oVar.getCornerRadius().createAnimation();
        this.f86520h = jVarCreateAnimation;
        aVar.addAnimation(fVarCreateAnimation);
        aVar.addAnimation(fVarCreateAnimation2);
        aVar.addAnimation(jVarCreateAnimation);
        fVarCreateAnimation.addUpdateListener(this);
        fVarCreateAnimation2.addUpdateListener(this);
        jVarCreateAnimation.addUpdateListener(this);
    }

    @Override // t7.l, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        if (t10 == h0.f83921g) {
            this.f86519g.setValueCallback(cVar);
        } else if (t10 == h0.f83923i) {
            this.f86518f.setValueCallback(cVar);
        } else if (t10 == h0.f83922h) {
            this.f86520h.setValueCallback(cVar);
        }
    }

    @Override // t7.l, t7.d
    public String getName() {
        return this.f86515c;
    }

    @Override // t7.n
    public Path getPath() {
        float f10;
        u7.f fVar;
        boolean z10 = this.f86523k;
        Path path = this.f86513a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f86516d) {
            this.f86523k = true;
            return path;
        }
        PointF pointF = (PointF) this.f86519g.getValue();
        float f11 = pointF.x / 2.0f;
        float f12 = pointF.y / 2.0f;
        u7.j jVar = this.f86520h;
        float floatValue = jVar == null ? 0.0f : jVar.getFloatValue();
        if (floatValue == 0.0f && (fVar = this.f86522j) != null) {
            floatValue = Math.min(((Float) fVar.getValue()).floatValue(), Math.min(f11, f12));
        }
        float fMin = Math.min(f11, f12);
        if (floatValue > fMin) {
            floatValue = fMin;
        }
        PointF pointF2 = (PointF) this.f86518f.getValue();
        path.moveTo(pointF2.x + f11, (pointF2.y - f12) + floatValue);
        path.lineTo(pointF2.x + f11, (pointF2.y + f12) - floatValue);
        RectF rectF = this.f86514b;
        if (floatValue > 0.0f) {
            float f13 = pointF2.x + f11;
            float f14 = floatValue * 2.0f;
            f10 = 2.0f;
            float f15 = pointF2.y + f12;
            rectF.set(f13 - f14, f15 - f14, f13, f15);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f10 = 2.0f;
        }
        path.lineTo((pointF2.x - f11) + floatValue, pointF2.y + f12);
        if (floatValue > 0.0f) {
            float f16 = pointF2.x - f11;
            float f17 = pointF2.y + f12;
            float f18 = floatValue * f10;
            rectF.set(f16, f17 - f18, f18 + f16, f17);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f11, (pointF2.y - f12) + floatValue);
        if (floatValue > 0.0f) {
            float f19 = pointF2.x - f11;
            float f20 = pointF2.y - f12;
            float f21 = floatValue * f10;
            rectF.set(f19, f20, f19 + f21, f21 + f20);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f11) - floatValue, pointF2.y - f12);
        if (floatValue > 0.0f) {
            float f22 = pointF2.x + f11;
            float f23 = floatValue * f10;
            float f24 = pointF2.y - f12;
            rectF.set(f22 - f23, f24, f22, f23 + f24);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.f86521i.apply(path);
        this.f86523k = true;
        return path;
    }

    @Override // u7.a
    public void onValueChanged() {
        this.f86523k = false;
        this.f86517e.invalidateSelf();
    }

    @Override // t7.l, x7.g
    public void resolveKeyPath(x7.f fVar, int i10, List<x7.f> list, x7.f fVar2) {
        e8.j.resolveKeyPath(fVar, i10, list, fVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // t7.l, t7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setContents(java.util.List<t7.d> r5, java.util.List<t7.d> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            t7.d r0 = (t7.d) r0
            boolean r1 = r0 instanceof t7.v
            if (r1 == 0) goto L25
            r1 = r0
            t7.v r1 = (t7.v) r1
            z7.y r2 = r1.f86553d
            z7.y r3 = z7.y.f97681b
            if (r2 != r3) goto L25
            t7.c r0 = r4.f86521i
            java.util.ArrayList r0 = r0.f86426a
            r0.add(r1)
            r1.a(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof t7.r
            if (r1 == 0) goto L31
            t7.r r0 = (t7.r) r0
            u7.f r0 = r0.getRoundedCorners()
            r4.f86522j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.p.setContents(java.util.List, java.util.List):void");
    }
}
