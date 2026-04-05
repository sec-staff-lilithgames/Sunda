package com.android.billingclient.api;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class CreateAlternativeBillingOnlyReportingDetailsResult {

    /* renamed from: a, reason: collision with root package name */
    public final BillingResult f12604a;

    /* renamed from: b, reason: collision with root package name */
    public final AlternativeBillingOnlyReportingDetails f12605b;

    public CreateAlternativeBillingOnlyReportingDetailsResult(BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        this.f12604a = billingResult;
        this.f12605b = alternativeBillingOnlyReportingDetails;
    }

    public static /* synthetic */ CreateAlternativeBillingOnlyReportingDetailsResult copy$default(CreateAlternativeBillingOnlyReportingDetailsResult createAlternativeBillingOnlyReportingDetailsResult, BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = createAlternativeBillingOnlyReportingDetailsResult.f12604a;
        }
        if ((i10 & 2) != 0) {
            alternativeBillingOnlyReportingDetails = createAlternativeBillingOnlyReportingDetailsResult.f12605b;
        }
        return createAlternativeBillingOnlyReportingDetailsResult.copy(billingResult, alternativeBillingOnlyReportingDetails);
    }

    public final BillingResult component1() {
        return this.f12604a;
    }

    public final AlternativeBillingOnlyReportingDetails component2() {
        return this.f12605b;
    }

    public final CreateAlternativeBillingOnlyReportingDetailsResult copy(BillingResult billingResult, AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        return new CreateAlternativeBillingOnlyReportingDetailsResult(billingResult, alternativeBillingOnlyReportingDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAlternativeBillingOnlyReportingDetailsResult)) {
            return false;
        }
        CreateAlternativeBillingOnlyReportingDetailsResult createAlternativeBillingOnlyReportingDetailsResult = (CreateAlternativeBillingOnlyReportingDetailsResult) obj;
        return e0.areEqual(this.f12604a, createAlternativeBillingOnlyReportingDetailsResult.f12604a) && e0.areEqual(this.f12605b, createAlternativeBillingOnlyReportingDetailsResult.f12605b);
    }

    public final AlternativeBillingOnlyReportingDetails getAlternativeBillingOnlyReportingDetails() {
        return this.f12605b;
    }

    public final BillingResult getBillingResult() {
        return this.f12604a;
    }

    public int hashCode() {
        int iHashCode = this.f12604a.hashCode() * 31;
        AlternativeBillingOnlyReportingDetails alternativeBillingOnlyReportingDetails = this.f12605b;
        return iHashCode + (alternativeBillingOnlyReportingDetails == null ? 0 : alternativeBillingOnlyReportingDetails.hashCode());
    }

    public String toString() {
        return "CreateAlternativeBillingOnlyReportingDetailsResult(billingResult=" + this.f12604a + ", alternativeBillingOnlyReportingDetails=" + this.f12605b + ")";
    }
}
