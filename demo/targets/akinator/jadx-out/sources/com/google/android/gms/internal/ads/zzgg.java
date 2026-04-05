package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgg implements zzga {
    private final Context zza;
    private final zzga zzb;

    public zzgg(Context context) {
        zzgi zzgiVar = new zzgi();
        this.zza = context.getApplicationContext();
        this.zzb = zzgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final /* bridge */ /* synthetic */ zzgb zza() {
        return new zzgh(this.zza, this.zzb.zza());
    }
}
