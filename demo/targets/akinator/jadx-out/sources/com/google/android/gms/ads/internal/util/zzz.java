package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbdt;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzcgy;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzegj;
import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzz {
    public /* synthetic */ zzz(byte[] bArr) {
    }

    public CookieManager zza(Context context) {
        throw null;
    }

    public zzchj zzb(zzcgy zzcgyVar, zzbdt zzbdtVar, boolean z10, zzegj zzegjVar) {
        throw null;
    }

    public WebResourceResponse zzc(String str, String str2, int i10, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public boolean zzd(Activity activity, Configuration configuration) {
        return false;
    }

    public zzbdz.zzq zzf(Context context, TelephonyManager telephonyManager) {
        return zzbdz.zzq.zzc;
    }

    public boolean zzh(Context context, String str) {
        return false;
    }

    public Intent zzi(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int zzk(AudioManager audioManager) {
        return 0;
    }

    public int zzm(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void zzj(Activity activity) {
    }

    public void zzg(Context context, String str, String str2) {
    }
}
