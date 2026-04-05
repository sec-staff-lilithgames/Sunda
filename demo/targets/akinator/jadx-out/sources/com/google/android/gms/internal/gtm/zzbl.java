package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbl implements Runnable {
    final /* synthetic */ zzek zza;
    final /* synthetic */ zzbp zzb;

    public zzbl(zzbp zzbpVar, zzek zzekVar) {
        this.zza = zzekVar;
        this.zzb = zzbpVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.zzb.zza.zzj(this.zza);
    }
}
