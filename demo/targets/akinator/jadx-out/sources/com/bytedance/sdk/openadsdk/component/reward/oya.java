package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class oya implements TTClientBidding {
    private final jj jpo;

    public oya(Context context, com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        this.jpo = new jj(context, jpoVar);
    }

    public void jd() {
        this.jpo.jpo();
    }

    public jj jpo() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        this.jpo.loss(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        this.jpo.win(d10);
    }

    public void jpo(boolean z10) {
        this.jpo.jpo(z10);
    }
}
