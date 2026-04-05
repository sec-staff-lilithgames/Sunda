package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzblb implements zzguf {
    final /* synthetic */ zzcgy zza;

    public zzblb(zzcgy zzcgyVar) {
        this.zza = zzcgyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcgy zzcgyVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbt(zzcgyVar.getContext(), zzcgyVar.zzs().afmaVersion, str, null, zzcgyVar.zzC() != null ? zzcgyVar.zzC().zzax : null).zzb();
    }
}
