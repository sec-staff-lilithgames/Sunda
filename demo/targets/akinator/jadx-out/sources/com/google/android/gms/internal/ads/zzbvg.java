package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbvg extends zzbal implements zzbvi {
    public zzbvg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzH(int i10, String[] strArr, int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzdf(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zze() throws RemoteException {
        zzdf(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzf() throws RemoteException {
        zzdf(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final boolean zzg() throws RemoteException {
        Parcel parcelZzde = zzde(11, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzh(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, bundle);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj() throws RemoteException {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzk() throws RemoteException {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzl() throws RemoteException {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzm(int i10, int i11, Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        parcelZza.writeInt(i11);
        zzban.zzc(parcelZza, intent);
        zzdf(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzo(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, bundle);
        Parcel parcelZzde = zzde(6, parcelZza);
        if (parcelZzde.readInt() != 0) {
            bundle.readFromParcel(parcelZzde);
        }
        parcelZzde.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzp() throws RemoteException {
        zzdf(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzq() throws RemoteException {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzs() throws RemoteException {
        zzdf(9, zza());
    }
}
