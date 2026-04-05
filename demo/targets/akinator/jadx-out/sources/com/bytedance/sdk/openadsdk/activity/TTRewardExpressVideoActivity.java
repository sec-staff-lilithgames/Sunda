package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.yd;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void jpo(long j10, long j11) throws NumberFormatException {
        int iHf = this.f19172jd.f19914jd.hf();
        boolean z10 = this.f19172jd.f19911hx.zz() && iHf >= 0;
        int i10 = (int) (j10 / 1000);
        wqx(j10, j11);
        yd ydVar = this.f19172jd.f19911hx;
        if (ydVar != null && ydVar.jpo() != null) {
            this.f19172jd.f19911hx.jpo().setTime(String.valueOf(this.f19173jj), i10, 0, false);
            this.f19172jd.f19911hx.jpo().jpo(j10, j11);
        }
        int i11 = this.f19173jj;
        if (i11 > 0) {
            if (!z10) {
                this.f19172jd.duq.jpo(String.valueOf(i11), null);
                return;
            }
            if (i10 < iHf) {
                this.f19172jd.duq.jpo(String.valueOf(i11), null);
                return;
            }
            if (this.f19172jd.f19914jd.jkt() == 5 || this.f19172jd.f19914jd.jkt() == 33) {
                this.f19172jd.duq.jpo(String.valueOf(this.f19173jj), null);
                return;
            }
            this.f19172jd.jpo(true);
            this.f19172jd.duq.jpo(String.valueOf(this.f19173jj), TTAdDislikeToast.getSkipText());
            this.f19172jd.duq.my(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public Map<String, Object> pdm() {
        return this.f19172jd.jj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean rq() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout se() {
        return this.f19172jd.f19911hx.jd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean tu() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void qk() {
    }
}
