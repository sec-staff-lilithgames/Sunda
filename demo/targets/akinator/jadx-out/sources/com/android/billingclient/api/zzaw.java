package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzkg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class zzaw extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlternativeBillingOnlyInformationDialogListener f12803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f12804c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(a aVar, Handler handler, AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        super(handler);
        this.f12803b = alternativeBillingOnlyInformationDialogListener;
        this.f12804c = aVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i10);
        AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener = this.f12803b;
        if (i10 != 0) {
            a aVar = this.f12804c;
            if (bundle == null) {
                aVar.A(alternativeBillingOnlyInformationDialogListener, t.f12770k, 73, null);
                return;
            } else {
                builderNewBuilder.setDebugMessage(com.google.android.gms.internal.play_billing.zze.zzh(bundle, "BillingClient"));
                int i11 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                aVar.f(zzcg.zzc(i11 != 0 ? zzkg.zza(i11) : 23, 16, builderNewBuilder.build(), bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS")));
            }
        }
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(builderNewBuilder.build());
    }
}
