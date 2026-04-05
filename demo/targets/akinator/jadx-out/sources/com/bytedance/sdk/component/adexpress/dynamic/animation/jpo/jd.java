package com.bytedance.sdk.component.adexpress.dynamic.animation.jpo;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nzb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements nzb {
    List<cm> jpo = new ArrayList();

    public jd(View view, List<com.bytedance.sdk.component.adexpress.dynamic.cm.jpo> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.cm.jpo> it = list.iterator();
        while (it.hasNext()) {
            cm cmVarJpo = wqx.jpo().jpo(view, it.next());
            if (cmVarJpo != null) {
                this.jpo.add(cmVarJpo);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nzb
    public void jd() {
        Iterator<cm> it = this.jpo.iterator();
        while (it.hasNext()) {
            try {
                it.next().jd();
            } catch (Exception unused) {
            }
        }
    }

    public void jpo() {
        Iterator<cm> it = this.jpo.iterator();
        while (it.hasNext()) {
            try {
                it.next().wqx();
            } catch (Exception unused) {
            }
        }
    }
}
