package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C3191e4;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbex {
    private final String zza = (String) zzbgo.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbex(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put(ApsMetricsDataMap.APSMETRICS_FIELD_SDK, "gmob_sdk");
        linkedHashMap.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put(C3191e4.h.G, com.google.android.gms.ads.internal.util.zzs.zzv());
        linkedHashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzI(context) ? "0" : "1");
        Future futureZza = com.google.android.gms.ads.internal.zzt.zzp().zza(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbxn) futureZza.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbxn) futureZza.get()).zzk));
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmq)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzt.zzc();
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzs.zzF(context) ? "0" : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzku)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcI)).booleanValue() || zzgmu.zzc(com.google.android.gms.ads.internal.zzt.zzh().zzu())) {
                return;
            }
            this.zzb.put(Q6.L, com.google.android.gms.ads.internal.zzt.zzh().zzu());
        }
    }

    public final String zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final Map zzd() {
        return this.zzb;
    }
}
