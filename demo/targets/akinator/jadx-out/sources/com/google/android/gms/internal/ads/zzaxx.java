package com.google.android.gms.internal.ads;

import android.view.View;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaxx implements zzftm {
    private final zzfru zza;
    private final zzfsi zzb;
    private final zzayk zzc;
    private final zzaxw zzd;
    private final zzaxg zze;
    private final zzaym zzf;
    private final zzaye zzg;
    private final zzaxv zzh;

    public zzaxx(zzfru zzfruVar, zzfsi zzfsiVar, zzayk zzaykVar, zzaxw zzaxwVar, zzaxg zzaxgVar, zzaym zzaymVar, zzaye zzayeVar, zzaxv zzaxvVar) {
        this.zza = zzfruVar;
        this.zzb = zzfsiVar;
        this.zzc = zzaykVar;
        this.zzd = zzaxwVar;
        this.zze = zzaxgVar;
        this.zzf = zzaymVar;
        this.zzg = zzayeVar;
        this.zzh = zzaxvVar;
    }

    private final Map zzf() {
        HashMap map = new HashMap();
        zzfru zzfruVar = this.zza;
        zzauz zzauzVarZzb = this.zzb.zzb();
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, zzfruVar.zza());
        map.put("gms", Boolean.valueOf(zzfruVar.zzc()));
        map.put("gv", Long.valueOf(zzauzVarZzb.zzd()));
        map.put("int", zzauzVarZzb.zzb());
        map.put("attts", Long.valueOf(zzauzVarZzb.zzh().zzb()));
        map.put("att", zzauzVarZzb.zzh().zzd());
        map.put("attkid", zzauzVarZzb.zzh().zzc());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, new Throwable());
        zzaye zzayeVar = this.zzg;
        if (zzayeVar != null) {
            map.put("tcq", Long.valueOf(zzayeVar.zze()));
            map.put("tpq", Long.valueOf(zzayeVar.zzd()));
            map.put("tcv", Long.valueOf(zzayeVar.zzf()));
            map.put("tpv", Long.valueOf(zzayeVar.zzg()));
            map.put("tchv", Long.valueOf(zzayeVar.zzi()));
            map.put("tphv", Long.valueOf(zzayeVar.zzh()));
            map.put("tcc", Long.valueOf(zzayeVar.zzj()));
            map.put("tpc", Long.valueOf(zzayeVar.zzk()));
            zzaxg zzaxgVar = this.zze;
            if (zzaxgVar != null) {
                map.put("nt", Long.valueOf(zzaxgVar.zzc()));
            }
            zzaym zzaymVar = this.zzf;
            if (zzaymVar != null) {
                map.put("vs", Long.valueOf(zzaymVar.zzc()));
                map.put(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, Long.valueOf(zzaymVar.zzd()));
            }
        }
        return map;
    }

    public final void zza(View view) {
        this.zzc.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final Map zzb() {
        return zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final Map zzc() {
        zzaxv zzaxvVar = this.zzh;
        Map mapZzf = zzf();
        if (zzaxvVar != null) {
            mapZzf.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, zzaxvVar.zzb());
        }
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final Map zzd() {
        zzayk zzaykVar = this.zzc;
        Map mapZzf = zzf();
        mapZzf.put("lts", Long.valueOf(zzaykVar.zzc()));
        return mapZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzftm
    public final Map zze() {
        HashMap map = new HashMap();
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, new Throwable());
        return map;
    }
}
