package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzli;
import com.google.android.gms.internal.play_billing.zzlk;
import com.google.android.gms.internal.play_billing.zzlq;
import com.google.android.gms.internal.play_billing.zzlu;
import md.e0;
import md.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u implements s {

    /* renamed from: b, reason: collision with root package name */
    public zzku f12786b;

    /* renamed from: c, reason: collision with root package name */
    public final v f12787c;

    public u(Context context, zzku zzkuVar) {
        v vVar = new v();
        try {
            h0.initialize(context);
            vVar.f12789b = ((e0) h0.getInstance().newFactory(kd.a.f70805e)).getTransport("PLAY_BILLING_LIBRARY", zzlk.class, jd.e.of("proto"), new jd.j() { // from class: com.android.billingclient.api.zzcm
                @Override // jd.j
                public final Object apply(Object obj) {
                    return ((zzlk) obj).zzh();
                }
            });
        } catch (Throwable unused) {
            vVar.f12788a = true;
        }
        this.f12787c = vVar;
        this.f12786b = zzkuVar;
    }

    @Override // com.android.billingclient.api.s
    public final void zza(zzjz zzjzVar) {
        if (zzjzVar == null) {
            return;
        }
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.f12786b);
            zzliVarZzc.zza(zzjzVar);
            this.f12787c.zza((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.s
    public final void zzb(zzjz zzjzVar, int i10) {
        try {
            zzks zzksVar = (zzks) this.f12786b.zzn();
            zzksVar.zza(i10);
            this.f12786b = (zzku) zzksVar.zzf();
            zza(zzjzVar);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.s
    public final void zzc(zzkd zzkdVar) {
        if (zzkdVar == null) {
            return;
        }
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.f12786b);
            zzliVarZzc.zzm(zzkdVar);
            this.f12787c.zza((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.s
    public final void zzd(zzkd zzkdVar, int i10) {
        try {
            zzks zzksVar = (zzks) this.f12786b.zzn();
            zzksVar.zza(i10);
            this.f12786b = (zzku) zzksVar.zzf();
            zzc(zzkdVar);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.s
    public final void zze(zzkl zzklVar) {
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.f12786b);
            zzliVarZzc.zzn(zzklVar);
            this.f12787c.zza((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.s
    public final void zzf(zzlq zzlqVar) {
        try {
            v vVar = this.f12787c;
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.f12786b);
            zzliVarZzc.zzp(zzlqVar);
            vVar.zza((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // com.android.billingclient.api.s
    public final void zzg(zzlu zzluVar) {
        if (zzluVar == null) {
            return;
        }
        try {
            zzli zzliVarZzc = zzlk.zzc();
            zzliVarZzc.zzo(this.f12786b);
            zzliVarZzc.zzq(zzluVar);
            this.f12787c.zza((zzlk) zzliVarZzc.zzf());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingLogger", "Unable to log.", th2);
        }
    }
}
