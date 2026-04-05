package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzeka extends zzbtb {
    final /* synthetic */ zzekb zza;
    private final zzehn zzb;

    public /* synthetic */ zzeka(zzekb zzekbVar, zzehn zzehnVar, byte[] bArr) {
        Objects.requireNonNull(zzekbVar);
        this.zza = zzekbVar;
        this.zzb = zzehnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zze(zzbry zzbryVar) throws RemoteException {
        this.zza.zzc(zzbryVar);
        ((zzeiz) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzf(String str) throws RemoteException {
        ((zzeiz) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeiz) this.zzb.zzc).zzx(zzeVar);
    }
}
