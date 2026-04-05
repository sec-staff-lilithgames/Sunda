package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class zzav extends ResultReceiver {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppMessageResponseListener f12802b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzav(Handler handler, InAppMessageResponseListener inAppMessageResponseListener) {
        super(handler);
        this.f12802b = inAppMessageResponseListener;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f12802b.onInAppMessageResponse(com.google.android.gms.internal.play_billing.zze.zzg(bundle, "BillingClient"));
    }
}
