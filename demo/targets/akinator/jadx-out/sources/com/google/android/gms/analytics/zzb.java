package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzbd;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzbw;
import com.google.android.gms.internal.gtm.zzek;
import com.google.android.gms.internal.gtm.zzff;
import com.ironsource.C3191e4;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzb extends zzbq implements zzt {
    private static DecimalFormat zza;
    private final zzbu zzb;
    private final String zzc;
    private final Uri zzd;

    public zzb(zzbu zzbuVar, String str) {
        super(zzbuVar);
        Preconditions.checkNotEmpty(str);
        this.zzb = zzbuVar;
        this.zzc = str;
        this.zzd = zza(str);
    }

    public static Uri zza(String str) {
        Preconditions.checkNotEmpty(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        return builder.build();
    }

    public static String zzc(double d10) {
        if (zza == null) {
            zza = new DecimalFormat("0.######");
        }
        return zza.format(d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map zzd(com.google.android.gms.analytics.zzh r10) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.zzb.zzd(com.google.android.gms.analytics.zzh):java.util.Map");
    }

    private static void zzf(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    private static void zzg(Map map, String str, boolean z10) {
        if (z10) {
            map.put(str, "1");
        }
    }

    @Override // com.google.android.gms.analytics.zzt
    public final Uri zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.analytics.zzt
    public final void zze(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        Preconditions.checkArgument(zzhVar.zzm(), "Can't deliver not submitted measurement");
        Preconditions.checkNotMainThread("deliver should be called on worker thread");
        zzh zzhVar2 = new zzh(zzhVar);
        zzbd zzbdVar = (zzbd) zzhVar2.zzb(zzbd.class);
        if (TextUtils.isEmpty(zzbdVar.zzf())) {
            zzz().zzc(zzd(zzhVar2), "Ignoring measurement without type");
            return;
        }
        if (TextUtils.isEmpty(zzbdVar.zze())) {
            zzz().zzc(zzd(zzhVar2), "Ignoring measurement without client id");
            return;
        }
        if (this.zzb.zzc().getAppOptOut()) {
            return;
        }
        if (zzff.zzj(0.0d, zzbdVar.zze())) {
            zzF("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(0.0d));
            return;
        }
        Map mapZzd = zzd(zzhVar2);
        mapZzd.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, "1");
        mapZzd.put("_v", zzbs.zzb);
        mapZzd.put(ScarConstants.TOKEN_ID_KEY, this.zzc);
        if (this.zzb.zzc().isDryRunEnabled()) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry : mapZzd.entrySet()) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append((String) entry.getKey());
                sb2.append(C3191e4.i.f36525b);
                sb2.append((String) entry.getValue());
            }
            zzM("Dry run is enabled. GoogleAnalytics would have sent", sb2.toString());
            return;
        }
        HashMap map = new HashMap();
        zzff.zzg(map, "uid", zzbdVar.zzg());
        zzau zzauVar = (zzau) zzhVar.zzc(zzau.class);
        if (zzauVar != null) {
            zzff.zzg(map, "an", zzauVar.zzf());
            zzff.zzg(map, "aid", zzauVar.zzd());
            zzff.zzg(map, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTERVERSION, zzauVar.zzg());
            zzff.zzg(map, "aiid", zzauVar.zze());
        }
        mapZzd.put("_s", String.valueOf(zzs().zza(new zzbw(0L, zzbdVar.zze(), this.zzc, !TextUtils.isEmpty(zzbdVar.zzd()), 0L, map))));
        zzs().zzh(new zzek(zzz(), mapZzd, zzhVar.zza(), true));
    }
}
