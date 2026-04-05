package com.bytedance.sdk.openadsdk.core.ju.jd.jd;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd extends com.bytedance.adsdk.ugeno.jd.jpo<com.bytedance.adsdk.ugeno.zz.jd.jpo> {
    public jd(Context context) {
        super(context);
    }

    public com.bytedance.adsdk.ugeno.zz.jd.jpo cm() {
        return ((jpo) this.my).getPlayableView();
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.zz.jd.jpo jpo() {
        jpo jpoVar = new jpo(this.f17811jd);
        jpoVar.jpo(this);
        return jpoVar;
    }
}
