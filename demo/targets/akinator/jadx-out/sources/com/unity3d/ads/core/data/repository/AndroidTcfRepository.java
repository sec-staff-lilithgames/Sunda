package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.TcfDataSource;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidTcfRepository implements TcfRepository {
    private final TcfDataSource tcfDataSource;

    public AndroidTcfRepository(TcfDataSource tcfDataSource) {
        e0.checkNotNullParameter(tcfDataSource, "tcfDataSource");
        this.tcfDataSource = tcfDataSource;
    }

    public final TcfDataSource getTcfDataSource() {
        return this.tcfDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.TcfRepository
    public String getTcfString() {
        return this.tcfDataSource.getTcfString();
    }
}
