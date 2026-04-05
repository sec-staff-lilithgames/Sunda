package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbwf implements zzbwh {
    public static zzbwh zza;
    static zzbwh zzb;
    static zzbwh zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final VersionInfoParcel zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;
    private Set zzp;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzbwf(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.zzh = r0
            com.google.android.gms.internal.ads.zzfuy.zza()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.zzn = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r3 = r3.getApplicationContext()
        L2f:
            r2.zzg = r3
            r2.zzj = r4
            com.google.android.gms.internal.ads.zzbel r4 = com.google.android.gms.internal.ads.zzbeu.zziE
            com.google.android.gms.internal.ads.zzbes r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r0.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L50
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 == 0) goto L50
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L52
        L50:
            r3 = r0
            goto L61
        L52:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.getPackageInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L61:
            r2.zzk = r3
            com.google.android.gms.internal.ads.zzbel r3 = com.google.android.gms.internal.ads.zzbeu.zzis
            com.google.android.gms.internal.ads.zzbes r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r4 = r4.zzd(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L82
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L83
        L82:
            r4 = r1
        L83:
            r2.zzl = r4
            com.google.android.gms.internal.ads.zzbes r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb2
            android.content.Context r3 = r2.zzg
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 != 0) goto L9c
            goto Lb3
        L9c:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            if (r3 != 0) goto Lab
            goto Lb3
        Lab:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb3
            goto Lb3
        Lb2:
            r0 = r1
        Lb3:
            r2.zzm = r0
            com.google.android.gms.internal.ads.zzbel r3 = com.google.android.gms.internal.ads.zzbeu.zzio
            com.google.android.gms.internal.ads.zzbes r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 <= 0) goto Lce
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.zzp = r3
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwf.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public static zzbwh zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzj(context)) {
                        zza = new zzbwf(context, VersionInfoParcel.forPackage());
                    } else {
                        zza = new zzbwg();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zza;
    }

    public static zzbwh zzb(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z10 = false;
                    if (((Boolean) zzbgm.zzc.zze()).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzim)).booleanValue() || ((Boolean) zzbgm.zza.zze()).booleanValue()) {
                            z10 = true;
                        }
                    }
                    if (zzj(context)) {
                        zzbwf zzbwfVar = new zzbwf(context, versionInfoParcel);
                        zzbwfVar.zzl();
                        zzbwfVar.zzk();
                        zzc = zzbwfVar;
                    } else if (!z10 || context == null) {
                        zzc = new zzbwg();
                    } else {
                        zzbwf zzbwfVar2 = new zzbwf(context, versionInfoParcel, true);
                        zzbwfVar2.zzl();
                        zzbwfVar2.zzk();
                        zzc = zzbwfVar2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0039, B:14:0x0040), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbwh zzc(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbwf.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbwh r1 = com.google.android.gms.internal.ads.zzbwf.zzb     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L40
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzin     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzim     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            com.google.android.gms.internal.ads.zzbwf r1 = new com.google.android.gms.internal.ads.zzbwf     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbwf.zzb = r1     // Catch: java.lang.Throwable -> L37
            goto L40
        L37:
            r3 = move-exception
            goto L44
        L39:
            com.google.android.gms.internal.ads.zzbwg r3 = new com.google.android.gms.internal.ads.zzbwg     // Catch: java.lang.Throwable -> L37
            r3.<init>()     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbwf.zzb = r3     // Catch: java.lang.Throwable -> L37
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.zzbwh r3 = com.google.android.gms.internal.ads.zzbwf.zzb
            return r3
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwf.zzc(android.content.Context):com.google.android.gms.internal.ads.zzbwh");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbwh zzd(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbwf.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbwh r1 = com.google.android.gms.internal.ads.zzbwf.zzb     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L3c
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzin     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzim     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbes r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L35
            com.google.android.gms.internal.ads.zzbwf r1 = new com.google.android.gms.internal.ads.zzbwf     // Catch: java.lang.Throwable -> L33
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbwf.zzb = r1     // Catch: java.lang.Throwable -> L33
            goto L3c
        L33:
            r3 = move-exception
            goto L40
        L35:
            com.google.android.gms.internal.ads.zzbwg r3 = new com.google.android.gms.internal.ads.zzbwg     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbwf.zzb = r3     // Catch: java.lang.Throwable -> L33
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzbwh r3 = com.google.android.gms.internal.ads.zzbwf.zzb
            return r3
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwf.zzd(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):com.google.android.gms.internal.ads.zzbwh");
    }

    public static String zze(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th2) {
        return zzgmu.zza(com.google.android.gms.ads.internal.util.client.zzf.zzg(zze(th2)));
    }

    private static boolean zzj(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    zzd = Boolean.valueOf(com.google.android.gms.ads.internal.client.zzbb.zze().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznK)).intValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzim)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private final void zzk() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbwc(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzl() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbwd(this, thread.getUncaughtExceptionHandler()));
    }

    public final void zzg(Thread thread, Throwable th2) {
        if (th2 != null) {
            boolean zZzo = false;
            boolean zEquals = false;
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzo |= com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName());
                    zEquals |= zzbwf.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzio)).intValue();
            if (iIntValue > 0) {
                if (this.zzp.size() >= iIntValue) {
                    return;
                }
                String strZzf = zzf(th2);
                if (this.zzp.contains(strZzf)) {
                    return;
                } else {
                    this.zzp.add(strZzf);
                }
            }
            if (!zZzo || zEquals) {
                return;
            }
            if (!this.zzo) {
                zzh(th2, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbgm.zzc.zze()).booleanValue()) {
                return;
            }
            zzbef.zzb(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzh(Throwable th2, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th2, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzi(Throwable th2, String str, float f10) {
        Throwable th3;
        String packageName;
        PackageInfo packageInfo;
        ActivityManager.MemoryInfo memoryInfoZze;
        if (this.zzo) {
            return;
        }
        Handler handler = com.google.android.gms.ads.internal.util.client.zzf.zza;
        boolean zIsCallerInstantApp = false;
        if (((Boolean) zzbhd.zze.zze()).booleanValue()) {
            th3 = th2;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th3 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z10 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcH)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.zzo(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z10 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z10) {
                    th3 = th3 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th3);
                    th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th3 != null) {
            String name = th2.getClass().getName();
            String strZze = zze(th2);
            String strZzf = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjI)).booleanValue() ? zzf(th2) : "";
            double d10 = f10;
            double dRandom = Math.random();
            int i10 = f10 > 0.0f ? (int) (1.0f / f10) : 1;
            if (dRandom < d10) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zIsCallerInstantApp = Wrappers.packageManager(this.zzg).isCallerInstantApp();
                } catch (Throwable th5) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error fetching instant app info", th5);
                }
                try {
                    packageName = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zIsCallerInstantApp)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i11 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i11));
                String str2 = Build.MANUFACTURER;
                String strO = Build.MODEL;
                if (!strO.startsWith(str2)) {
                    strO = a.b.o(new StringBuilder(String.valueOf(str2).length() + 1 + strO.length()), str2, " ", strO);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter(C3191e4.h.G, strO);
                VersionInfoParcel versionInfoParcel = this.zzj;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZze).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbd.zzb().zze())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "811902923").appendQueryParameter(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "dev").appendQueryParameter(DTBMetricsConfiguration.SAMPLING_RATE_ANALYTICS_KEY_NAME, Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(zzbhd.zzc.zze()));
                Context context = this.zzg;
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(strZzf)) {
                    builderAppendQueryParameter5.appendQueryParameter("hash", strZzf);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzit)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                    builderAppendQueryParameter5.appendQueryParameter("available_memory", Long.toString(memoryInfoZze.availMem));
                    builderAppendQueryParameter5.appendQueryParameter("total_memory", Long.toString(memoryInfoZze.totalMem));
                    builderAppendQueryParameter5.appendQueryParameter("is_low_memory", true != memoryInfoZze.lowMemory ? "0" : "1");
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzis)).booleanValue()) {
                    String str3 = this.zzl;
                    if (!TextUtils.isEmpty(str3)) {
                        builderAppendQueryParameter5.appendQueryParameter("countrycode", str3);
                    }
                    String str4 = this.zzm;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter5.appendQueryParameter("psv", str4);
                    }
                    if (i11 >= 26) {
                        packageInfo = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = Wrappers.packageManager(context).getPackageInfo("com.android.webview", 128);
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                    if (packageInfo != null) {
                        builderAppendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(packageInfo.versionCode));
                        builderAppendQueryParameter5.appendQueryParameter("wvvn", packageInfo.versionName);
                        builderAppendQueryParameter5.appendQueryParameter("wvpn", packageInfo.packageName);
                    }
                }
                PackageInfo packageInfo2 = this.zzk;
                if (packageInfo2 != null) {
                    builderAppendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo2.versionCode));
                    builderAppendQueryParameter5.appendQueryParameter("appvn", packageInfo2.versionName);
                }
                arrayList2.add(builderAppendQueryParameter5.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    final String str5 = (String) it.next();
                    final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(this.zzg, null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwe
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzuVar.zzc(str5, null);
                        }
                    });
                }
            }
        }
    }

    public zzbwf(Context context, VersionInfoParcel versionInfoParcel, boolean z10) {
        this(context, versionInfoParcel);
        this.zzo = true;
    }
}
