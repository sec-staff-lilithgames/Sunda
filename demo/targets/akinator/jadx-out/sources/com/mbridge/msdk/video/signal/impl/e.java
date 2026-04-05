package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class e implements com.mbridge.msdk.video.signal.f, com.mbridge.msdk.video.signal.h {
    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        p0.a("DefaultJSContainerModule", "endCardShowing");
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        p0.a("DefaultJSContainerModule", "hideAlertWebview ,msg=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        p0.a("DefaultJSContainerModule", "ivRewardAdsWithoutVideo,params=");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        p0.a("DefaultJSContainerModule", "miniCardShowing");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i10) {
        p0.a("DefaultJSContainerModule", "readyStatus:isReady=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i10, int i11, int i12) {
        StringBuilder sbF = w0.i.f(i10, i11, "showMiniCard width = ", " height = ", " radius = ");
        sbF.append(i12);
        p0.a("DefaultJSContainerModule", sbF.toString());
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        p0.a("DefaultJSContainerModule", "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i10) {
        p0.a("DefaultJSContainerModule", "showEndcard,type=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        StringBuilder sbF = w0.i.f(i10, i11, "showMiniCard top = ", " left = ", " width = ");
        a.b.x(i12, i13, " height = ", " radius = ", sbF);
        sbF.append(i14);
        p0.a("DefaultJSContainerModule", sbF.toString());
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i10) {
        p0.a("DefaultJSContainerModule", "showVideoClickView:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        p0.a("DefaultJSContainerModule", "showVideoEndCover");
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i10, int i11, int i12) {
    }
}
