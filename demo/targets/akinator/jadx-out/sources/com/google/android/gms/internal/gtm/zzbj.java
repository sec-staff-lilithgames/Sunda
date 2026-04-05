package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbj implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ Runnable zzb;
    final /* synthetic */ zzbp zzc;

    public zzbj(zzbp zzbpVar, String str, Runnable runnable) {
        this.zza = str;
        this.zzb = runnable;
        this.zzc = zzbpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzn(this.zza);
        this.zzb.run();
    }
}
