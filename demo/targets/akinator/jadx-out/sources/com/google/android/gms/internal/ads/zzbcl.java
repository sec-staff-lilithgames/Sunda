package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbcl extends zzbal implements zzbcn {
    public zzbcl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final com.google.android.gms.ads.internal.client.zzbx zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzf(IObjectWrapper iObjectWrapper, zzbcu zzbcuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbcuVar);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final com.google.android.gms.ads.internal.client.zzea zzg() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzh(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzban.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzdtVar);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final String zzj() throws RemoteException {
        Parcel parcelZzde = zzde(8, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final long zzk() throws RemoteException {
        Parcel parcelZzde = zzde(9, zza());
        long j10 = parcelZzde.readLong();
        parcelZzde.recycle();
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzbcn
    public final void zzl(long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzdf(10, parcelZza);
    }
}
