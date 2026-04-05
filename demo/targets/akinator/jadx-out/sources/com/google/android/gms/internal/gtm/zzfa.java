package com.google.android.gms.internal.gtm;

import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.stats.WakeLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfa {
    private static Boolean zza;
    private final Handler zzb;
    private final Context zzc;

    public zzfa(Context context) {
        Preconditions.checkNotNull(context);
        this.zzc = context;
        this.zzb = new zzfy();
    }

    public static boolean zzh(Context context) {
        Preconditions.checkNotNull(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    z10 = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zza = Boolean.valueOf(z10);
        return z10;
    }

    public final int zza(Intent intent, int i10, final int i11) {
        try {
            synchronized (zzev.zza) {
                try {
                    WakeLock wakeLock = zzev.zzb;
                    if (wakeLock != null && wakeLock.isHeld()) {
                        wakeLock.release();
                    }
                } finally {
                }
            }
        } catch (SecurityException unused) {
        }
        zzbu zzbuVarZzg = zzbu.zzg(this.zzc);
        final zzeo zzeoVarZzm = zzbuVarZzg.zzm();
        if (intent == null) {
            zzeoVarZzm.zzQ("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzbuVarZzg.zzj();
        zzeoVarZzm.zzP("Local AnalyticsService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            zzg(new Runnable() { // from class: com.google.android.gms.internal.gtm.zzew
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc(i11, zzeoVarZzm);
                }
            });
        }
        return 2;
    }

    public final /* synthetic */ void zzc(int i10, zzeo zzeoVar) {
        if (((zzez) this.zzc).callServiceStopSelfResult(i10)) {
            zzeoVar.zzN("Local AnalyticsService processed last dispatch request");
        }
    }

    public final /* synthetic */ void zzd(zzeo zzeoVar, JobParameters jobParameters) {
        zzeoVar.zzN("AnalyticsJobService processed last dispatch request");
        ((zzez) this.zzc).zza(jobParameters, false);
    }

    public final void zze() {
        zzbu zzbuVarZzg = zzbu.zzg(this.zzc);
        zzeo zzeoVarZzm = zzbuVarZzg.zzm();
        zzbuVarZzg.zzj();
        zzeoVarZzm.zzN("Local AnalyticsService is starting up");
    }

    public final void zzf() {
        zzbu zzbuVarZzg = zzbu.zzg(this.zzc);
        zzeo zzeoVarZzm = zzbuVarZzg.zzm();
        zzbuVarZzg.zzj();
        zzeoVarZzm.zzN("Local AnalyticsService is shutting down");
    }

    public final void zzg(Runnable runnable) {
        zzbu.zzg(this.zzc).zzf().zze(new zzey(this, runnable));
    }

    public final boolean zzi(final JobParameters jobParameters) {
        zzbu zzbuVarZzg = zzbu.zzg(this.zzc);
        final zzeo zzeoVarZzm = zzbuVarZzg.zzm();
        String string = jobParameters.getExtras().getString("action");
        zzbuVarZzg.zzj();
        zzeoVarZzm.zzO("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        zzg(new Runnable() { // from class: com.google.android.gms.internal.gtm.zzex
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(zzeoVarZzm, jobParameters);
            }
        });
        return true;
    }
}
