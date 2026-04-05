package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.duq;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends com.bytedance.sdk.component.xyk.xyk {
    private final List<? extends com.bytedance.sdk.component.xyk.xyk> jpo;

    public jd(String str, List<? extends com.bytedance.sdk.component.xyk.xyk> list) {
        super(str);
        this.jpo = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.xyk.xyk> list;
        if (opi.wqx(sq.jpo()) != 0 && (list = this.jpo) != null) {
            Iterator<? extends com.bytedance.sdk.component.xyk.xyk> it = list.iterator();
            while (it.hasNext()) {
                duq.jpo(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.zz.jpo().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
