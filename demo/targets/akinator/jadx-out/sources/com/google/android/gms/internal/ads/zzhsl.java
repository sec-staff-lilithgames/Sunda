package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhsl implements zzhik {
    final zzhik zza;
    final zzhik zzb;

    public /* synthetic */ zzhsl(zzhik zzhikVar, zzhik zzhikVar2, byte[] bArr) {
        this.zza = zzhikVar;
        this.zzb = zzhikVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhik
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i10) : this.zzb.zza(bArr, i10);
    }
}
