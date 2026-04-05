package com.mbridge.msdk.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.videocommon.download.d;
import com.mbridge.msdk.videocommon.download.f;
import com.mbridge.msdk.videocommon.setting.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeAlertWebview extends MBridgeH5EndCardView {
    private String P;

    public MBridgeAlertWebview(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public RelativeLayout.LayoutParams getContentLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    public String getURL() {
        if (TextUtils.isEmpty(this.unitId)) {
            return "";
        }
        String strC = b.b().a(c.m().b(), this.unitId, false).c();
        this.P = strC;
        return !TextUtils.isEmpty(strC) ? d.a().a(this.P) : "";
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        String url = getURL();
        if (!this.f44615e || this.f44612b == null || TextUtils.isEmpty(url)) {
            this.notifyListener.a(101, "");
            return;
        }
        com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(this.f44612b);
        aVar.a(this.f44612b.getAppName());
        this.f44662p.setDownloadListener(aVar);
        this.f44662p.setCampaignId(this.f44612b.getId());
        setCloseVisible(8);
        this.f44662p.setApiManagerJSFactory(bVar);
        this.f44662p.setWebViewListener(new a());
        setHtmlSource(f.a().a(url));
        this.f44666t = false;
        if (TextUtils.isEmpty(this.f44665s)) {
            com.google.android.gms.internal.play_billing.a.D("load url:", url, MBridgeBaseView.TAG);
            this.f44662p.loadUrl(url);
        } else {
            p0.a(MBridgeBaseView.TAG, "load html...");
            this.f44662p.loadDataWithBaseURL(url, this.f44665s, "text/html", C.UTF8_NAME, null);
        }
        this.f44662p.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f44660n;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
        j.a(this.f44611a, this.f44612b, this.P, this.unitId, 2, 1);
    }

    public MBridgeAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public a() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) {
            super.a(webView, str);
            p0.b("MBridgeAlertWebview", "finish+" + str);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10, String str, String str2) {
            super.a(webView, i10, str, str2);
            p0.b("MBridgeAlertWebview", "onReceivedError");
            if (MBridgeAlertWebview.this.f44667u) {
                return;
            }
            com.google.android.gms.internal.play_billing.a.D("onReceivedError,url:", str2, MBridgeBaseView.TAG);
            MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
            j.a(mBridgeAlertWebview.f44611a, mBridgeAlertWebview.f44612b, mBridgeAlertWebview.P, MBridgeAlertWebview.this.unitId, 2, str, 1);
            MBridgeAlertWebview.this.f44667u = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            String strE;
            super.a(webView, i10);
            p0.b("MBridgeAlertWebview", "readyState  :  " + i10);
            MBridgeAlertWebview mBridgeAlertWebview = MBridgeAlertWebview.this;
            if (mBridgeAlertWebview.f44667u) {
                return;
            }
            boolean z10 = i10 == 1;
            mBridgeAlertWebview.f44666t = z10;
            if (z10) {
                strE = a.b.e(i10, "readyState state is ");
            } else {
                strE = "";
            }
            String str = strE;
            MBridgeAlertWebview mBridgeAlertWebview2 = MBridgeAlertWebview.this;
            j.a(mBridgeAlertWebview2.f44611a, mBridgeAlertWebview2.f44612b, mBridgeAlertWebview2.P, MBridgeAlertWebview.this.unitId, i10, str, 1);
        }
    }
}
