package com.facebook.ads.internal.api;

import android.view.View;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.VideoStartReason;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface MediaViewVideoRendererApi extends AdComponentViewApiProvider {
    void destroy();

    void disengageSeek(VideoStartReason videoStartReason);

    void engageSeek();

    int getCurrentTimeMs();

    int getDuration();

    View getVideoView();

    float getVolume();

    void initialize(AdViewConstructorParams adViewConstructorParams, MediaViewVideoRenderer mediaViewVideoRenderer);

    void pause(boolean z10);

    void play(VideoStartReason videoStartReason);

    void seekTo(int i10);

    void setVolume(float f10);

    boolean shouldAutoplay();
}
