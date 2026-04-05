package com.amazon.aps.ads.listeners;

import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface ApsAdRequestListener {
    void onFailure(ApsAdError apsAdError);

    void onSuccess(ApsAd apsAd);
}
