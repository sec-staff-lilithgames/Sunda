package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface IFragmentWrapper extends IInterface {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterfaceQueryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) iInterfaceQueryLocalInterface : new zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            switch (i10) {
                case 2:
                    IObjectWrapper iObjectWrapperZzg = zzg();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iObjectWrapperZzg);
                    return true;
                case 3:
                    Bundle bundleZzd = zzd();
                    parcel2.writeNoException();
                    zzc.zzd(parcel2, bundleZzd);
                    return true;
                case 4:
                    int iZzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzb);
                    return true;
                case 5:
                    IFragmentWrapper iFragmentWrapperZze = zze();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iFragmentWrapperZze);
                    return true;
                case 6:
                    IObjectWrapper iObjectWrapperZzh = zzh();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iObjectWrapperZzh);
                    return true;
                case 7:
                    boolean zZzs = zzs();
                    parcel2.writeNoException();
                    int i12 = zzc.zza;
                    parcel2.writeInt(zZzs ? 1 : 0);
                    return true;
                case 8:
                    String strZzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeString(strZzj);
                    return true;
                case 9:
                    IFragmentWrapper iFragmentWrapperZzf = zzf();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iFragmentWrapperZzf);
                    return true;
                case 10:
                    int iZzc = zzc();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzc);
                    return true;
                case 11:
                    boolean zZzt = zzt();
                    parcel2.writeNoException();
                    int i13 = zzc.zza;
                    parcel2.writeInt(zZzt ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper iObjectWrapperZzi = zzi();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, iObjectWrapperZzi);
                    return true;
                case 13:
                    boolean zZzu = zzu();
                    parcel2.writeNoException();
                    int i14 = zzc.zza;
                    parcel2.writeInt(zZzu ? 1 : 0);
                    return true;
                case 14:
                    boolean zZzv = zzv();
                    parcel2.writeNoException();
                    int i15 = zzc.zza;
                    parcel2.writeInt(zZzv ? 1 : 0);
                    return true;
                case 15:
                    boolean zZzw = zzw();
                    parcel2.writeNoException();
                    int i16 = zzc.zza;
                    parcel2.writeInt(zZzw ? 1 : 0);
                    return true;
                case 16:
                    boolean zZzx = zzx();
                    parcel2.writeNoException();
                    int i17 = zzc.zza;
                    parcel2.writeInt(zZzx ? 1 : 0);
                    return true;
                case 17:
                    boolean zZzy = zzy();
                    parcel2.writeNoException();
                    int i18 = zzc.zza;
                    parcel2.writeInt(zZzy ? 1 : 0);
                    return true;
                case 18:
                    boolean zZzz = zzz();
                    parcel2.writeNoException();
                    int i19 = zzc.zza;
                    parcel2.writeInt(zZzz ? 1 : 0);
                    return true;
                case 19:
                    boolean zZzA = zzA();
                    parcel2.writeNoException();
                    int i20 = zzc.zza;
                    parcel2.writeInt(zZzA ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    zzk(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zZzf = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    zzl(zZzf);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zZzf2 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    zzm(zZzf2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zZzf3 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    zzn(zZzf3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zZzf4 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    zzo(zZzf4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) zzc.zza(parcel, Intent.CREATOR);
                    zzc.zzb(parcel);
                    zzp(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) zzc.zza(parcel, Intent.CREATOR);
                    int i21 = parcel.readInt();
                    zzc.zzb(parcel);
                    zzq(intent2, i21);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    zzr(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean zzA() throws RemoteException;

    int zzb() throws RemoteException;

    int zzc() throws RemoteException;

    Bundle zzd() throws RemoteException;

    IFragmentWrapper zze() throws RemoteException;

    IFragmentWrapper zzf() throws RemoteException;

    IObjectWrapper zzg() throws RemoteException;

    IObjectWrapper zzh() throws RemoteException;

    IObjectWrapper zzi() throws RemoteException;

    String zzj() throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzl(boolean z10) throws RemoteException;

    void zzm(boolean z10) throws RemoteException;

    void zzn(boolean z10) throws RemoteException;

    void zzo(boolean z10) throws RemoteException;

    void zzp(Intent intent) throws RemoteException;

    void zzq(Intent intent, int i10) throws RemoteException;

    void zzr(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzs() throws RemoteException;

    boolean zzt() throws RemoteException;

    boolean zzu() throws RemoteException;

    boolean zzv() throws RemoteException;

    boolean zzw() throws RemoteException;

    boolean zzx() throws RemoteException;

    boolean zzy() throws RemoteException;

    boolean zzz() throws RemoteException;
}
