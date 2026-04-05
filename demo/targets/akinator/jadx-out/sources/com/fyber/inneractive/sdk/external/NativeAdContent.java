package com.fyber.inneractive.sdk.external;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface NativeAdContent {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class ViewTag {
        public static final String AD_DESCRIPTION = "DESCRIPTION";
        public static final String AD_ICON = "ICON";
        public static final String AD_TITLE = "TITLE";
        public static final String CTA = "CTA";
        public static final String MEDIA_VIEW = "MEDIA_VIEW";
        public static final String OTHER = "OTHER";
        public static final String RATING = "RATING";
        public static final String ROOT = "ROOT";
    }

    void bindMediaView(MediaView mediaView);

    void destroy();

    String getAdCallToAction();

    String getAdDescription();

    String getAdTitle();

    String getAdvertiserName();

    Uri getAppIcon();

    Float getMediaAspectRatio();

    MediaView getMediaView();

    String getPrice();

    Float getRating();

    void registerViewsForInteraction(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, Collection<View> collection);
}
