package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgyp extends zzgxb {
    private final int zza;
    private final zzgyo zzb;

    public /* synthetic */ zzgyp(int i10, zzgyo zzgyoVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = zzgyoVar;
    }

    public static zzgyn zzb() {
        return new zzgyn(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgyp)) {
            return false;
        }
        zzgyp zzgypVar = (zzgyp) obj;
        return zzgypVar.zza == this.zza && zzgypVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzgyp.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = strValueOf.length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i10).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zzb != zzgyo.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzgyo zzd() {
        return this.zzb;
    }
}
