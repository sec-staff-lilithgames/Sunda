package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhns extends zzhpr {
    private final zzhnl zza;
    private final zzhsz zzb;
    private final zzhsz zzc;
    private final Integer zzd;

    private zzhns(zzhnl zzhnlVar, zzhsz zzhszVar, zzhsz zzhszVar2, Integer num) {
        this.zza = zzhnlVar;
        this.zzb = zzhszVar;
        this.zzc = zzhszVar2;
        this.zzd = num;
    }

    public static zzhns zzc(zzhnk zzhnkVar, zzhsz zzhszVar, Integer num) throws GeneralSecurityException {
        zzhsz zzhszVarZza;
        zzhnl zzhnlVarZzb = zzhnl.zzb(zzhnkVar);
        zzhnk zzhnkVar2 = zzhnk.zzd;
        if (!zzhnkVar.equals(zzhnkVar2) && num == null) {
            String string = zzhnkVar.toString();
            throw new GeneralSecurityException(a.b.o(new StringBuilder(string.length() + 62), "For given Variant ", string, " the value of idRequirement must be non-null"));
        }
        if (zzhnkVar.equals(zzhnkVar2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzhszVar.zzd() != 32) {
            int iZzd = zzhszVar.zzd();
            throw new GeneralSecurityException(o2.l(iZzd, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(iZzd).length() + 65)));
        }
        if (zzhnlVarZzb.zzc() == zzhnkVar2) {
            zzhszVarZza = zzhfc.zza;
        } else if (zzhnlVarZzb.zzc() == zzhnk.zzb || zzhnlVarZzb.zzc() == zzhnk.zzc) {
            zzhszVarZza = zzhfc.zza(num.intValue());
        } else {
            if (zzhnlVarZzb.zzc() != zzhnk.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzhnlVarZzb.zzc().toString()));
            }
            zzhszVarZza = zzhfc.zzb(num.intValue());
        }
        return new zzhns(zzhnlVarZzb, zzhszVar, zzhszVarZza, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhpr, com.google.android.gms.internal.ads.zzgvt
    public final /* synthetic */ zzgwj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final Integer zzb() {
        return this.zzd;
    }

    public final zzhsz zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhpr
    public final zzhsz zze() {
        return this.zzc;
    }

    public final zzhnl zzf() {
        return this.zza;
    }
}
