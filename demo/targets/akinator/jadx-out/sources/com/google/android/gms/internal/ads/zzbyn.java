package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbyn extends zzbam implements zzbyo {
    public zzbyn() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbyo zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzbyo ? (zzbyo) iInterfaceQueryLocalInterface : new zzbym(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbyv zzbytVar = null;
        zzbyv zzbytVar2 = null;
        zzbyw zzbywVar = null;
        zzbyr zzbypVar = null;
        switch (i10) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbytVar = iInterfaceQueryLocalInterface instanceof zzbyv ? (zzbyv) iInterfaceQueryLocalInterface : new zzbyt(strongBinder);
                }
                zzban.zzh(parcel);
                zzc(zzmVar, zzbytVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbypVar = iInterfaceQueryLocalInterface2 instanceof zzbyr ? (zzbyr) iInterfaceQueryLocalInterface2 : new zzbyp(strongBinder2);
                }
                zzban.zzh(parcel);
                zze(zzbypVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                int i12 = zzban.zza;
                parcel2.writeInt(zZzi ? 1 : 0);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzb(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbywVar = iInterfaceQueryLocalInterface3 instanceof zzbyw ? (zzbyw) iInterfaceQueryLocalInterface3 : new zzbyw(strongBinder3);
                }
                zzban.zzh(parcel);
                zzs(zzbywVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbzc zzbzcVar = (zzbzc) zzban.zzb(parcel, zzbzc.CREATOR);
                zzban.zzh(parcel);
                zzh(zzbzcVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzf(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzban.zzd(parcel2, bundleZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZza = zzban.zza(parcel);
                zzban.zzh(parcel);
                zzk(iObjectWrapperAsInterface2, zZza);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbyl zzbylVarZzl = zzl();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbylVarZzl);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzm = zzm();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzeaVarZzm);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdt zzdtVarZzb = com.google.android.gms.ads.internal.client.zzds.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzo(zzdtVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbytVar2 = iInterfaceQueryLocalInterface4 instanceof zzbyv ? (zzbyv) iInterfaceQueryLocalInterface4 : new zzbyt(strongBinder4);
                }
                zzban.zzh(parcel);
                zzd(zzmVar2, zzbytVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZza2 = zzban.zza(parcel);
                zzban.zzh(parcel);
                zzp(zZza2);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 17:
                long jZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(jZzq);
                return true;
            case 18:
                long j10 = parcel.readLong();
                zzban.zzh(parcel);
                zzr(j10);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
