package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.device.ads.DTBMetricReport;
import com.ironsource.Q6;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzepz implements zzexy {
    final zzfgn zza;
    private final long zzb;

    public zzepz(zzfgn zzfgnVar, long j10) {
        this.zza = zzfgnVar;
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcxq) obj).zza;
        zzfgn zzfgnVar = this.zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfgnVar.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", zzfgnVar.zzg);
        int i10 = zzfgnVar.zzp.zza;
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i11 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        zzfhc.zzd(bundle, "is_sdk_preload", true, zzmVar.zzc());
        zzfhc.zzb(bundle, "prefetch_type", "zenith_v2", zzmVar.zzd());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j10 = zzmVar.zzb;
        zzfhc.zzb(bundle, "cust_age", simpleDateFormat.format(new Date(j10)), j10 != -1);
        zzfhc.zzf(bundle, "extras", zzmVar.zzc);
        int i12 = zzmVar.zzd;
        zzfhc.zzc(bundle, "cust_gender", i12, i12 != -1);
        zzfhc.zzg(bundle, "kw", zzmVar.zze);
        int i13 = zzmVar.zzg;
        zzfhc.zzc(bundle, "tag_for_child_directed_treatment", i13, i13 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        int i14 = zzmVar.zza;
        zzfhc.zzc(bundle, "d_imp_hdr", 1, i14 >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzfhc.zzb(bundle, "ppid", str, i14 >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong(Q6.f35296s, (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong(DTBMetricReport.TIME, time);
            bundle.putBundle("uule", bundle2);
        }
        zzfhc.zze(bundle, "url", zzmVar.zzl);
        zzfhc.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        zzfhc.zzf(bundle, "custom_targeting", zzmVar.zzn);
        zzfhc.zzg(bundle, "category_exclusions", zzmVar.zzo);
        zzfhc.zze(bundle, "request_agent", zzmVar.zzp);
        zzfhc.zze(bundle, "request_pkg", zzmVar.zzq);
        zzfhc.zzd(bundle, "is_designed_for_families", zzmVar.zzr, i14 >= 7);
        if (i14 >= 8) {
            int i15 = zzmVar.zzt;
            zzfhc.zzc(bundle, "tag_for_under_age_of_consent", i15, i15 != -1);
            zzfhc.zze(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
        Bundle bundle3 = zzfgnVar.zze;
        zzfhc.zzh(bundle, "plcs", Integer.valueOf(bundle3.getInt("plcs")));
        zzfhc.zzh(bundle, "plbs", Integer.valueOf(bundle3.getInt("plbs")));
        zzfhc.zze(bundle, "plid", bundle3.getString("plid"));
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcxq) obj).zzb;
        zzfgn zzfgnVar = this.zza;
        bundle.putString("slotname", zzfgnVar.zzg);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfgnVar.zzd;
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i10 = zzmVar.zzg;
        zzfhc.zzc(bundle, "tag_for_child_directed_treatment", i10, i10 != -1);
        if (zzmVar.zza >= 8) {
            int i11 = zzmVar.zzt;
            zzfhc.zzc(bundle, "tag_for_under_age_of_consent", i11, i11 != -1);
        }
        zzfhc.zze(bundle, "url", zzmVar.zzl);
        zzfhc.zzg(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle2 = zzmVar.zzc;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzif)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfhc.zzf(bundle, "extras", bundle3);
    }
}
