package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhfx implements zzhgb {
    private final zzhsz zza;
    private final zzhla zzb;

    private zzhfx(zzhla zzhlaVar, zzhsz zzhszVar) {
        this.zzb = zzhlaVar;
        this.zza = zzhszVar;
    }

    public static zzhfx zza(zzhla zzhlaVar) {
        return new zzhfx(zzhlaVar, zzhgi.zza(zzhlaVar.zza()));
    }

    public static zzhfx zzb(zzhla zzhlaVar) throws GeneralSecurityException {
        return new zzhfx(zzhlaVar, zzhgi.zzb(zzhlaVar.zza()));
    }

    public final zzhla zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhgb
    public final zzhsz zzf() {
        return this.zza;
    }
}
