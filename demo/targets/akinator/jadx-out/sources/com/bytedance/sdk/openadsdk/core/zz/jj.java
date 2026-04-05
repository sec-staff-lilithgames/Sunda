package com.bytedance.sdk.openadsdk.core.zz;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.duq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo {

    /* renamed from: cm, reason: collision with root package name */
    private final Runnable f21069cm;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.jd.qk f21070jd;
    private final com.bytedance.sdk.component.adexpress.jd.au jpo;
    private final com.bytedance.sdk.component.xyk.xyk wqx;

    public jj(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z10, com.bytedance.sdk.component.adexpress.dynamic.my.xyk xykVar, com.bytedance.sdk.component.adexpress.jd.au auVar, com.bytedance.sdk.component.adexpress.dynamic.jj.jpo jpoVar) {
        super(context, themeStatusBroadcastReceiver, z10, xykVar, auVar, jpoVar);
        this.wqx = new com.bytedance.sdk.component.xyk.xyk("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.zz.jj.1
            @Override // java.lang.Runnable
            public void run() {
                jj.this.jpo.wqx();
                com.bytedance.sdk.openadsdk.core.oya.wqx().post(jj.this.f21069cm);
            }
        };
        this.f21069cm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.jj.2
            @Override // java.lang.Runnable
            public void run() {
                if (jj.this.f21070jd != null) {
                    jj jjVar = jj.this;
                    jj.super.jpo(jjVar.f21070jd);
                }
            }
        };
        this.jpo = auVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo
    public void jd() {
        super.jd();
        com.bytedance.sdk.openadsdk.core.oya.wqx().removeCallbacks(this.f21069cm);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.jpo.jpo, com.bytedance.sdk.component.adexpress.jd.cm
    public void jpo(com.bytedance.sdk.component.adexpress.jd.qk qkVar) {
        this.f21070jd = qkVar;
        duq.jd(this.wqx);
    }
}
