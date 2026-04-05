package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import com.applovin.mediation.adapter.MaxAdapterError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface MaxAppOpenAdapterListener extends MaxAdapterListener {
    void onAppOpenAdClicked();

    void onAppOpenAdClicked(Bundle bundle);

    void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, Bundle bundle);

    void onAppOpenAdDisplayed();

    void onAppOpenAdDisplayed(Bundle bundle);

    void onAppOpenAdHidden();

    void onAppOpenAdHidden(Bundle bundle);

    void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError);

    void onAppOpenAdLoaded();

    void onAppOpenAdLoaded(Bundle bundle);
}
