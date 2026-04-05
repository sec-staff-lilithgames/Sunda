package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzclo implements zzdwz {
    private final zzckz zza;
    private Context zzb;
    private zzbmx zzc;

    public /* synthetic */ zzclo(zzckz zzckzVar, byte[] bArr) {
        this.zza = zzckzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwz
    public final zzdxa zza() {
        zzifp.zzc(this.zzb, Context.class);
        zzifp.zzc(this.zzc, zzbmx.class);
        return new zzclp(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdwz
    public final /* bridge */ /* synthetic */ zzdwz zzb(zzbmx zzbmxVar) {
        zzbmxVar.getClass();
        this.zzc = zzbmxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdwz
    public final /* bridge */ /* synthetic */ zzdwz zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
