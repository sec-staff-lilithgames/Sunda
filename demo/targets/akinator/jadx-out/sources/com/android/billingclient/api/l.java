package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l extends com.google.android.gms.internal.play_billing.zzaj {

    /* renamed from: b, reason: collision with root package name */
    public final ExternalOfferAvailabilityListener f12745b;

    /* renamed from: c, reason: collision with root package name */
    public final s f12746c;

    /* renamed from: e, reason: collision with root package name */
    public final int f12747e;

    public /* synthetic */ l(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, u uVar, int i10) {
        this.f12745b = externalOfferAvailabilityListener;
        this.f12746c = uVar;
        this.f12747e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzak
    public final void zza(Bundle bundle) throws RemoteException {
        ExternalOfferAvailabilityListener externalOfferAvailabilityListener = this.f12745b;
        int i10 = this.f12747e;
        s sVar = this.f12746c;
        if (bundle == null) {
            BillingResult billingResult = t.f12770k;
            ((u) sVar).zzb(zzcg.zzb(92, 23, billingResult), i10);
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        BillingResult billingResultA = t.a(iZzb, com.google.android.gms.internal.play_billing.zze.zzh(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iZzb);
            ((u) sVar).zzb(zzcg.zzb(23, 23, billingResultA), i10);
        }
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(billingResultA);
    }
}
