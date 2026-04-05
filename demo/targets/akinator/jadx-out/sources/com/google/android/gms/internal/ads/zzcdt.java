package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcdt implements Runnable {
    private final zzcdf zza;
    private boolean zzb = false;

    public zzcdt(zzcdf zzcdfVar) {
        this.zza = zzcdfVar;
    }

    private final void zzc() {
        zzfuz zzfuzVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfuzVar.removeCallbacks(this);
        zzfuzVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzF();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzF();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
