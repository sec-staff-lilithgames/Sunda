package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class c extends b {

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.listener.b f44337c;

    /* renamed from: d, reason: collision with root package name */
    private String f44338d;

    public c(com.mbridge.msdk.video.bt.module.listener.b bVar, String str) {
        this.f44337c = bVar;
        this.f44338d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f44337c != null) {
            p0.a("H5ShowRewardListener", "onAdShow");
            this.f44337c.a(this.f44338d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        if (this.f44337c != null) {
            p0.a("H5ShowRewardListener", "onVideoComplete");
            this.f44337c.a(this.f44338d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        if (this.f44337c != null) {
            p0.a("H5ShowRewardListener", "onAdClose");
            this.f44337c.a(this.f44338d, z10, cVar2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        if (this.f44337c != null) {
            p0.a("H5ShowRewardListener", "onShowFail");
            this.f44337c.a(this.f44338d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        if (this.f44337c != null) {
            p0.a("H5ShowRewardListener", "onVideoAdClicked");
            this.f44337c.b(this.f44338d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        if (this.f44337c != null) {
            p0.a("H5ShowRewardListener", "onEndcardShow");
            this.f44337c.c(this.f44338d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        if (this.f44337c != null) {
            p0.a("H5ShowRewardListener", "onAutoLoad");
            this.f44337c.a(this.f44338d, i10, str, str2);
        }
    }
}
