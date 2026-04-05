package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzacw {
    protected volatile zzadl zza;
    private volatile zzyx zzb;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzacw)) {
            return false;
        }
        zzacw zzacwVar = (zzacw) obj;
        zzadl zzadlVar = this.zza;
        zzadl zzadlVar2 = zzacwVar.zza;
        if (zzadlVar == null && zzadlVar2 == null) {
            return zzb().equals(zzacwVar.zzb());
        }
        if (zzadlVar != null && zzadlVar2 != null) {
            return zzadlVar.equals(zzadlVar2);
        }
        if (zzadlVar != null) {
            zzacwVar.zzd(zzadlVar.zzay());
            return zzadlVar.equals(zzacwVar.zza);
        }
        zzd(zzadlVar2.zzay());
        return this.zza.equals(zzadlVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzyv) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzY();
        }
        return 0;
    }

    public final zzyx zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzyx.zzb;
                } else {
                    this.zzb = this.zza.zzR();
                }
                return this.zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzadl zzc(zzadl zzadlVar) {
        zzadl zzadlVar2 = this.zza;
        this.zzb = null;
        this.zza = zzadlVar;
        return zzadlVar2;
    }

    public final void zzd(zzadl zzadlVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzadlVar;
                this.zzb = zzyx.zzb;
            } catch (zzacq unused) {
                this.zza = zzadlVar;
                this.zzb = zzyx.zzb;
            }
        }
    }
}
