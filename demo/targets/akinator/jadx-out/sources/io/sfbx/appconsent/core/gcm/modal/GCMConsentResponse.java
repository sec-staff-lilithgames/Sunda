package io.sfbx.appconsent.core.gcm.modal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class GCMConsentResponse {
    private final boolean isAdPersonalizationGranted;
    private final boolean isAdStorageGranted;
    private final boolean isAdUserDataGranted;
    private final boolean isAnalyticsStorageGranted;

    public GCMConsentResponse(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.isAnalyticsStorageGranted = z10;
        this.isAdStorageGranted = z11;
        this.isAdUserDataGranted = z12;
        this.isAdPersonalizationGranted = z13;
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
}
