package com.bytedance.sdk.openadsdk.prr.wqx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class my implements wqx {
    private static volatile my jpo;

    private my() {
    }

    @Override // com.bytedance.sdk.openadsdk.prr.wqx.wqx
    public void jpo(com.bytedance.sdk.openadsdk.prr.jd jdVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.prr.wqx.wqx
    public void jpo(com.bytedance.sdk.openadsdk.prr.jd jdVar, boolean z10) {
    }

    public static my jpo() {
        if (jpo == null) {
            synchronized (my.class) {
                try {
                    if (jpo == null) {
                        jpo = new my();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }
}
