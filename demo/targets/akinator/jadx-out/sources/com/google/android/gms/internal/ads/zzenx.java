package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzenx implements zzepi {
    final /* synthetic */ zzeny zza;

    public zzenx(zzeny zzenyVar) {
        Objects.requireNonNull(zzenyVar);
        this.zza = zzenyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final void zza() {
        zzeny zzenyVar = this.zza;
        synchronized (zzenyVar) {
            zzenyVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeny zzenyVar = this.zza;
        zzcrg zzcrgVar = (zzcrg) obj;
        synchronized (zzenyVar) {
            try {
                if (zzenyVar.zzM() != null) {
                    if (zzcrgVar.zzo() != null && zzenyVar.zzM().zzo() != null) {
                        zzcrgVar.zzo().zzb(zzenyVar.zzM().zzo().zza());
                    }
                    zzenyVar.zzM().zzd();
                }
                zzenyVar.zzN(zzcrgVar);
                zzenyVar.zzM().zzj();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
