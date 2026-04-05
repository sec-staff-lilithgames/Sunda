package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzej;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o implements zzej {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Consumer f12753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f12754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f12755c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12756d;

    public o(r rVar, int i10, Consumer consumer, Runnable runnable) {
        this.f12756d = i10;
        this.f12753a = consumer;
        this.f12754b = runnable;
        this.f12755c = rVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzej
    public final void zza(Throwable th2) {
        boolean z10 = th2 instanceof TimeoutException;
        r rVar = this.f12755c;
        if (z10) {
            rVar.L(114, 28, t.G);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            rVar.L(107, 28, t.G);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        this.f12754b.run();
    }

    @Override // com.google.android.gms.internal.play_billing.zzej
    public final void zzb(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() <= 0) {
            this.f12754b.run();
            return;
        }
        BillingResult billingResultA = t.a(num.intValue(), "Billing override value was set by a license tester.");
        this.f12755c.L(105, this.f12756d, billingResultA);
        this.f12753a.accept(billingResultA);
    }
}
