package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.MediationDataSource;
import kotlin.jvm.internal.e0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidMediationRepository implements MediationRepository {
    private final MediationDataSource mediationDataSource;

    public AndroidMediationRepository(MediationDataSource mediationDataSource) {
        e0.checkNotNullParameter(mediationDataSource, "mediationDataSource");
        this.mediationDataSource = mediationDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public a getMediationProvider() {
        return new AndroidMediationRepository$mediationProvider$1(this);
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getName() {
        return this.mediationDataSource.getName();
    }

    @Override // com.unity3d.ads.core.data.repository.MediationRepository
    public String getVersion() {
        return this.mediationDataSource.getVersion();
    }
}
