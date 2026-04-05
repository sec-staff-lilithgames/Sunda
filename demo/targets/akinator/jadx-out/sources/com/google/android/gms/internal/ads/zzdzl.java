package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.ironsource.mediationsdk.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdzl extends com.google.android.gms.ads.internal.client.zzdv {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzdyz zzd;
    private final zzgus zze;
    private zzdyo zzf;

    public zzdzl(Context context, WeakReference weakReference, zzdyz zzdyzVar, zzdzn zzdznVar, zzgus zzgusVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdyzVar;
        this.zze = zzgusVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzgui.zzr(this.zzf.zzn(str), new zzdzg(this), this.zze);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzgui.zzr(this.zzf.zzn(str), new zzdzh(this), this.zze);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzeaVarZzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzeaVarZzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zzb(zzdyo zzdyoVar) {
        this.zzf = zzdyoVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void zzc(zzdzm zzdzmVar) {
        try {
            String strZzb = zzdzmVar.zzb();
            switch (strZzb.hashCode()) {
                case -1999289321:
                    if (strZzb.equals("NATIVE")) {
                        final String strZza = zzdzmVar.zza();
                        AdLoader.Builder builder = new AdLoader.Builder(zzl(), strZza);
                        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdzj
                            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                            public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                                this.zza.zzf(strZza, nativeAd);
                            }
                        });
                        builder.withAdListener(new zzdzf(this));
                        NativeAdOptions nativeAdOptionsZze = zzdzmVar.zze();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkt)).booleanValue() && nativeAdOptionsZze != null) {
                            builder.withNativeAdOptions(nativeAdOptionsZze);
                        }
                        builder.build().loadAd(zzdzmVar.zzc());
                        return;
                    }
                    break;
                case -1372958932:
                    if (strZzb.equals("INTERSTITIAL")) {
                        String strZza2 = zzdzmVar.zza();
                        InterstitialAd.load(zzl(), strZza2, zzdzmVar.zzc(), new zzdzc(this, strZza2));
                        return;
                    }
                    break;
                case -428325382:
                    if (strZzb.equals("APP_OPEN_AD")) {
                        String strZza3 = zzdzmVar.zza();
                        AppOpenAd.load(zzl(), strZza3, zzdzmVar.zzc(), new zzdza(this, strZza3));
                        return;
                    }
                    break;
                case 543046670:
                    if (strZzb.equals("REWARDED")) {
                        String strZza4 = zzdzmVar.zza();
                        RewardedAd.load(zzl(), strZza4, zzdzmVar.zzc(), new zzdzd(this, strZza4));
                        return;
                    }
                    break;
                case 1854800829:
                    if (strZzb.equals("REWARDED_INTERSTITIAL")) {
                        String strZza5 = zzdzmVar.zza();
                        RewardedInterstitialAd.load(zzl(), strZza5, zzdzmVar.zzc(), new zzdze(this, strZza5));
                        return;
                    }
                    break;
                case 1951953708:
                    if (strZzb.equals(l.f37554a)) {
                        String strZza6 = zzdzmVar.zza();
                        zzbel zzbelVar = zzbeu.zzkt;
                        BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() && zzdzmVar.zzg()) ? new AdManagerAdView(zzl()) : new AdView(zzl());
                        adManagerAdView.setAdSize(zzdzmVar.zzd());
                        adManagerAdView.setAdUnitId(strZza6);
                        adManagerAdView.setAdListener(new zzdzb(this, strZza6, adManagerAdView));
                        VideoOptions videoOptionsZzf = zzdzmVar.zzf();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() && zzdzmVar.zzg() && videoOptionsZzf != null) {
                            ((AdManagerAdView) adManagerAdView).setVideoOptions(videoOptionsZzf);
                        }
                        adManagerAdView.loadAd(zzdzmVar.zzc());
                        return;
                    }
                    break;
            }
        } finally {
        }
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        try {
            Activity activityZzo = this.zzd.zzo();
            if (activityZzo != null && (obj = (map = this.zza).get(str)) != null) {
                zzbel zzbelVar = zzbeu.zzks;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                    map.remove(str);
                }
                zzk(zzm(obj));
                if (obj instanceof AppOpenAd) {
                    ((AppOpenAd) obj).show(activityZzo);
                    return;
                }
                if (obj instanceof InterstitialAd) {
                    ((InterstitialAd) obj).show(activityZzo);
                    return;
                }
                if (obj instanceof RewardedAd) {
                    ((RewardedAd) obj).show(activityZzo, zzdzk.zza);
                    return;
                }
                if (obj instanceof RewardedInterstitialAd) {
                    ((RewardedInterstitialAd) obj).show(activityZzo, zzdzi.zza);
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                    Intent intent = new Intent();
                    Context contextZzl = zzl();
                    intent.setClassName(contextZzl, OutOfContextTestingActivity.CLASS_NAME);
                    intent.putExtra("adUnit", str);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzZ(contextZzl, intent);
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdw
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            zzdzn.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzdzn.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    public final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    public final /* synthetic */ zzdyz zzi() {
        return this.zzd;
    }
}
