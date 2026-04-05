package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    public /* synthetic */ zzp(zzn zznVar, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzo zzoVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    public static /* bridge */ /* synthetic */ zzcj zza(zzp zzpVar) throws zzg, PackageManager.NameNotFoundException {
        Bundle bundle;
        List list;
        List list2;
        PackageInfo packageInfo;
        zzcj zzcjVar = new zzcj();
        String strZza = zzpVar.zzd.zza();
        if (TextUtils.isEmpty(strZza)) {
            try {
                zzn zznVar = zzpVar.zza;
                bundle = zznVar.zza.getPackageManager().getApplicationInfo(zznVar.zza.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                strZza = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(strZza)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzcjVar.zza = strZza;
        ConsentDebugSettings consentDebugSettings = zzpVar.zzc;
        if (consentDebugSettings.isTestDevice()) {
            ArrayList arrayList = new ArrayList();
            int debugGeography = consentDebugSettings.getDebugGeography();
            if (debugGeography == 1) {
                arrayList.add(zzce.GEO_OVERRIDE_EEA);
            } else if (debugGeography == 2) {
                arrayList.add(zzce.GEO_OVERRIDE_NON_EEA);
            } else if (debugGeography == 3) {
                arrayList.add(zzce.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (debugGeography == 4) {
                arrayList.add(zzce.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(zzce.PREVIEWING_DEBUG_MESSAGES);
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        zzcjVar.zzi = list;
        zzn zznVar2 = zzpVar.zza;
        zzcjVar.zze = zznVar2.zzb.zzc();
        zzcjVar.zzd = Boolean.valueOf(zzpVar.zzd.isTagForUnderAgeOfConsent());
        zzcjVar.zzc = Locale.getDefault().toLanguageTag();
        zzcf zzcfVar = new zzcf();
        int i10 = Build.VERSION.SDK_INT;
        zzcfVar.zzb = Integer.valueOf(i10);
        zzcfVar.zza = Build.MODEL;
        zzcfVar.zzc = 2;
        zzcjVar.zzb = zzcfVar;
        Configuration configuration = zznVar2.zza.getResources().getConfiguration();
        zznVar2.zza.getResources().getConfiguration();
        zzch zzchVar = new zzch();
        zzchVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzchVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzchVar.zzc = Double.valueOf(zznVar2.zza.getResources().getDisplayMetrics().density);
        if (i10 < 28) {
            list2 = Collections.EMPTY_LIST;
        } else {
            Activity activity = zzpVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list2 = Collections.EMPTY_LIST;
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzcg zzcgVar = new zzcg();
                        zzcgVar.zzb = Integer.valueOf(rect.left);
                        zzcgVar.zzc = Integer.valueOf(rect.right);
                        zzcgVar.zza = Integer.valueOf(rect.top);
                        zzcgVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzcgVar);
                    }
                }
                list2 = arrayList2;
            }
        }
        zzchVar.zzd = list2;
        zzcjVar.zzf = zzchVar;
        Application application = zznVar2.zza;
        try {
            packageInfo = zznVar2.zza.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcd zzcdVar = new zzcd();
        zzcdVar.zza = application.getPackageName();
        zzn zznVar3 = zzpVar.zza;
        CharSequence applicationLabel = zznVar3.zza.getPackageManager().getApplicationLabel(zznVar3.zza.getApplicationInfo());
        zzcdVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzcdVar.zzc = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzcjVar.zzg = zzcdVar;
        zzci zzciVar = new zzci();
        zzciVar.zza = "3.2.0";
        zzcjVar.zzh = zzciVar;
        return zzcjVar;
    }
}
