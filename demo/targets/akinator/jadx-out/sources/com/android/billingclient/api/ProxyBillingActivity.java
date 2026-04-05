package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    public ResultReceiver f12650b;

    /* renamed from: c, reason: collision with root package name */
    public ResultReceiver f12651c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12652e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12653f;

    /* renamed from: g, reason: collision with root package name */
    public int f12654g;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f12652e = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f12650b = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f12651c = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f12653f = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.f12654g = bundle.getInt("activity_code", 100);
            return;
        }
        com.google.android.gms.internal.play_billing.zze.zzk("ProxyBillingActivity", "Launching Play Store billing flow");
        this.f12654g = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f12653f = true;
                this.f12654g = 110;
            }
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f12650b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f12651c = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.f12654g = 101;
        } else {
            pendingIntent = null;
        }
        try {
            this.f12652e = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.f12654g, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e10) {
            com.google.android.gms.internal.play_billing.zze.zzm("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
            ResultReceiver resultReceiver = this.f12650b;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f12651c;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentA = a();
                    if (this.f12653f) {
                        intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentA.putExtra("RESPONSE_CODE", 6);
                    intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentA);
                }
            }
            this.f12652e = false;
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f12652e) {
            Intent intentA = a();
            intentA.putExtra("RESPONSE_CODE", 1);
            intentA.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            int i10 = this.f12654g;
            if (i10 == 110 || i10 == 100) {
                intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
            }
            sendBroadcast(intentA);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f12650b;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f12651c;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f12652e);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f12653f);
        bundle.putInt("activity_code", this.f12654g);
    }
}
