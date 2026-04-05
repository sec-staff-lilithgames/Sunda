package com.facebook.ads.internal.api;

import android.view.View;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface MediaViewApi extends AdComponentViewApiProvider {
    void destroy();

    View getAdContentsView();

    int getMediaHeight();

    int getMediaWidth();

    void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView);

    void setListener(MediaViewListener mediaViewListener);

    void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer);
}
