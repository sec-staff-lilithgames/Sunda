package com.mbridge.msdk.out;

import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.util.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class NativeAdWithCodeListener implements NativeListener.NativeAdListener {
    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoadError(String str) {
        onAdLoadErrorWithCode(a.a(1000, str), str);
    }

    public abstract void onAdLoadErrorWithCode(int i10, String str);
}
