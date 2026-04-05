package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.yd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void hx() throws NumberFormatException {
        if (dt.my(this.f19172jd.f19914jd)) {
            finish();
            return;
        }
        yd ydVar = this.f19172jd.f19911hx;
        if (ydVar == null || ydVar.jpo() == null) {
            return;
        }
        this.f19172jd.f19911hx.jpo().setTime("0", 0, 0, false);
        if (this.f19172jd.f19911hx.zz()) {
            this.f19172jd.duq.jpo("0", "X");
            this.f19172jd.duq.my(true);
            this.f19172jd.duq.wqx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void jpo(long j10, long j11) throws NumberFormatException {
        int i10 = (int) (j10 / 1000);
        yd ydVar = this.f19172jd.f19911hx;
        if (ydVar != null && ydVar.jpo() != null) {
            this.f19172jd.f19911hx.jpo().setTime(String.valueOf(this.f19173jj), i10, 0, false);
            this.f19172jd.f19911hx.jpo().jpo(j10, j11);
        }
        yd ydVar2 = this.f19172jd.f19911hx;
        if ((ydVar2 == null || !ydVar2.zz()) && !this.f19172jd.f19914jd.aul()) {
            return;
        }
        wqx(i10);
        if (this.f19173jj >= 0) {
            this.f19172jd.duq.cm(true);
            this.f19172jd.duq.jpo(String.valueOf(this.f19173jj), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public Map<String, Object> pdm() {
        return this.f19172jd.jj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean rq() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout se() {
        com.bytedance.sdk.openadsdk.component.reward.jd.jd jdVar = this.wqx;
        return (jdVar == null || !(jdVar instanceof com.bytedance.sdk.openadsdk.component.reward.jd.xyk) || this.f19172jd.f19907dn) ? this.f19172jd.f19911hx.jd() : ((com.bytedance.sdk.openadsdk.component.reward.jd.xyk) jdVar).rv();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean tu() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void qk() {
    }
}
