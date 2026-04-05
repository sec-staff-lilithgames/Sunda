package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbcq;
import com.google.android.gms.internal.ads.zzbfo;
import com.google.android.gms.internal.ads.zzbfp;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbvr;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbya;
import com.google.android.gms.internal.ads.zzbyb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbw extends zzbam implements zzbx {
    public zzbw() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbx zzZ(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbk zzbiVar = null;
        zzcv zzctVar = null;
        zzbn zzblVar = null;
        zzdt zzdrVar = null;
        zzcb zzbzVar = null;
        zzcs zzcsVar = null;
        zzbh zzbfVar = null;
        zzco zzcmVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperZzb = zzb();
                parcel2.writeNoException();
                zzban.zze(parcel2, iObjectWrapperZzb);
                return true;
            case 2:
                zzc();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzd = zzd();
                parcel2.writeNoException();
                int i12 = zzban.zza;
                parcel2.writeInt(zZzd ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzban.zzb(parcel, zzm.CREATOR);
                zzban.zzh(parcel);
                boolean zZze = zze(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZze ? 1 : 0);
                return true;
            case 5:
                zzf();
                parcel2.writeNoException();
                return true;
            case 6:
                zzg();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbiVar = iInterfaceQueryLocalInterface instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface : new zzbi(strongBinder);
                }
                zzban.zzh(parcel);
                zzdW(zzbiVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzcmVar = iInterfaceQueryLocalInterface2 instanceof zzco ? (zzco) iInterfaceQueryLocalInterface2 : new zzcm(strongBinder2);
                }
                zzban.zzh(parcel);
                zzi(zzcmVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzl();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzm();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr zzrVarZzn = zzn();
                parcel2.writeNoException();
                zzban.zzd(parcel2, zzrVarZzn);
                return true;
            case 13:
                zzr zzrVar = (zzr) zzban.zzb(parcel, zzr.CREATOR);
                zzban.zzh(parcel);
                zzo(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbvr zzbvrVarZzb = zzbvq.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzp(zzbvrVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbvu zzbvuVarZzb = zzbvt.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                zzban.zzh(parcel);
                zzq(zzbvuVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 19:
                zzbfp zzbfpVarZzb = zzbfo.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzx(zzbfpVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbfVar = iInterfaceQueryLocalInterface3 instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface3 : new zzbf(strongBinder3);
                }
                zzban.zzh(parcel);
                zzy(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcsVar = iInterfaceQueryLocalInterface4 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface4 : new zzcs(strongBinder4);
                }
                zzban.zzh(parcel);
                zzY(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZza = zzban.zza(parcel);
                zzban.zzh(parcel);
                zzz(zZza);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                int i13 = zzban.zza;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 24:
                zzbyb zzbybVarZzb = zzbya.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzC(zzbybVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzban.zzh(parcel);
                zzD(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzed zzedVarZzF = zzF();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzedVarZzF);
                return true;
            case 29:
                zzga zzgaVar = (zzga) zzban.zzb(parcel, zzga.CREATOR);
                zzban.zzh(parcel);
                zzG(zzgaVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzeh zzehVar = (zzeh) zzban.zzb(parcel, zzeh.CREATOR);
                zzban.zzh(parcel);
                zzH(zzehVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 32:
                zzco zzcoVarZzv = zzv();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzcoVarZzv);
                return true;
            case 33:
                zzbk zzbkVarZzw = zzw();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbkVarZzw);
                return true;
            case 34:
                boolean zZza2 = zzban.zza(parcel);
                zzban.zzh(parcel);
                zzK(zZza2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbzVar = iInterfaceQueryLocalInterface5 instanceof zzcb ? (zzcb) iInterfaceQueryLocalInterface5 : new zzbz(strongBinder5);
                }
                zzban.zzh(parcel);
                zzj(zzbzVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                zzban.zzd(parcel2, bundleZzk);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzban.zzh(parcel);
                zzE(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzx zzxVar = (zzx) zzban.zzb(parcel, zzx.CREATOR);
                zzban.zzh(parcel);
                zzI(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbcq zzbcqVarZze = zzbcp.zze(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzJ(zzbcqVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzea zzeaVarZzt = zzt();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzeaVarZzt);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdrVar = iInterfaceQueryLocalInterface6 instanceof zzdt ? (zzdt) iInterfaceQueryLocalInterface6 : new zzdr(strongBinder6);
                }
                zzban.zzh(parcel);
                zzP(zzdrVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzban.zzb(parcel, zzm.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzblVar = iInterfaceQueryLocalInterface7 instanceof zzbn ? (zzbn) iInterfaceQueryLocalInterface7 : new zzbl(strongBinder7);
                }
                zzban.zzh(parcel);
                zzQ(zzmVar2, zzblVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzR(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzctVar = iInterfaceQueryLocalInterface8 instanceof zzcv ? (zzcv) iInterfaceQueryLocalInterface8 : new zzct(strongBinder8);
                }
                zzban.zzh(parcel);
                zzS(zzctVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i14 = zzban.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 47:
                long jZzU = zzU();
                parcel2.writeNoException();
                parcel2.writeLong(jZzU);
                return true;
            case 48:
                long j10 = parcel.readLong();
                zzban.zzh(parcel);
                zzT(j10);
                parcel2.writeNoException();
                return true;
        }
    }
}
