package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzenw extends com.google.android.gms.ads.internal.client.zzbp {
    private final zzepe zza;

    public zzenw(Context context, zzcjn zzcjnVar, zzfgm zzfgmVar, zzdma zzdmaVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        zzepg zzepgVar = new zzepg(zzdmaVar, zzcjnVar.zzD());
        zzepgVar.zza(zzbkVar);
        this.zza = new zzepe(new zzepq(zzcjnVar, context, zzepgVar, zzfgmVar), zzfgmVar.zzh());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        this.zza.zzb(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zzf() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized boolean zzg() throws RemoteException {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized String zzh() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar, int i10) throws RemoteException {
        this.zza.zzb(zzmVar, i10);
    }
}
