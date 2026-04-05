package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhce implements zzgvm {
    private final zzgvm zza;
    private final byte[] zzb;

    private zzhce(zzgvm zzgvmVar, byte[] bArr) {
        this.zza = zzgvmVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgvm zzb(zzhei zzheiVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzhfw zzhfwVarZzc = zzheiVar.zzc(zzgvr.zza());
        zzgvm zzgvmVar = (zzgvm) zzhdw.zza().zzc(zzhfwVarZzc.zzg(), zzgvm.class).zza(zzhfwVarZzc.zzb());
        zzhlt zzhltVarZzd = zzhfwVarZzc.zzd();
        int iOrdinal = zzhltVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzhfc.zzb(zzheiVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzhfc.zza(zzheiVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzhltVarZzd)));
            }
            bArrZzc = zzhfc.zza(zzheiVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzhfc.zza.zzc();
        }
        return new zzhce(zzgvmVar, bArrZzc);
    }

    public static zzgvm zzc(zzgvm zzgvmVar, zzhsz zzhszVar) {
        return new zzhce(zzgvmVar, zzhszVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzhgi.zze(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
