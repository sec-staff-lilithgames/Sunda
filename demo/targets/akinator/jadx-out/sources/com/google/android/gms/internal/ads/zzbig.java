package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbig extends zzbal implements zzbii {
    public zzbig(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final IObjectWrapper zzb() throws RemoteException {
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzde(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final Uri zzc() throws RemoteException {
        Parcel parcelZzde = zzde(2, zza());
        Uri uri = (Uri) zzban.zzb(parcelZzde, Uri.CREATOR);
        parcelZzde.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final double zzd() throws RemoteException {
        Parcel parcelZzde = zzde(3, zza());
        double d10 = parcelZzde.readDouble();
        parcelZzde.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final int zze() throws RemoteException {
        Parcel parcelZzde = zzde(4, zza());
        int i10 = parcelZzde.readInt();
        parcelZzde.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final int zzf() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        int i10 = parcelZzde.readInt();
        parcelZzde.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final Map zzg() throws RemoteException {
        Parcel parcelZzde = zzde(6, zza());
        HashMap mapZzg = zzban.zzg(parcelZzde);
        parcelZzde.recycle();
        return mapZzg;
    }
}
