package com.google.android.gms.ads.appopen;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AppOpenAdPreloader {
    private AppOpenAdPreloader() {
    }

    public static boolean destroy(String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzf(str);
    }

    public static void destroyAll() {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza != null) {
            zzeoVarZza.zzg();
        }
    }

    public static PreloadConfiguration getConfiguration(String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return null;
        }
        return zzeoVarZza.zzi(str);
    }

    public static Map<String, PreloadConfiguration> getConfigurations() {
        zzeo zzeoVarZza = zza();
        return zzeoVarZza == null ? new HashMap() : zzeoVarZza.zzh();
    }

    public static int getNumAdsAvailable(String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return 0;
        }
        return zzeoVarZza.zze(str);
    }

    public static boolean isAdAvailable(String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzd(str);
    }

    public static AppOpenAd pollAd(String str) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return null;
        }
        return zzeoVarZza.zza(str);
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzc(str, preloadConfiguration);
    }

    private static zzeo zza() {
        zzeo zzeoVar = (zzeo) zzex.zzb().zza(AdFormat.APP_OPEN_AD);
        if (zzeoVar == null) {
            zzo.zzi("Failed to get a preloader. Call MobileAds.initialize() prior to calling preload APIs.");
        }
        return zzeoVar;
    }

    public static boolean start(String str, PreloadConfiguration preloadConfiguration, PreloadCallbackV2 preloadCallbackV2) {
        zzeo zzeoVarZza = zza();
        if (zzeoVarZza == null) {
            return false;
        }
        return zzeoVarZza.zzb(str, preloadConfiguration, preloadCallbackV2);
    }
}
