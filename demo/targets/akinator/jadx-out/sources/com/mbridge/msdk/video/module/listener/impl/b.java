package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b extends d {

    /* renamed from: n, reason: collision with root package name */
    private MBridgeVideoView f44836n;

    /* renamed from: o, reason: collision with root package name */
    private MBridgeContainerView f44837o;

    public b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f44836n = mBridgeVideoView;
        this.f44837o = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f44847a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.d, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        if (this.f44847a) {
            if (i10 == 8) {
                MBridgeContainerView mBridgeContainerView = this.f44837o;
                if (mBridgeContainerView == null) {
                    MBridgeVideoView mBridgeVideoView = this.f44836n;
                    if (mBridgeVideoView != null) {
                        mBridgeVideoView.showAlertView();
                    }
                } else if (mBridgeContainerView.showAlertWebView()) {
                    MBridgeVideoView mBridgeVideoView2 = this.f44836n;
                    if (mBridgeVideoView2 != null) {
                        mBridgeVideoView2.alertWebViewShowed();
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f44836n;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.showAlertView();
                    }
                }
            } else if (i10 == 107) {
                this.f44837o.showVideoClickView(-1);
                this.f44836n.setCover(false);
                this.f44836n.setMiniEndCardState(false);
                this.f44836n.videoOperate(1);
            } else if (i10 == 112) {
                this.f44836n.setCover(true);
                this.f44836n.setMiniEndCardState(true);
                this.f44836n.videoOperate(2);
            } else if (i10 == 115) {
                this.f44837o.resizeMiniCard(this.f44836n.getBorderViewWidth(), this.f44836n.getBorderViewHeight(), this.f44836n.getBorderViewRadius());
            }
        }
        super.a(i10, obj);
    }
}
