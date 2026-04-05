package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzlk;
import md.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12788a;

    /* renamed from: b, reason: collision with root package name */
    public jd.k f12789b;

    public final void zza(zzlk zzlkVar) {
        if (this.f12788a) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((f0) this.f12789b).send(jd.f.ofData(zzlkVar));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingLogger", "logging failed.");
        }
    }
}
