package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbpv extends zzcch {
    private final Object zza = new Object();
    private final zzbqa zzb;
    private boolean zzc;

    public zzbpv(zzbqa zzbqaVar) {
        this.zzb = zzbqaVar;
    }

    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock acquired");
                if (this.zzc) {
                    com.google.android.gms.ads.internal.util.zze.zza("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zze(new zzbps(this), new zzccd());
                zze(new zzbpt(this), new zzbpu(this));
                com.google.android.gms.ads.internal.util.zze.zza("release: Lock released");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ zzbqa zzb() {
        return this.zzb;
    }
}
