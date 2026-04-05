package com.unity3d.ads.beta;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MediationInfo {
    private final String adapterVersion;
    private final String name;
    private final String version;

    public MediationInfo(String name, String version, String adapterVersion) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(version, "version");
        e0.checkNotNullParameter(adapterVersion, "adapterVersion");
        this.name = name;
        this.version = version;
        this.adapterVersion = adapterVersion;
    }

    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }
}
