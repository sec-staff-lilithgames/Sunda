package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbja extends zzbal implements zzbjc {
    @Override // com.google.android.gms.internal.ads.zzbjc
    public final String zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(1, parcelZza);
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final zzbii zzf(String str) throws RemoteException {
        zzbii zzbigVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(2, parcelZza);
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

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final List zzg() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList<String> arrayListCreateStringArrayList = parcelZzde.createStringArrayList();
        parcelZzde.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final String zzh() throws RemoteException {
        Parcel parcelZzde = zzde(4, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zzi(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zzj() throws RemoteException {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final com.google.android.gms.ads.internal.client.zzed zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zzl() throws RemoteException {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final IObjectWrapper zzm() throws RemoteException {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzde(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final boolean zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzde = zzde(10, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final boolean zzo() throws RemoteException {
        Parcel parcelZzde = zzde(12, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final boolean zzp() throws RemoteException {
        Parcel parcelZzde = zzde(13, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zzr() throws RemoteException {
        zzdf(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final zzbif zzs() throws RemoteException {
        zzbif zzbidVar;
        Parcel parcelZzde = zzde(16, zza());
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

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzde = zzde(17, parcelZza);
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    public zzbja(IBinder iBinder) {
        super(iBinder, wHkgq.erkLgXEcpWrv);
    }
}
