package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzepe {
    private final zzepj zza;
    private final String zzb;
    private com.google.android.gms.ads.internal.client.zzea zzc;

    public zzepe(zzepj zzepjVar, String str) {
        this.zza = zzepjVar;
        this.zzb = str;
    }

    public final synchronized boolean zza() throws RemoteException {
        return this.zza.zzb();
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, int i10) throws RemoteException {
        this.zzc = null;
        zzepk zzepkVar = new zzepk(i10);
        zzepd zzepdVar = new zzepd(this);
        this.zza.zza(zzmVar, this.zzb, zzepkVar, zzepdVar);
    }

    public final synchronized String zzc() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zzc;
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzeaVar != null ? zzeaVar.zze() : null;
    }

    public final synchronized String zzd() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zzc;
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzeaVar != null ? zzeaVar.zze() : null;
    }

    public final /* synthetic */ void zze(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zzc = zzeaVar;
    }
}
