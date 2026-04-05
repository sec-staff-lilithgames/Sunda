package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhak extends zzgxb {
    private final zzhaj zza;
    private final int zzb;

    private zzhak(zzhaj zzhajVar, int i10) {
        this.zza = zzhajVar;
        this.zzb = i10;
    }

    public static zzhak zzb(zzhaj zzhajVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzhak(zzhajVar, i10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhak)) {
            return false;
        }
        zzhak zzhakVar = (zzhak) obj;
        return zzhakVar.zza == this.zza && zzhakVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhak.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 48 + String.valueOf(i10).length() + 1);
        sb2.append("X-AES-GCM Parameters (variant: ");
        sb2.append(string);
        sb2.append("salt_size_bytes: ");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zza != zzhaj.zzb;
    }

    public final zzhaj zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }
}
