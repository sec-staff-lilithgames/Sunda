package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhrp implements zzgwl {
    private final byte[] zza;

    private zzhrp(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!zzhcy.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        byte[] bArrZzb = zzhdj.zzb(bArr);
        this.zza = bArrZzb;
        zzhdj.zza(bArrZzb);
    }

    public static zzgwl zzb(zzhnm zzhnmVar) throws GeneralSecurityException {
        if (!zzhcy.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhqi.zzb(zzhnmVar);
        } catch (GeneralSecurityException unused) {
            return new zzhrp(zzhnmVar.zzf().zzc(zzgvr.zza()), zzhnmVar.zze().zze().zzc(), zzhnmVar.zzd().zzc().equals(zzhnk.zzc) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
