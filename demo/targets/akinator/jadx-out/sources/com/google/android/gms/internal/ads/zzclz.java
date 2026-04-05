package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzclz implements zzffn {
    private final zzckz zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzclz(zzckz zzckzVar, byte[] bArr) {
        this.zza = zzckzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final zzffo zza() {
        zzifp.zzc(this.zzb, Context.class);
        return new zzcma(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* synthetic */ zzffn zzb(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffn
    public final /* bridge */ /* synthetic */ zzffn zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
