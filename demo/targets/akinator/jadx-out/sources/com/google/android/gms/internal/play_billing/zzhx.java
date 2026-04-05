package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzhx {
    protected volatile zzim zza;
    private volatile zzgk zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhx)) {
            return false;
        }
        zzhx zzhxVar = (zzhx) obj;
        zzim zzimVar = this.zza;
        zzim zzimVar2 = zzhxVar.zza;
        if (zzimVar == null && zzimVar2 == null) {
            return zzb().equals(zzhxVar.zzb());
        }
        if (zzimVar != null && zzimVar2 != null) {
            return zzimVar.equals(zzimVar2);
        }
        if (zzimVar != null) {
            zzhxVar.zzd(zzimVar.zzi());
            return zzimVar.equals(zzhxVar.zza);
        }
        zzd(zzimVar2.zzi());
        return this.zza.equals(zzimVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzgi) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzk();
        }
        return 0;
    }

    public final zzgk zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzgk.zzb;
                } else {
                    this.zzb = this.zza.zzf();
                }
                return this.zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzim zzc(zzim zzimVar) {
        zzim zzimVar2 = this.zza;
        this.zzb = null;
        this.zza = zzimVar;
        return zzimVar2;
    }

    public final void zzd(zzim zzimVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzimVar;
                this.zzb = zzgk.zzb;
            } catch (zzhr unused) {
                this.zza = zzimVar;
                this.zzb = zzgk.zzb;
            }
        }
    }
}
