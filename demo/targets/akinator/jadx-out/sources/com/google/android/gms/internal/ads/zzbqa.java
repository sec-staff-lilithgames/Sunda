package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbqa extends zzcch {
    private final com.google.android.gms.ads.internal.util.zzbc zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbqa(com.google.android.gms.ads.internal.util.zzbc zzbcVar) {
        this.zzb = zzbcVar;
    }

    public final zzbpv zza() {
        zzbpv zzbpvVar = new zzbpv(this);
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock acquired");
            zze(new zzbpw(this, zzbpvVar), new zzbpx(this, zzbpvVar));
            Preconditions.checkState(this.zzd >= 0);
            this.zzd++;
        }
        com.google.android.gms.ads.internal.util.zze.zza("createNewReference: Lock released");
        return zzbpvVar;
    }

    public final void zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock acquired");
            Preconditions.checkState(this.zzd > 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzd();
        }
        com.google.android.gms.ads.internal.util.zze.zza("releaseOneReference: Lock released");
    }

    public final void zzc() {
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock acquired");
            Preconditions.checkState(this.zzd >= 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzd();
        }
        com.google.android.gms.ads.internal.util.zze.zza("markAsDestroyable: Lock released");
    }

    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock acquired");
                Preconditions.checkState(this.zzd >= 0);
                if (this.zzc && this.zzd == 0) {
                    com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                    zze(new zzbpz(this), new zzccd());
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("maybeDestroy: Lock released");
    }
}
