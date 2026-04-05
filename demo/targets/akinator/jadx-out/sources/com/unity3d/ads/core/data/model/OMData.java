package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OMData {
    private final String partnerName;
    private final String partnerVersion;
    private final String version;

    public OMData(String version, String partnerName, String partnerVersion) {
        e0.checkNotNullParameter(version, "version");
        e0.checkNotNullParameter(partnerName, "partnerName");
        e0.checkNotNullParameter(partnerVersion, "partnerVersion");
        this.version = version;
        this.partnerName = partnerName;
        this.partnerVersion = partnerVersion;
    }

    public static /* synthetic */ OMData copy$default(OMData oMData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oMData.version;
        }
        if ((i10 & 2) != 0) {
            str2 = oMData.partnerName;
        }
        if ((i10 & 4) != 0) {
            str3 = oMData.partnerVersion;
        }
        return oMData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.partnerName;
    }

    public final String component3() {
        return this.partnerVersion;
    }

    public final OMData copy(String version, String partnerName, String partnerVersion) {
        e0.checkNotNullParameter(version, "version");
        e0.checkNotNullParameter(partnerName, "partnerName");
        e0.checkNotNullParameter(partnerVersion, "partnerVersion");
        return new OMData(version, partnerName, partnerVersion);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OMData)) {
            return false;
        }
        OMData oMData = (OMData) obj;
        return e0.areEqual(this.version, oMData.version) && e0.areEqual(this.partnerName, oMData.partnerName) && e0.areEqual(this.partnerVersion, oMData.partnerVersion);
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.partnerVersion.hashCode() + o2.e(this.version.hashCode() * 31, 31, this.partnerName);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OMData(version=");
        sb2.append(this.version);
        sb2.append(", partnerName=");
        sb2.append(this.partnerName);
        sb2.append(", partnerVersion=");
        return o2.q(sb2, this.partnerVersion, ')');
    }
}
