package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbid extends zzbal implements zzbif {
    public zzbid(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final float zze() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        float f10 = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final IObjectWrapper zzg() throws RemoteException {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzde(4, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final float zzh() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        float f10 = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final float zzi() throws RemoteException {
        Parcel parcelZzde = zzde(6, zza());
        float f10 = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final com.google.android.gms.ads.internal.client.zzed zzj() throws RemoteException {
        Parcel parcelZzde = zzde(7, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final boolean zzk() throws RemoteException {
        Parcel parcelZzde = zzde(8, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzde = zzde(10, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zzm(zzbjq zzbjqVar) throws RemoteException {
        throw null;
    }
}
