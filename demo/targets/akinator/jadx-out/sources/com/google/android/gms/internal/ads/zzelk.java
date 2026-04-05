package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzelk extends zzbte {
    private final zzehn zza;

    public /* synthetic */ zzelk(zzell zzellVar, zzehn zzehnVar, byte[] bArr) {
        Objects.requireNonNull(zzellVar);
        this.zza = zzehnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zze() throws RemoteException {
        ((zzeiz) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzf(String str) throws RemoteException {
        ((zzeiz) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeiz) this.zza.zzc).zzx(zzeVar);
    }
}
