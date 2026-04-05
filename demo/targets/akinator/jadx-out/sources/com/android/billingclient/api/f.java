package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f extends com.google.android.gms.internal.play_billing.zzx {

    /* renamed from: b, reason: collision with root package name */
    public final AlternativeBillingOnlyReportingDetailsListener f12729b;

    /* renamed from: c, reason: collision with root package name */
    public final s f12730c;

    /* renamed from: e, reason: collision with root package name */
    public final int f12731e;

    public /* synthetic */ f(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, u uVar, int i10) {
        this.f12729b = alternativeBillingOnlyReportingDetailsListener;
        this.f12730c = uVar;
        this.f12731e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzy
    public final void zza(Bundle bundle) throws RemoteException {
        int i10 = this.f12731e;
        s sVar = this.f12730c;
        AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener = this.f12729b;
        if (bundle == null) {
            BillingResult billingResult = t.f12770k;
            ((u) sVar).zzb(zzcg.zzb(71, 15, billingResult), i10);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        BillingResult billingResultA = t.a(iZzb, com.google.android.gms.internal.play_billing.zze.zzh(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iZzb);
            ((u) sVar).zzb(zzcg.zzb(23, 15, billingResultA), i10);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultA, null);
            return;
        }
        try {
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResultA, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException e10) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e10);
            BillingResult billingResult2 = t.f12770k;
            ((u) sVar).zzb(zzcg.zzb(72, 15, billingResult2), i10);
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
        }
    }
}
