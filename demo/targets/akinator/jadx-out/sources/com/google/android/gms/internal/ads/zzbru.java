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
public final class zzbru extends zzbal implements IInterface {
    public zzbru(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final String zze() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final List zzf() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList arrayListZzf = zzban.zzf(parcelZzde);
        parcelZzde.recycle();
        return arrayListZzf;
    }

    public final String zzg() throws RemoteException {
        Parcel parcelZzde = zzde(4, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final zzbii zzh() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        zzbii zzbiiVarZzh = zzbih.zzh(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbiiVarZzh;
    }

    public final String zzi() throws RemoteException {
        Parcel parcelZzde = zzde(6, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final double zzj() throws RemoteException {
        Parcel parcelZzde = zzde(7, zza());
        double d10 = parcelZzde.readDouble();
        parcelZzde.recycle();
        return d10;
    }

    public final String zzk() throws RemoteException {
        Parcel parcelZzde = zzde(8, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final String zzl() throws RemoteException {
        Parcel parcelZzde = zzde(9, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    public final void zzm() throws RemoteException {
        zzdf(10, zza());
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(11, parcelZza);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(12, parcelZza);
    }

    public final boolean zzp() throws RemoteException {
        Parcel parcelZzde = zzde(13, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    public final boolean zzq() throws RemoteException {
        Parcel parcelZzde = zzde(14, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    public final Bundle zzr() throws RemoteException {
        Parcel parcelZzde = zzde(15, zza());
        Bundle bundle = (Bundle) zzban.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(16, parcelZza);
    }

    public final com.google.android.gms.ads.internal.client.zzed zzt() throws RemoteException {
        Parcel parcelZzde = zzde(17, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzedVarZzb;
    }

    public final IObjectWrapper zzu() throws RemoteException {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzde(18, zza()));
    }

    public final zzbib zzv() throws RemoteException {
        Parcel parcelZzde = zzde(19, zza());
        zzbib zzbibVarZzj = zzbia.zzj(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbibVarZzj;
    }

    public final IObjectWrapper zzw() throws RemoteException {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzde(20, zza()));
    }

    public final IObjectWrapper zzx() throws RemoteException {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzde(21, zza()));
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, iObjectWrapper2);
        zzban.zze(parcelZza, iObjectWrapper3);
        zzdf(22, parcelZza);
    }
}
