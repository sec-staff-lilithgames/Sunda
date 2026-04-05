package com.inmobi.ads.controllers;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3007tb;
import com.inmobi.media.C3078xe;
import com.inmobi.media.F1;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class PublisherCallbacks {
    public static final C3007tb Companion = new C3007tb();
    public static final byte NORMAL_FLOW = 0;
    public static final byte PRELOAD_FLOW = 1;

    public abstract byte getType();

    public abstract void onAdClicked(Map<Object, ? extends Object> map);

    public abstract void onAdDismissed();

    public abstract void onAdDisplayed(AdMetaInfo adMetaInfo);

    public abstract void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onAdFetchSuccessful(AdMetaInfo info) {
        e0.checkNotNullParameter(info, "info");
    }

    public abstract void onAdLoadFailed(InMobiAdRequestStatus inMobiAdRequestStatus);

    public abstract void onAdLoadSucceeded(AdMetaInfo adMetaInfo);

    public void onAudioStatusChanged(F1 audioStatusInternal) {
        e0.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
    }

    public void onImraidLog(String log) {
        e0.checkNotNullParameter(log, "log");
    }

    public abstract void onRequestPayloadCreated(byte[] bArr);

    public abstract void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        e0.checkNotNullParameter(rewards, "rewards");
    }

    public abstract void onUserLeftApplication();

    public void onAdDisplayFailed() {
    }

    public void onAdImpressed() {
    }

    public void onAdWillDisplay() {
    }

    public void onVideoCompleted() {
    }

    public void onVideoSkipped() {
    }

    public void onAdImpression(C3078xe c3078xe) {
    }

    public void onAudioStateChanged(boolean z10) {
    }
}
