package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzmw {
    protected volatile zznm zza;
    private volatile zzlh zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmw)) {
            return false;
        }
        zzmw zzmwVar = (zzmw) obj;
        zznm zznmVar = this.zza;
        zznm zznmVar2 = zzmwVar.zza;
        if (zznmVar == null && zznmVar2 == null) {
            return zzc().equals(zzmwVar.zzc());
        }
        if (zznmVar != null && zznmVar2 != null) {
            return zznmVar.equals(zznmVar2);
        }
        if (zznmVar != null) {
            zzmwVar.zzd(zznmVar.zzcE());
            return zznmVar.equals(zzmwVar.zza);
        }
        zzd(zznmVar2.zzcE());
        return this.zza.equals(zznmVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zznm zza(zznm zznmVar) {
        zznm zznmVar2 = this.zza;
        this.zzb = null;
        this.zza = zznmVar;
        return zznmVar2;
    }

    public final int zzb() {
        if (this.zzb != null) {
            return ((zzlg) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzcn();
        }
        return 0;
    }

    public final zzlh zzc() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzlh.zzb;
                } else {
                    this.zzb = this.zza.zzcb();
                }
                return this.zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzd(zznm zznmVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zznmVar;
                this.zzb = zzlh.zzb;
            } catch (zzmr unused) {
                this.zzc = true;
                this.zza = zznmVar;
                this.zzb = zzlh.zzb;
            }
        }
    }
}
