package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbcq;
import com.google.android.gms.internal.ads.zzbfp;
import com.google.android.gms.internal.ads.zzbvr;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbyb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbv extends zzbal implements zzbx {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzde = zzde(46, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzB() throws RemoteException {
        Parcel parcelZzde = zzde(23, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzC(zzbyb zzbybVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzD(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzE(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzed zzF() throws RemoteException {
        zzed zzebVar;
        Parcel parcelZzde = zzde(26, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzebVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzebVar = iInterfaceQueryLocalInterface instanceof zzed ? (zzed) iInterfaceQueryLocalInterface : new zzeb(strongBinder);
        }
        parcelZzde.recycle();
        return zzebVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzG(zzga zzgaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzgaVar);
        zzdf(29, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzH(zzeh zzehVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzI(zzx zzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzJ(zzbcq zzbcqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbcqVar);
        zzdf(40, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzK(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzban.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdf(34, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzP(zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzdtVar);
        zzdf(42, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzQ(zzm zzmVar, zzbn zzbnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzmVar);
        zzban.zze(parcelZza, zzbnVar);
        zzdf(43, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzR(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(44, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzS(zzcv zzcvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzcvVar);
        zzdf(45, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzT(long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzdf(48, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final long zzU() throws RemoteException {
        Parcel parcelZzde = zzde(47, zza());
        long j10 = parcelZzde.readLong();
        parcelZzde.recycle();
        return j10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzY(zzcs zzcsVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final IObjectWrapper zzb() throws RemoteException {
        return a.j(zzde(1, zza()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzc() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zzd() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzdW(zzbk zzbkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbkVar);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final boolean zze(zzm zzmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzmVar);
        Parcel parcelZzde = zzde(4, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzf() throws RemoteException {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzg() throws RemoteException {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzi(zzco zzcoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzcoVar);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzj(zzcb zzcbVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final Bundle zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzl() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzm() throws RemoteException {
        zzdf(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzr zzn() throws RemoteException {
        Parcel parcelZzde = zzde(12, zza());
        zzr zzrVar = (zzr) zzban.zzb(parcelZzde, zzr.CREATOR);
        parcelZzde.recycle();
        return zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzo(zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzrVar);
        zzdf(13, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzp(zzbvr zzbvrVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzq(zzbvu zzbvuVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzea zzt() throws RemoteException {
        zzea zzdyVar;
        Parcel parcelZzde = zzde(41, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzdyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdyVar = iInterfaceQueryLocalInterface instanceof zzea ? (zzea) iInterfaceQueryLocalInterface : new zzdy(strongBinder);
        }
        parcelZzde.recycle();
        return zzdyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final String zzu() throws RemoteException {
        Parcel parcelZzde = zzde(31, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzco zzv() throws RemoteException {
        zzco zzcmVar;
        Parcel parcelZzde = zzde(32, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(strongBinder);
        }
        parcelZzde.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final zzbk zzw() throws RemoteException {
        zzbk zzbiVar;
        Parcel parcelZzde = zzde(33, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbiVar = iInterfaceQueryLocalInterface instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface : new zzbi(strongBinder);
        }
        parcelZzde.recycle();
        return zzbiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzx(zzbfp zzbfpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzy(zzbh zzbhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbhVar);
        zzdf(20, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbx
    public final void zzz(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzban.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdf(22, parcelZza);
    }
}
