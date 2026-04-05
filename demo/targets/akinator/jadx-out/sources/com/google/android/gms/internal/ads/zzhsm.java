package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhsm implements zzhik {
    public static zzhik zzb(zzhii zzhiiVar) throws GeneralSecurityException {
        zzhik zzhikVarZzb = zzhio.zzb(zzhiiVar);
        try {
            return new zzhsl(zzhikVarZzb, zzhip.zzb(zzhiiVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhikVarZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhik
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        throw null;
    }
}
