package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m extends com.google.android.gms.internal.play_billing.zzao {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f12748b;

    /* renamed from: c, reason: collision with root package name */
    public final ResultReceiver f12749c;

    public /* synthetic */ m(WeakReference weakReference, ResultReceiver resultReceiver) {
        this.f12748b = weakReference;
        this.f12749c = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzap
    public final void zza(Bundle bundle) throws RemoteException {
        ResultReceiver resultReceiver = this.f12749c;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f12748b.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            resultReceiver.send(0, null);
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", resultReceiver);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e10) {
            resultReceiver.send(0, null);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Exception caught while launching intent for in-app messaging.", e10);
        }
    }
}
