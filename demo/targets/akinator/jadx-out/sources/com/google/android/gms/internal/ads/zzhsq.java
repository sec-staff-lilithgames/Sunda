package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhsq implements zzgwm {
    private final RSAPublicKey zza;
    private final zzhsi zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    public /* synthetic */ zzhsq(RSAPublicKey rSAPublicKey, zzhsi zzhsiVar, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhcz.zza()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        zzhsx.zzb(zzhsiVar);
        zzhsx.zzc(rSAPublicKey.getModulus().bitLength());
        zzhsx.zzd(rSAPublicKey.getPublicExponent());
        this.zza = rSAPublicKey;
        this.zzb = zzhsiVar;
        this.zzc = bArr;
        this.zzd = bArr2;
    }

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza;
        int i10;
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrZzb = zzhdb.zzb(bigInteger.modPow(publicExponent, modulus), iBitLength);
        zzhsi zzhsiVar = this.zzb;
        zzhsx.zzb(zzhsiVar);
        MessageDigest messageDigest = (MessageDigest) zzhrz.zzd.zzb(zzhsw.zzb(zzhsiVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzd;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = zzhsiVar.ordinal();
        int i11 = 2;
        if (iOrdinal == 2) {
            bArrZza = zzhsj.zza("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrZza = zzhsj.zza("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(zzhsiVar.toString()));
            }
            bArrZza = zzhsj.zza("3051300d060960864801650304020305000440");
        }
        if (iBitLength < bArrZza.length + bArrDigest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i12 = 0;
        while (true) {
            i10 = i11 + 1;
            if (i12 >= (iBitLength - r5) - 3) {
                break;
            }
            bArr4[i11] = -1;
            i12++;
            i11 = i10;
        }
        bArr4[i11] = 0;
        int length = bArrZza.length;
        System.arraycopy(bArrZza, 0, bArr4, i10, length);
        System.arraycopy(bArrDigest, 0, bArr4, i10 + length, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrZzb, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!zzhgi.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
