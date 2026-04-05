package com.mbridge.msdk.out;

import com.mbridge.msdk.util.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class MBSplashLoadWithCodeListener implements MBSplashLoadListener {
    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void onLoadFailed(MBridgeIds mBridgeIds, String str, int i10) {
        onLoadFailedWithCode(mBridgeIds, a.a(5000, str), str, i10);
    }

    public abstract void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i10, String str, int i11);
}
