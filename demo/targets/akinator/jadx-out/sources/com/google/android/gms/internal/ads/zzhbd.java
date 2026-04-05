package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhbd {
    private static final ThreadLocal zza = new zzhbc();

    public static Cipher zza() {
        return (Cipher) zza.get();
    }

    public static SecretKey zzb(byte[] bArr) throws GeneralSecurityException {
        zzhsx.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec zzc(byte[] bArr, int i10, int i11) {
        zzhgi.zzd();
        return new GCMParameterSpec(128, bArr, i10, 12);
    }
}
