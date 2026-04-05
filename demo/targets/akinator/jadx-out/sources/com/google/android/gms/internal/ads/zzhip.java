package com.google.android.gms.internal.ads;

import com.apm.insight.b.El.rJqlArycrfkilN;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhip implements zzhik {
    private final Key zza;
    private final Provider zzb;

    public static zzhik zzb(zzhii zzhiiVar) throws GeneralSecurityException {
        Provider providerZza = zzhdc.zza();
        if (providerZza == null) {
            throw new GeneralSecurityException("Conscrypt not available");
        }
        Mac.getInstance("AESCMAC", providerZza);
        return new zzhip(zzhiiVar.zzd().zzc(zzgvr.zza()), providerZza);
    }

    @Override // com.google.android.gms.internal.ads.zzhik
    public final byte[] zza(byte[] bArr, int i10) throws IllegalStateException, GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Provider provider = this.zzb;
        Key key = this.zza;
        Mac mac = Mac.getInstance("AESCMAC", provider);
        mac.init(key);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i10 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i10);
    }

    private zzhip(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (zzhcy.zza(1)) {
            this.zza = new SecretKeySpec(bArr, "AES");
            this.zzb = provider;
            return;
        }
        throw new GeneralSecurityException(rJqlArycrfkilN.eMoxx);
    }
}
