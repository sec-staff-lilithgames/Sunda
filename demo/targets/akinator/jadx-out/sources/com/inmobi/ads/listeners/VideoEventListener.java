package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiNative;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class VideoEventListener {
    public void onAudioStateChanged(InMobiNative inMobiNative, boolean z10) {
        e0.checkNotNullParameter(inMobiNative, "inMobiNative");
    }

    public void onVideoCompleted(InMobiNative ad2) {
        e0.checkNotNullParameter(ad2, "ad");
    }

    public void onVideoSkipped(InMobiNative ad2) {
        e0.checkNotNullParameter(ad2, "ad");
    }
}
