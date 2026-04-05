package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zzbf;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j extends com.google.android.gms.internal.play_billing.zzaf {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f12740b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReceiver f12741c;

    public /* synthetic */ j(WeakReference weakReference, ResultReceiver resultReceiver) {
        this.f12740b = weakReference;
        this.f12741c = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzag
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.f12741c;
        if (bundle == null) {
            resultReceiver.send(6, null);
            return;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Response bundle doesn't contain a response code");
            resultReceiver.send(6, bundle);
            return;
        }
        int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Unable to launch intent for external offer dialog" + iZzb);
            resultReceiver.send(iZzb, bundle);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("EXTERNAL_PAYMENT_DIALOG_INTENT");
        if (pendingIntent == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "The PendingIntent for the external offer dialog is null");
            Bundle bundle2 = new Bundle();
            bundle2.putInt("RESPONSE_CODE", 6);
            bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
            resultReceiver.send(6, bundle2);
            return;
        }
        try {
            Activity activity = (Activity) this.f12740b.get();
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivityV2.class);
            intent.putExtra("external_payment_dialog_result_receiver", resultReceiver);
            intent.putExtra("external_payment_dialog_pending_intent", pendingIntent);
            activity.startActivity(intent);
        } catch (RuntimeException e10) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Runtime error while launching intent for the external offer dialog.", e10);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("RESPONSE_CODE", 6);
            bundle3.putString("DEBUG_MESSAGE", "An internal error occurred.");
            bundle3.putInt("INTERNAL_LOG_ERROR_REASON", 98);
            bundle3.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", e10.getClass().getName() + ": " + zzbf.zzb(e10.getMessage()));
            resultReceiver.send(6, bundle3);
        }
    }
}
