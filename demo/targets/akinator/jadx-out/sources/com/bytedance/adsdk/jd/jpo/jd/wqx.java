package com.bytedance.adsdk.jd.jpo.jd;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.jd.jpo.jd.jpo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements jpo.InterfaceC0058jpo {

    /* renamed from: cm, reason: collision with root package name */
    private final jpo<Float, Float> f17308cm;

    /* renamed from: jd, reason: collision with root package name */
    private final jpo<Integer, Integer> f17309jd;

    /* renamed from: jj, reason: collision with root package name */
    private final jpo<Float, Float> f17310jj;
    private final jpo.InterfaceC0058jpo jpo;
    private final jpo<Float, Float> my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f17311qk = true;
    private final jpo<Float, Float> wqx;

    public wqx(jpo.InterfaceC0058jpo interfaceC0058jpo, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.my.yd ydVar) {
        this.jpo = interfaceC0058jpo;
        jpo<Integer, Integer> jpoVarJpo = ydVar.jpo().jpo();
        this.f17309jd = jpoVarJpo;
        jpoVarJpo.jpo(this);
        jpoVar.jpo(jpoVarJpo);
        jpo<Float, Float> jpoVarJpo2 = ydVar.jd().jpo();
        this.wqx = jpoVarJpo2;
        jpoVarJpo2.jpo(this);
        jpoVar.jpo(jpoVarJpo2);
        jpo<Float, Float> jpoVarJpo3 = ydVar.wqx().jpo();
        this.f17308cm = jpoVarJpo3;
        jpoVarJpo3.jpo(this);
        jpoVar.jpo(jpoVarJpo3);
        jpo<Float, Float> jpoVarJpo4 = ydVar.cm().jpo();
        this.my = jpoVarJpo4;
        jpoVarJpo4.jpo(this);
        jpoVar.jpo(jpoVarJpo4);
        jpo<Float, Float> jpoVarJpo5 = ydVar.my().jpo();
        this.f17310jj = jpoVarJpo5;
        jpoVarJpo5.jpo(this);
        jpoVar.jpo(jpoVarJpo5);
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        this.f17311qk = true;
        this.jpo.jpo();
    }

    public void jpo(Paint paint) {
        if (this.f17311qk) {
            this.f17311qk = false;
            double dFloatValue = this.f17308cm.qk().floatValue() * 0.017453292519943295d;
            float fFloatValue = this.my.qk().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f17309jd.qk().intValue();
            paint.setShadowLayer(this.f17310jj.qk().floatValue(), fSin, fCos, Color.argb(Math.round(this.wqx.qk().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
