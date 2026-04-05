package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b implements h {

    /* renamed from: a, reason: collision with root package name */
    private Boolean f44335a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f44336b = null;

    public void a() {
        this.f44336b = Boolean.TRUE;
    }

    public void b() {
        this.f44335a = Boolean.TRUE;
    }

    public Boolean c() {
        return this.f44336b;
    }

    public Boolean d() {
        return this.f44335a;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        p0.a("ShowRewardListener", "onAdShow");
        this.f44335a = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        com.google.android.gms.internal.play_billing.a.D("onVideoComplete: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        p0.a("ShowRewardListener", "onAdClose:isCompleteView:" + z10 + ",reward:" + cVar2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        com.google.android.gms.internal.play_billing.a.D("onShowFail:", str, "ShowRewardListener");
        this.f44336b = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        com.google.android.gms.internal.play_billing.a.D("onVideoAdClicked:", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, int i10) {
        p0.a("ShowRewardListener", "onAdCloseWithIVReward: " + z10 + "  " + i10);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        com.google.android.gms.internal.play_billing.a.D("onEndcardShow: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        com.google.android.gms.internal.play_billing.a.D("onAutoLoad: ", str2, "ShowRewardListener");
    }
}
