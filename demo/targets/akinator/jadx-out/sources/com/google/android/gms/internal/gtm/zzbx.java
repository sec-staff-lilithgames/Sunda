package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbx extends zzcv {
    final /* synthetic */ zzcb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbx(zzcb zzcbVar, zzbu zzbuVar) {
        super(zzbuVar);
        this.zza = zzcbVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzcv
    public final void zza() {
        com.google.android.gms.analytics.zzr.zzh();
        zzcb zzcbVar = this.zza;
        if (zzcbVar.zzg()) {
            zzcbVar.zzN("Inactivity, disconnecting from device AnalyticsService");
            zzcbVar.zzc();
        }
    }
}
