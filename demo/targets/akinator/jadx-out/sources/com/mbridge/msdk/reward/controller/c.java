package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Context f42542a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42543b;

    public c(Context context, String str) {
        this.f42542a = context;
        this.f42543b = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC;
        if (this.f42542a == null || TextUtils.isEmpty(this.f42543b)) {
            return;
        }
        try {
            com.mbridge.msdk.reward.report.a.a(this.f42542a, this.f42543b);
            n0.a();
            n0.a(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES));
            n0.a(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML));
            com.mbridge.msdk.videocommon.setting.b.b().b(this.f42543b);
            if (r0.a().a("c_d_v_w_i", false) || TextUtils.isEmpty(this.f42543b) || (copyOnWriteArrayListC = com.mbridge.msdk.videocommon.cache.a.a().c(this.f42543b, 1)) == null || copyOnWriteArrayListC.size() <= 0) {
                return;
            }
            com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f42542a, this.f42543b, copyOnWriteArrayListC, 94, (com.mbridge.msdk.videocommon.listener.a) null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardVideoControllerInitTask", "initRewardVideoController task ", e10);
            }
        }
    }
}
