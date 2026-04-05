package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import be.nVUQ.UupKET;
import com.google.android.gms.ads.AdFormat;
import com.moloco.sdk.BKC.KerkSviMAy;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfnv {
    private final zzdvi zza;

    public zzfnv(zzdvi zzdviVar, Context context) {
        this.zza = zzdviVar;
    }

    private final void zzr(String str, String str2, long j10, int i10, int i11, String str3, zzfoc zzfocVar, String str4) {
        zzdvh zzdvhVarZza = this.zza.zza();
        zzdvhVarZza.zzc(str2, Long.toString(j10));
        if (zzfocVar != null) {
            zzdvhVarZza.zzc("ad_unit_id", zzfocVar.zza());
            zzdvhVarZza.zzc("ad_format", zzfocVar.zzb());
            zzdvhVarZza.zzc("pid", zzfocVar.zzc());
        }
        zzdvhVarZza.zzc("action", str);
        if (str3 != null) {
            zzdvhVarZza.zzc("gqi", str3);
        }
        if (i10 >= 0) {
            zzdvhVarZza.zzc("max_ads", Integer.toString(i10));
        }
        if (i11 >= 0) {
            zzdvhVarZza.zzc("cache_size", Integer.toString(i11));
        }
        zzdvhVarZza.zzc("pv", str4);
        zzdvhVarZza.zzd();
    }

    public final void zza(int i10, long j10, zzfoc zzfocVar, String str) {
        zzdvh zzdvhVarZza = this.zza.zza();
        zzdvhVarZza.zzc("action", "start_preload");
        zzdvhVarZza.zzc("sp_ts", Long.toString(j10));
        zzdvhVarZza.zzc("ad_format", zzfocVar.zzb());
        zzdvhVarZza.zzc("ad_unit_id", zzfocVar.zza());
        zzdvhVarZza.zzc("pid", zzfocVar.zzc());
        zzdvhVarZza.zzc("max_ads", Integer.toString(i10));
        zzdvhVarZza.zzc("pv", str);
        zzdvhVarZza.zzd();
    }

    public final void zzd(int i10, int i11, long j10, Long l9, String str, zzfoc zzfocVar, String str2) {
        zzdvh zzdvhVarZza = this.zza.zza();
        zzdvhVarZza.zzc("plaac_ts", Long.toString(j10));
        zzdvhVarZza.zzc("max_ads", Integer.toString(i10));
        zzdvhVarZza.zzc("cache_size", Integer.toString(i11));
        zzdvhVarZza.zzc("action", "is_ad_available");
        if (zzfocVar != null) {
            zzdvhVarZza.zzc("ad_unit_id", zzfocVar.zza());
            zzdvhVarZza.zzc("pid", zzfocVar.zzc());
            zzdvhVarZza.zzc("ad_format", zzfocVar.zzb());
        }
        if (l9 != null) {
            zzdvhVarZza.zzc("plaay_ts", Long.toString(l9.longValue()));
        }
        if (str != null) {
            zzdvhVarZza.zzc("gqi", str);
        }
        zzdvhVarZza.zzc("pv", str2);
        zzdvhVarZza.zzd();
    }

    public final void zze(long j10, String str) {
        zzr("poll_ad", "ppacwe_ts", j10, -1, -1, null, null, "2");
    }

    public final void zzf(long j10, zzfoc zzfocVar, int i10, int i11, String str) {
        zzr("poll_ad", "ppac_ts", j10, i10, i11, null, zzfocVar, str);
    }

    public final void zzg(long j10, int i10, int i11, String str, zzfoc zzfocVar, String str2) {
        zzr("poll_ad", "psvroc_ts", j10, i10, i11, str, zzfocVar, str2);
    }

    public final void zzh(long j10, int i10, int i11, String str, zzfoc zzfocVar, String str2) {
        zzdvh zzdvhVarZza = this.zza.zza();
        zzdvhVarZza.zzc("ppla_ts", Long.toString(j10));
        zzdvhVarZza.zzc("ad_format", zzfocVar.zzb());
        zzdvhVarZza.zzc("ad_unit_id", zzfocVar.zza());
        zzdvhVarZza.zzc("pid", zzfocVar.zzc());
        zzdvhVarZza.zzc("max_ads", Integer.toString(i10));
        zzdvhVarZza.zzc("cache_size", Integer.toString(i11));
        zzdvhVarZza.zzc("action", "poll_ad");
        if (str != null) {
            zzdvhVarZza.zzc("gqi", str);
        }
        zzdvhVarZza.zzc("pv", str2);
        zzdvhVarZza.zzd();
    }

    public final void zzi(long j10, String str, zzfoc zzfocVar, int i10, int i11, String str2) {
        zzr("paa", "pano_ts", j10, i10, i11, str, zzfocVar, str2);
    }

    public final void zzj(long j10, zzfoc zzfocVar, int i10, String str) {
        zzr("pae", UupKET.fXraLPGlzuqM, j10, i10, 0, null, zzfocVar, str);
    }

    public final void zzk(long j10, zzfoc zzfocVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i10, int i11, String str) {
        zzdvh zzdvhVarZza = this.zza.zza();
        zzdvhVarZza.zzc("action", "pftla");
        zzdvhVarZza.zzc("pftlat_ts", Long.toString(j10));
        zzdvhVarZza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zzdvhVarZza.zzc("ad_format", zzfocVar.zzb());
        zzdvhVarZza.zzc("max_ads", Integer.toString(i10));
        zzdvhVarZza.zzc("cache_size", Integer.toString(i11));
        zzdvhVarZza.zzc("ad_unit_id", zzfocVar.zza());
        zzdvhVarZza.zzc("pid", zzfocVar.zzc());
        zzdvhVarZza.zzc("pv", str);
        zzdvhVarZza.zzd();
    }

    public final void zzl(long j10, AdFormat adFormat, int i10) {
        zzq("pda", j10, null, null, adFormat, -1, -1, i10, "2");
    }

    public final void zzm(long j10, String str, String str2, AdFormat adFormat, int i10, int i11) {
        zzq("pd", j10, str, str2, adFormat, i10, i11, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j10, int i10) {
        zzq("pgcs", j10, null, null, adFormat, -1, -1, i10, "2");
    }

    public final void zzo(long j10, String str, String str2, AdFormat adFormat, int i10, int i11) {
        zzq("pgc", j10, str, str2, adFormat, i10, i11, 1, "2");
    }

    public final void zzp(int i10, long j10, String str, String str2, AdFormat adFormat, int i11) {
        zzq("pnav", j10, str, str2, adFormat, i11, i10, 1, "2");
    }

    private final void zzq(String str, long j10, String str2, String str3, AdFormat adFormat, int i10, int i11, int i12, String str4) {
        zzdvh zzdvhVarZza = this.zza.zza();
        zzdvhVarZza.zzc("action", str);
        zzdvhVarZza.zzc("pat", Long.toString(j10));
        zzdvhVarZza.zzc(wHkgq.lLG, adFormat.name().toLowerCase(Locale.ENGLISH));
        zzdvhVarZza.zzc("max_ads", Integer.toString(i10));
        zzdvhVarZza.zzc("cache_size", Integer.toString(i11));
        zzdvhVarZza.zzc("pas", Integer.toString(i12));
        zzdvhVarZza.zzc("pv", "2");
        zzdvhVarZza.zzc("ad_unit_id", str3);
        zzdvhVarZza.zzc("pid", str2);
        zzdvhVarZza.zzd();
    }

    public final void zzb(Map map, long j10, String str) {
        zzdvh zzdvhVarZza = this.zza.zza();
        zzdvhVarZza.zzc("action", "start_preload");
        zzdvhVarZza.zzc("sp_ts", Long.toString(j10));
        zzdvhVarZza.zzc("pv", KerkSviMAy.WyrjCiFFYcxqKaa);
        for (AdFormat adFormat : map.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzdvhVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdvhVarZza.zzd();
    }

    public final void zzc(int i10, int i11, long j10, zzfoc zzfocVar) {
        zzdvh zzdvhVarZza = this.zza.zza();
        zzdvhVarZza.zzc("action", "cache_resize");
        zzdvhVarZza.zzc("cs_ts", Long.toString(j10));
        zzdvhVarZza.zzc("orig_ma", Integer.toString(i10));
        zzdvhVarZza.zzc("max_ads", Integer.toString(i11));
        zzdvhVarZza.zzc("ad_format", zzfocVar.zzb());
        zzdvhVarZza.zzc("ad_unit_id", zzfocVar.zza());
        zzdvhVarZza.zzc("pid", zzfocVar.zzc());
        zzdvhVarZza.zzc("pv", QFzuMMDfrzagDN.CnCmaJ);
        zzdvhVarZza.zzd();
    }
}
