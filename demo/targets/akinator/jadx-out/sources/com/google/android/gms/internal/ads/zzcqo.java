package com.google.android.gms.internal.ads;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcqo {
    private final zzdvi zza;
    private final zzfgf zzb;

    public zzcqo(zzdvi zzdviVar, zzfgf zzfgfVar) {
        this.zza = zzdviVar;
        this.zzb = zzfgfVar;
    }

    public final void zza(long j10, int i10) {
        zzdvh zzdvhVarZza = this.zza.zza();
        zzdvhVarZza.zza(this.zzb.zzb.zzb);
        zzdvhVarZza.zzc("action", "ad_closed");
        zzdvhVarZza.zzc("show_time", String.valueOf(j10));
        zzdvhVarZza.zzc("ad_format", "app_open_ad");
        int i11 = i10 - 1;
        zzdvhVarZza.zzc("acr", i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? ApsMetricsDataMap.APSMETRICS_FIELD_URL : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME : "cb" : "cc" : "bb" : ApsMetricsDataMap.APSMETRICS_FIELD_HOSTNAME);
        zzdvhVarZza.zzd();
    }
}
