package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcpv implements zzblx {
    final /* synthetic */ zzcpw zza;

    public zzcpv(zzcpw zzcpwVar) {
        Objects.requireNonNull(zzcpwVar);
        this.zza = zzcpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(Object obj, Map map) {
        zzcpw zzcpwVar = this.zza;
        if (zzcpwVar.zze(map)) {
            zzcpwVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzg().zzm();
                }
            });
        }
    }
}
