package com.google.android.gms.internal.measurement;

import a.b;
import com.google.android.gms.internal.play_billing.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbu extends zzca {
    private final String zzc;
    private final int zzd;
    private final int zze;

    public /* synthetic */ zzbu(String str, boolean z10, int i10, zzbr zzbrVar, zzbs zzbsVar, int i11, byte[] bArr) {
        this.zzc = str;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzca) {
            zzca zzcaVar = (zzca) obj;
            if (this.zzc.equals(zzcaVar.zza())) {
                zzcaVar.zzb();
                int i10 = this.zzd;
                int iZze = zzcaVar.zze();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iZze) {
                    zzcaVar.zzc();
                    zzcaVar.zzd();
                    int i11 = this.zze;
                    int iZzf = zzcaVar.zzf();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzc.hashCode() ^ 1000003;
        int i10 = this.zzd;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.zze != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.zzd;
        String str = AbstractJsonLexerKt.NULL;
        String str2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? AbstractJsonLexerKt.NULL : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.zze == 1) {
            str = "READ_AND_WRITE";
        }
        String str3 = this.zzc;
        StringBuilder sb2 = new StringBuilder(str.length() + o2.C(String.valueOf(str3).length() + 73, 91, str2) + 1);
        a.B(sb2, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str2);
        return b.o(sb2, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str, "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final String zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbr zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbs zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zzf() {
        return this.zze;
    }
}
