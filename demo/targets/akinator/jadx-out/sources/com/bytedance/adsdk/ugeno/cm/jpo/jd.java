package com.bytedance.adsdk.ugeno.cm.jpo;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements wqx {
    private List<cm> jpo = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.cm.jpo.wqx
    public void jpo(cm cmVar) {
        this.jpo.add(cmVar);
    }

    @Override // com.bytedance.adsdk.ugeno.cm.jpo.wqx
    public void jpo(String str) {
        if (this.jpo.isEmpty()) {
            return;
        }
        Iterator<cm> it = this.jpo.iterator();
        while (it.hasNext()) {
            it.next().jpo(str);
        }
    }
}
