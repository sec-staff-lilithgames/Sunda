package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzmj {
    public final long zza;
    public final zzbf zzb;
    public final int zzc;
    public final zzuu zzd;
    public final long zze;
    public final zzbf zzf;
    public final int zzg;
    public final zzuu zzh;
    public final long zzi;
    public final long zzj;

    public zzmj(long j10, zzbf zzbfVar, int i10, zzuu zzuuVar, long j11, zzbf zzbfVar2, int i11, zzuu zzuuVar2, long j12, long j13) {
        this.zza = j10;
        this.zzb = zzbfVar;
        this.zzc = i10;
        this.zzd = zzuuVar;
        this.zze = j11;
        this.zzf = zzbfVar2;
        this.zzg = i11;
        this.zzh = zzuuVar2;
        this.zzi = j12;
        this.zzj = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmj.class == obj.getClass()) {
            zzmj zzmjVar = (zzmj) obj;
            if (this.zza == zzmjVar.zza && this.zzc == zzmjVar.zzc && this.zze == zzmjVar.zze && this.zzg == zzmjVar.zzg && this.zzi == zzmjVar.zzi && this.zzj == zzmjVar.zzj && Objects.equals(this.zzb, zzmjVar.zzb) && Objects.equals(this.zzd, zzmjVar.zzd) && Objects.equals(this.zzf, zzmjVar.zzf) && Objects.equals(this.zzh, zzmjVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj));
    }
}
