package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;
import java.util.Map;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzerq implements zzeya {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcve zze;
    private final zzfhv zzf;
    private final zzfgn zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzh().zzo();
    private final zzdvc zzi;
    private final zzcvs zzj;

    public zzerq(Context context, String str, String str2, zzcve zzcveVar, zzfhv zzfhvVar, zzfgn zzfgnVar, zzdvc zzdvcVar, zzcvs zzcvsVar, long j10) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcveVar;
        this.zzf = zzfhvVar;
        this.zzg = zzfgnVar;
        this.zzi = zzdvcVar;
        this.zzj = zzcvsVar;
        this.zzd = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        Bundle bundle = new Bundle();
        zzdvc zzdvcVar = this.zzi;
        Map mapZzc = zzdvcVar.zzc();
        String str = this.zzb;
        mapZzc.put("seq_num", str);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcv)).booleanValue()) {
            zzdvcVar.zzd("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd));
            com.google.android.gms.ads.internal.zzt.zzc();
            zzdvcVar.zzd(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzK(this.zza) ? "1" : "0");
        }
        zzcve zzcveVar = this.zze;
        zzfgn zzfgnVar = this.zzg;
        zzcveVar.zzi(zzfgnVar.zzd);
        bundle.putAll(this.zzf.zzc());
        return zzgui.zza(new zzerr(this.zza, bundle, str, this.zzc, this.zzh, zzfgnVar.zzg, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 12;
    }
}
