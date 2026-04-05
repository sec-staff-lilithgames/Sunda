package com.bytedance.sdk.openadsdk.activity;

import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {

    /* renamed from: jd, reason: collision with root package name */
    private long f19169jd;
    private long jpo;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long j10 = this.jpo;
        if (j10 > 0) {
            com.bytedance.sdk.openadsdk.utils.my.jpo(j10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        if (this.f19169jd > 0) {
            this.jpo = (SystemClock.elapsedRealtime() - this.f19169jd) + this.jpo;
            this.f19169jd = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.my.wqx()) {
            this.f19169jd = SystemClock.elapsedRealtime();
        }
    }
}
