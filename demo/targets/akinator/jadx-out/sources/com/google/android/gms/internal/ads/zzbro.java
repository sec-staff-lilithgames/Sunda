package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbro extends zzbam implements zzbrp {
    public zzbro() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbrp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbrp ? (zzbrp) iInterfaceQueryLocalInterface : new zzbrn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i12 = parcel.readInt();
                zzban.zzh(parcel);
                zzg(i12);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                }
                zzban.zzh(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzban.zzh(parcel);
                zzl(string, string2);
                break;
            case 10:
                zzbjb.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzban.zzh(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                zzban.zzh(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzbyh zzbyhVar = (zzbyh) zzban.zzb(parcel, zzbyh.CREATOR);
                zzban.zzh(parcel);
                zzp(zzbyhVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                zzbyl zzbylVarZzb = zzbyk.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzr(zzbylVarZzb);
                break;
            case 17:
                int i13 = parcel.readInt();
                zzban.zzh(parcel);
                zzs(i13);
                break;
            case 18:
                zzt();
                break;
            case 19:
                zzban.zzh(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String string3 = parcel.readString();
                zzban.zzh(parcel);
                zzv(string3);
                break;
            case 22:
                int i14 = parcel.readInt();
                String string4 = parcel.readString();
                zzban.zzh(parcel);
                zzw(i14, string4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzban.zzh(parcel);
                zzx(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzban.zzh(parcel);
                zzy(zzeVar2);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
