package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12795a;

    /* renamed from: b, reason: collision with root package name */
    public final PurchasesUpdatedListener f12796b;

    /* renamed from: c, reason: collision with root package name */
    public final UserChoiceBillingListener f12797c;

    /* renamed from: d, reason: collision with root package name */
    public final s f12798d;

    /* renamed from: e, reason: collision with root package name */
    public final zzm f12799e = new zzm(this, true);

    /* renamed from: f, reason: collision with root package name */
    public final zzm f12800f = new zzm(this, false);

    /* renamed from: g, reason: collision with root package name */
    public boolean f12801g;

    public z(Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, u uVar) {
        this.f12795a = context;
        this.f12796b = purchasesUpdatedListener;
        this.f12797c = userChoiceBillingListener;
        this.f12798d = uVar;
    }

    public final void a(boolean z10) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f12801g = z10;
        zzm zzmVar = this.f12800f;
        Context context = this.f12795a;
        zzmVar.zza(context, intentFilter2);
        boolean z11 = this.f12801g;
        zzm zzmVar2 = this.f12799e;
        if (z11) {
            zzmVar2.zzb(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            zzmVar2.zza(context, intentFilter);
        }
    }
}
