package com.bytedance.sdk.component.jj.jpo.jpo;

import com.bytedance.sdk.component.jj.jpo.jpo.jd.qk;
import com.bytedance.sdk.component.jj.jpo.xyk;
import java.util.List;
import java.util.Queue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj implements cm {

    /* renamed from: au, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f18705au;

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.jpo.jd.jd f18706cm;

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f68if;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.jpo.jd.my f18707jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.jpo.jd.wqx f18708jj;
    my jpo = xyk.qk().cm();

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f18709ju;
    private qk my;
    private Queue<String> oya;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.jpo.jd.jj f18710qk;
    private com.bytedance.sdk.component.jj.jpo.jpo.jd.jpo wqx;
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo xyk;

    /* renamed from: yd, reason: collision with root package name */
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo f18711yd;
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo zz;

    public jj(Queue<String> queue) {
        this.oya = queue;
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo()) {
            com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVarM417if = xyk.qk().m417if();
            this.xyk = jpoVarM417if;
            this.f18707jd = new com.bytedance.sdk.component.jj.jpo.jpo.jd.my(jpoVarM417if, queue);
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.my()) {
            if (xyk.qk().yd() != null) {
                this.f18711yd = xyk.qk().yd();
            } else {
                this.f18711yd = xyk.qk().au();
            }
            this.f18706cm = new com.bytedance.sdk.component.jj.jpo.jpo.jd.jd(this.f18711yd, queue);
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jd()) {
            com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVarAu = xyk.qk().au();
            this.zz = jpoVarAu;
            this.wqx = new com.bytedance.sdk.component.jj.jpo.jpo.jd.jpo(jpoVarAu, queue);
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.wqx()) {
            com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVarAu2 = xyk.qk().au();
            this.f18709ju = jpoVarAu2;
            this.my = new qk(jpoVarAu2, queue);
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.cm()) {
            com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVarOya = xyk.qk().oya();
            this.f68if = jpoVarOya;
            this.f18708jj = new com.bytedance.sdk.component.jj.jpo.jpo.jd.wqx(jpoVarOya, queue);
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jj()) {
            com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVarPrr = xyk.qk().prr();
            this.f18705au = jpoVarPrr;
            this.f18710qk = new com.bytedance.sdk.component.jj.jpo.jpo.jd.jj(jpoVarPrr, queue);
        }
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public void jpo(int i10, long j10) {
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public void jpo(com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar, int i10) {
        try {
            byte bCm = jpoVar.cm();
            byte bMy = jpoVar.my();
            if (bCm == 0 && bMy == 1 && com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo()) {
                this.f18707jd.jpo(jpoVar);
                return;
            }
            if (bCm == 3 && bMy == 2 && com.bytedance.sdk.component.jj.jpo.jd.jpo.my()) {
                this.f18706cm.jpo(jpoVar);
                return;
            }
            if (bCm == 0 && bMy == 2 && com.bytedance.sdk.component.jj.jpo.jd.jpo.jd()) {
                this.wqx.jpo(jpoVar);
                return;
            }
            if (bCm == 1 && bMy == 2 && com.bytedance.sdk.component.jj.jpo.jd.jpo.wqx()) {
                this.my.jpo(jpoVar);
                return;
            }
            if (bCm == 1 && bMy == 3 && com.bytedance.sdk.component.jj.jpo.jd.jpo.cm()) {
                this.f18708jj.jpo(jpoVar);
            } else if (bCm == 2 && bMy == 3 && com.bytedance.sdk.component.jj.jpo.jd.jpo.jj()) {
                this.f18710qk.jpo(jpoVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public void jpo(int i10, List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar = list.get(0);
        byte bMy = jpoVar.my();
        byte bCm = jpoVar.cm();
        if (bCm == 0 && bMy == 1 && com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo()) {
            this.f18707jd.jpo(i10, list);
            return;
        }
        if (bCm == 3 && bMy == 2 && com.bytedance.sdk.component.jj.jpo.jd.jpo.my()) {
            this.f18706cm.jpo(i10, list);
            return;
        }
        if (bCm == 0 && bMy == 2 && com.bytedance.sdk.component.jj.jpo.jd.jpo.jd()) {
            this.wqx.jpo(i10, list);
            return;
        }
        if (bCm == 1 && bMy == 2 && com.bytedance.sdk.component.jj.jpo.jd.jpo.wqx()) {
            this.my.jpo(i10, list);
            return;
        }
        if (bCm == 1 && bMy == 3 && com.bytedance.sdk.component.jj.jpo.jd.jpo.cm()) {
            this.f18708jj.jpo(i10, list);
        } else if (bCm == 2 && bMy == 3 && com.bytedance.sdk.component.jj.jpo.jd.jpo.jj()) {
            this.f18710qk.jpo(i10, list);
        }
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public List<com.bytedance.sdk.component.jj.jpo.cm.jpo> jpo(int i10, int i11, List<String> list) {
        List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo;
        List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo2;
        List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo3;
        List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo4;
        List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo5;
        List<com.bytedance.sdk.component.jj.jpo.cm.jpo> listJpo6;
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo() && this.f18707jd.jd(i10, i11) && (listJpo6 = this.f18707jd.jpo(i10, i11)) != null && listJpo6.size() != 0) {
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.opi(), 1);
            return listJpo6;
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.my() && this.f18706cm.jd(i10, i11) && (listJpo5 = this.f18706cm.jpo(i10, i11)) != null && listJpo5.size() != 0) {
            return listJpo5;
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jd() && this.wqx.jd(i10, i11) && (listJpo4 = this.wqx.jpo(i10, i11)) != null && listJpo4.size() != 0) {
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.jr(), 1);
            return listJpo4;
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.wqx() && this.my.jd(i10, i11) && (listJpo3 = this.my.jpo(i10, i11)) != null && listJpo3.size() != 0) {
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.nmd(), 1);
            return listJpo3;
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.cm() && this.f18708jj.jd(i10, i11) && (listJpo2 = this.f18708jj.jpo(i10, i11)) != null && listJpo2.size() != 0) {
            com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.rq(), 1);
            return listJpo2;
        }
        if (!com.bytedance.sdk.component.jj.jpo.jd.jpo.jj() || !this.f18710qk.jd(i10, i11) || (listJpo = this.f18710qk.jpo(i10, i11)) == null || listJpo.size() == 0) {
            return null;
        }
        return listJpo;
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.cm
    public boolean jpo(int i10, boolean z10) {
        com.bytedance.sdk.component.jj.jpo.jpo.jd.jj jjVar;
        com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar;
        com.bytedance.sdk.component.jj.jpo.jpo.jd.wqx wqxVar;
        com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar2;
        qk qkVar;
        com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar3;
        com.bytedance.sdk.component.jj.jpo.jpo.jd.jpo jpoVar4;
        com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar5;
        com.bytedance.sdk.component.jj.jpo.jpo.jd.jd jdVar;
        com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar6;
        com.bytedance.sdk.component.jj.jpo.jpo.jd.my myVar;
        com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar7;
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo() && (myVar = this.f18707jd) != null && (jpoVar7 = this.xyk) != null && myVar.jd(i10, jpoVar7.jpo())) {
            return true;
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.my() && (jdVar = this.f18706cm) != null && (jpoVar6 = this.f18711yd) != null && jdVar.jd(i10, jpoVar6.jpo())) {
            return true;
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.jd() && (jpoVar4 = this.wqx) != null && (jpoVar5 = this.zz) != null && jpoVar4.jd(i10, jpoVar5.jpo())) {
            return true;
        }
        if (com.bytedance.sdk.component.jj.jpo.jd.jpo.wqx() && (qkVar = this.my) != null && (jpoVar3 = this.f18709ju) != null && qkVar.jd(i10, jpoVar3.jpo())) {
            return true;
        }
        if (!com.bytedance.sdk.component.jj.jpo.jd.jpo.cm() || (wqxVar = this.f18708jj) == null || (jpoVar2 = this.f68if) == null || !wqxVar.jd(i10, jpoVar2.jpo())) {
            return com.bytedance.sdk.component.jj.jpo.jd.jpo.jj() && (jjVar = this.f18710qk) != null && (jpoVar = this.f18705au) != null && jjVar.jd(i10, jpoVar.jpo());
        }
        return true;
    }
}
