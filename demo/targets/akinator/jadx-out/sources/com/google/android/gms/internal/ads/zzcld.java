package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcld implements zzfax {
    private final zzckz zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcld(zzckz zzckzVar, byte[] bArr) {
        this.zza = zzckzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final zzfay zza() {
        zzifp.zzc(this.zzb, Context.class);
        zzifp.zzc(this.zzc, String.class);
        return new zzcle(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final /* bridge */ /* synthetic */ zzfax zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final /* bridge */ /* synthetic */ zzfax zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
