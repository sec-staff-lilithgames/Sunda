package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzp extends com.google.android.gms.internal.common.zza implements IInterface {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() throws RemoteException {
        Parcel parcelZzB = zzB(6, zza());
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    public final int zzf(IObjectWrapper iObjectWrapper, String str, boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z10 ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    public final int zzg(IObjectWrapper iObjectWrapper, String str, boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z10 ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    public final IObjectWrapper zzh(IObjectWrapper iObjectWrapper, String str, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzB(2, parcelZza));
    }

    public final IObjectWrapper zzi(IObjectWrapper iObjectWrapper, String str, int i10, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper2);
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzB(8, parcelZza));
    }

    public final IObjectWrapper zzj(IObjectWrapper iObjectWrapper, String str, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i10);
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzB(4, parcelZza));
    }

    public final IObjectWrapper zzk(IObjectWrapper iObjectWrapper, String str, boolean z10, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(z10 ? 1 : 0);
        parcelZza.writeLong(j10);
        return com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.j(zzB(7, parcelZza));
    }
}
