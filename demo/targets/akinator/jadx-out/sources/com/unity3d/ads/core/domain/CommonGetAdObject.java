package com.unity3d.ads.core.domain;

import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f
/* loaded from: classes8.dex */
public final class CommonGetAdObject implements GetAdObject {
    private final AdRepository adRepository;

    public CommonGetAdObject(AdRepository adRepository) {
        e0.checkNotNullParameter(adRepository, "adRepository");
        this.adRepository = adRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetAdObject
    public AdObject invoke(String opportunityId) {
        e0.checkNotNullParameter(opportunityId, "opportunityId");
        return this.adRepository.getAd(ByteStringsKt.toByteStringUtf8(opportunityId));
    }
}
