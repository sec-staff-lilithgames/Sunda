package com.bytedance.sdk.openadsdk.core.zz;

import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.duq;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class rq extends com.bytedance.sdk.component.adexpress.jd.jpo<jpo> {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.jd.wqx f21133cm;

    /* renamed from: jd, reason: collision with root package name */
    private jpo f21134jd;

    /* renamed from: jj, reason: collision with root package name */
    private final com.bytedance.sdk.component.adexpress.jd.au f21135jj;
    AtomicBoolean jpo = new AtomicBoolean(false);
    private com.bytedance.sdk.component.adexpress.jd.qk my;
    private final View wqx;

    public rq(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.jd.au auVar) {
        this.wqx = view;
        this.f21135jj = auVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd() {
        if (this.jpo.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.jd.wqx wqxVar = this.f21133cm;
        if (wqxVar == null || !wqxVar.jpo((nmd) this.wqx, 0)) {
            this.my.jpo(107, "backup false");
            return;
        }
        this.f21135jj.my().qk();
        jpo jpoVar = (jpo) this.wqx.findViewWithTag("tt_express_backup_fl_tag_26");
        this.f21134jd = jpoVar;
        if (jpoVar == null) {
            this.my.jpo(107, "backupview is null");
            return;
        }
        com.bytedance.sdk.component.adexpress.jd.oya oyaVar = new com.bytedance.sdk.component.adexpress.jd.oya();
        jpo jpoVar2 = this.f21134jd;
        float realWidth = jpoVar2 == null ? 0.0f : jpoVar2.getRealWidth();
        jpo jpoVar3 = this.f21134jd;
        float realHeight = jpoVar3 != null ? jpoVar3.getRealHeight() : 0.0f;
        oyaVar.jpo(true);
        oyaVar.jpo(realWidth);
        oyaVar.jd(realHeight);
        this.my.jpo(this.f21134jd, oyaVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.cm
    public void jpo(com.bytedance.sdk.component.adexpress.jd.qk qkVar) {
        this.my = qkVar;
        duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zz.rq.1
            @Override // java.lang.Runnable
            public void run() {
                rq.this.jd();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.cm
    /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
    public jpo my() {
        return this.f21134jd;
    }

    @Override // com.bytedance.sdk.component.adexpress.jd.jpo
    public void jpo(com.bytedance.sdk.component.adexpress.jd.wqx wqxVar) {
        this.f21133cm = wqxVar;
    }
}
