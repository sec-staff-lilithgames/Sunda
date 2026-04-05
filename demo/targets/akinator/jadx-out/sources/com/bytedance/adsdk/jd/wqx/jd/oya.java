package com.bytedance.adsdk.jd.wqx.jd;

import a.b;
import android.graphics.PointF;
import com.unity3d.services.core.request.NJc.yFkbx;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class oya {

    /* renamed from: jd, reason: collision with root package name */
    private PointF f17490jd;
    private final List<com.bytedance.adsdk.jd.wqx.jpo> jpo;
    private boolean wqx;

    public oya(PointF pointF, boolean z10, List<com.bytedance.adsdk.jd.wqx.jpo> list) {
        this.f17490jd = pointF;
        this.wqx = z10;
        this.jpo = new ArrayList(list);
    }

    public boolean jd() {
        return this.wqx;
    }

    public void jpo(float f10, float f11) {
        if (this.f17490jd == null) {
            this.f17490jd = new PointF();
        }
        this.f17490jd.set(f10, f11);
    }

    public List<com.bytedance.adsdk.jd.wqx.jpo> wqx() {
        return this.jpo;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(yFkbx.dsWcIpEt);
        sb2.append(this.jpo.size());
        sb2.append("closed=");
        return b.p(sb2, this.wqx, AbstractJsonLexerKt.END_OBJ);
    }

    public PointF jpo() {
        return this.f17490jd;
    }

    public oya() {
        this.jpo = new ArrayList();
    }

    public void jpo(boolean z10) {
        this.wqx = z10;
    }

    public void jpo(oya oyaVar, oya oyaVar2, float f10) {
        if (this.f17490jd == null) {
            this.f17490jd = new PointF();
        }
        this.wqx = oyaVar.jd() || oyaVar2.jd();
        if (oyaVar.wqx().size() != oyaVar2.wqx().size()) {
            oyaVar.wqx().size();
            oyaVar2.wqx().size();
        }
        int iMin = Math.min(oyaVar.wqx().size(), oyaVar2.wqx().size());
        if (this.jpo.size() < iMin) {
            for (int size = this.jpo.size(); size < iMin; size++) {
                this.jpo.add(new com.bytedance.adsdk.jd.wqx.jpo());
            }
        } else if (this.jpo.size() > iMin) {
            for (int size2 = this.jpo.size() - 1; size2 >= iMin; size2--) {
                List<com.bytedance.adsdk.jd.wqx.jpo> list = this.jpo;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFJpo = oyaVar.jpo();
        PointF pointFJpo2 = oyaVar2.jpo();
        jpo(com.bytedance.adsdk.jd.jj.my.jpo(pointFJpo.x, pointFJpo2.x, f10), com.bytedance.adsdk.jd.jj.my.jpo(pointFJpo.y, pointFJpo2.y, f10));
        for (int size3 = this.jpo.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.jd.wqx.jpo jpoVar = oyaVar.wqx().get(size3);
            com.bytedance.adsdk.jd.wqx.jpo jpoVar2 = oyaVar2.wqx().get(size3);
            PointF pointFJpo3 = jpoVar.jpo();
            PointF pointFJd = jpoVar.jd();
            PointF pointFWqx = jpoVar.wqx();
            PointF pointFJpo4 = jpoVar2.jpo();
            PointF pointFJd2 = jpoVar2.jd();
            PointF pointFWqx2 = jpoVar2.wqx();
            this.jpo.get(size3).jpo(com.bytedance.adsdk.jd.jj.my.jpo(pointFJpo3.x, pointFJpo4.x, f10), com.bytedance.adsdk.jd.jj.my.jpo(pointFJpo3.y, pointFJpo4.y, f10));
            this.jpo.get(size3).jd(com.bytedance.adsdk.jd.jj.my.jpo(pointFJd.x, pointFJd2.x, f10), com.bytedance.adsdk.jd.jj.my.jpo(pointFJd.y, pointFJd2.y, f10));
            this.jpo.get(size3).wqx(com.bytedance.adsdk.jd.jj.my.jpo(pointFWqx.x, pointFWqx2.x, f10), com.bytedance.adsdk.jd.jj.my.jpo(pointFWqx.y, pointFWqx2.y, f10));
        }
    }
}
