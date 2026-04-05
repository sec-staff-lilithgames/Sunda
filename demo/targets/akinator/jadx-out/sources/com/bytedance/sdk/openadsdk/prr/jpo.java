package com.bytedance.sdk.openadsdk.prr;

import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.cm.jpo.jj;
import com.bytedance.sdk.openadsdk.core.nq;
import com.bytedance.sdk.openadsdk.utils.duq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    public static void jpo() {
        if (duq.jj()) {
            duq.jpo(new xyk("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.prr.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    jpo.wqx();
                }
            });
        } else {
            wqx();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wqx() {
        com.bytedance.sdk.openadsdk.cm.jpo.jpo.jd();
        jj.jpo();
        nq.jpo();
    }
}
