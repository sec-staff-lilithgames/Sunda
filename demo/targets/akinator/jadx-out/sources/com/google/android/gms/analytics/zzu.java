package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzau;
import com.google.android.gms.internal.gtm.zzbh;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbw;
import com.google.android.gms.internal.gtm.zzek;
import com.google.android.gms.internal.gtm.zzff;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzu implements Runnable {
    final /* synthetic */ Map zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ String zzg;
    final /* synthetic */ Tracker zzh;

    public zzu(Tracker tracker, Map map, boolean z10, String str, long j10, boolean z11, boolean z12, String str2) {
        this.zza = map;
        this.zzb = z10;
        this.zzc = str;
        this.zzd = j10;
        this.zze = z11;
        this.zzf = z12;
        this.zzg = str2;
        this.zzh = tracker;
    }

    @Override // java.lang.Runnable
    public final void run() throws NumberFormatException {
        double d10;
        if (this.zzh.zze.zzf()) {
            this.zza.put("sc", "start");
        }
        Map map = this.zza;
        GoogleAnalytics googleAnalyticsZzp = this.zzh.zzp();
        Preconditions.checkNotMainThread("getClientId can not be called from the main thread");
        String strZzb = googleAnalyticsZzp.zzb().zzi().zzb();
        if (strZzb != null && TextUtils.isEmpty((CharSequence) map.get(BidResponsedEx.KEY_CID))) {
            map.put(BidResponsedEx.KEY_CID, strZzb);
        }
        String str = (String) this.zza.get("sf");
        if (str != null) {
            try {
                d10 = Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                d10 = 100.0d;
            }
            if (zzff.zzj(d10, (String) this.zza.get(BidResponsedEx.KEY_CID))) {
                this.zzh.zzF("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d10));
                return;
            }
        }
        Tracker tracker = this.zzh;
        boolean z10 = this.zzb;
        zzbh zzbhVarZzr = tracker.zzr();
        if (z10) {
            Map map2 = this.zza;
            boolean zZzb = zzbhVarZzr.zzb();
            if (!map2.containsKey("ate")) {
                map2.put("ate", true != zZzb ? "0" : "1");
            }
            zzff.zzg(this.zza, "adid", zzbhVarZzr.zza());
        } else {
            this.zza.remove("ate");
            this.zza.remove("adid");
        }
        zzau zzauVarZza = this.zzh.zzu().zza();
        zzff.zzg(this.zza, "an", zzauVarZza.zzf());
        zzff.zzg(this.zza, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTERVERSION, zzauVarZza.zzg());
        zzff.zzg(this.zza, "aid", zzauVarZza.zzd());
        zzff.zzg(this.zza, "aiid", zzauVarZza.zze());
        this.zza.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, "1");
        this.zza.put("_v", zzbs.zzb);
        zzff.zzg(this.zza, "ul", this.zzh.zzx().zza().zzd());
        zzff.zzg(this.zza, "sr", this.zzh.zzx().zzb());
        if (!this.zzc.equals("transaction") && !this.zzc.equals("item") && !this.zzh.zzd.zza()) {
            this.zzh.zzz().zzc(this.zza, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long jZza = zzff.zza((String) this.zza.get(DownloadCommon.DOWNLOAD_REPORT_HOST));
        if (jZza == 0) {
            jZza = this.zzd;
        }
        long j10 = jZza;
        if (this.zze) {
            this.zzh.zzz().zzM("Dry run enabled. Would have sent hit", new zzek(this.zzh, this.zza, j10, this.zzf));
            return;
        }
        String str2 = (String) this.zza.get(BidResponsedEx.KEY_CID);
        HashMap map3 = new HashMap();
        zzff.zzh(map3, "uid", this.zza);
        zzff.zzh(map3, "an", this.zza);
        zzff.zzh(map3, "aid", this.zza);
        zzff.zzh(map3, ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTERVERSION, this.zza);
        zzff.zzh(map3, "aiid", this.zza);
        Preconditions.checkNotNull(str2);
        this.zza.put("_s", String.valueOf(this.zzh.zzs().zza(new zzbw(0L, str2, this.zzg, !TextUtils.isEmpty((CharSequence) this.zza.get("adid")), 0L, map3))));
        this.zzh.zzs().zzh(new zzek(this.zzh, this.zza, j10, this.zzf));
    }
}
