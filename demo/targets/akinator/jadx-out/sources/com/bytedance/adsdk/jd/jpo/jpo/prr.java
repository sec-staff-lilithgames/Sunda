package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.jd.jpo.jd.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class prr implements jpo.InterfaceC0058jpo, au, ju {

    /* renamed from: cm, reason: collision with root package name */
    private final boolean f17359cm;

    /* renamed from: jj, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, PointF> f17361jj;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f17362ju;
    private final com.bytedance.adsdk.jd.zz my;

    /* renamed from: qk, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, PointF> f17363qk;
    private final String wqx;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> xyk;
    private final Path jpo = new Path();

    /* renamed from: jd, reason: collision with root package name */
    private final RectF f17360jd = new RectF();
    private final jd zz = new jd();

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> f17364yd = null;

    public prr(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jd.ju juVar) {
        this.wqx = juVar.jpo();
        this.f17359cm = juVar.my();
        this.my = zzVar;
        com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> jpoVarJpo = juVar.cm().jpo();
        this.f17361jj = jpoVarJpo;
        com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> jpoVarJpo2 = juVar.wqx().jpo();
        this.f17363qk = jpoVarJpo2;
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo3 = juVar.jd().jpo();
        this.xyk = jpoVarJpo3;
        jpoVar.jpo(jpoVarJpo);
        jpoVar.jpo(jpoVarJpo2);
        jpoVar.jpo(jpoVarJpo3);
        jpoVarJpo.jpo(this);
        jpoVarJpo2.jpo(this);
        jpoVarJpo3.jpo(this);
    }

    private void jd() {
        this.f17362ju = false;
        this.my.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.au
    public Path cm() {
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVar;
        if (this.f17362ju) {
            return this.jpo;
        }
        this.jpo.reset();
        if (this.f17359cm) {
            this.f17362ju = true;
            return this.jpo;
        }
        PointF pointFQk = this.f17363qk.qk();
        float f10 = pointFQk.x / 2.0f;
        float f11 = pointFQk.y / 2.0f;
        com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> jpoVar2 = this.xyk;
        float fZz = jpoVar2 == null ? 0.0f : ((com.bytedance.adsdk.jd.jpo.jd.cm) jpoVar2).zz();
        if (fZz == 0.0f && (jpoVar = this.f17364yd) != null) {
            fZz = Math.min(jpoVar.qk().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fZz > fMin) {
            fZz = fMin;
        }
        PointF pointFQk2 = this.f17361jj.qk();
        this.jpo.moveTo(pointFQk2.x + f10, (pointFQk2.y - f11) + fZz);
        this.jpo.lineTo(pointFQk2.x + f10, (pointFQk2.y + f11) - fZz);
        if (fZz > 0.0f) {
            RectF rectF = this.f17360jd;
            float f12 = pointFQk2.x;
            float f13 = fZz * 2.0f;
            float f14 = pointFQk2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.jpo.arcTo(this.f17360jd, 0.0f, 90.0f, false);
        }
        this.jpo.lineTo((pointFQk2.x - f10) + fZz, pointFQk2.y + f11);
        if (fZz > 0.0f) {
            RectF rectF2 = this.f17360jd;
            float f15 = pointFQk2.x;
            float f16 = pointFQk2.y;
            float f17 = fZz * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.jpo.arcTo(this.f17360jd, 90.0f, 90.0f, false);
        }
        this.jpo.lineTo(pointFQk2.x - f10, (pointFQk2.y - f11) + fZz);
        if (fZz > 0.0f) {
            RectF rectF3 = this.f17360jd;
            float f18 = pointFQk2.x;
            float f19 = pointFQk2.y;
            float f20 = fZz * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.jpo.arcTo(this.f17360jd, 180.0f, 90.0f, false);
        }
        this.jpo.lineTo((pointFQk2.x + f10) - fZz, pointFQk2.y - f11);
        if (fZz > 0.0f) {
            RectF rectF4 = this.f17360jd;
            float f21 = pointFQk2.x;
            float f22 = fZz * 2.0f;
            float f23 = pointFQk2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.jpo.arcTo(this.f17360jd, 270.0f, 90.0f, false);
        }
        this.jpo.close();
        this.zz.jpo(this.jpo);
        this.f17362ju = true;
        return this.jpo;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        jd();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(java.util.List<com.bytedance.adsdk.jd.jpo.jpo.wqx> r5, java.util.List<com.bytedance.adsdk.jd.jpo.jpo.wqx> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            com.bytedance.adsdk.jd.jpo.jpo.wqx r0 = (com.bytedance.adsdk.jd.jpo.jpo.wqx) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.jd.jpo.jpo.rq
            if (r1 == 0) goto L25
            r1 = r0
            com.bytedance.adsdk.jd.jpo.jpo.rq r1 = (com.bytedance.adsdk.jd.jpo.jpo.rq) r1
            com.bytedance.adsdk.jd.wqx.jd.jr$jpo r2 = r1.jd()
            com.bytedance.adsdk.jd.wqx.jd.jr$jpo r3 = com.bytedance.adsdk.jd.wqx.jd.jr.jpo.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            com.bytedance.adsdk.jd.jpo.jpo.jd r0 = r4.zz
            r0.jpo(r1)
            r1.jpo(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof com.bytedance.adsdk.jd.jpo.jpo.sq
            if (r1 == 0) goto L31
            com.bytedance.adsdk.jd.jpo.jpo.sq r0 = (com.bytedance.adsdk.jd.jpo.jpo.sq) r0
            com.bytedance.adsdk.jd.jpo.jd.jpo r0 = r0.jd()
            r4.f17364yd = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.jd.jpo.jpo.prr.jpo(java.util.List, java.util.List):void");
    }
}
