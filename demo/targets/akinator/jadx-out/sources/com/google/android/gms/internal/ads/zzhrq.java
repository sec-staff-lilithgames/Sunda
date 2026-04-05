package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhrq implements zzgwm {
    private final zzhsz zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhrq(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!zzhcy.zza(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.zza = zzhsz.zza(bArr);
        this.zzb = bArr2;
        this.zzc = bArr3;
        zzhdj.zzd();
    }

    public static zzgwm zzb(zzhns zzhnsVar) throws GeneralSecurityException {
        if (!zzhcy.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhqj.zzb(zzhnsVar);
        } catch (GeneralSecurityException unused) {
            return new zzhrq(zzhnsVar.zzd().zzc(), zzhnsVar.zze().zzc(), zzhnsVar.zzf().zzc().equals(zzhnk.zzc) ? new byte[]{0} : new byte[0]);
        }
    }

    private final void zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        if (!zzhdj.zzc(bArr2, bArr, this.zza.zzc())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhgi.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.zzc;
            if (bArr4.length != 0) {
                bArr2 = zzhrm.zza(bArr2, bArr4);
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
