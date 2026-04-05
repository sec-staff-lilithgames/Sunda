package com.bytedance.adsdk.jd.jpo.jd;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {

    /* renamed from: jd, reason: collision with root package name */
    private final List<jpo<Integer, Integer>> f17312jd;
    private final List<jpo<com.bytedance.adsdk.jd.wqx.jd.oya, Path>> jpo;
    private final List<com.bytedance.adsdk.jd.wqx.jd.xyk> wqx;

    public xyk(List<com.bytedance.adsdk.jd.wqx.jd.xyk> list) {
        this.wqx = list;
        this.jpo = new ArrayList(list.size());
        this.f17312jd = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.jpo.add(list.get(i10).jd().jpo());
            this.f17312jd.add(list.get(i10).wqx().jpo());
        }
    }

    public List<jpo<com.bytedance.adsdk.jd.wqx.jd.oya, Path>> jd() {
        return this.jpo;
    }

    public List<com.bytedance.adsdk.jd.wqx.jd.xyk> jpo() {
        return this.wqx;
    }

    public List<jpo<Integer, Integer>> wqx() {
        return this.f17312jd;
    }
}
