package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class c extends d {

    /* renamed from: n, reason: collision with root package name */
    private IJSFactory f44838n;

    public c(IJSFactory iJSFactory, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f44838n = iJSFactory;
        if (iJSFactory == null) {
            this.f44847a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.d, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        if (this.f44847a) {
            if (i10 != 8) {
                if (i10 == 105) {
                    this.f44838n.getJSNotifyProxy().a(3, obj.toString());
                    i10 = -1;
                } else if (i10 == 107) {
                    this.f44838n.getJSContainerModule().showVideoClickView(-1);
                    this.f44838n.getJSVideoModule().setCover(false);
                    this.f44838n.getJSVideoModule().setMiniEndCardState(false);
                    this.f44838n.getJSVideoModule().videoOperate(1);
                } else if (i10 == 112) {
                    this.f44838n.getJSVideoModule().setCover(true);
                    this.f44838n.getJSVideoModule().setMiniEndCardState(true);
                    this.f44838n.getJSVideoModule().videoOperate(2);
                } else if (i10 == 115) {
                    com.mbridge.msdk.video.signal.j jSVideoModule = this.f44838n.getJSVideoModule();
                    this.f44838n.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (this.f44838n.getJSContainerModule().showAlertWebView()) {
                this.f44838n.getJSVideoModule().alertWebViewShowed();
            } else {
                this.f44838n.getJSVideoModule().showAlertView();
            }
        }
        super.a(i10, obj);
    }
}
