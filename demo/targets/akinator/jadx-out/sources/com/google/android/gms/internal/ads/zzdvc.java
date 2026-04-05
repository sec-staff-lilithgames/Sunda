package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdvc {
    private final ConcurrentHashMap zza;
    private final zzcbn zzb;
    private final zzfgn zzc;
    private final String zzd;
    private final String zze;
    private final zzaxa zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdvc(Context context, zzdvn zzdvnVar, zzcbn zzcbnVar, zzfgn zzfgnVar, String str, String str2, zzaxa zzaxaVar) {
        ActivityManager.MemoryInfo memoryInfoZze;
        ConcurrentHashMap concurrentHashMapZzd = zzdvnVar.zzd();
        this.zza = concurrentHashMapZzd;
        this.zzb = zzcbnVar;
        this.zzc = zzfgnVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzaxaVar;
        this.zzh = context;
        concurrentHashMapZzd.put("ad_format", str2.toUpperCase(Locale.ROOT));
        zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcv)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzt.zzh().zzl()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcD)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                zzd("mem_avl", String.valueOf(memoryInfoZze.availMem));
                zzd("mem_tt", String.valueOf(memoryInfoZze.totalMem));
                zzd("low_m", true != memoryInfoZze.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcF)).booleanValue()) {
            zzd("ad_unit_id", zzfgnVar.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhw)).booleanValue()) {
            int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfgnVar) - 1;
            if (iZzg == 0) {
                concurrentHashMapZzd.put("request_id", str);
                concurrentHashMapZzd.put("scar", "false");
                return;
            }
            if (iZzg == 1) {
                concurrentHashMapZzd.put("request_id", str);
                concurrentHashMapZzd.put("se", "query_g");
            } else if (iZzg == 2) {
                concurrentHashMapZzd.put("se", "r_adinfo");
            } else if (iZzg != 3) {
                concurrentHashMapZzd.put("se", "r_both");
            } else {
                concurrentHashMapZzd.put("se", "r_adstring");
            }
            concurrentHashMapZzd.put("scar", "true");
            zzd("ragent", zzfgnVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfgnVar.zzd)));
        }
    }

    public final void zza(zzfgf zzfgfVar) {
        zzfge zzfgeVar = zzfgfVar.zzb;
        List list = zzfgeVar.zza;
        if (!list.isEmpty()) {
            int i10 = ((zzffu) list.get(0)).zzb;
            zzd("ad_format", zzffu.zza(i10));
            if (i10 == 6) {
                this.zza.put("as", true != this.zzb.zzl() ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcx)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzfgeVar.zzb.zzb);
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map zzc() {
        return this.zza;
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final Bundle zze() {
        return this.zzg;
    }

    public final void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoo)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? "0" : "1");
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkA)).booleanValue()) {
            zzawv zzawvVarZzb = this.zzf.zzb();
            if (zzawvVarZzb instanceof com.google.android.gms.ads.internal.zzk) {
                this.zza.put("asv", ((com.google.android.gms.ads.internal.zzk) zzawvVarZzb).zzc());
            } else if (zzawvVarZzb instanceof zzcjm) {
                this.zza.put("asv", ((zzcjm) zzawvVarZzb).zza());
            } else {
                this.zza.put("asv", "NA");
            }
        }
    }
}
