package com.inmobi.ads.listeners;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class AdEventListener<T> {
    public void onAdImpression(T t10) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdClicked(T t10, Map<Object, Object> map) {
    }

    public void onAdFetchSuccessful(T t10, AdMetaInfo adMetaInfo) {
    }

    public void onAdLoadFailed(T t10, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    public void onAdLoadSucceeded(T t10, AdMetaInfo adMetaInfo) {
    }
}
