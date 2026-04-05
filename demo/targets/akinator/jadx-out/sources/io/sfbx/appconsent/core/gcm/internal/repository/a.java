package io.sfbx.appconsent.core.gcm.internal.repository;

import io.sfbx.appconsent.core.gcm.modal.Consent;
import io.sfbx.appconsent.core.gcm.modal.GCMConsentResponse;
import io.sfbx.appconsent.core.gcm.repository.GCMRepositoryContract;
import kotlin.jvm.internal.e0;
import tu.v;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a implements GCMRepositoryContract {

    /* renamed from: a, reason: collision with root package name */
    private final io.sfbx.appconsent.core.gcm.internal.datasource.manifest.a f68215a;

    /* renamed from: b, reason: collision with root package name */
    private final io.sfbx.appconsent.core.gcm.internal.datasource.preferences.a f68216b;

    public a(io.sfbx.appconsent.core.gcm.internal.datasource.manifest.a gcmManifestContract, io.sfbx.appconsent.core.gcm.internal.datasource.preferences.a gcmSharedPreferences) {
        e0.checkNotNullParameter(gcmManifestContract, "gcmManifestContract");
        e0.checkNotNullParameter(gcmSharedPreferences, "gcmSharedPreferences");
        this.f68215a = gcmManifestContract;
        this.f68216b = gcmSharedPreferences;
    }

    private final void a(Consent consent) {
        io.sfbx.appconsent.core.gcm.internal.datasource.preferences.a aVar = this.f68216b;
        boolean z10 = true;
        v vVar = tu.e0.to("appconsent_analytics_storage", Boolean.valueOf(consent.isPurpose7Allowed() || consent.isPurpose9Allowed()));
        v vVar2 = tu.e0.to("appconsent_ad_storage", Boolean.valueOf(consent.isPurpose3Allowed()));
        v vVar3 = tu.e0.to("appconsent_ad_user_data", Boolean.valueOf(consent.isPurpose3Allowed()));
        if (!consent.isPurpose3Allowed() && !consent.isPurpose4Allowed()) {
            z10 = false;
        }
        aVar.a(p1.mapOf(vVar, vVar2, vVar3, tu.e0.to("appconsent_ad_personalization_signals", Boolean.valueOf(z10))));
    }

    @Override // io.sfbx.appconsent.core.gcm.repository.GCMRepositoryContract
    public void clearGCM() {
        this.f68216b.e();
    }

    @Override // io.sfbx.appconsent.core.gcm.repository.GCMRepositoryContract
    public void defineGCMStatusFromPurpose(Consent consent) {
        e0.checkNotNullParameter(consent, "consent");
        if (consent.isPurpose1Allowed() && consent.isGoogleVendorAllowed()) {
            a(consent);
        } else {
            a(new Consent(consent.isGoogleVendorAllowed(), consent.isPurpose1Allowed(), consent.isPurpose3Allowed(), consent.isPurpose4Allowed(), consent.isPurpose7Allowed(), consent.isPurpose9Allowed()));
        }
    }

    @Override // io.sfbx.appconsent.core.gcm.repository.GCMRepositoryContract
    public GCMConsentResponse getGCMConsentResponse() {
        Boolean boolD = this.f68216b.d();
        if (boolD == null) {
            boolD = this.f68215a.d();
        }
        Boolean boolB = this.f68216b.b();
        if (boolB == null) {
            boolB = this.f68215a.b();
        }
        Boolean boolA = this.f68216b.a();
        if (boolA == null) {
            boolA = this.f68215a.a();
        }
        Boolean boolC = this.f68216b.c();
        if (boolC == null) {
            boolC = this.f68215a.c();
        }
        return new GCMConsentResponse(boolD != null ? boolD.booleanValue() : false, boolB != null ? boolB.booleanValue() : false, boolA != null ? boolA.booleanValue() : false, boolC != null ? boolC.booleanValue() : false);
    }
}
