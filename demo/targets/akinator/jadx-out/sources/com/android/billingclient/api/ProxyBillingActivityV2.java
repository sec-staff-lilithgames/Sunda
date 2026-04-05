package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {

    /* renamed from: c, reason: collision with root package name */
    public i.d f12655c;

    /* renamed from: e, reason: collision with root package name */
    public i.d f12656e;

    /* renamed from: f, reason: collision with root package name */
    public ResultReceiver f12657f;

    /* renamed from: g, reason: collision with root package name */
    public ResultReceiver f12658g;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12655c = registerForActivityResult(new j.e(), new i.b() { // from class: com.android.billingclient.api.zzct
            @Override // i.b
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.zza;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent data = activityResult.getData();
                int responseCode = com.google.android.gms.internal.play_billing.zze.zzf(data, "ProxyBillingActivityV2").getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.f12657f;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, data == null ? null : data.getExtras());
                }
                if (activityResult.getResultCode() != -1 || responseCode != 0) {
                    com.google.android.gms.internal.play_billing.zze.zzl("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + activityResult.getResultCode() + " and billing's responseCode: " + responseCode);
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.f12656e = registerForActivityResult(new j.e(), new i.b() { // from class: com.android.billingclient.api.zzcu
            @Override // i.b
            public final void onActivityResult(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.zza;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent data = activityResult.getData();
                int responseCode = com.google.android.gms.internal.play_billing.zze.zzf(data, "ProxyBillingActivityV2").getResponseCode();
                ResultReceiver resultReceiver = proxyBillingActivityV2.f12658g;
                if (resultReceiver != null) {
                    resultReceiver.send(responseCode, data == null ? null : data.getExtras());
                }
                if (activityResult.getResultCode() != -1 || responseCode != 0) {
                    com.google.android.gms.internal.play_billing.zze.zzl("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + activityResult.getResultCode() + " and billing's responseCode: " + responseCode);
                }
                proxyBillingActivityV2.finish();
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f12657f = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.f12658g = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.play_billing.zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f12657f = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f12655c.launch(new IntentSenderRequest.a(pendingIntent).build());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.f12658g = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f12656e.launch(new IntentSenderRequest.a(pendingIntent2).build());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f12657f;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f12658g;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
