package com.google.android.gms.internal.ads;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfgy {
    public static zzblx zza(final zzefy zzefyVar, final zzfng zzfngVar, final zzcpe zzcpeVar, final zzdgv zzdgvVar) {
        return new zzblx() { // from class: com.google.android.gms.internal.ads.zzfgx
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcgy zzcgyVar = (zzcgy) obj;
                zzblw.zzc(map, zzdgvVar);
                String str = (String) map.get(ApsMetricsDataMap.APSMETRICS_FIELD_URL);
                if (str == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzefy zzefyVar2 = zzefyVar;
                    zzfng zzfngVar2 = zzfngVar;
                    zzgui.zzr(zzblw.zza(zzcgyVar, str), new zzfgv(zzcgyVar, zzcpeVar, zzfngVar2, zzefyVar2), zzcbv.zza);
                }
            }
        };
    }

    public static zzblx zzb(final zzefy zzefyVar, final zzfng zzfngVar) {
        return new zzblx() { // from class: com.google.android.gms.internal.ads.zzfgw
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcgp zzcgpVar = (zzcgp) obj;
                String str = (String) map.get(ApsMetricsDataMap.APSMETRICS_FIELD_URL);
                if (str == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzffu zzffuVarZzC = zzcgpVar.zzC();
                if (zzffuVarZzC != null && !zzffuVarZzC.zzai) {
                    zzfngVar.zzb(str, zzffuVarZzC.zzax, null, null);
                    return;
                }
                zzffx zzffxVarZzaC = ((zzcif) zzcgpVar).zzaC();
                if (zzffxVarZzaC != null) {
                    zzefyVar.zze(new zzega(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzffxVarZzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
