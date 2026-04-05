package com.fyber.inneractive.sdk.interfaces;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.Orientation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface e {
    void destroy();

    void disableCloseButton();

    void dismissAd(boolean z10);

    View getCloseButton();

    ViewGroup getLayout();

    boolean isCloseButtonDisplay();

    void secondEndCardWasDisplayed();

    void setActivityOrientation(boolean z10, Orientation orientation);

    void showCloseButton(boolean z10, int i10, int i11);

    void showCloseCountdown();

    void updateCloseCountdown(int i10);

    boolean wasDismissedByUser();
}
