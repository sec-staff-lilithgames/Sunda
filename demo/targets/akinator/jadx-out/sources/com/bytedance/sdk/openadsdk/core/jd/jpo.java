package com.bytedance.sdk.openadsdk.core.jd;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.sq.cm;
import com.bytedance.sdk.openadsdk.sq.wqx;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.vungle.ads.internal.Constants;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements tu.jpo {

    /* renamed from: jd, reason: collision with root package name */
    private final AdSlot f20452jd;
    private final tu.jpo jpo;
    private final boolean wqx;

    public jpo(tu.jpo jpoVar, AdSlot adSlot, boolean z10) {
        this.jpo = jpoVar;
        this.f20452jd = adSlot;
        this.wqx = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
    public void jpo(final int i10, final String str) {
        AdSlot adSlot;
        if (this.jpo != null) {
            if (duq.jj() || !((adSlot = this.f20452jd) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.rq.jpo.jpo("getads_callback_async", 0) != 1)) {
                this.jpo.jpo(i10, str);
            } else {
                duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jd.jpo.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jpo.this.jpo.jpo(i10, str);
                    }
                });
            }
            if (!this.wqx || this.f20452jd == null) {
                return;
            }
            wqx.wqx(new cm() { // from class: com.bytedance.sdk.openadsdk.core.jd.jpo.2
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVarH = a.h(Constants.LOAD_AD);
                    jpoVarH.wqx(jpo.this.f20452jd.getCodeId());
                    jpoVarH.cm(tic.wqx(jpo.this.f20452jd.getDurationSlotType()));
                    jpoVarH.jpo(BuildConfig.VERSION_NAME);
                    jpoVarH.qk(tic.jpo(jpo.this.f20452jd).toString());
                    return jpoVarH;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
    public void jpo(final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, final com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) {
        AdSlot adSlot;
        if (this.jpo != null) {
            if (!duq.jj() && ((adSlot = this.f20452jd) == null || adSlot.getDurationSlotType() == 5 || com.bytedance.sdk.openadsdk.rq.jpo.jpo("getads_callback_async", 0) != 1)) {
                duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jd.jpo.3
                    @Override // java.lang.Runnable
                    public void run() {
                        jpo.this.jpo.jpo(jpoVar, wqxVar);
                    }
                });
            } else {
                this.jpo.jpo(jpoVar, wqxVar);
            }
            if (!this.wqx || this.f20452jd == null) {
                return;
            }
            wqx.jd(new cm() { // from class: com.bytedance.sdk.openadsdk.core.jd.jpo.4
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVarH = a.h(Constants.LOAD_AD);
                    jpoVarH.wqx(jpo.this.f20452jd.getCodeId());
                    jpoVarH.cm(tic.wqx(jpo.this.f20452jd.getDurationSlotType()));
                    jpoVarH.jpo(BuildConfig.VERSION_NAME);
                    jpoVarH.qk(tic.jpo(jpo.this.f20452jd).toString());
                    return jpoVarH;
                }
            });
        }
    }
}
