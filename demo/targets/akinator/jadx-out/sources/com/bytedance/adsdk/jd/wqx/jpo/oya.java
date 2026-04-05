package com.bytedance.adsdk.jd.wqx.jpo;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
abstract class oya<V, O> implements au<V, O> {
    final List<com.bytedance.adsdk.jd.qk.jpo<V>> jpo;

    public oya(List<com.bytedance.adsdk.jd.qk.jpo<V>> list) {
        this.jpo = list;
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.au
    public boolean jd() {
        return this.jpo.isEmpty() || (this.jpo.size() == 1 && this.jpo.get(0).my());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.jpo.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.jpo.toArray()));
        }
        return sb2.toString();
    }

    @Override // com.bytedance.adsdk.jd.wqx.jpo.au
    public List<com.bytedance.adsdk.jd.qk.jpo<V>> wqx() {
        return this.jpo;
    }
}
