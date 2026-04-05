package com.google.android.gms.internal.gtm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcx extends zzbr {
    private boolean zza;
    private boolean zzb;
    private final AlarmManager zzc;
    private Integer zzd;

    public zzcx(zzbu zzbuVar) {
        super(zzbuVar);
        this.zzc = (AlarmManager) zzo().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private final int zzf() {
        if (this.zzd == null) {
            this.zzd = Integer.valueOf(DTBMetricsConfiguration.ANALYTICS_KEY_NAME.concat(String.valueOf(zzo().getPackageName())).hashCode());
        }
        return this.zzd.intValue();
    }

    private final PendingIntent zzg() {
        Context contextZzo = zzo();
        return PendingIntent.getBroadcast(contextZzo, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(contextZzo, "com.google.android.gms.analytics.AnalyticsReceiver")), zzfs.zza);
    }

    public final void zza() {
        this.zzb = false;
        try {
            this.zzc.cancel(zzg());
        } catch (NullPointerException unused) {
        }
        JobScheduler jobScheduler = (JobScheduler) zzo().getSystemService("jobscheduler");
        int iZzf = zzf();
        zzO("Cancelling job. JobID", Integer.valueOf(iZzf));
        jobScheduler.cancel(iZzf);
    }

    public final void zzb() {
        zzV();
        Preconditions.checkState(this.zza, "Receiver not registered");
        zzw();
        long jZzd = zzcs.zzd();
        if (jZzd > 0) {
            zza();
            zzC().elapsedRealtime();
            this.zzb = true;
            ((Boolean) zzeh.zzF.zzb()).getClass();
            zzN("Scheduling upload with JobScheduler");
            Context contextZzo = zzo();
            ComponentName componentName = new ComponentName(contextZzo, "com.google.android.gms.analytics.AnalyticsJobService");
            int iZzf = zzf();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            JobInfo jobInfoBuild = new JobInfo.Builder(iZzf, componentName).setMinimumLatency(jZzd).setOverrideDeadline(jZzd + jZzd).setExtras(persistableBundle).build();
            zzO("Scheduling job. JobID", Integer.valueOf(iZzf));
            zzft.zza(contextZzo, jobInfoBuild, "com.google.android.gms", "DispatchAlarm");
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() throws PackageManager.NameNotFoundException {
        try {
            zza();
            zzw();
            if (zzcs.zzd() > 0) {
                Context contextZzo = zzo();
                ActivityInfo receiverInfo = contextZzo.getPackageManager().getReceiverInfo(new ComponentName(contextZzo, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo == null || !receiverInfo.enabled) {
                    return;
                }
                zzN("Receiver registered for local dispatch.");
                this.zza = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final boolean zze() {
        return this.zzb;
    }
}
