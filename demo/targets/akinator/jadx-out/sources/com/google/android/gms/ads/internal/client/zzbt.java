package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
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
public interface zzbt extends IInterface {
    zzbq zze() throws RemoteException;

    void zzf(zzbk zzbkVar) throws RemoteException;

    void zzg(zzbjg zzbjgVar) throws RemoteException;

    void zzh(zzbjj zzbjjVar) throws RemoteException;

    void zzi(String str, zzbjp zzbjpVar, zzbjm zzbjmVar) throws RemoteException;

    void zzj(zzbhx zzbhxVar) throws RemoteException;

    void zzk(zzbjt zzbjtVar, zzr zzrVar) throws RemoteException;

    void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzm(zzbjw zzbjwVar) throws RemoteException;

    void zzn(zzboi zzboiVar) throws RemoteException;

    void zzo(zzbor zzborVar) throws RemoteException;

    void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzq(zzcs zzcsVar) throws RemoteException;
}
