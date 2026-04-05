package com.android.billingclient.api;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class CreateExternalOfferReportingDetailsResult {

    /* renamed from: a, reason: collision with root package name */
    public final BillingResult f12606a;

    /* renamed from: b, reason: collision with root package name */
    public final ExternalOfferReportingDetails f12607b;

    public CreateExternalOfferReportingDetailsResult(BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        this.f12606a = billingResult;
        this.f12607b = externalOfferReportingDetails;
    }

    public static /* synthetic */ CreateExternalOfferReportingDetailsResult copy$default(CreateExternalOfferReportingDetailsResult createExternalOfferReportingDetailsResult, BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = createExternalOfferReportingDetailsResult.f12606a;
        }
        if ((i10 & 2) != 0) {
            externalOfferReportingDetails = createExternalOfferReportingDetailsResult.f12607b;
        }
        return createExternalOfferReportingDetailsResult.copy(billingResult, externalOfferReportingDetails);
    }

    public final BillingResult component1() {
        return this.f12606a;
    }

    public final ExternalOfferReportingDetails component2() {
        return this.f12607b;
    }

    public final CreateExternalOfferReportingDetailsResult copy(BillingResult billingResult, ExternalOfferReportingDetails externalOfferReportingDetails) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        return new CreateExternalOfferReportingDetailsResult(billingResult, externalOfferReportingDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateExternalOfferReportingDetailsResult)) {
            return false;
        }
        CreateExternalOfferReportingDetailsResult createExternalOfferReportingDetailsResult = (CreateExternalOfferReportingDetailsResult) obj;
        return e0.areEqual(this.f12606a, createExternalOfferReportingDetailsResult.f12606a) && e0.areEqual(this.f12607b, createExternalOfferReportingDetailsResult.f12607b);
    }

    public final BillingResult getBillingResult() {
        return this.f12606a;
    }

    public final ExternalOfferReportingDetails getExternalOfferReportingDetails() {
        return this.f12607b;
    }

    public int hashCode() {
        int iHashCode = this.f12606a.hashCode() * 31;
        ExternalOfferReportingDetails externalOfferReportingDetails = this.f12607b;
        return iHashCode + (externalOfferReportingDetails == null ? 0 : externalOfferReportingDetails.hashCode());
    }

    public String toString() {
        return "CreateExternalOfferReportingDetailsResult(billingResult=" + this.f12606a + ", externalOfferReportingDetails=" + this.f12607b + ")";
    }
}
