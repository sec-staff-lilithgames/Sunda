package com.google.android.gms.internal.ads;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdsq {
    private final zzfvh zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzdsq(zzfvh zzfvhVar) {
        this.zza = zzfvhVar;
    }

    public final void zza(zzbbp zzbbpVar) {
        this.zzc.set(true);
        zzbbpVar.zzg(this);
        this.zza.zza();
    }

    public final void zzb(String str) {
        if (zzgmu.zzc(str) || !this.zzc.get() || this.zzb.getAndSet(true)) {
            return;
        }
        this.zza.zzb(str);
    }

    public final void zzc() {
        if (this.zzb.get()) {
            this.zza.zzg();
        }
    }

    public final void zzd() {
        if (this.zzb.getAndSet(false)) {
            this.zza.zze();
        }
    }

    public final void zze(Activity activity) {
        if (this.zzb.get()) {
            this.zza.zzd();
        }
    }

    public final void zzf(Activity activity) {
        if (this.zzb.get()) {
            this.zza.zzc();
        }
    }

    public final boolean zzg(Activity activity) {
        if (!this.zzb.getAndSet(false)) {
            return false;
        }
        this.zza.zzf();
        return false;
    }
}
