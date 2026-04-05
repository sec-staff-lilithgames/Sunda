package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzym implements zzyk {
    private final zzyk zza;

    public zzym(zzyk zzykVar) {
        this.zza = zzykVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzym) {
            return this.zza.equals(((zzym) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public zzbg zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public zzv zzb(int i10) {
        return this.zza.zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public zzv zzc() {
        return this.zza.zzc();
    }

    public final zzyk zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzf(int i10) {
        return this.zza.zzf(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzyp
    public final int zzg(int i10) {
        return this.zza.zzg(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zzh() {
        return this.zza.zzh();
    }
}
