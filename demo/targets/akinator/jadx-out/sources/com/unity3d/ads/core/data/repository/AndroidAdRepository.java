package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e0;
import uu.p1;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidAdRepository implements AdRepository {
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, List<ByteString>> placementsLoadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void addAd(ByteString opportunityId, AdObject adObject) {
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        e0.checkNotNullParameter(adObject, "adObject");
        this.loadedAds.put(opportunityId, adObject);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void enqueueOpportunityForPlacement(String placementId, ByteString opportunityId) {
        List<ByteString> listPutIfAbsent;
        e0.checkNotNullParameter(placementId, "placementId");
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        ConcurrentHashMap<String, List<ByteString>> concurrentHashMap = this.placementsLoadedAds;
        List<ByteString> arrayList = concurrentHashMap.get(placementId);
        if (arrayList == null && (listPutIfAbsent = concurrentHashMap.putIfAbsent(placementId, (arrayList = new ArrayList<>()))) != null) {
            arrayList = listPutIfAbsent;
        }
        arrayList.add(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public AdObject getAd(ByteString opportunityId) {
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        return this.loadedAds.get(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Map<ByteString, AdObject> getAllAds() {
        return p1.toMap(this.loadedAds);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public boolean hasOpportunityId(ByteString opportunityId) {
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        return this.loadedAds.containsKey(opportunityId);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public ByteString pollOpportunityIdForPlacement(String placementId) {
        e0.checkNotNullParameter(placementId, "placementId");
        List<ByteString> list = this.placementsLoadedAds.get(placementId);
        if (list != null) {
            return (ByteString) v0.removeFirstOrNull(list);
        }
        return null;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public void removeAd(ByteString opportunityId) {
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        this.loadedAds.remove(opportunityId);
    }
}
