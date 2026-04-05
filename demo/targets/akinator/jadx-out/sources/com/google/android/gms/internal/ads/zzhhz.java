package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhhz implements zzhgs {
    private zzhhz(zzhgk zzhgkVar, Provider provider) throws GeneralSecurityException {
        if (!zzhcy.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzhgkVar.zze().zzc();
            zzhgkVar.zzf();
            new SecretKeySpec(zzhgkVar.zzd().zzc(zzgvr.zza()), "AES");
        } catch (NoSuchAlgorithmException e10) {
            throw new GeneralSecurityException("AES-CMAC not available.", e10);
        }
    }

    public static zzhgs zza(zzhgk zzhgkVar, Provider provider) throws GeneralSecurityException {
        return new zzhhz(zzhgkVar, provider);
    }
}
