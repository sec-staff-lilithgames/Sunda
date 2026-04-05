package com.google.android.gms.internal.ads;

import b0.e2;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhgr extends zzhhi {
    private final int zza;
    private final int zzb;
    private final zzhgq zzc;

    public /* synthetic */ zzhgr(int i10, int i11, zzhgq zzhgqVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzhgqVar;
    }

    public static zzhgp zzb() {
        return new zzhgp(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgr)) {
            return false;
        }
        zzhgr zzhgrVar = (zzhgr) obj;
        return zzhgrVar.zza == this.zza && zzhgrVar.zze() == zze() && zzhgrVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhgr.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i11).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        return e2.n(sb2, "-byte tags, and ", i11, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zzc != zzhgq.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhgq zzhgqVar = this.zzc;
        if (zzhgqVar == zzhgq.zzd) {
            return this.zzb;
        }
        if (zzhgqVar == zzhgq.zza || zzhgqVar == zzhgq.zzb || zzhgqVar == zzhgq.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhgq zzf() {
        return this.zzc;
    }
}
