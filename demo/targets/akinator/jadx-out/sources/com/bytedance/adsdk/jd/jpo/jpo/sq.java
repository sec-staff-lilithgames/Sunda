package com.bytedance.adsdk.jd.jpo.jpo;

import android.graphics.PointF;
import com.bytedance.adsdk.jd.jpo.jd.jpo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq implements jpo.InterfaceC0058jpo, jr {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.adsdk.jd.wqx.jd.oya f17376cm;

    /* renamed from: jd, reason: collision with root package name */
    private final String f17377jd;
    private final com.bytedance.adsdk.jd.zz jpo;
    private final com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> wqx;

    public sq(com.bytedance.adsdk.jd.zz zzVar, com.bytedance.adsdk.jd.wqx.wqx.jpo jpoVar, com.bytedance.adsdk.jd.wqx.jd.au auVar) {
        this.jpo = zzVar;
        this.f17377jd = auVar.jpo();
        com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jpoVarJpo = auVar.jd().jpo();
        this.wqx = jpoVarJpo;
        jpoVar.jpo(jpoVarJpo);
        jpoVarJpo.jpo(this);
    }

    public com.bytedance.adsdk.jd.jpo.jd.jpo<Float, Float> jd() {
        return this.wqx;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jpo.wqx
    public void jpo(List<wqx> list, List<wqx> list2) {
    }

    private com.bytedance.adsdk.jd.wqx.jd.oya jd(com.bytedance.adsdk.jd.wqx.jd.oya oyaVar) {
        List<com.bytedance.adsdk.jd.wqx.jpo> listWqx = oyaVar.wqx();
        boolean zJd = oyaVar.jd();
        int size = listWqx.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            com.bytedance.adsdk.jd.wqx.jpo jpoVar = listWqx.get(size);
            com.bytedance.adsdk.jd.wqx.jpo jpoVar2 = listWqx.get(jpo(size - 1, listWqx.size()));
            PointF pointFWqx = (size != 0 || zJd) ? jpoVar2.wqx() : oyaVar.jpo();
            i10 = (((size != 0 || zJd) ? jpoVar2.jd() : pointFWqx).equals(pointFWqx) && jpoVar.jpo().equals(pointFWqx) && !(!oyaVar.jd() && size == 0 && size == listWqx.size() - 1)) ? i10 + 2 : i10 + 1;
            size--;
        }
        com.bytedance.adsdk.jd.wqx.jd.oya oyaVar2 = this.f17376cm;
        if (oyaVar2 == null || oyaVar2.wqx().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new com.bytedance.adsdk.jd.wqx.jpo());
            }
            this.f17376cm = new com.bytedance.adsdk.jd.wqx.jd.oya(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f17376cm.jpo(zJd);
        return this.f17376cm;
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo.InterfaceC0058jpo
    public void jpo() {
        this.jpo.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    @Override // com.bytedance.adsdk.jd.jpo.jpo.jr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.adsdk.jd.wqx.jd.oya jpo(com.bytedance.adsdk.jd.wqx.jd.oya r19) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.jd.jpo.jpo.sq.jpo(com.bytedance.adsdk.jd.wqx.jd.oya):com.bytedance.adsdk.jd.wqx.jd.oya");
    }

    private static int jd(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int jpo(int i10, int i11) {
        return i10 - (jd(i10, i11) * i11);
    }
}
