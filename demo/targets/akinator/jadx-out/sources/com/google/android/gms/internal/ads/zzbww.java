package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbww extends zzbam implements zzbwx {
    public zzbww() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbxb zzbwzVar = null;
        zzbxc zzbxcVar = null;
        zzbxb zzbwzVar2 = null;
        zzbxb zzbwzVar3 = null;
        zzbxb zzbwzVar4 = null;
        switch (i10) {
            case 1:
                zzban.zzh(parcel);
                parcel2.writeNoException();
                zzban.zzd(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                zzban.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbxj zzbxjVar = (zzbxj) zzban.zzb(parcel, zzbxj.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbwzVar = iInterfaceQueryLocalInterface instanceof zzbxb ? (zzbxb) iInterfaceQueryLocalInterface : new zzbwz(strongBinder2);
                }
                zzban.zzh(parcel);
                zze(zzbxjVar, zzbwzVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbxj zzbxjVar2 = (zzbxj) zzban.zzb(parcel, zzbxj.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbwzVar4 = iInterfaceQueryLocalInterface2 instanceof zzbxb ? (zzbxb) iInterfaceQueryLocalInterface2 : new zzbwz(strongBinder3);
                }
                zzban.zzh(parcel);
                zzf(zzbxjVar2, zzbwzVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbxj zzbxjVar3 = (zzbxj) zzban.zzb(parcel, zzbxj.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbwzVar3 = iInterfaceQueryLocalInterface3 instanceof zzbxb ? (zzbxb) iInterfaceQueryLocalInterface3 : new zzbwz(strongBinder4);
                }
                zzban.zzh(parcel);
                zzg(zzbxjVar3, zzbwzVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbwzVar2 = iInterfaceQueryLocalInterface4 instanceof zzbxb ? (zzbxb) iInterfaceQueryLocalInterface4 : new zzbwz(strongBinder5);
                }
                zzban.zzh(parcel);
                zzh(string, zzbwzVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbwt zzbwtVar = (zzbwt) zzban.zzb(parcel, zzbwt.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbxcVar = iInterfaceQueryLocalInterface5 instanceof zzbxc ? (zzbxc) iInterfaceQueryLocalInterface5 : new zzbxc(strongBinder6);
                }
                zzban.zzh(parcel);
                zzj(zzbwtVar, zzbxcVar);
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                zzban.zzh(parcel);
                zzi(string2);
                parcel2.writeNoException();
                return true;
        }
    }
}
