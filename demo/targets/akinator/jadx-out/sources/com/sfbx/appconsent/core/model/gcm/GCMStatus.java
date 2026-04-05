package com.sfbx.appconsent.core.model.gcm;

import a.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GCMStatus {
    private final boolean isAdPersonalizationGranted;
    private final boolean isAdStorageGranted;
    private final boolean isAdUserDataGranted;
    private final boolean isAnalyticsStorageGranted;

    public GCMStatus(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.isAnalyticsStorageGranted = z10;
        this.isAdStorageGranted = z11;
        this.isAdUserDataGranted = z12;
        this.isAdPersonalizationGranted = z13;
    }

    public static /* synthetic */ GCMStatus copy$default(GCMStatus gCMStatus, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = gCMStatus.isAnalyticsStorageGranted;
        }
        if ((i10 & 2) != 0) {
            z11 = gCMStatus.isAdStorageGranted;
        }
        if ((i10 & 4) != 0) {
            z12 = gCMStatus.isAdUserDataGranted;
        }
        if ((i10 & 8) != 0) {
            z13 = gCMStatus.isAdPersonalizationGranted;
        }
        return gCMStatus.copy(z10, z11, z12, z13);
    }

    public final boolean component1() {
        return this.isAnalyticsStorageGranted;
    }

    public final boolean component2() {
        return this.isAdStorageGranted;
    }

    public final boolean component3() {
        return this.isAdUserDataGranted;
    }

    public final boolean component4() {
        return this.isAdPersonalizationGranted;
    }

    public final GCMStatus copy(boolean z10, boolean z11, boolean z12, boolean z13) {
        return new GCMStatus(z10, z11, z12, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GCMStatus)) {
            return false;
        }
        GCMStatus gCMStatus = (GCMStatus) obj;
        return this.isAnalyticsStorageGranted == gCMStatus.isAnalyticsStorageGranted && this.isAdStorageGranted == gCMStatus.isAdStorageGranted && this.isAdUserDataGranted == gCMStatus.isAdUserDataGranted && this.isAdPersonalizationGranted == gCMStatus.isAdPersonalizationGranted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.isAnalyticsStorageGranted;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        ?? r22 = this.isAdStorageGranted;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        ?? r23 = this.isAdUserDataGranted;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z11 = this.isAdPersonalizationGranted;
        return i14 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final boolean isAdPersonalizationGranted() {
        return this.isAdPersonalizationGranted;
    }

    public final boolean isAdStorageGranted() {
        return this.isAdStorageGranted;
    }

    public final boolean isAdUserDataGranted() {
        return this.isAdUserDataGranted;
    }

    public final boolean isAnalyticsStorageGranted() {
        return this.isAnalyticsStorageGranted;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GCMStatus(isAnalyticsStorageGranted=");
        sb2.append(this.isAnalyticsStorageGranted);
        sb2.append(", isAdStorageGranted=");
        sb2.append(this.isAdStorageGranted);
        sb2.append(", isAdUserDataGranted=");
        sb2.append(this.isAdUserDataGranted);
        sb2.append(", isAdPersonalizationGranted=");
        return b.p(sb2, this.isAdPersonalizationGranted, ')');
    }
}
