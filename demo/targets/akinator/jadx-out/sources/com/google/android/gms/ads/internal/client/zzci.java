package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbcm;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbrj;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzbyo;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzci extends zzbal implements zzck {
    public zzci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zze(List list, zzce zzceVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzban.zze(parcelZza, zzceVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(2, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbyo zzg(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(3, parcelZza);
        zzbyo zzbyoVarZzt = zzbyn.zzt(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbyoVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzh(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(4, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbcn zzi(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(5, parcelZza);
        zzbcn zzbcnVarZzb = zzbcm.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbcnVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzj(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(6, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzk(String str) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(7, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzl(zzbrj zzbrjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbrjVar);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzm(String str, zzft zzftVar, zzch zzchVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzban.zzc(parcelZza, zzftVar);
        zzban.zze(parcelZza, zzchVar);
        Parcel parcelZzde = zzde(9, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzn(int i10, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(10, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbx zzo(String str) throws RemoteException {
        zzbx zzbvVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(11, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbcn zzp(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(12, parcelZza);
        zzbcn zzbcnVarZzb = zzbcm.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbcnVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbyo zzq(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(13, parcelZza);
        zzbyo zzbyoVarZzt = zzbyn.zzt(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbyoVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzft zzr(int i10, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(14, parcelZza);
        zzft zzftVar = (zzft) zzban.zzb(parcelZzde, zzft.CREATOR);
        parcelZzde.recycle();
        return zzftVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final Bundle zzs(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        Parcel parcelZzde = zzde(15, parcelZza);
        Bundle bundle = (Bundle) zzban.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final int zzt(int i10, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(16, parcelZza);
        int i11 = parcelZzde.readInt();
        parcelZzde.recycle();
        return i11;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzu(int i10, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(17, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzv(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdf(18, parcelZza);
    }
}
