package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhou {
    private zzhox zza = null;
    private zzhta zzb = null;
    private zzhta zzc = null;
    private zzhta zzd = null;
    private zzhta zze = null;
    private zzhta zzf = null;
    private zzhta zzg = null;

    private zzhou() {
    }

    public final zzhou zza(zzhox zzhoxVar) {
        this.zza = zzhoxVar;
        return this;
    }

    public final zzhou zzb(zzhta zzhtaVar, zzhta zzhtaVar2) {
        this.zzc = zzhtaVar;
        this.zzd = zzhtaVar2;
        return this;
    }

    public final zzhou zzc(zzhta zzhtaVar) {
        this.zzb = zzhtaVar;
        return this;
    }

    public final zzhou zzd(zzhta zzhtaVar, zzhta zzhtaVar2) {
        this.zze = zzhtaVar;
        this.zzf = zzhtaVar2;
        return this;
    }

    public final zzhou zze(zzhta zzhtaVar) {
        this.zzg = zzhtaVar;
        return this;
    }

    public final zzhov zzf() throws GeneralSecurityException {
        zzhox zzhoxVar = this.zza;
        if (zzhoxVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigIntegerZzd = zzhoxVar.zzf().zzd();
        BigInteger bigIntegerZzd2 = this.zza.zzd();
        BigInteger bigIntegerZzb = this.zzc.zzb(zzgvr.zza());
        BigInteger bigIntegerZzb2 = this.zzd.zzb(zzgvr.zza());
        BigInteger bigIntegerZzb3 = this.zzb.zzb(zzgvr.zza());
        BigInteger bigIntegerZzb4 = this.zze.zzb(zzgvr.zza());
        BigInteger bigIntegerZzb5 = this.zzf.zzb(zzgvr.zza());
        BigInteger bigIntegerZzb6 = this.zzg.zzb(zzgvr.zza());
        if (!bigIntegerZzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigIntegerZzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigIntegerZzb.multiply(bigIntegerZzb2).equals(bigIntegerZzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerZzb.subtract(bigInteger);
        BigInteger bigIntegerSubtract2 = bigIntegerZzb2.subtract(bigInteger);
        if (!bigIntegerZzd.multiply(bigIntegerZzb3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb4).mod(bigIntegerSubtract).equals(bigInteger)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb5).mod(bigIntegerSubtract2).equals(bigInteger)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigIntegerZzb2.multiply(bigIntegerZzb6).mod(bigIntegerZzb).equals(bigInteger)) {
            return new zzhov(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ zzhou(byte[] bArr) {
    }
}
