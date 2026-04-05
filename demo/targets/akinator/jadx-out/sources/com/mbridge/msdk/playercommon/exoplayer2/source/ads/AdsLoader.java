package com.mbridge.msdk.playercommon.exoplayer2.source.ads;

import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.source.ads.AdsMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSpec;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AdsLoader {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface EventListener {
        void onAdClicked();

        void onAdLoadError(AdsMediaSource.AdLoadException adLoadException, DataSpec dataSpec);

        void onAdPlaybackState(AdPlaybackState adPlaybackState);

        void onAdTapped();
    }

    void attachPlayer(ExoPlayer exoPlayer, EventListener eventListener, ViewGroup viewGroup);

    void detachPlayer();

    void handlePrepareError(int i10, int i11, IOException iOException);

    void release();

    void setSupportedContentTypes(int... iArr);
}
