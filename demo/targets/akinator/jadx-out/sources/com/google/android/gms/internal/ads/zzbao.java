package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbao extends zzbal implements zzbaq {
    public zzbao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString("GMA_SDK");
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzf() throws RemoteException {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzg(int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzh(byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzi(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(0);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzj(int i10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzdf(7, parcelZza);
    }
}
