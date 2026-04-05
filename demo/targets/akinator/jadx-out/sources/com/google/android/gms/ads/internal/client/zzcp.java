package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbir;
import com.google.android.gms.internal.ads.zzbis;
import com.google.android.gms.internal.ads.zzbmx;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbrj;
import com.google.android.gms.internal.ads.zzbva;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzcar;
import com.google.android.gms.internal.ads.zzcas;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcp extends zzbal implements zzcr {
    public zzcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzb(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbrj zzbrjVar, int i10) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zzc(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzban.zze(parcelZza, zzbrjVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(1, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(strongBinder);
        }
        parcelZzde.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzc(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbrj zzbrjVar, int i10) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zzc(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzban.zze(parcelZza, zzbrjVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(2, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(strongBinder);
        }
        parcelZzde.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbt zzd(IObjectWrapper iObjectWrapper, String str, zzbrj zzbrjVar, int i10) throws RemoteException {
        zzbt zzbrVar;
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzban.zze(parcelZza, zzbrjVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(3, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbrVar = iInterfaceQueryLocalInterface instanceof zzbt ? (zzbt) iInterfaceQueryLocalInterface : new zzbr(strongBinder);
        }
        parcelZzde.recycle();
        return zzbrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbim zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, iObjectWrapper2);
        Parcel parcelZzde = zzde(5, parcelZza);
        zzbim zzbimVarZzdK = zzbil.zzdK(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbimVarZzdK;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbxy zzf(IObjectWrapper iObjectWrapper, zzbrj zzbrjVar, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbvi zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzde = zzde(8, parcelZza);
        zzbvi zzbviVarZzI = zzbvh.zzI(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbviVarZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzck zzh(IObjectWrapper iObjectWrapper, zzbrj zzbrjVar, int i10) throws RemoteException {
        zzck zzciVar;
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbrjVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(18, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzciVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzciVar = iInterfaceQueryLocalInterface instanceof zzck ? (zzck) iInterfaceQueryLocalInterface : new zzci(strongBinder);
        }
        parcelZzde.recycle();
        return zzciVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdb zzi(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzdb zzczVar;
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(9, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzczVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzczVar = iInterfaceQueryLocalInterface instanceof zzdb ? (zzdb) iInterfaceQueryLocalInterface : new zzcz(strongBinder);
        }
        parcelZzde.recycle();
        return zzczVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzj(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, int i10) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zzc(parcelZza, zzrVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(10, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(strongBinder);
        }
        parcelZzde.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbis zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, iObjectWrapper2);
        zzban.zze(parcelZza, iObjectWrapper3);
        Parcel parcelZzde = zzde(11, parcelZza);
        zzbis zzbisVarZze = zzbir.zze(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbisVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbyo zzl(IObjectWrapper iObjectWrapper, String str, zzbrj zzbrjVar, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzban.zze(parcelZza, zzbrjVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(12, parcelZza);
        zzbyo zzbyoVarZzt = zzbyn.zzt(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbyoVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbx zzm(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbrj zzbrjVar, int i10) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zzc(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzban.zze(parcelZza, zzbrjVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(13, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbvVar = iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(strongBinder);
        }
        parcelZzde.recycle();
        return zzbvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzcas zzn(IObjectWrapper iObjectWrapper, zzbrj zzbrjVar, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbrjVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(14, parcelZza);
        zzcas zzcasVarZzb = zzcar.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzcasVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbvb zzo(IObjectWrapper iObjectWrapper, zzbrj zzbrjVar, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbrjVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(15, parcelZza);
        zzbvb zzbvbVarZzb = zzbva.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbvbVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzbna zzp(IObjectWrapper iObjectWrapper, zzbrj zzbrjVar, int i10, zzbmx zzbmxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbrjVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzban.zze(parcelZza, zzbmxVar);
        Parcel parcelZzde = zzde(16, parcelZza);
        zzbna zzbnaVarZzb = zzbmz.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbnaVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcr
    public final zzdw zzq(IObjectWrapper iObjectWrapper, zzbrj zzbrjVar, int i10) throws RemoteException {
        zzdw zzduVar;
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbrjVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelZzde = zzde(17, parcelZza);
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzduVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzduVar = iInterfaceQueryLocalInterface instanceof zzdw ? (zzdw) iInterfaceQueryLocalInterface : new zzdu(strongBinder);
        }
        parcelZzde.recycle();
        return zzduVar;
    }
}
