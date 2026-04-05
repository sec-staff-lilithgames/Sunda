package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdpz extends zzbiy {
    private final String zza;
    private final zzdll zzb;
    private final zzdlq zzc;

    public zzdpz(String str, zzdll zzdllVar, zzdlq zzdlqVar) {
        this.zza = str;
        this.zzb = zzdllVar;
        this.zzc = zzdlqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final IObjectWrapper zzb() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final String zzc() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final List zzd() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final String zze() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final zzbii zzf() throws RemoteException {
        return this.zzc.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final String zzg() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final String zzh() throws RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final Bundle zzi() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zzj() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final com.google.android.gms.ads.internal.client.zzed zzk() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zzl(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final boolean zzm(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zzn(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final zzbib zzo() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final IObjectWrapper zzp() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final String zzq() throws RemoteException {
        return this.zza;
    }
}
