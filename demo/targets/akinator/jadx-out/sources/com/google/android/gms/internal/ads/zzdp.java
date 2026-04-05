package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdp {
    public final Object zza;
    private zzr zzb = new zzr();
    private boolean zzc;
    private boolean zzd;

    public zzdp(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdp.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzdp) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(zzdo zzdoVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzdoVar.zza(this.zza, this.zzb.zzb());
        }
    }

    public final void zzb(int i10, zzdn zzdnVar) {
        if (this.zzd) {
            return;
        }
        if (i10 != -1) {
            this.zzb.zza(i10);
        }
        this.zzc = true;
        zzdnVar.zza(this.zza);
    }

    public final void zzc(zzdo zzdoVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzs zzsVarZzb = this.zzb.zzb();
        this.zzb = new zzr();
        this.zzc = false;
        zzdoVar.zza(this.zza, zzsVarZzb);
    }
}
