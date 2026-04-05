package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzdvn;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzp extends QueryInfoGenerationCallback {
    private final zzo zza;
    private final zzdvn zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
    private final Boolean zzf;

    public zzp(zzo zzoVar, boolean z10, int i10, Boolean bool, zzdvn zzdvnVar) {
        this.zza = zzoVar;
        this.zzc = z10;
        this.zzd = i10;
        this.zzf = bool;
        this.zzb = zzdvnVar;
    }

    private static long zza() {
        return ((Long) zzbgz.zzh.zze()).longValue() + com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(zzb()));
        int i10 = this.zzd;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i10));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z10 = this.zzc;
        zzaa.zze(this.zzb, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z10 ? "0" : "1"));
        this.zza.zzc(z10, new zzq(null, str, zza(), i10));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(zzb()));
        int i10 = this.zzd;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i10));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z10 = this.zzc;
        zzaa.zze(this.zzb, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z10 ? "0" : "1"));
        this.zza.zzc(z10, new zzq(queryInfo, "", zza(), i10));
    }
}
