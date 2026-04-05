package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.setting.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected Handler f41714a;

    public abstract void a(int i10, long j10, int i11, l lVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar, boolean z10);

    public void a(Context context, CampaignEx campaignEx) {
    }

    public void a(CampaignUnit campaignUnit) {
    }

    public void a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar, int i10) {
    }

    public synchronized void a(int i10, long j10, int i11, l lVar, String str, String str2, boolean z10, com.mbridge.msdk.preload.listenter.a aVar) {
        try {
            a(i10, j10, i11, lVar, str, str2, aVar, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
