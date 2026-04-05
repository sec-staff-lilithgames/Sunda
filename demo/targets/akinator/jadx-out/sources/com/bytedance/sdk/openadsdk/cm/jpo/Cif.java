package com.bytedance.sdk.openadsdk.cm.jpo;

import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.nq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.cm.jpo.if, reason: invalid class name */
/* loaded from: classes4.dex */
class Cif implements com.bytedance.sdk.openadsdk.prr.wqx.wqx {
    public static final Cif jpo = new Cif();

    private Cif() {
    }

    @Override // com.bytedance.sdk.openadsdk.prr.wqx.wqx
    public void jpo(com.bytedance.sdk.openadsdk.prr.jd jdVar) {
        jpo(jdVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.prr.wqx.wqx
    public void jpo(final com.bytedance.sdk.openadsdk.prr.jd jdVar, final boolean z10) {
        jpo(new com.bytedance.sdk.component.xyk.xyk("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.cm.jpo.if.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.prr.jpo.wqx logStats = jdVar.getLogStats();
                    if (logStats == null) {
                        return;
                    }
                    com.bytedance.sdk.component.jj.jpo.cm.jpo.jpo jpoVar = new com.bytedance.sdk.component.jj.jpo.cm.jpo.jpo(nq.jpo(), logStats.jpo());
                    jpoVar.wqx((byte) 0);
                    jpoVar.jd(z10 ? (byte) 2 : (byte) 3);
                    jpoVar.jpo((byte) 1);
                    if (com.bytedance.sdk.component.jj.jpo.jd.jd()) {
                        cm.jpo(sq.jpo(), com.bytedance.sdk.openadsdk.multipro.jd.wqx());
                    }
                    com.bytedance.sdk.component.jj.jpo.jd.jpo(jpoVar);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void jpo(com.bytedance.sdk.component.xyk.xyk xykVar) {
        if (xykVar == null) {
            return;
        }
        if (!duq.qk()) {
            duq.jd(xykVar, 5);
        } else {
            xykVar.run();
        }
    }
}
