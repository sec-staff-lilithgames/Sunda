package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.p0;
import hr.kNq.ikJMrW;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class h implements com.mbridge.msdk.video.signal.j {
    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        p0.a("DefaultJSVideoModule", "alertWebViewShowed:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i10, int i11) {
        p0.a("DefaultJSVideoModule", "closeOperte:close=" + i10 + "closeViewVisible=" + i11);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        p0.a("DefaultJSVideoModule", "dismissAllAlert");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        p0.a("DefaultJSVideoModule", "getCurrentProgress");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i10) {
        p0.a("DefaultJSVideoModule", "hideAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i10) {
        p0.a("DefaultJSVideoModule", "notifyCloseBtn:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i10) {
        p0.a("DefaultJSVideoModule", "progressBarOperate:progressViewVisible=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i10, int i11) {
        p0.a("DefaultJSVideoModule", "progressOperate:progress=" + i10 + "progressViewVisible=" + i11);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z10) {
        p0.a("DefaultJSVideoModule", "setCover:" + z10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z10) {
        p0.a("DefaultJSVideoModule", "setMiniEndCardState");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i10) {
        p0.a("DefaultJSVideoModule", "setScaleFitXY:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i10) {
        p0.a("DefaultJSVideoModule", "setVisible:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        p0.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        p0.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        StringBuilder sbF = w0.i.f(i10, i11, "showVideoLocation:marginTop=", ",marginLeft=", ",width=");
        a.b.x(i12, i13, ",height=", ",radius=", sbF);
        a.b.x(i14, i15, ",borderTop=", ",borderTop=", sbF);
        a.b.x(i15, i16, ",borderLeft=", ",borderWidth=", sbF);
        sbF.append(i17);
        sbF.append(",borderHeight=");
        sbF.append(i18);
        p0.a("DefaultJSVideoModule", sbF.toString());
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11) {
        p0.a(ikJMrW.pJmHZawpw, "soundOperate:mute=" + i10 + ",soundViewVisible=" + i11);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i10) {
        p0.a("DefaultJSVideoModule", "videoOperate:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i10, int i11, String str) {
        StringBuilder sbF = w0.i.f(i10, i11, "soundOperate:mute=", ",soundViewVisible=", ",pt=");
        sbF.append(str);
        p0.a("DefaultJSVideoModule", sbF.toString());
    }
}
