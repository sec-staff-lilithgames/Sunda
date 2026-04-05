package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbjo;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbjt;
import com.google.android.gms.internal.ads.zzbjv;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzboq;
import com.google.android.gms.internal.ads.zzbor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbs extends zzbam implements zzbt {
    public zzbs() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbk zzbiVar = null;
        zzcs zzcsVar = null;
        switch (i10) {
            case 1:
                zzbq zzbqVarZze = zze();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbqVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbiVar = iInterfaceQueryLocalInterface instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface : new zzbi(strongBinder);
                }
                zzban.zzh(parcel);
                zzf(zzbiVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbjg zzbjgVarZzb = zzbjf.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzg(zzbjgVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbjj zzbjjVarZzb = zzbji.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzh(zzbjjVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbjp zzbjpVarZzb = zzbjo.zzb(parcel.readStrongBinder());
                zzbjm zzbjmVarZzb = zzbjl.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzi(string, zzbjpVarZzb, zzbjmVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbhx zzbhxVar = (zzbhx) zzban.zzb(parcel, zzbhx.CREATOR);
                zzban.zzh(parcel);
                zzj(zzbhxVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcsVar = iInterfaceQueryLocalInterface2 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface2 : new zzcs(strongBinder2);
                }
                zzban.zzh(parcel);
                zzq(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbjt zzbjtVarZzb = zzbjs.zzb(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzban.zzb(parcel, zzr.CREATOR);
                zzban.zzh(parcel);
                zzk(zzbjtVarZzb, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzban.zzb(parcel, PublisherAdViewOptions.CREATOR);
                zzban.zzh(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbjw zzbjwVarZzb = zzbjv.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzm(zzbjwVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzboi zzboiVar = (zzboi) zzban.zzb(parcel, zzboi.CREATOR);
                zzban.zzh(parcel);
                zzn(zzboiVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbor zzborVarZzb = zzboq.zzb(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzo(zzborVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzban.zzb(parcel, AdManagerAdViewOptions.CREATOR);
                zzban.zzh(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
