package com.google.android.gms.internal.ads;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzftw extends zzfuc {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzftw(String str, boolean z10, int i10, zzftt zzfttVar, zzftu zzftuVar, int i11, byte[] bArr) {
        this.zzb = str;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfuc) {
            zzfuc zzfucVar = (zzfuc) obj;
            if (this.zzb.equals(zzfucVar.zza())) {
                zzfucVar.zzb();
                int i10 = this.zzc;
                int iZze = zzfucVar.zze();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iZze) {
                    zzfucVar.zzc();
                    zzfucVar.zzd();
                    int i11 = this.zzd;
                    int iZzf = zzfucVar.zzf();
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
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i10 = this.zzc;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.zzd != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.zzc;
        String str = AbstractJsonLexerKt.NULL;
        String str2 = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? AbstractJsonLexerKt.NULL : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.zzd == 1) {
            str = "READ_AND_WRITE";
        }
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str.length() + o2.C(String.valueOf(str3).length() + 73, 91, str2) + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, "FileComplianceOptions{fileOwner=", str3, ", hasDifferentDmaOwner=false, fileChecks=", str2);
        return a.b.o(sb2, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=", str, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final zzftt zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final zzftu zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final int zzf() {
        return this.zzd;
    }
}
