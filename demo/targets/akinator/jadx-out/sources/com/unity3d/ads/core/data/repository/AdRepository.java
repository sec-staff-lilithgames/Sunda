package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AdRepository {
    void addAd(ByteString byteString, AdObject adObject);

    void enqueueOpportunityForPlacement(String str, ByteString byteString);

    AdObject getAd(ByteString byteString);

    Map<ByteString, AdObject> getAllAds();

    boolean hasOpportunityId(ByteString byteString);

    ByteString pollOpportunityIdForPlacement(String str);

    void removeAd(ByteString byteString);
}
