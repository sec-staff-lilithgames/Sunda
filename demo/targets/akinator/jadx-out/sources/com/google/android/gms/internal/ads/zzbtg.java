package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbtg extends zzbal implements zzbti {
    public zzbtg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbtl zzbtlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzban.zzc(parcelZza, bundle);
        zzban.zzc(parcelZza, bundle2);
        zzban.zzc(parcelZza, zzrVar);
        zzban.zze(parcelZza, zzbtlVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final zzbtx zzf() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        zzbtx zzbtxVar = (zzbtx) zzban.zzb(parcelZzde, zzbtx.CREATOR);
        parcelZzde.recycle();
        return zzbtxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final zzbtx zzg() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        zzbtx zzbtxVar = (zzbtx) zzban.zzb(parcelZzde, zzbtx.CREATOR);
        parcelZzde.recycle();
        return zzbtxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final com.google.android.gms.ads.internal.client.zzed zzh() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbsw zzbswVar, zzbrp zzbrpVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzban.zzc(parcelZza, zzmVar);
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbswVar);
        zzban.zze(parcelZza, zzbrpVar);
        zzban.zzc(parcelZza, zzrVar);
        zzdf(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbsz zzbszVar, zzbrp zzbrpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzban.zzc(parcelZza, zzmVar);
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbszVar);
        zzban.zze(parcelZza, zzbrpVar);
        zzdf(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzde = zzde(15, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbtf zzbtfVar, zzbrp zzbrpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzban.zzc(parcelZza, zzmVar);
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbtfVar);
        zzban.zze(parcelZza, zzbrpVar);
        zzdf(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzde = zzde(17, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar, zzbrp zzbrpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzban.zzc(parcelZza, zzmVar);
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbtcVar);
        zzban.zze(parcelZza, zzbrpVar);
        zzdf(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzo(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbtf zzbtfVar, zzbrp zzbrpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzban.zzc(parcelZza, zzmVar);
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbtfVar);
        zzban.zze(parcelZza, zzbrpVar);
        zzdf(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbsw zzbswVar, zzbrp zzbrpVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzban.zzc(parcelZza, zzmVar);
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbswVar);
        zzban.zze(parcelZza, zzbrpVar);
        zzban.zzc(parcelZza, zzrVar);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar, zzbrp zzbrpVar, zzbhx zzbhxVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzban.zzc(parcelZza, zzmVar);
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbtcVar);
        zzban.zze(parcelZza, zzbrpVar);
        zzban.zzc(parcelZza, zzbhxVar);
        zzdf(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbst zzbstVar, zzbrp zzbrpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzban.zzc(parcelZza, zzmVar);
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, zzbstVar);
        zzban.zze(parcelZza, zzbrpVar);
        zzdf(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzde = zzde(24, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }
}
