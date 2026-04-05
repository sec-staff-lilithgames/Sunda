package com.bytedance.adsdk.jd.jpo.jpo;

import com.bytedance.adsdk.jd.jpo.jd.jpo;
import com.bytedance.adsdk.jd.wqx.jd.jr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class rq implements jpo.InterfaceC0058jpo, wqx {

    /* renamed from: cm, reason: collision with root package name */
    private final jr.jpo f17372cm;

    /* renamed from: jd, reason: collision with root package name */
    private final boolean f17373jd;

    /* renamed from: jj, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> f17374jj;
    private final String jpo;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> my;

    /* renamed from: qk, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> f17375qk;
    private final List<jpo.InterfaceC0058jpo> wqx = new ArrayList();

    public rq(com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jd.jr jrVar) {
        this.jpo = jrVar.jpo();
        this.f17373jd = jrVar.jj();
        this.f17372cm = jrVar.jd();
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo = jrVar.cm().jpo();
        this.my = jpoVarJpo;
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo2 = jrVar.wqx().jpo();
        this.f17374jj = jpoVarJpo2;
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo3 = jrVar.my().jpo();
        this.f17375qk = jpoVarJpo3;
        jpoVar.jpo(jpoVarJpo);
        jpoVar.jpo(jpoVarJpo2);
        jpoVar.jpo(jpoVarJpo3);
        jpoVarJpo.jpo(this);
        jpoVarJpo2.jpo(this);
        jpoVarJpo3.jpo(this);
    }

    public com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> cm() {
        return this.f17374jj;
    }

    public jr.jpo jd() {
        return this.f17372cm;
    }

    public boolean jj() {
        return this.f17373jd;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    public void jpo(List<wqx> list, List<wqx> list2) {
    }

    public com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> my() {
        return this.f17375qk;
    }

    public com.bytedance.adsdk.jd.jpo.jd.jpo<?, Float> wqx() {
        return this.my;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        for (int i10 = 0; i10 < this.wqx.size(); i10++) {
            this.wqx.get(i10).jpo();
        }
    }

    public void jpo(jpo.InterfaceC0058jpo interfaceC0058jpo) {
        this.wqx.add(interfaceC0058jpo);
    }
}
