package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.dt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends Cif {
    public wqx(Context context) {
        super(context);
        this.f19726jd = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.Cif
    public void jpo() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.wqx.1
            @Override // java.lang.Runnable
            public void run() {
                wqx wqxVar = wqx.this;
                if (wqxVar.jpo != null) {
                    wqxVar.setVisibility(0);
                }
            }
        });
    }

    public void jpo(dt dtVar, String str, int i10, String str2, long j10, boolean z10, int i11, long j11) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar, str, i10, str2, SystemClock.elapsedRealtime() - j10, z10, i11, j11);
            super.jd();
        }
    }
}
