package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.ironsource.Mf;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdwv {
    private final zzbmx zza;

    public zzdwv(zzbmx zzbmxVar) {
        this.zza = zzbmxVar;
    }

    private final void zzs(zzdwu zzdwuVar) throws JSONException, RemoteException {
        String strZza = zzdwuVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdwu(MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j10) throws RemoteException {
        zzdwu zzdwuVar = new zzdwu("creation", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("nativeObjectCreated");
        zzs(zzdwuVar);
    }

    public final void zzc(long j10) throws RemoteException {
        zzdwu zzdwuVar = new zzdwu("creation", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("nativeObjectNotCreated");
        zzs(zzdwuVar);
    }

    public final void zzd(long j10) throws RemoteException {
        zzdwu zzdwuVar = new zzdwu("interstitial", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdwuVar);
    }

    public final void zze(long j10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("interstitial", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("onAdLoaded");
        zzs(zzdwuVar);
    }

    public final void zzf(long j10, int i10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("interstitial", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("onAdFailedToLoad");
        zzdwuVar.zzd(Integer.valueOf(i10));
        zzs(zzdwuVar);
    }

    public final void zzg(long j10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("interstitial", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc(Mf.f34995c);
        zzs(zzdwuVar);
    }

    public final void zzh(long j10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("interstitial", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc(Mf.f34998f);
        this.zza.zzb(zzdwuVar.zza());
    }

    public final void zzi(long j10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("interstitial", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc(Mf.f34999g);
        zzs(zzdwuVar);
    }

    public final void zzj(long j10) throws RemoteException {
        zzdwu zzdwuVar = new zzdwu("rewarded", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdwuVar);
    }

    public final void zzk(long j10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("rewarded", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("onRewardedAdLoaded");
        zzs(zzdwuVar);
    }

    public final void zzl(long j10, int i10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("rewarded", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("onRewardedAdFailedToLoad");
        zzdwuVar.zzd(Integer.valueOf(i10));
        zzs(zzdwuVar);
    }

    public final void zzm(long j10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("rewarded", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("onRewardedAdOpened");
        zzs(zzdwuVar);
    }

    public final void zzn(long j10, int i10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("rewarded", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("onRewardedAdFailedToShow");
        zzdwuVar.zzd(Integer.valueOf(i10));
        zzs(zzdwuVar);
    }

    public final void zzo(long j10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("rewarded", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("onRewardedAdClosed");
        zzs(zzdwuVar);
    }

    public final void zzp(long j10, zzbyl zzbylVar) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("rewarded", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("onUserEarnedReward");
        zzdwuVar.zze(zzbylVar.zze());
        zzdwuVar.zzf(Integer.valueOf(zzbylVar.zzf()));
        zzs(zzdwuVar);
    }

    public final void zzq(long j10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("rewarded", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc("onAdImpression");
        zzs(zzdwuVar);
    }

    public final void zzr(long j10) throws JSONException, RemoteException {
        zzdwu zzdwuVar = new zzdwu("rewarded", null);
        zzdwuVar.zzb(Long.valueOf(j10));
        zzdwuVar.zzc(Mf.f34998f);
        zzs(zzdwuVar);
    }
}
