package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.jd.jpo.jd.jpo;
import com.bytedance.adsdk.jd.wqx.jd.jr;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj implements jpo.InterfaceC0058jpo, au, ju {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, PointF> f17332cm;

    /* renamed from: jd, reason: collision with root package name */
    private final String f17333jd;

    /* renamed from: jj, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jd.jd f17334jj;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, PointF> my;
    private final com.bytedance.adsdk.jd.zz wqx;
    private boolean xyk;
    private final Path jpo = new Path();

    /* renamed from: qk, reason: collision with root package name */
    private final jd f17335qk = new jd();

    public jj(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jd.jd jdVar) {
        this.f17333jd = jdVar.jpo();
        this.wqx = zzVar;
        com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> jpoVarJpo = jdVar.wqx().jpo();
        this.f17332cm = jpoVarJpo;
        com.bytedance.adsdk.jd.jpo.jd.jpo<PointF, PointF> jpoVarJpo2 = jdVar.jd().jpo();
        this.my = jpoVarJpo2;
        this.f17334jj = jdVar;
        jpoVar.jpo(jpoVarJpo);
        jpoVar.jpo(jpoVarJpo2);
        jpoVarJpo.jpo(this);
        jpoVarJpo2.jpo(this);
    }

    private void jd() {
        this.xyk = false;
        this.wqx.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.au
    public Path cm() {
        if (this.xyk) {
            return this.jpo;
        }
        this.jpo.reset();
        if (this.f17334jj.my()) {
            this.xyk = true;
            return this.jpo;
        }
        PointF pointFQk = this.f17332cm.qk();
        float f10 = pointFQk.x / 2.0f;
        float f11 = pointFQk.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.jpo.reset();
        if (this.f17334jj.cm()) {
            float f14 = -f11;
            this.jpo.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.jpo.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.jpo.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.jpo.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.jpo.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.jpo.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.jpo.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.jpo.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.jpo.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.jpo.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFQk2 = this.my.qk();
        this.jpo.offset(pointFQk2.x, pointFQk2.y);
        this.jpo.close();
        this.f17335qk.jpo(this.jpo);
        this.xyk = true;
        return this.jpo;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        jd();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    public void jpo(List<wqx> list, List<wqx> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            wqx wqxVar = list.get(i10);
            if (wqxVar instanceof rq) {
                rq rqVar = (rq) wqxVar;
                if (rqVar.jd() == jr.jpo.SIMULTANEOUSLY) {
                    this.f17335qk.jpo(rqVar);
                    rqVar.jpo(this);
                }
            }
        }
    }
}
