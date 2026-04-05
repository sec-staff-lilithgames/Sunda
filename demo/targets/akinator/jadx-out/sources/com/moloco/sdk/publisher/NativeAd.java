package com.moloco.sdk.publisher;

import android.net.Uri;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface NativeAd extends AdLoad, Destroyable {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Assets {
        String getCallToActionText();

        String getDescription();

        Uri getIconUri();

        Uri getMainImageUri();

        View getMediaView();

        Float getRating();

        String getSponsorText();

        String getTitle();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface InteractionListener {
        void onGeneralClickHandled();

        void onImpressionHandled();
    }

    Assets getAssets();

    InteractionListener getInteractionListener();

    void handleGeneralAdClick();

    void handleImpression();

    void setInteractionListener(InteractionListener interactionListener);
}
