package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgey implements zzftm {
    private final Context zza;
    private final zzghy zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    public zzgey(Context context, zzfxt zzfxtVar, zzghy zzghyVar) {
        this.zza = context;
        this.zzc = zzfxtVar.zzb();
        this.zzd = zzfxtVar.zzj();
        this.zze = zzfxtVar.zzk();
        this.zzb = zzghyVar;
    }

    public final void zza(Map map) {
        n1 n1Var;
        zzauz zzauzVar;
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, this.zzc);
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, new Throwable());
        try {
            n1Var = (n1) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strZzb = (n1Var == null || (Build.VERSION.SDK_INT >= 31 && !n1Var.isDone()) || (zzauzVar = (zzauz) n1Var.get(this.zzd, TimeUnit.MILLISECONDS)) == null || zzauzVar.zzb().length() <= 1) ? "E" : zzauzVar.zzb();
        if (strZzb.equals("E")) {
            try {
                n1 n1Var2 = (n1) map.get("ai");
                if (n1Var2 != null) {
                    String str = (String) n1Var2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgmu.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final Map zzb() {
        Map mapZzb = this.zzb.zzb();
        zza(mapZzb);
        return mapZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final Map zzc() {
        Map mapZzc = this.zzb.zzc(this.zza, null);
        zza(mapZzc);
        return mapZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final Map zzd() {
        Map mapZzd = this.zzb.zzd();
        zza(mapZzd);
        return mapZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final Map zze() {
        HashMap map = new HashMap();
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, new Throwable());
        return map;
    }
}
