package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzban;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdy extends zzbal implements zzea {
    public zzdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zze() throws RemoteException {
        Parcel parcelZzde = zzde(1, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzf() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final List zzg() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzde.createTypedArrayList(zzv.CREATOR);
        parcelZzde.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzv zzh() throws RemoteException {
        Parcel parcelZzde = zzde(4, zza());
        zzv zzvVar = (zzv) zzban.zzb(parcelZzde, zzv.CREATOR);
        parcelZzde.recycle();
        return zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final Bundle zzi() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        Bundle bundle = (Bundle) zzban.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final String zzj() throws RemoteException {
        Parcel parcelZzde = zzde(6, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }
}
