package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzby implements Runnable {
    final /* synthetic */ zzca zza;
    final /* synthetic */ zzel zzb;

    public zzby(zzca zzcaVar, zzel zzelVar) {
        this.zzb = zzelVar;
        this.zza = zzcaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zza.zzg()) {
            return;
        }
        this.zza.zza.zzE("Connected to service after a timeout");
        zzca zzcaVar = this.zza;
        zzcb.zzi(zzcaVar.zza, this.zzb);
    }
}
