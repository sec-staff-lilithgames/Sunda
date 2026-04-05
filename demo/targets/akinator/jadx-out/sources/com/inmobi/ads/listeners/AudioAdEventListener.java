package com.inmobi.ads.listeners;

import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class AudioAdEventListener extends AdEventListener<InMobiAudio> {
    public void onAdDismissed(InMobiAudio ad2) {
        e0.checkNotNullParameter(ad2, "ad");
    }

    public void onAdDisplayFailed(InMobiAudio ad2) {
        e0.checkNotNullParameter(ad2, "ad");
    }

    public void onAdDisplayed(InMobiAudio ad2) {
        e0.checkNotNullParameter(ad2, "ad");
    }

    public void onAdFetchFailed(InMobiAudio ad2, InMobiAdRequestStatus status) {
        e0.checkNotNullParameter(ad2, "ad");
        e0.checkNotNullParameter(status, "status");
    }

    public void onAudioStatusChanged(InMobiAudio ad2, AudioStatus audioStatus) {
        e0.checkNotNullParameter(ad2, "ad");
        e0.checkNotNullParameter(audioStatus, "audioStatus");
    }

    public void onRewardsUnlocked(InMobiAudio ad2, Map<Object, ? extends Object> rewards) {
        e0.checkNotNullParameter(ad2, "ad");
        e0.checkNotNullParameter(rewards, "rewards");
    }

    public void onUserLeftApplication(InMobiAudio ad2) {
        e0.checkNotNullParameter(ad2, "ad");
    }
}
