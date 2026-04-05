package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbpz implements zzcce {
    final /* synthetic */ zzbqa zza;

    public zzbpz(zzbqa zzbqaVar) {
        Objects.requireNonNull(zzbqaVar);
        this.zza = zzbqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbow zzbowVar = (zzbow) obj;
        zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbpy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbow zzbowVar2 = zzbowVar;
                zzbowVar2.zzn("/result", zzblw.zzo);
                zzbowVar2.zzj();
            }
        });
    }
}
