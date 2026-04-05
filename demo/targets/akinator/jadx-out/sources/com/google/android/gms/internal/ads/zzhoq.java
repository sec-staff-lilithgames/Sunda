package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhoq {
    private static final BigInteger zze;
    private static final BigInteger zzf;
    private Integer zza = null;
    private BigInteger zzb = zzhot.zza;
    private zzhor zzc = null;
    private zzhos zzd = zzhos.zzd;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        zze = bigIntegerValueOf;
        zzf = bigIntegerValueOf.pow(NotificationCompat.FLAG_LOCAL_ONLY);
    }

    private zzhoq() {
    }

    public final zzhoq zza(int i10) {
        this.zza = Integer.valueOf(i10);
        return this;
    }

    public final zzhoq zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhoq zzc(zzhos zzhosVar) {
        this.zzd = zzhosVar;
        return this;
    }

    public final zzhoq zzd(zzhor zzhorVar) {
        this.zzc = zzhorVar;
        return this;
    }

    public final zzhot zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.zza));
        }
        BigInteger bigInteger = this.zzb;
        int iCompareTo = bigInteger.compareTo(zzhot.zza);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(zze).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(zzf) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhot(this.zza.intValue(), this.zzb, this.zzd, this.zzc, null);
    }

    public /* synthetic */ zzhoq(byte[] bArr) {
    }
}
