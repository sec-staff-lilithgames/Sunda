package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbqr implements zzccc {
    final /* synthetic */ zzcca zza;
    final /* synthetic */ zzbpv zzb;

    public zzbqr(zzbqt zzbqtVar, zzcca zzccaVar, zzbpv zzbpvVar) {
        this.zza = zzccaVar;
        this.zzb = zzbpvVar;
        Objects.requireNonNull(zzbqtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccc
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise rejected");
        this.zza.zzd(new zzbqe("Unable to obtain a JavascriptEngine."));
        this.zzb.zza();
    }
}
