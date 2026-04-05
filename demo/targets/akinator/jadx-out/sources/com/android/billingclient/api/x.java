package com.android.billingclient.api;

import android.os.Bundle;
import b0.e2;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class x {
    public static w a(Bundle bundle, String str) {
        BillingResult billingResult = t.f12770k;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", str.concat(" got null owned items list"));
            return new w(billingResult, 54);
        }
        int iZzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        BillingResult billingResultF = e2.f(iZzb, com.google.android.gms.internal.play_billing.zze.zzh(bundle, "BillingClient"));
        if (iZzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", str + " failed. Response code: " + iZzb);
            return new w(billingResultF, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Bundle returned from " + str + " doesn't contain required fields.");
            return new w(billingResult, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
            return new w(billingResult, 56);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
            return new w(billingResult, 57);
        }
        if (stringArrayList3 != null) {
            return new w(t.f12771l, 1);
        }
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
        return new w(billingResult, 58);
    }
}
