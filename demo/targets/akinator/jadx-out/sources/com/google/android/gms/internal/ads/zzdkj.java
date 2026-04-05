package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdkj implements zzblx {
    private final WeakReference zza;
    private final zzfng zzb;
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;
    private final zzflm zzd;

    public /* synthetic */ zzdkj(zzdkk zzdkkVar, zzfng zzfngVar, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzflm zzflmVar, byte[] bArr) {
        this.zza = new WeakReference(zzdkkVar);
        this.zzb = zzfngVar;
        this.zzc = zzvVar;
        this.zzd = zzflmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(Object obj, Map map) {
        zzdkk zzdkkVar = (zzdkk) this.zza.get();
        String str = (String) map.get(ApsMetricsDataMap.APSMETRICS_FIELD_URL);
        if (zzdkkVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.zzb.zzb(str, this.zzc, this.zzd, zzdkkVar.zzF());
    }
}
