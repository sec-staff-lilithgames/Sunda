package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbk implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbp zzb;

    public zzbk(zzbp zzbpVar, int i10) {
        this.zza = i10;
        this.zzb = zzbpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzY(this.zza * 1000);
    }
}
