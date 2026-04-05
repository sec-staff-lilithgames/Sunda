package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.video.module.MBridgeVideoView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class f implements com.mbridge.msdk.video.signal.g {
    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i10) {
        p0.a("DefaultJSNotifyProxy", "onVideoStatusNotify:" + i10);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i10, String str) {
        p0.a("DefaultJSNotifyProxy", "onClick:" + i10 + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(MBridgeVideoView.v vVar) {
        p0.a("DefaultJSNotifyProxy", "onProgressNotify:" + vVar.toString());
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(Object obj) {
        p0.a("DefaultJSNotifyProxy", "onWebviewShow:" + obj);
    }

    @Override // com.mbridge.msdk.video.signal.g
    public void a(int i10, int i11, int i12, int i13) {
        p0.a("DefaultJSNotifyProxy", "showDataInfo");
    }
}
