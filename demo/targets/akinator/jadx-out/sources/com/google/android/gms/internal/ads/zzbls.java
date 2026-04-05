package com.google.android.gms.internal.ads;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzbls implements zzblx {
    static final /* synthetic */ zzbls zza = new zzbls();

    private /* synthetic */ zzbls() {
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcik zzcikVar = (zzcik) obj;
        zzblx zzblxVar = zzblw.zza;
        String str = (String) map.get(ApsMetricsDataMap.APSMETRICS_FIELD_URL);
        if (str == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzf)).booleanValue() && str.isEmpty()) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty from httpTrack GMSG.");
        } else {
            zzcgp zzcgpVar = (zzcgp) zzcikVar;
            new com.google.android.gms.ads.internal.util.zzbt(zzcikVar.getContext(), ((zzcis) zzcikVar).zzs().afmaVersion, str, null, zzcgpVar.zzC() != null ? zzcgpVar.zzC().zzax : null).zzb();
        }
    }
}
