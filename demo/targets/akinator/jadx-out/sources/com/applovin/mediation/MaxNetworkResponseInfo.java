package com.applovin.mediation;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface MaxNetworkResponseInfo {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum AdLoadState {
        AD_LOAD_NOT_ATTEMPTED,
        AD_LOADED,
        FAILED_TO_LOAD
    }

    AdLoadState getAdLoadState();

    Bundle getCredentials();

    MaxError getError();

    long getLatencyMillis();

    MaxMediatedNetworkInfo getMediatedNetwork();

    boolean isBidding();
}
