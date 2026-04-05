package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzkq {
    public final zzuu zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    public zzkq(zzuu zzuuVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        zzgmd.zza(!z14 || z12);
        if (z13 && !z12) {
            z15 = false;
        }
        zzgmd.zza(z15);
        this.zza = zzuuVar;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkq.class == obj.getClass()) {
            zzkq zzkqVar = (zzkq) obj;
            if (this.zzb == zzkqVar.zzb && this.zzc == zzkqVar.zzc && this.zzd == zzkqVar.zzd && this.zze == zzkqVar.zze && this.zzh == zzkqVar.zzh && this.zzi == zzkqVar.zzi && this.zzj == zzkqVar.zzj && Objects.equals(this.zza, zzkqVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j10 = this.zze;
        long j11 = this.zzd;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j11)) * 31) + ((int) j10)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzkq zza(long j10) {
        return j10 == this.zzb ? this : new zzkq(this.zza, j10, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzkq zzb(long j10) {
        return j10 == this.zzc ? this : new zzkq(this.zza, this.zzb, j10, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }
}
