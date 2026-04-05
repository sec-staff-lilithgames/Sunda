package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgzf extends zzgxb {
    private final String zza;
    private final zzgze zzb;

    private zzgzf(String str, zzgze zzgzeVar) {
        this.zza = str;
        this.zzb = zzgzeVar;
    }

    public static zzgzf zzb(String str, zzgze zzgzeVar) {
        return new zzgzf(str, zzgzeVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgzf)) {
            return false;
        }
        zzgzf zzgzfVar = (zzgzf) obj;
        return zzgzfVar.zza.equals(this.zza) && zzgzfVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzgzf.class, this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + string.length() + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, "LegacyKmsAead Parameters (keyUri: ", str, ", variant: ", string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zzb != zzgze.zzb;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zzgze zzd() {
        return this.zzb;
    }
}
