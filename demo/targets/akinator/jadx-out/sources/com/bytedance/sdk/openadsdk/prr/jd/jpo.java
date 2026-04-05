package com.bytedance.sdk.openadsdk.prr.jd;

import com.bytedance.sdk.component.xyk.wqx;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.prr.jd;
import com.bytedance.sdk.openadsdk.prr.jpo.cm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements wqx {
    @Override // com.bytedance.sdk.component.xyk.wqx
    public void jpo(final com.bytedance.sdk.component.xyk.jd.jpo jpoVar) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo();
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("stats_sdk_thread_num", false, new jd() { // from class: com.bytedance.sdk.openadsdk.prr.jd.jpo.1
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                com.bytedance.sdk.component.xyk.jd.jpo jpoVar2;
                if (!sq.cm().ic() || (jpoVar2 = jpoVar) == null || jpoVar2.jpo() == null) {
                    return null;
                }
                return cm.jd().jpo("stats_sdk_thread_num").jd(jpoVar.jpo().toString());
            }
        });
    }
}
