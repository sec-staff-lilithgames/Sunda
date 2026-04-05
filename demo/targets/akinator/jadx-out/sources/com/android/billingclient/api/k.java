package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends com.google.android.gms.internal.play_billing.zzah {

    /* renamed from: b, reason: collision with root package name */
    public final AlternativeBillingOnlyAvailabilityListener f12742b;

    /* renamed from: c, reason: collision with root package name */
    public final s f12743c;

    /* renamed from: e, reason: collision with root package name */
    public final int f12744e;

    public /* synthetic */ k(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, u uVar, int i10) {
        this.f12742b = alternativeBillingOnlyAvailabilityListener;
        this.f12743c = uVar;
        this.f12744e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzai
    public final void zza(Bundle bundle) throws RemoteException {
        AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener = this.f12742b;
        int i10 = this.f12744e;
        s sVar = this.f12743c;
        if (bundle == null) {
            BillingResult billingResult = t.f12770k;
            ((u) sVar).zzb(zzcg.zzb(67, 14, billingResult), i10);
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        BillingResult billingResultA = t.a(iZzb, com.google.android.gms.internal.play_billing.zze.zzh(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iZzb);
            ((u) sVar).zzb(zzcg.zzb(23, 14, billingResultA), i10);
        }
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(billingResultA);
    }
}
