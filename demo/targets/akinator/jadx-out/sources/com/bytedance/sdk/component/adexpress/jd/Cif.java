package com.bytedance.sdk.component.adexpress.jd;

import com.bytedance.sdk.component.adexpress.jd.yd;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.component.adexpress.jd.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif implements yd.jpo {

    /* renamed from: cm, reason: collision with root package name */
    private AtomicBoolean f18396cm = new AtomicBoolean(false);

    /* renamed from: jd, reason: collision with root package name */
    private List<yd> f18397jd;
    prr jpo;
    private zz wqx;

    public Cif(List<yd> list, zz zzVar) {
        this.f18397jd = list;
        this.wqx = zzVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd.jpo
    public boolean jd(yd ydVar) {
        int iIndexOf = this.f18397jd.indexOf(ydVar);
        return iIndexOf < this.f18397jd.size() - 1 && iIndexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd.jpo
    public void jpo() {
        this.wqx.cm();
        Iterator<yd> it = this.f18397jd.iterator();
        while (it.hasNext() && !it.next().jpo(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd.jpo
    public boolean wqx() {
        return this.f18396cm.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd.jpo
    public prr jd() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd.jpo
    public void jpo(yd ydVar) {
        int iIndexOf = this.f18397jd.indexOf(ydVar);
        if (iIndexOf < 0) {
            return;
        }
        do {
            iIndexOf++;
            if (iIndexOf >= this.f18397jd.size()) {
                return;
            }
        } while (!this.f18397jd.get(iIndexOf).jpo(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd.jpo
    public void jpo(prr prrVar) {
        this.jpo = prrVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.yd.jpo
    public void jpo(boolean z10) {
        this.f18396cm.getAndSet(z10);
    }
}
