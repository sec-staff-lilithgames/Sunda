package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhcu implements zzgvm {
    private static final ThreadLocal zza = new zzhcs();

    public static zzgvm zzb(zzgyi zzgyiVar) throws GeneralSecurityException {
        return zzhbk.zzc(zzgyiVar, zzhct.zza);
    }

    public static /* synthetic */ Cipher zzc() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) zza.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
