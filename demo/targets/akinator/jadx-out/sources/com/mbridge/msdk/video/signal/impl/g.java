package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class g implements com.mbridge.msdk.video.signal.i {
    @Override // com.mbridge.msdk.video.signal.i
    public void a(String str) {
        com.google.android.gms.internal.play_billing.a.D("setOrientation,landscape=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.i
    public String b() {
        p0.a("js", "getEndScreenInfo");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void handlerPlayableException(String str) {
        com.google.android.gms.internal.play_billing.a.D("handlerPlayableException，msg=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        p0.a("js", "notifyCloseBtn,state=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        p0.a("js", "toggleCloseBtn,state=" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void triggerCloseBtn(String str) {
        com.google.android.gms.internal.play_billing.a.D("triggerCloseBtn,state=", str, "js");
    }
}
