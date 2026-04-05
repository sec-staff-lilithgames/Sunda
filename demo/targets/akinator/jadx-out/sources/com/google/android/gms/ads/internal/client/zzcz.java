package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbrj;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcz extends zzbal implements zzdb {
    public zzcz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzf(float f10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f10);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzg(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzh(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzban.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final float zzk() throws RemoteException {
        Parcel parcelZzde = zzde(7, zza());
        float f10 = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzde = zzde(8, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzm() throws RemoteException {
        Parcel parcelZzde = zzde(9, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbrj zzbrjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbrjVar);
        zzdf(11, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(zzbod zzbodVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbodVar);
        zzdf(12, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzq() throws RemoteException {
        Parcel parcelZzde = zzde(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzde.createTypedArrayList(zzbnw.CREATOR);
        parcelZzde.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(zzfv zzfvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzfvVar);
        zzdf(14, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs() throws RemoteException {
        zzdf(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(zzdn zzdnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzdnVar);
        zzdf(16, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzban.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdf(17, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzv(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(18, parcelZza);
    }
}
