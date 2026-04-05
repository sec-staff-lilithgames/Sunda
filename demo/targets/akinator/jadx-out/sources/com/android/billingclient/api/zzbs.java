package com.android.billingclient.api;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class zzbs {
    public final /* synthetic */ r zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzbs(r rVar, int i10) {
        this.zza = rVar;
        this.zzb = i10;
    }

    public final Object zza(com.google.android.gms.internal.play_billing.zzr zzrVar) {
        String str;
        r rVar = this.zza;
        int i10 = this.zzb;
        rVar.getClass();
        try {
            if (rVar.I == null) {
                throw null;
            }
            com.google.android.gms.internal.play_billing.zzav zzavVar = rVar.I;
            String packageName = rVar.G.getPackageName();
            switch (i10) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            zzavVar.zza(packageName, str, new p(zzrVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            rVar.L(107, 28, t.G);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e10);
            zzrVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }
}
