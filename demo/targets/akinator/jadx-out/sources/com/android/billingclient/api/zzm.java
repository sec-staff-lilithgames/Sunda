package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzjz;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
final class zzm extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12812a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f12814c;

    public zzm(z zVar, boolean z10) {
        this.f12814c = zVar;
        this.f12813b = z10;
    }

    public final void a(Bundle bundle, BillingResult billingResult, int i10) {
        s sVar = this.f12814c.f12798d;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                ((u) sVar).zza(zzjz.zzC(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzgw.zza()));
            } else {
                ((u) sVar).zza(zzcg.zzb(23, i10, billingResult));
            }
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        z zVar = this.f12814c;
        UserChoiceBillingListener userChoiceBillingListener = zVar.f12797c;
        PurchasesUpdatedListener purchasesUpdatedListener = zVar.f12796b;
        s sVar = zVar.f12798d;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", "Bundle is null.");
            BillingResult billingResult = t.f12770k;
            ((u) sVar).zza(zzcg.zzb(11, 1, billingResult));
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesUpdated(billingResult, null);
                return;
            }
            return;
        }
        BillingResult billingResultZzf = com.google.android.gms.internal.play_billing.zze.zzf(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i10 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List<Purchase> listZzj = com.google.android.gms.internal.play_billing.zze.zzj(extras);
            if (billingResultZzf.getResponseCode() == 0) {
                ((u) sVar).zzc(zzcg.zzd(i10));
            } else {
                a(extras, billingResultZzf, i10);
            }
            purchasesUpdatedListener.onPurchasesUpdated(billingResultZzf, listZzj);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (billingResultZzf.getResponseCode() != 0) {
                a(extras, billingResultZzf, i10);
                purchasesUpdatedListener.onPurchasesUpdated(billingResultZzf, com.google.android.gms.internal.play_billing.zzco.zzl());
                return;
            }
            if (userChoiceBillingListener == null) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                BillingResult billingResult2 = t.f12770k;
                ((u) sVar).zza(zzcg.zzb(77, i10, billingResult2));
                purchasesUpdatedListener.onPurchasesUpdated(billingResult2, com.google.android.gms.internal.play_billing.zzco.zzl());
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                BillingResult billingResult3 = t.f12770k;
                ((u) sVar).zza(zzcg.zzb(16, i10, billingResult3));
                purchasesUpdatedListener.onPurchasesUpdated(billingResult3, com.google.android.gms.internal.play_billing.zzco.zzl());
                return;
            }
            try {
                if (userChoiceBillingListener != null) {
                    userChoiceBillingListener.userSelectedAlternativeBilling(new UserChoiceDetails(string));
                    ((u) sVar).zzc(zzcg.zzd(i10));
                    return;
                }
                JSONArray jSONArrayOptJSONArray = new JSONObject(string).optJSONArray("products");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray == null) {
                    throw null;
                }
                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new zzc(jSONObjectOptJSONObject));
                    }
                }
                throw null;
            } catch (JSONException unused) {
                com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", "Error when parsing invalid user choice data: [" + string + C3191e4.i.f36531e);
                BillingResult billingResult4 = t.f12770k;
                ((u) sVar).zza(zzcg.zzb(17, i10, billingResult4));
                purchasesUpdatedListener.onPurchasesUpdated(billingResult4, com.google.android.gms.internal.play_billing.zzco.zzl());
            }
        }
    }

    public final synchronized void zza(Context context, IntentFilter intentFilter) {
        try {
            if (this.f12812a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f12813b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f12812a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(Context context, IntentFilter intentFilter, String str) {
        zzm zzmVar;
        try {
            try {
                if (this.f12812a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    zzmVar = this;
                    context.registerReceiver(zzmVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f12813b ? 4 : 2);
                } else {
                    zzmVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                zzmVar.f12812a = true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void zzc(Context context) {
        if (!this.f12812a) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f12812a = false;
        }
    }
}
