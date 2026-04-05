package com.mbridge.msdk.mbbanner.common.listener;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.setting.l;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private c f41435a;

    /* renamed from: b, reason: collision with root package name */
    private l f41436b;

    public e(c cVar, l lVar) {
        this.f41436b = lVar;
        this.f41435a = cVar;
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a(List<CampaignEx> list) {
        c cVar = this.f41435a;
        if (cVar != null) {
            cVar.a(list);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void b() {
        c cVar = this.f41435a;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void c() {
        c cVar = this.f41435a;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void d() {
        c cVar = this.f41435a;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void onLeaveApp() {
        c cVar = this.f41435a;
        if (cVar != null) {
            cVar.onLeaveApp();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        c cVar = this.f41435a;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a() {
        c cVar = this.f41435a;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a(CampaignEx campaignEx) {
        c cVar = this.f41435a;
        if (cVar != null) {
            cVar.a(campaignEx);
        }
    }
}
