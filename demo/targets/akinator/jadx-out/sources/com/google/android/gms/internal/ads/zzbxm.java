package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbxm {
    private int zzA;
    private final String zzB;
    private boolean zzC;
    private int zza;
    private boolean zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private double zzm;
    private boolean zzn;
    private String zzo;
    private String zzp;
    private final boolean zzq;
    private final boolean zzr;
    private final String zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final String zzw;
    private final String zzx;
    private float zzy;
    private int zzz;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzbxm(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            com.google.android.gms.internal.ads.zzbeu.zza(r8)
            r7.zzb(r8)
            r7.zzc(r8)
            r7.zzd(r8)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = zze(r0, r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L23
            r2 = r4
            goto L24
        L23:
            r2 = r3
        L24:
            r7.zzq = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = zze(r0, r2)
            if (r2 == 0) goto L30
            r2 = r4
            goto L31
        L30:
            r2 = r3
        L31:
            r7.zzr = r2
            java.lang.String r2 = r1.getCountry()
            r7.zzs = r2
            com.google.android.gms.ads.internal.zzt.zzc()
            com.google.android.gms.ads.internal.client.zzbb.zza()
            boolean r2 = com.google.android.gms.ads.internal.util.client.zzf.zzw()
            r7.zzt = r2
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.isLatchsky(r8)
            r7.zzu = r2
            boolean r2 = com.google.android.gms.common.util.DeviceProperties.isSidewinder(r8)
            r7.zzv = r2
            java.lang.String r1 = r1.getLanguage()
            r7.zzw = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = zze(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L64
        L62:
            r0 = r2
            goto L9d
        L64:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L69
            goto L62
        L69:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.lang.String r6 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            android.content.pm.PackageInfo r3 = r5.getPackageInfo(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            if (r3 == 0) goto L62
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.lang.String r0 = r0.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            int r5 = r5.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            int r5 = r5 + r4
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            int r6 = r6.length()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            r6.<init>(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            r6.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            r6.append(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            r6.append(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
            java.lang.String r0 = r6.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62
        L9d:
            r7.zzx = r0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r8)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r3 = "com.android.vending"
            r5 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r5)     // Catch: java.lang.Exception -> Ld5
            if (r0 == 0) goto Ld5
            int r3 = r0.versionCode     // Catch: java.lang.Exception -> Ld5
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> Ld5
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> Ld5
            int r5 = r5.length()     // Catch: java.lang.Exception -> Ld5
            int r5 = r5 + r4
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> Ld5
            int r4 = r4.length()     // Catch: java.lang.Exception -> Ld5
            int r5 = r5 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r4.<init>(r5)     // Catch: java.lang.Exception -> Ld5
            r4.append(r3)     // Catch: java.lang.Exception -> Ld5
            r4.append(r1)     // Catch: java.lang.Exception -> Ld5
            r4.append(r0)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Ld5
        Ld5:
            r7.zzB = r2
            android.content.res.Resources r8 = r8.getResources()
            if (r8 != 0) goto Lde
            goto Lf0
        Lde:
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            if (r8 == 0) goto Lf0
            float r0 = r8.density
            r7.zzy = r0
            int r0 = r8.widthPixels
            r7.zzz = r0
            int r8 = r8.heightPixels
            r7.zzA = r8
        Lf0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxm.<init>(android.content.Context):void");
    }

    private final void zzb(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.zza = audioManager.getMode();
                this.zzb = audioManager.isMusicActive();
                this.zzc = audioManager.isSpeakerphoneOn();
                this.zzd = audioManager.getStreamVolume(3);
                this.zze = audioManager.getRingerMode();
                this.zzf = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.zza = -2;
        this.zzb = false;
        this.zzc = false;
        this.zzd = 0;
        this.zze = 2;
        this.zzf = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzc(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.zzg = r2
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.zzbel r2 = com.google.android.gms.internal.ads.zzbeu.zzjy
            com.google.android.gms.internal.ads.zzbes r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r4.zzd(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = r3
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.zzi = r2
            int r0 = r0.getPhoneType()
            r5.zzj = r0
            r0 = -2
            r5.zzh = r0
            r5.zzk = r3
            r0 = -1
            r5.zzl = r0
            com.google.android.gms.ads.internal.zzt.zzc()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.zzs.zzE(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.zzh = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.zzl = r6
            goto L69
        L67:
            r5.zzh = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.zzk = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxm.zzc(android.content.Context):void");
    }

    private final void zzd(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlZ)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver == null) {
            this.zzm = -1.0d;
            this.zzn = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            this.zzm = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.zzn = intExtra == 2 || intExtra == 5;
        }
    }

    private static ResolveInfo zze(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), C.DEFAULT_BUFFER_SEGMENT_SIZE);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final zzbxn zza() {
        return new zzbxn(this.zza, this.zzq, this.zzr, this.zzg, this.zzs, this.zzt, this.zzu, this.zzv, this.zzb, this.zzc, this.zzw, this.zzx, this.zzB, this.zzd, this.zzh, this.zzi, this.zzj, this.zze, this.zzf, this.zzy, this.zzz, this.zzA, this.zzm, this.zzn, this.zzk, this.zzl, this.zzo, this.zzC, this.zzp);
    }

    public zzbxm(Context context, zzbxn zzbxnVar) {
        zzbeu.zza(context);
        zzb(context);
        zzc(context);
        zzd(context);
        this.zzo = Build.FINGERPRINT;
        this.zzp = Build.DEVICE;
        this.zzC = zzbfv.zza(context);
        this.zzq = zzbxnVar.zza;
        this.zzr = zzbxnVar.zzb;
        this.zzs = zzbxnVar.zzc;
        this.zzt = zzbxnVar.zzd;
        this.zzu = zzbxnVar.zze;
        this.zzv = zzbxnVar.zzf;
        this.zzw = zzbxnVar.zzg;
        this.zzx = zzbxnVar.zzh;
        this.zzB = zzbxnVar.zzi;
        this.zzy = zzbxnVar.zzl;
        this.zzz = zzbxnVar.zzm;
        this.zzA = zzbxnVar.zzn;
    }
}
