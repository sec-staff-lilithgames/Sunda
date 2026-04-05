package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhqi implements zzgwl {
    private static final byte[] zza = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    private zzhqi(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!zzhcy.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        KeyFactory.getInstance("Ed25519", provider).generatePrivate(new PKCS8EncodedKeySpec(zzhrm.zza(zza, bArr)));
    }

    public static zzgwl zzb(zzhnm zzhnmVar) throws GeneralSecurityException {
        Provider providerZza = zzhdc.zza();
        if (providerZza != null) {
            return new zzhqi(zzhnmVar.zzf().zzc(zzgvr.zza()), zzhnmVar.zze().zze().zzc(), zzhnmVar.zzd().zzc().equals(zzhnk.zzc) ? new byte[]{0} : new byte[0], providerZza);
        }
        throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
