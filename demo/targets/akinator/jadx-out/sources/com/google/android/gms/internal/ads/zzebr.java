package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzebr implements zzguf {
    final /* synthetic */ Context zza;

    public zzebr(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        if (((Boolean) zzbgm.zzh.zze()).booleanValue() && (th2 instanceof com.google.android.gms.ads.internal.util.zzaz)) {
            zzbef.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbgm.zzj.zze()).booleanValue()) {
            zzbef.zze(this.zza);
        }
    }
}
