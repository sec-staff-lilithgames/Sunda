package com.google.android.gms.internal.gtm;

import b3.h;
import j1.o2;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfl extends zzfr {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzfl(String str, boolean z10, int i10, zzfh zzfhVar, zzfi zzfiVar, int i11, zzfk zzfkVar) {
        this.zzb = str;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfr) {
            zzfr zzfrVar = (zzfr) obj;
            if (this.zzb.equals(zzfrVar.zzc())) {
                zzfrVar.zzd();
                int i10 = this.zzc;
                int iZze = zzfrVar.zze();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iZze) {
                    zzfrVar.zza();
                    zzfrVar.zzb();
                    int i11 = this.zzd;
                    int iZzf = zzfrVar.zzf();
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
        return o2.o(h.b("FileComplianceOptions{fileOwner=", this.zzb, ", hasDifferentDmaOwner=false, fileChecks=", str2, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose="), str, "}");
    }

    @Override // com.google.android.gms.internal.gtm.zzfr
    public final zzfh zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.gtm.zzfr
    public final zzfi zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.gtm.zzfr
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzfr
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzfr
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzfr
    public final int zzf() {
        return this.zzd;
    }
}
