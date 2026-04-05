package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbos extends AdManagerInterstitialAd {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final com.google.android.gms.ads.internal.client.zzbx zzc;
    private final AtomicReference zzd;
    private final zzbrf zze;
    private final long zzf;
    private AppEventListener zzg;
    private FullScreenContentCallback zzh;
    private OnPaidEventListener zzi;
    private final AtomicLong zzj;

    public zzbos(Context context, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        this.zze = new zzbrf();
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference();
        this.zzb = com.google.android.gms.ads.internal.client.zzq.zza;
        this.zzc = zzbxVar;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        String strZzu;
        String str;
        AtomicReference atomicReference = this.zzd;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzu = this.zzc.zzu();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                strZzu = null;
            }
            if (strZzu == null) {
                this.zzd.set("");
            } else {
                this.zzd.set(strZzu);
            }
            str = (String) this.zzd.get();
        }
        return str;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzh;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final long getPlacementId() {
        AtomicLong atomicLong = this.zzj;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
                    if (zzbxVar != null) {
                        long jZzU = zzbxVar.zzU();
                        AtomicLong atomicLong2 = this.zzj;
                        atomicLong2.set(jZzU);
                        return atomicLong2.get();
                    }
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                }
                return 0L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzt = null;
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzeaVarZzt = zzbxVar.zzt();
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzc(zzeaVarZzt);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.zzg = appEventListener;
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzbxVar.zzi(appEventListener != null ? new zzbbj(appEventListener) : null);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.zzh = fullScreenContentCallback;
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzbxVar.zzS(new com.google.android.gms.ads.internal.client.zzbe(fullScreenContentCallback));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z10) {
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzbxVar.zzK(z10);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzi = onPaidEventListener;
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzbxVar.zzP(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setPlacementId(long j10) {
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzbxVar.zzT(j10);
                this.zzj.set(j10);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzbxVar.zzR(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzek zzekVar, AdLoadCallback adLoadCallback) {
        try {
            com.google.android.gms.ads.internal.client.zzbx zzbxVar = this.zzc;
            if (zzbxVar != null) {
                zzekVar.zzp(this.zzf);
                zzbxVar.zzQ(this.zzb.zza(this.zza, zzekVar), new com.google.android.gms.ads.internal.client.zzh(adLoadCallback, this));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }

    public zzbos(Context context, String str) {
        zzbrf zzbrfVar = new zzbrf();
        this.zze = zzbrfVar;
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = com.google.android.gms.ads.internal.client.zzq.zza;
        this.zzc = com.google.android.gms.ads.internal.client.zzbb.zzb().zzb(context, new com.google.android.gms.ads.internal.client.zzr(), str, zzbrfVar);
    }

    public zzbos(Context context, String str, com.google.android.gms.ads.internal.client.zzbx zzbxVar) {
        com.google.android.gms.ads.internal.client.zzq zzqVar = com.google.android.gms.ads.internal.client.zzq.zza;
        this.zze = new zzbrf();
        this.zzf = System.currentTimeMillis();
        this.zzj = new AtomicLong();
        this.zza = context;
        this.zzd = new AtomicReference(str);
        this.zzb = zzqVar;
        this.zzc = zzbxVar;
    }
}
