package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.jd.jpo.jd.jpo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class jpo implements jpo.InterfaceC0058jpo, ju, my {

    /* renamed from: au, reason: collision with root package name */
    private final List<com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float>> f17336au;
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> hna;

    /* renamed from: if, reason: not valid java name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Integer> f6if;

    /* renamed from: jd, reason: collision with root package name */
    final Paint f17338jd;
    protected final com.bytedance.adsdk.jd.wqx.wqx.jpo jpo;

    /* renamed from: ju, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> f17340ju;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> oya;
    private com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> prr;

    /* renamed from: sq, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.wqx f17342sq;
    float wqx;
    private final com.bytedance.adsdk.jd.zz xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final float[] f17343yd;

    /* renamed from: cm, reason: collision with root package name */
    private final PathMeasure f17337cm = new PathMeasure();
    private final Path my = new Path();

    /* renamed from: jj, reason: collision with root package name */
    private final Path f17339jj = new Path();

    /* renamed from: qk, reason: collision with root package name */
    private final RectF f17341qk = new RectF();
    private final List<C0059jpo> zz = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.adsdk.jd.jpo.jpo.jpo$jpo, reason: collision with other inner class name */
    public static final class C0059jpo {

        /* renamed from: jd, reason: collision with root package name */
        private final rq f17344jd;
        private final List<au> jpo;

        private C0059jpo(rq rqVar) {
            this.jpo = new ArrayList();
            this.f17344jd = rqVar;
        }
    }

    public jpo(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, Paint.Cap cap, Paint.Join join, float f10, com.bytedance.adsdk.jd.wqx.jpo.cm cmVar, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar, List<com.bytedance.adsdk.jd.wqx.jpo.jd> list, com.bytedance.adsdk.jd.wqx.jpo.jd jdVar2) {
        com.bytedance.adsdk.jd.jpo.jpo jpoVar2 = new com.bytedance.adsdk.jd.jpo.jpo(1);
        this.f17338jd = jpoVar2;
        this.wqx = 0.0f;
        this.xyk = zzVar;
        this.jpo = jpoVar;
        jpoVar2.setStyle(Paint.Style.STROKE);
        jpoVar2.setStrokeCap(cap);
        jpoVar2.setStrokeJoin(join);
        jpoVar2.setStrokeMiter(f10);
        this.f6if = cmVar.jpo();
        this.f17340ju = jdVar.jpo();
        if (jdVar2 == null) {
            this.oya = null;
        } else {
            this.oya = jdVar2.jpo();
        }
        this.f17336au = new ArrayList(list.size());
        this.f17343yd = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f17336au.add(list.get(i10).jpo());
        }
        jpoVar.jpo(this.f6if);
        jpoVar.jpo(this.f17340ju);
        for (int i11 = 0; i11 < this.f17336au.size(); i11++) {
            jpoVar.jpo(this.f17336au.get(i11));
        }
        com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> jpoVar3 = this.oya;
        if (jpoVar3 != null) {
            jpoVar.jpo(jpoVar3);
        }
        this.f6if.jpo(this);
        this.f17340ju.jpo(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f17336au.get(i12).jpo(this);
        }
        com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> jpoVar4 = this.oya;
        if (jpoVar4 != null) {
            jpoVar4.jpo(this);
        }
        if (jpoVar.yd() != null) {
            com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo = jpoVar.yd().jpo().jpo();
            this.hna = jpoVarJpo;
            jpoVarJpo.jpo(this);
            jpoVar.jpo(this.hna);
        }
        if (jpoVar.ju() != null) {
            this.f17342sq = new com.bytedance.adsdk.jd.jpo.jd.wqx(this, jpoVar, jpoVar.ju());
        }
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        this.xyk.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(java.util.List<com.bytedance.adsdk.jd.jpo.jpo.wqx> r8, java.util.List<com.bytedance.adsdk.jd.jpo.jpo.wqx> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            com.bytedance.adsdk.jd.jpo.jpo.wqx r3 = (com.bytedance.adsdk.jd.jpo.jpo.wqx) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.jd.jpo.jpo.rq
            if (r4 == 0) goto L1f
            com.bytedance.adsdk.jd.jpo.jpo.rq r3 = (com.bytedance.adsdk.jd.jpo.jpo.rq) r3
            com.bytedance.adsdk.jd.wqx.jd.jr$jpo r4 = r3.jd()
            com.bytedance.adsdk.jd.wqx.jd.jr$jpo r5 = com.bytedance.adsdk.jd.wqx.jd.jr.jpo.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.jpo(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            com.bytedance.adsdk.jd.jpo.jpo.wqx r3 = (com.bytedance.adsdk.jd.jpo.jpo.wqx) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.jd.jpo.jpo.rq
            if (r4 == 0) goto L55
            r4 = r3
            com.bytedance.adsdk.jd.jpo.jpo.rq r4 = (com.bytedance.adsdk.jd.jpo.jpo.rq) r4
            com.bytedance.adsdk.jd.wqx.jd.jr$jpo r5 = r4.jd()
            com.bytedance.adsdk.jd.wqx.jd.jr$jpo r6 = com.bytedance.adsdk.jd.wqx.jd.jr.jpo.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<com.bytedance.adsdk.jd.jpo.jpo.jpo$jpo> r3 = r7.zz
            r3.add(r0)
        L4c:
            com.bytedance.adsdk.jd.jpo.jpo.jpo$jpo r0 = new com.bytedance.adsdk.jd.jpo.jpo.jpo$jpo
            r0.<init>(r4)
            r4.jpo(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof com.bytedance.adsdk.jd.jpo.jpo.au
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            com.bytedance.adsdk.jd.jpo.jpo.jpo$jpo r0 = new com.bytedance.adsdk.jd.jpo.jpo.jpo$jpo
            r0.<init>(r2)
        L60:
            java.util.List r4 = com.bytedance.adsdk.jd.jpo.jpo.jpo.C0059jpo.jpo(r0)
            com.bytedance.adsdk.jd.jpo.jpo.au r3 = (com.bytedance.adsdk.jd.jpo.jpo.au) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<com.bytedance.adsdk.jd.jpo.jpo.jpo$jpo> r8 = r7.zz
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.jd.jpo.jpo.jpo.jpo(java.util.List, java.util.List):void");
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(Canvas canvas, Matrix matrix, int i10) {
        com.bytedance.adsdk.jd.my.jpo("StrokeContent#draw");
        if (com.bytedance.adsdk.jd.jj.jj.jd(matrix)) {
            com.bytedance.adsdk.jd.my.jd("StrokeContent#draw");
            return;
        }
        this.f17338jd.setAlpha(com.bytedance.adsdk.jd.jj.my.jpo((int) ((((i10 / 255.0f) * ((com.bytedance.adsdk.jd.jpo.jd.jj) this.f6if).zz()) / 100.0f) * 255.0f), 0, 255));
        this.f17338jd.setStrokeWidth(com.bytedance.adsdk.jd.jj.jj.jpo(matrix) * ((com.bytedance.adsdk.jd.jpo.jd.cm) this.f17340ju).zz());
        if (this.f17338jd.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.jd.my.jd("StrokeContent#draw");
            return;
        }
        jpo(matrix);
        com.bytedance.adsdk.jd.jpo.jd.jpo<ColorFilter, ColorFilter> jpoVar = this.prr;
        if (jpoVar != null) {
            this.f17338jd.setColorFilter(jpoVar.qk());
        }
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVar2 = this.hna;
        if (jpoVar2 != null) {
            float fFloatValue = jpoVar2.qk().floatValue();
            if (fFloatValue == 0.0f) {
                this.f17338jd.setMaskFilter(null);
            } else if (fFloatValue != this.wqx) {
                this.f17338jd.setMaskFilter(this.jpo.jd(fFloatValue));
            }
            this.wqx = fFloatValue;
        }
        com.bytedance.adsdk.jd.jpo.jd.wqx wqxVar = this.f17342sq;
        if (wqxVar != null) {
            wqxVar.jpo(this.f17338jd);
        }
        for (int i11 = 0; i11 < this.zz.size(); i11++) {
            C0059jpo c0059jpo = this.zz.get(i11);
            if (c0059jpo.f17344jd != null) {
                jpo(canvas, c0059jpo, matrix);
            } else {
                com.bytedance.adsdk.jd.my.jpo("StrokeContent#buildPath");
                this.my.reset();
                for (int size = c0059jpo.jpo.size() - 1; size >= 0; size--) {
                    this.my.addPath(((au) c0059jpo.jpo.get(size)).cm(), matrix);
                }
                com.bytedance.adsdk.jd.my.jd("StrokeContent#buildPath");
                com.bytedance.adsdk.jd.my.jpo("StrokeContent#drawPath");
                canvas.drawPath(this.my, this.f17338jd);
                com.bytedance.adsdk.jd.my.jd("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.jd.my.jd("StrokeContent#draw");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(android.graphics.Canvas r17, com.bytedance.adsdk.jd.jpo.jpo.jpo.C0059jpo r18, android.graphics.Matrix r19) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.jd.jpo.jpo.jpo.jpo(android.graphics.Canvas, com.bytedance.adsdk.jd.jpo.jpo.jpo$jpo, android.graphics.Matrix):void");
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(RectF rectF, Matrix matrix, boolean z10) {
        com.bytedance.adsdk.jd.my.jpo("StrokeContent#getBounds");
        this.my.reset();
        for (int i10 = 0; i10 < this.zz.size(); i10++) {
            C0059jpo c0059jpo = this.zz.get(i10);
            for (int i11 = 0; i11 < c0059jpo.jpo.size(); i11++) {
                this.my.addPath(((au) c0059jpo.jpo.get(i11)).cm(), matrix);
            }
        }
        this.my.computeBounds(this.f17341qk, false);
        float fZz = ((com.bytedance.adsdk.jd.jpo.jd.cm) this.f17340ju).zz();
        RectF rectF2 = this.f17341qk;
        float f10 = fZz / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f17341qk);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.jd.my.jd("StrokeContent#getBounds");
    }

    private void jpo(Matrix matrix) {
        com.bytedance.adsdk.jd.my.jpo("StrokeContent#applyDashPattern");
        if (this.f17336au.isEmpty()) {
            com.bytedance.adsdk.jd.my.jd("StrokeContent#applyDashPattern");
            return;
        }
        float fJpo = com.bytedance.adsdk.jd.jj.jj.jpo(matrix);
        for (int i10 = 0; i10 < this.f17336au.size(); i10++) {
            this.f17343yd[i10] = this.f17336au.get(i10).qk().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f17343yd;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f17343yd;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.f17343yd;
            fArr3[i10] = fArr3[i10] * fJpo;
        }
        com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> jpoVar = this.oya;
        this.f17338jd.setPathEffect(new DashPathEffect(this.f17343yd, jpoVar == null ? 0.0f : fJpo * jpoVar.qk().floatValue()));
        com.bytedance.adsdk.jd.my.jd("StrokeContent#applyDashPattern");
    }
}
