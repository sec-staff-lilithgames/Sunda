package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzuu {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzuu(Object obj, int i10, int i11, long j10, int i12) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuu)) {
            return false;
        }
        zzuu zzuuVar = (zzuu) obj;
        return this.zza.equals(zzuuVar.zza) && this.zzb == zzuuVar.zzb && this.zzc == zzuuVar.zzc && this.zzd == zzuuVar.zzd && this.zze == zzuuVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzuu zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzuu(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzuu(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public zzuu(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public zzuu(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
