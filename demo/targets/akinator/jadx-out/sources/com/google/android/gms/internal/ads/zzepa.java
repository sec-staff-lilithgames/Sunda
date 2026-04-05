package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzepa implements zzepi {
    final /* synthetic */ zzepb zza;

    public zzepa(zzepb zzepbVar) {
        Objects.requireNonNull(zzepbVar);
        this.zza = zzepbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final void zza() {
        zzepb zzepbVar = this.zza;
        synchronized (zzepbVar) {
            zzepbVar.zzM(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzepi
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzepb zzepbVar = this.zza;
        zzdhw zzdhwVar = (zzdhw) obj;
        synchronized (zzepbVar) {
            zzepbVar.zzM(zzdhwVar);
            zzepbVar.zzL().zzj();
        }
    }
}
