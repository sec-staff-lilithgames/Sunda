package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.jd.jpo.jd.jpo;
import com.bytedance.adsdk.jd.wqx.jd.Cif;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class hna implements jpo.InterfaceC0058jpo, au, ju, my, yd {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.wqx.jpo f17324cm;

    /* renamed from: jj, reason: collision with root package name */
    private final boolean f17326jj;
    private final String my;

    /* renamed from: qk, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> f17327qk;
    private final com.bytedance.adsdk.jd.zz wqx;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> xyk;

    /* renamed from: yd, reason: collision with root package name */
    private cm f17328yd;
    private final com.bytedance.adsdk.jd.jpo.jd.hna zz;
    private final Matrix jpo = new Matrix();

    /* renamed from: jd, reason: collision with root package name */
    private final Path f17325jd = new Path();

    public hna(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, Cif cif) {
        this.wqx = zzVar;
        this.f17324cm = jpoVar;
        this.my = cif.jpo();
        this.f17326jj = cif.my();
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo = cif.jd().jpo();
        this.f17327qk = jpoVarJpo;
        jpoVar.jpo(jpoVarJpo);
        jpoVarJpo.jpo(this);
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo2 = cif.wqx().jpo();
        this.xyk = jpoVarJpo2;
        jpoVar.jpo(jpoVarJpo2);
        jpoVarJpo2.jpo(this);
        com.bytedance.adsdk.jd.jpo.jd.hna hnaVarYd = cif.cm().yd();
        this.zz = hnaVarYd;
        hnaVarYd.jpo(jpoVar);
        hnaVarYd.jpo(this);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.au
    public Path cm() {
        Path pathCm = this.f17328yd.cm();
        this.f17325jd.reset();
        float fFloatValue = this.f17327qk.qk().floatValue();
        float fFloatValue2 = this.xyk.qk().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.jpo.set(this.zz.jd(i10 + fFloatValue2));
            this.f17325jd.addPath(pathCm, this.jpo);
        }
        return this.f17325jd;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.yd
    public void jpo(ListIterator<wqx> listIterator) {
        if (this.f17328yd != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f17328yd = new cm(this.wqx, this.f17324cm, "Repeater", this.f17326jj, arrayList, null);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    public void jpo(List<wqx> list, List<wqx> list2) {
        this.f17328yd.jpo(list, list2);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue = this.f17327qk.qk().floatValue();
        float fFloatValue2 = this.xyk.qk().floatValue();
        float fFloatValue3 = this.zz.jd().qk().floatValue() / 100.0f;
        float fFloatValue4 = this.zz.wqx().qk().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.jpo.set(matrix);
            float f10 = i11;
            this.jpo.preConcat(this.zz.jd(f10 + fFloatValue2));
            this.f17328yd.jpo(canvas, this.jpo, (int) (com.bytedance.adsdk.jd.jj.my.jpo(fFloatValue3, fFloatValue4, f10 / fFloatValue) * i10));
        }
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.my
    public void jpo(RectF rectF, Matrix matrix, boolean z10) {
        this.f17328yd.jpo(rectF, matrix, z10);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        this.wqx.invalidateSelf();
    }
}
