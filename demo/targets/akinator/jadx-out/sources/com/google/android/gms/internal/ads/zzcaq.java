package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcaq extends zzbal implements zzcas {
    public zzcaq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zze(IObjectWrapper iObjectWrapper, zzcaw zzcawVar, zzcap zzcapVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zzc(parcelZza, zzcawVar);
        zzban.zze(parcelZza, zzcapVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbvx zzbvxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbvx zzbvxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzi(zzbwa zzbwaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbvx zzbvxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbvx zzbvxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzban.zze(parcelZza, iObjectWrapper2);
        parcelZza.writeString(str);
        zzban.zze(parcelZza, iObjectWrapper3);
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzde(11, parcelZza));
    }
}
