package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.video.bt.module.MBTempContainer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class e extends MBTempContainer.k.a {

    /* renamed from: b, reason: collision with root package name */
    private h f44348b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f44349c;

    public e(com.mbridge.msdk.foundation.same.report.metrics.c cVar, h hVar) {
        this.f44348b = hVar;
        this.f44349c = cVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.k.a, com.mbridge.msdk.video.bt.module.MBTempContainer.k
    public void onError(String str) {
        super.onError(str);
        h hVar = this.f44348b;
        if (hVar != null) {
            hVar.a(this.f44349c, str);
        }
    }
}
