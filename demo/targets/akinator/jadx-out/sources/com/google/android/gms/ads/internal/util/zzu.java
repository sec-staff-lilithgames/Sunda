package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbeu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzu extends zzt {
    public static final boolean zze(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzd(Activity activity, Configuration configuration) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfE)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfG)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        int iZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, configuration.screenHeightDp);
        int iZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics displayMetricsZzx = zzs.zzx(windowManager);
        int i10 = displayMetricsZzx.heightPixels;
        int i11 = displayMetricsZzx.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfC)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        return (zze(i10, iZzC + dimensionPixelSize, iIntValue) && zze(i11, iZzC2, iIntValue)) ? false : true;
    }
}
