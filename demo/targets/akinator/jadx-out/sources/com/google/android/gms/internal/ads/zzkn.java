package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzkn {
    public final long zza;
    public final float zzb;
    public final long zzc;

    public /* synthetic */ zzkn(zzkm zzkmVar, byte[] bArr) {
        this.zza = zzkmVar.zze();
        this.zzb = zzkmVar.zzf();
        this.zzc = zzkmVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkn)) {
            return false;
        }
        zzkn zzknVar = (zzkn) obj;
        return this.zza == zzknVar.zza && this.zzb == zzknVar.zzb && this.zzc == zzknVar.zzc;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Float.valueOf(this.zzb), Long.valueOf(this.zzc));
    }

    public final zzkm zza() {
        return new zzkm(this, null);
    }
}
