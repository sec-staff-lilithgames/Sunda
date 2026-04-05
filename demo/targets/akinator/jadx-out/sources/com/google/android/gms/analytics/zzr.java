package com.google.android.gms.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzaz;
import com.google.android.gms.internal.gtm.zzff;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzr {
    private static volatile zzr zza;
    private final Context zzb;
    private final List zzc;
    private final zzn zzd;
    private volatile zzau zze;
    private Thread.UncaughtExceptionHandler zzf;

    public zzr(Context context) {
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zzb = applicationContext;
        this.zzd = new zzn(this);
        this.zzc = new CopyOnWriteArrayList();
        new zzg();
    }

    public static zzr zzb(Context context) {
        Preconditions.checkNotNull(context);
        if (zza == null) {
            synchronized (zzr.class) {
                try {
                    if (zza == null) {
                        zza = new zzr(context);
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    public static void zzh() {
        if (!(Thread.currentThread() instanceof zzp)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Context zza() {
        return this.zzb;
    }

    public final zzau zzc() {
        if (this.zze == null) {
            synchronized (this) {
                try {
                    if (this.zze == null) {
                        zzau zzauVar = new zzau();
                        PackageManager packageManager = this.zzb.getPackageManager();
                        String packageName = this.zzb.getPackageName();
                        zzauVar.zzi(packageName);
                        zzauVar.zzj(packageManager.getInstallerPackageName(packageName));
                        String str = null;
                        try {
                            PackageInfo packageInfo = packageManager.getPackageInfo(this.zzb.getPackageName(), 0);
                            if (packageInfo != null) {
                                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    packageName = applicationLabel.toString();
                                }
                                str = packageInfo.versionName;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            Log.e("GAv4", "Error retrieving package info: appName set to " + packageName);
                        }
                        zzauVar.zzk(packageName);
                        zzauVar.zzl(str);
                        this.zze = zzauVar;
                    }
                } finally {
                }
            }
        }
        return this.zze;
    }

    public final zzaz zzd() {
        DisplayMetrics displayMetrics = this.zzb.getResources().getDisplayMetrics();
        zzaz zzazVar = new zzaz();
        zzazVar.zze(zzff.zzd(Locale.getDefault()));
        zzazVar.zza = displayMetrics.widthPixels;
        zzazVar.zzb = displayMetrics.heightPixels;
        return zzazVar;
    }

    public final Future zzg(Callable callable) {
        Preconditions.checkNotNull(callable);
        if (!(Thread.currentThread() instanceof zzp)) {
            return this.zzd.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    public final void zzi(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        this.zzd.submit(runnable);
    }

    public final void zzj(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzf = uncaughtExceptionHandler;
    }

    public final void zzk(zzh zzhVar) {
        if (zzhVar.zzl()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        }
        if (zzhVar.zzm()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
        zzh zzhVar2 = new zzh(zzhVar);
        zzhVar2.zzi();
        this.zzd.execute(new zzl(this, zzhVar2));
    }
}
