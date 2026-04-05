package com.mbridge.msdk.mbbanner.common.manager;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.setting.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c extends d {
    public c(MBBannerView mBBannerView, com.mbridge.msdk.mbbanner.common.listener.c cVar, String str, String str2, boolean z10, l lVar) {
        super(mBBannerView, cVar, str, str2, z10, lVar);
    }

    @Override // com.mbridge.msdk.mbbanner.common.manager.d
    public void a(CampaignEx campaignEx, boolean z10, String str) {
        if (this.f41496o) {
            if (this.f41501t == null) {
                this.f41501t = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f41497p);
            }
            this.f41501t.a(new a());
            campaignEx.setCampaignUnitId(this.f41497p);
            this.f41501t.a(campaignEx);
            if (!this.f41484c.isReportClick()) {
                this.f41484c.setReportClick(true);
                com.mbridge.msdk.mbbanner.common.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx);
            }
            com.mbridge.msdk.mbbanner.common.listener.c cVar = this.f41482a;
            if (cVar != null) {
                cVar.c();
            }
            if (!z10 || TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.mbbanner.common.report.a.a(campaignEx, this.f41497p, str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements NativeListener.TrackingExListener {
        public a() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            t0.a(campaign, c.this.f41485d);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return false;
        }

        @Override // com.mbridge.msdk.out.NativeListener.TrackingExListener
        public void onLeaveApp() {
            com.mbridge.msdk.mbbanner.common.listener.c cVar = c.this.f41482a;
            if (cVar != null) {
                cVar.onLeaveApp();
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            t0.a(campaign, c.this.f41485d);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            t0.b(campaign, c.this.f41485d);
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }
    }
}
