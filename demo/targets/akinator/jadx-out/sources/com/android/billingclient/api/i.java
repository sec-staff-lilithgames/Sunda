package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.android.billingclient.api.BillingResult;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i extends com.google.android.gms.internal.play_billing.zzad {

    /* renamed from: b, reason: collision with root package name */
    public final BillingConfigResponseListener f12737b;

    /* renamed from: c, reason: collision with root package name */
    public final s f12738c;

    /* renamed from: e, reason: collision with root package name */
    public final int f12739e;

    public /* synthetic */ i(BillingConfigResponseListener billingConfigResponseListener, u uVar, int i10) {
        this.f12737b = billingConfigResponseListener;
        this.f12738c = uVar;
        this.f12739e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzae
    public final void zza(Bundle bundle) throws RemoteException {
        int i10 = this.f12739e;
        s sVar = this.f12738c;
        BillingConfigResponseListener billingConfigResponseListener = this.f12737b;
        if (bundle == null) {
            BillingResult billingResult = t.f12770k;
            ((u) sVar).zzb(zzcg.zzb(63, 13, billingResult), i10);
            billingConfigResponseListener.onBillingConfigResponse(billingResult, null);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        String strZzh = com.google.android.gms.internal.play_billing.zze.zzh(bundle, "BillingClient");
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iZzb);
        builderNewBuilder.setDebugMessage(strZzh);
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "getBillingConfig() failed. Response code: " + iZzb);
            BillingResult billingResultBuild = builderNewBuilder.build();
            ((u) sVar).zzb(zzcg.zzb(23, 13, billingResultBuild), i10);
            billingConfigResponseListener.onBillingConfigResponse(billingResultBuild, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            builderNewBuilder.setResponseCode(6);
            BillingResult billingResultBuild2 = builderNewBuilder.build();
            ((u) sVar).zzb(zzcg.zzb(64, 13, billingResultBuild2), i10);
            billingConfigResponseListener.onBillingConfigResponse(billingResultBuild2, null);
            return;
        }
        try {
            billingConfigResponseListener.onBillingConfigResponse(builderNewBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e10) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e10);
            BillingResult billingResult2 = t.f12770k;
            ((u) sVar).zzb(zzcg.zzb(65, 13, billingResult2), i10);
            billingConfigResponseListener.onBillingConfigResponse(billingResult2, null);
        }
    }
}
