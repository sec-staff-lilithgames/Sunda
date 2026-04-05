package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzpl {
    public static final zzpl zza = new zzpk().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzpl(zzpk zzpkVar, byte[] bArr) {
        this.zzb = zzpkVar.zze();
        this.zzc = zzpkVar.zzf();
        this.zzd = zzpkVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpl.class == obj.getClass()) {
            zzpl zzplVar = (zzpl) obj;
            if (this.zzb == zzplVar.zzb && this.zzc == zzplVar.zzc && this.zzd == zzplVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.zzb;
        boolean z11 = this.zzc;
        return (z11 ? 1 : 0) + (z11 ? 1 : 0) + ((z10 ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}
