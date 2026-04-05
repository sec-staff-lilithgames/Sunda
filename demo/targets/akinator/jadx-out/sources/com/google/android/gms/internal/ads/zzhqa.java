package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhqa implements zzgwm {
    static final zzhdp zza;
    static final zzhdp zzb;
    static final zzhdp zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zzhrs zzi;
    private final byte[] zzj;
    private final byte[] zzk;
    private final Provider zzl;

    static {
        zzhdo zzhdoVarZza = zzhdp.zza();
        zzhdoVarZza.zza(zzhsi.SHA256, zzhmy.zza);
        zzhdoVarZza.zza(zzhsi.SHA384, zzhmy.zzb);
        zzhdoVarZza.zza(zzhsi.SHA512, zzhmy.zzc);
        zza = zzhdoVarZza.zzb();
        zzhdo zzhdoVarZza2 = zzhdp.zza();
        zzhdoVarZza2.zza(zzhrs.IEEE_P1363, zzhmz.zza);
        zzhdoVarZza2.zza(zzhrs.DER, zzhmz.zzb);
        zzb = zzhdoVarZza2.zzb();
        zzhdo zzhdoVarZza3 = zzhdp.zza();
        zzhdoVarZza3.zza(zzhrr.NIST_P256, zzhmx.zza);
        zzhdoVarZza3.zza(zzhrr.NIST_P384, zzhmx.zzb);
        zzhdoVarZza3.zza(zzhrr.NIST_P521, zzhmx.zzc);
        zzc = zzhdoVarZza3.zzb();
    }

    private zzhqa(ECPublicKey eCPublicKey, zzhsi zzhsiVar, zzhrs zzhrsVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhcy.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.zzh = zzhsw.zza(zzhsiVar);
        this.zzg = eCPublicKey;
        this.zzi = zzhrsVar;
        this.zzj = bArr;
        this.zzk = bArr2;
        this.zzl = provider;
    }

    public static zzgwm zzb(zzhnf zzhnfVar, Provider provider) throws GeneralSecurityException {
        return new zzhqa((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zzhrz.zzf.zzb("EC")).generatePublic(new ECPublicKeySpec(zzhnfVar.zzd(), zzhrt.zzb((zzhrr) zzc.zzb(zzhnfVar.zzf().zzd())))), (zzhsi) zza.zzb(zzhnfVar.zzf().zze()), (zzhrs) zzb.zzb(zzhnfVar.zzf().zzc()), zzhnfVar.zze().zzc(), zzhnfVar.zzf().zzf().equals(zzhna.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzc(byte[] r12, byte[] r13) throws java.security.GeneralSecurityException {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhqa.zzc(byte[], byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhgi.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
