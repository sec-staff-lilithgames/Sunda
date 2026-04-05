package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhnc {
    private zzhnf zza = null;
    private zzhta zzb = null;

    private zzhnc() {
    }

    public final zzhnc zza(zzhnf zzhnfVar) {
        this.zza = zzhnfVar;
        return this;
    }

    public final zzhnc zzb(zzhta zzhtaVar) {
        this.zzb = zzhtaVar;
        return this;
    }

    public final zzhnd zzc() throws GeneralSecurityException {
        zzhnf zzhnfVar = this.zza;
        if (zzhnfVar == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        zzhta zzhtaVar = this.zzb;
        if (zzhtaVar == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigIntegerZzb = zzhtaVar.zzb(zzgvr.zza());
        ECPoint eCPointZzd = zzhnfVar.zzd();
        zzhmx zzhmxVarZzd = zzhnfVar.zzf().zzd();
        BigInteger order = zzhmxVarZzd.zza().getOrder();
        if (bigIntegerZzb.signum() <= 0 || bigIntegerZzb.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzhdn.zzd(bigIntegerZzb, zzhmxVarZzd.zza()).equals(eCPointZzd)) {
            return new zzhnd(this.zza, this.zzb, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public /* synthetic */ zzhnc(byte[] bArr) {
    }
}
