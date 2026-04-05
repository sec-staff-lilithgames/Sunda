package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbis;
import com.google.android.gms.internal.ads.zzbmw;
import com.google.android.gms.internal.ads.zzbmx;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbrj;
import com.google.android.gms.internal.ads.zzbvb;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzcas;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzcq extends zzbam implements zzcr {
    public zzcq() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzban.zzb(parcel, zzr.CREATOR);
                String string = parcel.readString();
                zzbrj zzbrjVarZzf = zzbri.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzban.zzh(parcel);
                zzbx zzbxVarZzb = zzb(iObjectWrapperAsInterface, zzrVar, string, zzbrjVarZzf, i12);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbxVarZzb);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzban.zzb(parcel, zzr.CREATOR);
                String string2 = parcel.readString();
                zzbrj zzbrjVarZzf2 = zzbri.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzban.zzh(parcel);
                zzbx zzbxVarZzc = zzc(iObjectWrapperAsInterface2, zzrVar2, string2, zzbrjVarZzf2, i13);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbxVarZzc);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbrj zzbrjVarZzf3 = zzbri.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzban.zzh(parcel);
                zzbt zzbtVarZzd = zzd(iObjectWrapperAsInterface3, string3, zzbrjVarZzf3, i14);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbtVarZzd);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                parcel2.writeNoException();
                zzban.zze(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzbim zzbimVarZze = zze(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbimVarZze);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrj zzbrjVarZzf4 = zzbri.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzban.zzh(parcel);
                zzbxy zzbxyVarZzf = zzf(iObjectWrapperAsInterface6, zzbrjVarZzf4, i15);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbxyVarZzf);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                parcel2.writeNoException();
                zzban.zze(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzbvi zzbviVarZzg = zzg(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbviVarZzg);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                zzban.zzh(parcel);
                zzdb zzdbVarZzi = zzi(iObjectWrapperAsInterface8, i16);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzdbVarZzi);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzban.zzb(parcel, zzr.CREATOR);
                String string4 = parcel.readString();
                int i17 = parcel.readInt();
                zzban.zzh(parcel);
                zzbx zzbxVarZzj = zzj(iObjectWrapperAsInterface9, zzrVar3, string4, i17);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbxVarZzj);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzbis zzbisVarZzk = zzk(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbisVarZzk);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbrj zzbrjVarZzf5 = zzbri.zzf(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                zzban.zzh(parcel);
                zzbyo zzbyoVarZzl = zzl(iObjectWrapperAsInterface13, string5, zzbrjVarZzf5, i18);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbyoVarZzl);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzban.zzb(parcel, zzr.CREATOR);
                String string6 = parcel.readString();
                zzbrj zzbrjVarZzf6 = zzbri.zzf(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                zzban.zzh(parcel);
                zzbx zzbxVarZzm = zzm(iObjectWrapperAsInterface14, zzrVar4, string6, zzbrjVarZzf6, i19);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbxVarZzm);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrj zzbrjVarZzf7 = zzbri.zzf(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                zzban.zzh(parcel);
                zzcas zzcasVarZzn = zzn(iObjectWrapperAsInterface15, zzbrjVarZzf7, i20);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzcasVarZzn);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrj zzbrjVarZzf8 = zzbri.zzf(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                zzban.zzh(parcel);
                zzbvb zzbvbVarZzo = zzo(iObjectWrapperAsInterface16, zzbrjVarZzf8, i21);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbvbVarZzo);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrj zzbrjVarZzf9 = zzbri.zzf(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                zzbmx zzbmxVarZzc = zzbmw.zzc(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzbna zzbnaVarZzp = zzp(iObjectWrapperAsInterface17, zzbrjVarZzf9, i22, zzbmxVarZzc);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbnaVarZzp);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrj zzbrjVarZzf10 = zzbri.zzf(parcel.readStrongBinder());
                int i23 = parcel.readInt();
                zzban.zzh(parcel);
                zzdw zzdwVarZzq = zzq(iObjectWrapperAsInterface18, zzbrjVarZzf10, i23);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzdwVarZzq);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperAsInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbrj zzbrjVarZzf11 = zzbri.zzf(parcel.readStrongBinder());
                int i24 = parcel.readInt();
                zzban.zzh(parcel);
                zzck zzckVarZzh = zzh(iObjectWrapperAsInterface19, zzbrjVarZzf11, i24);
                parcel2.writeNoException();
                zzban.zze(parcel2, zzckVarZzh);
                return true;
            default:
                return false;
        }
    }
}
