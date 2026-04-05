package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhia implements zzhgs {
    public zzhia(zzhgk zzhgkVar) {
    }

    public static zzhgs zza(zzhgk zzhgkVar) throws GeneralSecurityException {
        if (!zzhcy.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerZza = zzhdc.zza();
        if (providerZza != null) {
            try {
                return zzhhz.zza(zzhgkVar, providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhia(zzhgkVar);
    }
}
