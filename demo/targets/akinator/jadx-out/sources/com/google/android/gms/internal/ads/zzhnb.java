package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhnb extends zzhpp {
    private final zzhmz zza;
    private final zzhmx zzb;
    private final zzhmy zzc;
    private final zzhna zzd;

    public /* synthetic */ zzhnb(zzhmz zzhmzVar, zzhmx zzhmxVar, zzhmy zzhmyVar, zzhna zzhnaVar, byte[] bArr) {
        this.zza = zzhmzVar;
        this.zzb = zzhmxVar;
        this.zzc = zzhmyVar;
        this.zzd = zzhnaVar;
    }

    public static zzhmw zzb() {
        return new zzhmw(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnb)) {
            return false;
        }
        zzhnb zzhnbVar = (zzhnb) obj;
        return zzhnbVar.zza == this.zza && zzhnbVar.zzb == this.zzb && zzhnbVar.zzc == this.zzc && zzhnbVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhnb.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int length = string.length();
        String string2 = this.zzc.toString();
        int length2 = string2.length();
        String string3 = this.zza.toString();
        int length3 = string3.length();
        String string4 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, "ECDSA Parameters (variant: ", string, ", hashType: ", string2);
        com.google.android.gms.internal.play_billing.a.B(sb2, ", encoding: ", string3, ", curve: ", string4);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zzd != zzhna.zzd;
    }

    public final zzhmz zzc() {
        return this.zza;
    }

    public final zzhmx zzd() {
        return this.zzb;
    }

    public final zzhmy zze() {
        return this.zzc;
    }

    public final zzhna zzf() {
        return this.zzd;
    }
}
