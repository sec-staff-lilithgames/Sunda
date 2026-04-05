package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbcc {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbcc(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbcc)) {
            return false;
        }
        zzbcc zzbccVar = (zzbcc) obj;
        return zzbccVar.zza == this.zza && zzbccVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
