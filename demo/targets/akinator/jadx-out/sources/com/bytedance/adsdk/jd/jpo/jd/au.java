package com.bytedance.adsdk.jd.jpo.jd;

import android.graphics.Path;
import com.bytedance.adsdk.jd.jpo.jpo.jr;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au extends jpo<com.bytedance.adsdk.jd.wqx.jd.oya, Path> {

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.adsdk.jd.wqx.jd.oya f17286cm;

    /* renamed from: jj, reason: collision with root package name */
    private List<jr> f17287jj;
    private final Path my;

    public au(List<com.bytedance.adsdk.jd.qk.jpo<com.bytedance.adsdk.jd.wqx.jd.oya>> list) {
        super(list);
        this.f17286cm = new com.bytedance.adsdk.jd.wqx.jd.oya();
        this.my = new Path();
    }

    @Override // com.bytedance.adsdk.jd.jpo.jd.jpo
    /* renamed from: jd, reason: merged with bridge method [inline-methods] */
    public Path jpo(com.bytedance.adsdk.jd.qk.jpo<com.bytedance.adsdk.jd.wqx.jd.oya> jpoVar, float f10) {
        this.f17286cm.jpo(jpoVar.jpo, jpoVar.f17433jd, f10);
        com.bytedance.adsdk.jd.wqx.jd.oya oyaVarJpo = this.f17286cm;
        List<jr> list = this.f17287jj;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oyaVarJpo = this.f17287jj.get(size).jpo(oyaVarJpo);
            }
        }
        com.bytedance.adsdk.jd.jj.my.jpo(oyaVarJpo, this.my);
        return this.my;
    }

    public void jpo(List<jr> list) {
        this.f17287jj = list;
    }
}
