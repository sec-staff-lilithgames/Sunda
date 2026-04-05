package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbka extends zzbal implements zzbkc {
    public zzbka(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzde = zzde(24, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzB(com.google.android.gms.ads.internal.client.zzdj zzdjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzdjVar);
        zzdf(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzC(com.google.android.gms.ads.internal.client.zzdf zzdfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzdfVar);
        zzdf(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzD() throws RemoteException {
        zzdf(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzE() throws RemoteException {
        zzdf(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final zzbif zzF() throws RemoteException {
        zzbif zzbidVar;
        Parcel parcelZzde = zzde(29, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbidVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbidVar = iInterfaceQueryLocalInterface instanceof zzbif ? (zzbif) iInterfaceQueryLocalInterface : new zzbid(strongBinder);
        }
        parcelZzde.recycle();
        return zzbidVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final boolean zzG() throws RemoteException {
        Parcel parcelZzde = zzde(30, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final com.google.android.gms.ads.internal.client.zzea zzH() throws RemoteException {
        Parcel parcelZzde = zzde(31, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzI(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzdtVar);
        zzdf(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzJ(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, bundle);
        zzdf(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final long zzK() throws RemoteException {
        Parcel parcelZzde = zzde(34, zza());
        long j10 = parcelZzde.readLong();
        parcelZzde.recycle();
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzL(long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzdf(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zze() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final List zzf() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList arrayListZzf = zzban.zzf(parcelZzde);
        parcelZzde.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzg() throws RemoteException {
        Parcel parcelZzde = zzde(4, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final zzbii zzh() throws RemoteException {
        zzbii zzbigVar;
        Parcel parcelZzde = zzde(5, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbigVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbigVar = iInterfaceQueryLocalInterface instanceof zzbii ? (zzbii) iInterfaceQueryLocalInterface : new zzbig(strongBinder);
        }
        parcelZzde.recycle();
        return zzbigVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzi() throws RemoteException {
        Parcel parcelZzde = zzde(6, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzj() throws RemoteException {
        Parcel parcelZzde = zzde(7, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final double zzk() throws RemoteException {
        Parcel parcelZzde = zzde(8, zza());
        double d10 = parcelZzde.readDouble();
        parcelZzde.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzl() throws RemoteException {
        Parcel parcelZzde = zzde(9, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzm() throws RemoteException {
        Parcel parcelZzde = zzde(10, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final com.google.android.gms.ads.internal.client.zzed zzn() throws RemoteException {
        Parcel parcelZzde = zzde(11, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final String zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzp() throws RemoteException {
        zzdf(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final zzbib zzq() throws RemoteException {
        zzbib zzbhzVar;
        Parcel parcelZzde = zzde(14, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbhzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbhzVar = iInterfaceQueryLocalInterface instanceof zzbib ? (zzbib) iInterfaceQueryLocalInterface : new zzbhz(strongBinder);
        }
        parcelZzde.recycle();
        return zzbhzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, bundle);
        zzdf(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final boolean zzs(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, bundle);
        Parcel parcelZzde = zzde(16, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzt(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, bundle);
        zzdf(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final IObjectWrapper zzu() throws RemoteException {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzde(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final IObjectWrapper zzv() throws RemoteException {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzde(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final Bundle zzw() throws RemoteException {
        Parcel parcelZzde = zzde(20, zza());
        Bundle bundle = (Bundle) zzban.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzx(zzbjz zzbjzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbjzVar);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final void zzy() throws RemoteException {
        zzdf(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbkc
    public final List zzz() throws RemoteException {
        Parcel parcelZzde = zzde(23, zza());
        ArrayList arrayListZzf = zzban.zzf(parcelZzde);
        parcelZzde.recycle();
        return arrayListZzf;
    }
}
