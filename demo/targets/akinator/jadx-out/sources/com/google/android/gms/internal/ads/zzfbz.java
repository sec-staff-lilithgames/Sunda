package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfbz implements zzepi {
    final /* synthetic */ zzfcc zza;

    public zzfbz(zzfcc zzfccVar) {
        Objects.requireNonNull(zzfccVar);
        this.zza = zzfccVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final void zza() {
        zzfcc zzfccVar = this.zza;
        synchronized (zzfccVar) {
            zzfccVar.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcra zzcraVar = (zzcra) obj;
        zzfcc zzfccVar = this.zza;
        synchronized (zzfccVar) {
            try {
                zzcra zzcraVar2 = zzfccVar.zza;
                if (zzcraVar2 != null) {
                    zzcraVar2.zzd();
                }
                zzfccVar.zza = zzcraVar;
                zzcraVar.zza(zzfccVar);
                zzfccVar.zzN().zzs(new zzcrb(zzcraVar, zzfccVar, zzfccVar.zzN(), zzfccVar.zzO()));
                zzcraVar.zzj();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
