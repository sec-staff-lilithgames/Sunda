package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgwp {
    public static byte[] zza(zzgwj zzgwjVar) throws GeneralSecurityException {
        return ((zzhfx) zzhfb.zza().zzk(zzgwjVar, zzhfx.class)).zzc().zzaN();
    }

    public static zzgwj zzb(byte[] bArr) throws GeneralSecurityException {
        try {
            zzhla zzhlaVarZzd = zzhla.zzd(bArr, zzhvy.zza());
            zzhfb zzhfbVarZza = zzhfb.zza();
            zzhfx zzhfxVarZzb = zzhfx.zzb(zzhlaVarZzd);
            return !zzhfbVarZza.zzi(zzhfxVarZzb) ? new zzhej(zzhfxVarZzb) : zzhfbVarZza.zzj(zzhfxVarZzb);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }
}
