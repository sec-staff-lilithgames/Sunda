package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g extends com.google.android.gms.internal.play_billing.zzz {

    /* renamed from: b, reason: collision with root package name */
    public final ExternalOfferReportingDetailsListener f12732b;

    /* renamed from: c, reason: collision with root package name */
    public final s f12733c;

    /* renamed from: e, reason: collision with root package name */
    public final int f12734e;

    public /* synthetic */ g(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, u uVar, int i10) {
        this.f12732b = externalOfferReportingDetailsListener;
        this.f12733c = uVar;
        this.f12734e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaa
    public final void zza(Bundle bundle) throws RemoteException {
        int i10 = this.f12734e;
        s sVar = this.f12733c;
        ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener = this.f12732b;
        if (bundle == null) {
            BillingResult billingResult = t.f12770k;
            ((u) sVar).zzb(zzcg.zzb(95, 24, billingResult), i10);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        BillingResult billingResultA = t.a(iZzb, com.google.android.gms.internal.play_billing.zze.zzh(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iZzb);
            ((u) sVar).zzb(zzcg.zzb(23, 24, billingResultA), i10);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultA, null);
            return;
        }
        try {
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResultA, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e10) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e10);
            BillingResult billingResult2 = t.f12770k;
            ((u) sVar).zzb(zzcg.zzb(104, 24, billingResult2), i10);
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(billingResult2, null);
        }
    }
}
