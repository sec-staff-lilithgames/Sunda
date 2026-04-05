package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfhd {
    public zzfhd() {
        try {
            zzgwr.zza();
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() throws GeneralSecurityException {
        byte[] byteArray;
        try {
            zzgwe zzgweVarZzf = zzgwe.zzf(zzgvw.zzb(zzhex.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgvp.zzb(zzgweVarZzf, zzgvo.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdvc zzdvcVar) {
        zzgwe zzgweVarZzc;
        if (str != null && (zzgweVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzgvm) zzgweVarZzc.zzg(zzhda.zza(), zzgvm.class)).zza(bArr, bArr2);
                zzdvcVar.zzc().put(ApsMetricsDataMap.APSMETRICS_FIELD_SCREENSIZE, "1");
                return new String(bArrZza, C.UTF8_NAME);
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e10) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e10.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.decrypt");
                zzdvcVar.zzc().put("dsf", e10.toString());
            }
        }
        return null;
    }

    private static final zzgwe zzc(String str) throws GeneralSecurityException {
        try {
            try {
                return zzgvp.zza(zzgvn.zza(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e10) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e10.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CryptoUtils.getHandle");
            return null;
        }
    }
}
