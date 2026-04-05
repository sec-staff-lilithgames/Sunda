package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbjm;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjt;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbr extends zzbal implements zzbt {
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final zzbq zze() throws RemoteException {
        zzbq zzboVar;
        Parcel parcelZzde = zzde(1, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzboVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzboVar = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
        }
        parcelZzde.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzf(zzbk zzbkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbkVar);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzg(zzbjg zzbjgVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzh(zzbjj zzbjjVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzi(String str, zzbjp zzbjpVar, zzbjm zzbjmVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzban.zze(parcelZza, zzbjpVar);
        zzban.zze(parcelZza, zzbjmVar);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzj(zzbhx zzbhxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, zzbhxVar);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzk(zzbjt zzbjtVar, zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbjtVar);
        zzban.zzc(parcelZza, zzrVar);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzm(zzbjw zzbjwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzbjwVar);
        zzdf(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzn(zzboi zzboiVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzo(zzbor zzborVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zzc(parcelZza, adManagerAdViewOptions);
        zzdf(15, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbt
    public final void zzq(zzcs zzcsVar) throws RemoteException {
        throw null;
    }
}
