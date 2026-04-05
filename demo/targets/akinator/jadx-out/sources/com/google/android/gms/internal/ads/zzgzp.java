package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgzp extends zzgxb {
    private final zzgzo zza;
    private final String zzb;
    private final zzgzn zzc;
    private final zzgxb zzd;

    public /* synthetic */ zzgzp(zzgzo zzgzoVar, String str, zzgzn zzgznVar, zzgxb zzgxbVar, byte[] bArr) {
        this.zza = zzgzoVar;
        this.zzb = str;
        this.zzc = zzgznVar;
        this.zzd = zzgxbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgzp)) {
            return false;
        }
        zzgzp zzgzpVar = (zzgzp) obj;
        return zzgzpVar.zzc.equals(this.zzc) && zzgzpVar.zzd.equals(this.zzd) && zzgzpVar.zzb.equals(this.zzb) && zzgzpVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzgzp.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzgzo zzgzoVar = this.zza;
        zzgxb zzgxbVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzgxbVar);
        String strValueOf3 = String.valueOf(zzgzoVar);
        String str = this.zzb;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        com.google.android.gms.internal.play_billing.a.B(sb2, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zza() {
        return this.zza != zzgzo.zzb;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzgzo zzc() {
        return this.zza;
    }

    public final zzgxb zzd() {
        return this.zzd;
    }
}
