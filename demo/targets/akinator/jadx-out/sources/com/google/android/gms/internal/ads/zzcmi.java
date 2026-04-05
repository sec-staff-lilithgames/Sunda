package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcmi implements zzifh {
    private final zzcmh zza;

    private zzcmi(zzcmh zzcmhVar) {
        this.zza = zzcmhVar;
    }

    public static zzcmi zzc(zzcmh zzcmhVar) {
        return new zzcmi(zzcmhVar);
    }

    public static com.google.android.gms.ads.internal.zza zzd(zzcmh zzcmhVar) {
        return new com.google.android.gms.ads.internal.zza(new zzceo(), new zzcdj());
    }

    public final com.google.android.gms.ads.internal.zza zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
