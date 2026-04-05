package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.VungleAdSize;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class FullscreenAdInternal extends AdInternal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenAdInternal(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public VungleAdSize getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(VungleAdSize vungleAdSize) {
        return true;
    }
}
