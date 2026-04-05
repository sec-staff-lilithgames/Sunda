package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zznt {
    private final Context zza;

    public zznt(Context context) {
        Preconditions.checkNotNull(context);
        this.zza = context;
    }

    public static final void zzi(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public static final boolean zzj(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    private final void zzk(zzpg zzpgVar, Runnable runnable) throws IllegalStateException {
        zzpgVar.zzaW().zzj(new zzno(this, zzpgVar, runnable));
    }

    public final void zza() {
        Log.v("FA", this.zza.getClass().getSimpleName().concat(" is starting up."));
    }

    public final void zzb() {
        Log.v("FA", this.zza.getClass().getSimpleName().concat(" is shutting down."));
    }

    public final int zzc(final Intent intent, int i10, final int i11) throws IllegalStateException {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.zza;
        zzic zzicVarZzy = zzic.zzy(context, null, null);
        final zzgu zzguVarZzaV = zzicVarZzy.zzaV();
        String action = intent.getAction();
        zzicVarZzy.zzaU();
        zzguVarZzaV.zzk().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzk(zzpg.zza(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzns
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(i11, zzguVarZzaV, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder zzd(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzjd(zzpg.zza(this.zza), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    public final boolean zze(final JobParameters jobParameters) throws IllegalStateException {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) Preconditions.checkNotNull(string);
            zzpg zzpgVarZza = zzpg.zza(this.zza);
            final zzgu zzguVarZzaV = zzpgVarZza.zzaV();
            zzpgVarZza.zzaU();
            zzguVarZzaV.zzk().zzb("Local AppMeasurementJobService called. action", str);
            zzk(zzpgVarZza, new Runnable() { // from class: com.google.android.gms.measurement.internal.zznq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(zzguVarZzaV, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        com.google.android.gms.internal.measurement.zzfb.zza(this.zza, null).zzw(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh(jobParameters);
            }
        });
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzf(int i10, zzgu zzguVar, Intent intent) {
        Context context = this.zza;
        zznp zznpVar = (zznp) context;
        if (zznpVar.zza(i10)) {
            zzguVar.zzk().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            zzic.zzy(context, null, null).zzaV().zzk().zza("Completed wakeful intent.");
            zznpVar.zzc(intent);
        }
    }

    public final /* synthetic */ void zzg(zzgu zzguVar, JobParameters jobParameters) {
        zzguVar.zzk().zza("AppMeasurementJobService processed last upload request.");
        ((zznp) this.zza).zzb(jobParameters, false);
    }

    public final /* synthetic */ void zzh(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((zznp) this.zza).zzb(jobParameters, false);
    }
}
