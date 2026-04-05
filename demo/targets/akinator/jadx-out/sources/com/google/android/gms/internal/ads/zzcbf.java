package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcbf extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcbj zza;

    public zzcbf(zzcbj zzcbjVar) {
        Objects.requireNonNull(zzcbjVar);
        this.zza = zzcbjVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzcbj zzcbjVar = this.zza;
        zzbex zzbexVar = new zzbex(zzcbjVar.zzy(), zzcbjVar.zzz().afmaVersion);
        synchronized (zzcbjVar.zzx()) {
            try {
                com.google.android.gms.ads.internal.zzt.zzm();
                zzbfa.zza(zzcbjVar.zzA(), zzbexVar);
            } catch (IllegalArgumentException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot config CSI reporter.", e10);
            }
        }
    }
}
