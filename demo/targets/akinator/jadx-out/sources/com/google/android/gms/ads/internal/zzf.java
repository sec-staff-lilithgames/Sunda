package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzbqj;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzdvi;
import com.google.android.gms.internal.ads.zzflc;
import com.google.android.gms.internal.ads.zzflp;
import com.google.android.gms.internal.ads.zzgtq;
import com.google.android.gms.internal.ads.zzgui;
import com.google.android.gms.internal.ads.zzgus;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    public static final /* synthetic */ n1 zzd(Long l9, zzdvi zzdviVar, zzflc zzflcVar, zzflp zzflpVar, JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            zzt.zzh().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l9 != null) {
                zzf(zzdviVar, "cld_s", zzt.zzk().elapsedRealtime() - l9.longValue());
            }
        }
        String strOptString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(strOptString)) {
            zzflcVar.zzk(strOptString);
        }
        zzflcVar.zzd(zOptBoolean);
        zzflpVar.zzb(zzflcVar.zzm());
        return zzgui.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdvi zzdviVar, String str, long j10) {
        if (zzdviVar != null) {
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zznH)).booleanValue()) {
                zzdvh zzdvhVarZza = zzdviVar.zza();
                zzdvhVarZza.zzc("action", "lat_init");
                zzdvhVarZza.zzc(str, Long.toString(j10));
                zzdvhVarZza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzflp zzflpVar, zzdvi zzdviVar, Long l9, boolean z10) throws JSONException {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzflpVar, zzdviVar, l9, z10);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzcbe zzcbeVar, zzflp zzflpVar, boolean z10) throws JSONException {
        zzc(context, versionInfoParcel, false, zzcbeVar, zzcbeVar != null ? zzcbeVar.zze() : null, str, null, zzflpVar, null, null, z10);
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, boolean z10, zzcbe zzcbeVar, String str, String str2, Runnable runnable, final zzflp zzflpVar, final zzdvi zzdviVar, final Long l9, boolean z11) throws JSONException {
        zzflc zzflcVar;
        Exception exc;
        PackageInfo packageInfo;
        if (zzt.zzk().elapsedRealtime() - this.zzb < 5000) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzk().elapsedRealtime();
        if (zzcbeVar != null && !TextUtils.isEmpty(zzcbeVar.zzd())) {
            if (zzt.zzk().currentTimeMillis() - zzcbeVar.zzb() <= ((Long) zzbd.zzc().zzd(zzbeu.zzeJ)).longValue() && zzcbeVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzflc zzflcVarZzn = zzflc.zzn(context, 4);
        zzflcVarZzn.zza();
        zzbqp zzbqpVarZzb = zzt.zzr().zzb(this.zza, versionInfoParcel, zzflpVar);
        zzbqj zzbqjVar = zzbqm.zza;
        zzbqf zzbqfVarZza = zzbqpVarZzb.zza("google.afma.config.fetchAppSettings", zzbqjVar, zzbqjVar);
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z10);
                jSONObject.put("pn", context.getPackageName());
                zzbel zzbelVar = zzbeu.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbd.zzb().zze()));
                jSONObject.put("js", versionInfoParcel.afmaVersion);
                if (((Boolean) zzbd.zzc().zzd(zzbeu.zzkz)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z11);
                }
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                n1 n1VarZzb = zzbqfVarZza.zzb(jSONObject);
                try {
                    zzgtq zzgtqVar = new zzgtq(this) { // from class: com.google.android.gms.ads.internal.zzd
                        @Override // com.google.android.gms.internal.ads.zzgtq
                        public final /* synthetic */ n1 zza(Object obj) {
                            return zzf.zzd(l9, zzdviVar, zzflcVarZzn, zzflpVar, (JSONObject) obj);
                        }
                    };
                    zzflcVar = zzflcVarZzn;
                    try {
                        zzgus zzgusVar = zzcbv.zzg;
                        n1 n1VarZzj = zzgui.zzj(n1VarZzb, zzgtqVar, zzgusVar);
                        if (runnable != null) {
                            n1VarZzb.addListener(runnable, zzgusVar);
                        }
                        if (l9 != null) {
                            n1VarZzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzf.zzf(zzdviVar, "cld_r", zzt.zzk().elapsedRealtime() - l9.longValue());
                                }
                            }, zzgusVar);
                        }
                        if (((Boolean) zzbd.zzc().zzd(zzbeu.zziq)).booleanValue()) {
                            zzcby.zzb(n1VarZzj, "ConfigLoader.maybeFetchNewAppSettings");
                        } else {
                            zzcby.zza(n1VarZzj, "ConfigLoader.maybeFetchNewAppSettings");
                        }
                    } catch (Exception e10) {
                        e = e10;
                        exc = e;
                        int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                        zzflcVar.zzj(exc);
                        zzflcVar.zzd(false);
                        zzflpVar.zzb(zzflcVar.zzm());
                    }
                } catch (Exception e11) {
                    e = e11;
                    zzflcVar = zzflcVarZzn;
                }
            } catch (Exception e12) {
                exc = e12;
                zzflcVar = zzflcVarZzn;
                int i132 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                zzflcVar.zzj(exc);
                zzflcVar.zzd(false);
                zzflpVar.zzb(zzflcVar.zzm());
            }
        } catch (Exception e13) {
            e = e13;
            zzflcVar = zzflcVarZzn;
        }
    }
}
