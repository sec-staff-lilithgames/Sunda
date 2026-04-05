package com.bytedance.sdk.openadsdk.component.reward.jd;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.jd.jd;
import com.bytedance.sdk.openadsdk.core.model.dt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk extends jd {
    private com.bytedance.sdk.openadsdk.component.reward.view.wqx prr;

    public xyk(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        super(jpoVar);
    }

    private boolean uu() {
        return dt.my(this.f19843jd);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public jd.jpo cm() {
        return new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.component.reward.jd.xyk.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd.jpo
            public void jpo(boolean z10) {
                if (xyk.this.prr != null) {
                    xyk.this.prr.setIsMute(z10);
                }
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public boolean jj() {
        return uu();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public boolean my() {
        return uu();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void qk() {
        this.f19844jj.cm(8);
        this.f19844jj.jd(8);
        if (this.f19843jd.cql() == 2) {
            this.xyk.jpo(false);
            this.xyk.wqx(false);
            this.xyk.cm(false);
            this.f19844jj.jj(8);
            return;
        }
        this.xyk.jpo(this.f19843jd.bl());
        this.xyk.wqx(uu());
        this.xyk.cm(uu());
        if (uu()) {
            this.f19844jj.jj(8);
        } else {
            this.xyk.my();
            this.f19844jj.jj(0);
        }
    }

    public FrameLayout rv() {
        com.bytedance.sdk.openadsdk.component.reward.view.wqx wqxVar = this.prr;
        if (wqxVar != null) {
            return wqxVar.getVideoContainer();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.jd.jd
    public void jpo(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.reward.view.wqx wqxVar = new com.bytedance.sdk.openadsdk.component.reward.view.wqx(this.jpo.vrc, this.f19840ju);
        this.prr = wqxVar;
        wqxVar.setDownloadListener(this.f104if);
        com.bytedance.sdk.openadsdk.component.reward.view.wqx wqxVar2 = this.prr;
        dt dtVar = this.f19843jd;
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.jpo;
        wqxVar2.jpo(dtVar, jpoVar.jkt, jpoVar.sbx, this.wqx, this.f19842cm);
        frameLayout.addView(this.prr.getInteractionStyleRootView());
    }

    public static boolean jpo(dt dtVar) {
        return (dtVar.jw() || dtVar.sy() == 100.0f) ? false : true;
    }
}
