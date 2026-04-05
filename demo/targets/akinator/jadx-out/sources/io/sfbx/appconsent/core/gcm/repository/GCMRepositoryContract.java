package io.sfbx.appconsent.core.gcm.repository;

import io.sfbx.appconsent.core.gcm.modal.Consent;
import io.sfbx.appconsent.core.gcm.modal.GCMConsentResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface GCMRepositoryContract {
    void clearGCM();

    void defineGCMStatusFromPurpose(Consent consent);

    GCMConsentResponse getGCMConsentResponse();
}
