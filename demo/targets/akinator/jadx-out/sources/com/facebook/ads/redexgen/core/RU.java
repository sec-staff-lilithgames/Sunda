package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.internal.api.NativeComponentTagApi;

/* loaded from: assets/audience_network.dex */
public final class RU implements NativeComponentTagApi {
    @Override // com.facebook.ads.internal.api.NativeComponentTagApi
    public final void tagView(View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
        if (view != null && nativeComponentTag != null) {
            EnumC1645Wq.A03(view, nativeComponentTag);
        }
    }
}
