package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhsp implements zzgwi {
    private static final byte[] zza = {0};
    private final zzhik zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzhsp(zzhgk zzhgkVar) throws GeneralSecurityException {
        this.zzb = zzhsm.zzb(zzhii.zzc(zzhij.zzb(zzhgkVar.zzf().zzc()), zzhgkVar.zzd()));
        this.zzc = zzhgkVar.zzf().zzd();
        this.zzd = zzhgkVar.zze().zzc();
        if (zzhgkVar.zzf().zzf().equals(zzhgq.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgwi zza(zzhgk zzhgkVar) throws GeneralSecurityException {
        return new zzhsp(zzhgkVar);
    }

    public static zzgwi zzb(zzhgw zzhgwVar) throws GeneralSecurityException {
        return new zzhsp(zzhgwVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzhrm.zza(this.zzd, this.zzb.zza(zzhrm.zza(bArr, bArr2), this.zzc)) : zzhrm.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzhsp(zzhgw zzhgwVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(zzhgwVar.zzf().zzg());
        this.zzb = new zzhso("HMAC".concat(strValueOf), new SecretKeySpec(zzhgwVar.zzd().zzc(zzgvr.zza()), "HMAC"));
        this.zzc = zzhgwVar.zzf().zzd();
        this.zzd = zzhgwVar.zze().zzc();
        if (zzhgwVar.zzf().zzf().equals(zzhhe.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzhsp(zzhik zzhikVar, int i10) throws GeneralSecurityException {
        this.zzb = zzhikVar;
        this.zzc = i10;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzhikVar.zza(new byte[0], i10);
    }
}
