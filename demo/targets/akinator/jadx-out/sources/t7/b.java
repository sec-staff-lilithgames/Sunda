package t7;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import r7.a0;
import r7.h0;
import u7.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b implements u7.a, l, f {

    /* renamed from: e, reason: collision with root package name */
    public final a0 f86414e;

    /* renamed from: f, reason: collision with root package name */
    public final a8.a f86415f;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f86417h;

    /* renamed from: i, reason: collision with root package name */
    public final s7.a f86418i;

    /* renamed from: j, reason: collision with root package name */
    public final u7.j f86419j;

    /* renamed from: k, reason: collision with root package name */
    public final u7.f f86420k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f86421l;

    /* renamed from: m, reason: collision with root package name */
    public final u7.j f86422m;

    /* renamed from: n, reason: collision with root package name */
    public y f86423n;

    /* renamed from: o, reason: collision with root package name */
    public u7.f f86424o;

    /* renamed from: p, reason: collision with root package name */
    public float f86425p;

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f86410a = new PathMeasure();

    /* renamed from: b, reason: collision with root package name */
    public final Path f86411b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f86412c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final RectF f86413d = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f86416g = new ArrayList();

    public b(a0 a0Var, a8.a aVar, Paint.Cap cap, Paint.Join join, float f10, y7.d dVar, y7.b bVar, List list, y7.b bVar2) {
        s7.a aVar2 = new s7.a(1);
        this.f86418i = aVar2;
        this.f86425p = 0.0f;
        this.f86414e = a0Var;
        this.f86415f = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f10);
        this.f86420k = dVar.createAnimation();
        this.f86419j = bVar.createAnimation();
        if (bVar2 == null) {
            this.f86422m = null;
        } else {
            this.f86422m = bVar2.createAnimation();
        }
        this.f86421l = new ArrayList(list.size());
        this.f86417h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f86421l.add(((y7.b) list.get(i10)).createAnimation());
        }
        aVar.addAnimation(this.f86420k);
        aVar.addAnimation(this.f86419j);
        for (int i11 = 0; i11 < this.f86421l.size(); i11++) {
            aVar.addAnimation((u7.f) this.f86421l.get(i11));
        }
        u7.j jVar = this.f86422m;
        if (jVar != null) {
            aVar.addAnimation(jVar);
        }
        this.f86420k.addUpdateListener(this);
        this.f86419j.addUpdateListener(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((u7.f) this.f86421l.get(i12)).addUpdateListener(this);
        }
        u7.j jVar2 = this.f86422m;
        if (jVar2 != null) {
            jVar2.addUpdateListener(this);
        }
        if (aVar.getBlurEffect() != null) {
            u7.j jVarCreateAnimation = aVar.getBlurEffect().getBlurriness().createAnimation();
            this.f86424o = jVarCreateAnimation;
            jVarCreateAnimation.addUpdateListener(this);
            aVar.addAnimation(this.f86424o);
        }
    }

    @Override // t7.l, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        PointF pointF = h0.f83915a;
        if (t10 == 4) {
            this.f86420k.setValueCallback(cVar);
            return;
        }
        if (t10 == h0.f83931q) {
            this.f86419j.setValueCallback(cVar);
            return;
        }
        ColorFilter colorFilter = h0.I;
        a8.a aVar = this.f86415f;
        if (t10 == colorFilter) {
            y yVar = this.f86423n;
            if (yVar != null) {
                aVar.removeAnimation(yVar);
            }
            if (cVar == null) {
                this.f86423n = null;
                return;
            }
            y yVar2 = new y(cVar);
            this.f86423n = yVar2;
            yVar2.addUpdateListener(this);
            aVar.addAnimation(this.f86423n);
            return;
        }
        if (t10 == h0.f83919e) {
            u7.f fVar = this.f86424o;
            if (fVar != null) {
                fVar.setValueCallback(cVar);
                return;
            }
            y yVar3 = new y(cVar);
            this.f86424o = yVar3;
            yVar3.addUpdateListener(this);
            aVar.addAnimation(this.f86424o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0218  */
    @Override // t7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22, e8.b r23) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.b.draw(android.graphics.Canvas, android.graphics.Matrix, int, e8.b):void");
    }

    @Override // t7.f
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        if (r7.d.isTraceEnabled()) {
            r7.d.beginSection("StrokeContent#getBounds");
        }
        Path path = this.f86411b;
        path.reset();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f86416g;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            for (int i11 = 0; i11 < aVar.f86408a.size(); i11++) {
                path.addPath(((n) aVar.f86408a.get(i11)).getPath(), matrix);
            }
            i10++;
        }
        RectF rectF2 = this.f86413d;
        path.computeBounds(rectF2, false);
        float floatValue = this.f86419j.getFloatValue() / 2.0f;
        rectF2.set(rectF2.left - floatValue, rectF2.top - floatValue, rectF2.right + floatValue, rectF2.bottom + floatValue);
        rectF.set(rectF2);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (r7.d.isTraceEnabled()) {
            r7.d.endSection("StrokeContent#getBounds");
        }
    }

    @Override // t7.l, t7.d
    public abstract /* synthetic */ String getName();

    @Override // u7.a
    public void onValueChanged() {
        this.f86414e.invalidateSelf();
    }

    @Override // t7.l, x7.g
    public void resolveKeyPath(x7.f fVar, int i10, List<x7.f> list, x7.f fVar2) {
        e8.j.resolveKeyPath(fVar, i10, list, fVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    @Override // t7.l, t7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setContents(java.util.List<t7.d> r8, java.util.List<t7.d> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            z7.y r3 = z7.y.f97682c
            if (r0 < 0) goto L20
            java.lang.Object r4 = r8.get(r0)
            t7.d r4 = (t7.d) r4
            boolean r5 = r4 instanceof t7.v
            if (r5 == 0) goto L1d
            t7.v r4 = (t7.v) r4
            z7.y r5 = r4.f86553d
            if (r5 != r3) goto L1d
            r2 = r4
        L1d:
            int r0 = r0 + (-1)
            goto L8
        L20:
            if (r2 == 0) goto L25
            r2.a(r7)
        L25:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2b:
            java.util.ArrayList r0 = r7.f86416g
            if (r8 < 0) goto L64
            java.lang.Object r4 = r9.get(r8)
            t7.d r4 = (t7.d) r4
            boolean r5 = r4 instanceof t7.v
            if (r5 == 0) goto L4f
            r5 = r4
            t7.v r5 = (t7.v) r5
            z7.y r6 = r5.f86553d
            if (r6 != r3) goto L4f
            if (r1 == 0) goto L45
            r0.add(r1)
        L45:
            t7.a r0 = new t7.a
            r0.<init>(r5)
            r5.a(r7)
            r1 = r0
            goto L61
        L4f:
            boolean r0 = r4 instanceof t7.n
            if (r0 == 0) goto L61
            if (r1 != 0) goto L5a
            t7.a r1 = new t7.a
            r1.<init>(r2)
        L5a:
            java.util.ArrayList r0 = r1.f86408a
            t7.n r4 = (t7.n) r4
            r0.add(r4)
        L61:
            int r8 = r8 + (-1)
            goto L2b
        L64:
            if (r1 == 0) goto L69
            r0.add(r1)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.b.setContents(java.util.List, java.util.List):void");
    }
}
