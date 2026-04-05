package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzhxj {
    protected volatile zzhxz zza;
    private volatile zzhvi zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhxj)) {
            return false;
        }
        zzhxj zzhxjVar = (zzhxj) obj;
        zzhxz zzhxzVar = this.zza;
        zzhxz zzhxzVar2 = zzhxjVar.zza;
        if (zzhxzVar == null && zzhxzVar2 == null) {
            return zzc().equals(zzhxjVar.zzc());
        }
        if (zzhxzVar != null && zzhxzVar2 != null) {
            return zzhxzVar.equals(zzhxzVar2);
        }
        if (zzhxzVar != null) {
            zzhxjVar.zzd(zzhxzVar.zzbw());
            return zzhxzVar.equals(zzhxjVar.zza);
        }
        zzd(zzhxzVar2.zzbw());
        return this.zza.equals(zzhxzVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzhxz zza(zzhxz zzhxzVar) {
        zzhxz zzhxzVar2 = this.zza;
        this.zzb = null;
        this.zza = zzhxzVar;
        return zzhxzVar2;
    }

    public final int zzb() {
        if (this.zzb != null) {
            return ((zzhvg) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzbr();
        }
        return 0;
    }

    public final zzhvi zzc() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzhvi.zzb;
                } else {
                    this.zzb = this.zza.zzaM();
                }
                return this.zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzd(zzhxz zzhxzVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzhxzVar;
                this.zzb = zzhvi.zzb;
            } catch (zzhxd unused) {
                this.zzc = true;
                this.zza = zzhxzVar;
                this.zzb = zzhvi.zzb;
            }
        }
    }
}
