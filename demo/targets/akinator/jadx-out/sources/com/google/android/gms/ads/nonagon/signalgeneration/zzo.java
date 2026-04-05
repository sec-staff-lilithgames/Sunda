package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzdvn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzo {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzdvn zzd;
    private final ExecutorService zze;

    public zzo(Context context, zzdvn zzdvnVar, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzdvnVar;
        this.zze = executorService;
    }

    private final void zzh(final boolean z10) {
        Map map = this.zzb;
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.zze.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.zza.zzf(z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final synchronized void zze(boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z10);
                Map map = this.zza;
                Boolean boolValueOf = Boolean.valueOf(z10);
                zzq zzqVar = (zzq) map.get(boolValueOf);
                int iZzd = 0;
                if (z11 && zzqVar != null) {
                    try {
                        iZzd = zzqVar.zzd() + 1;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                zzq zzqVar2 = (zzq) map.get(boolValueOf);
                final zzp zzpVar = new zzp(this, z10, iZzd, zzqVar2 == null ? null : Boolean.valueOf(zzqVar2.zze()), this.zzd);
                final AdRequest adRequestBuild = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmd)).booleanValue()) {
                    this.zze.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.zza.zzg(adRequestBuild, zzpVar);
                        }
                    });
                } else {
                    QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequestBuild, zzpVar);
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private final void zzj(zzq zzqVar, Pair pair, boolean z10) {
        zzqVar.zzf();
        QueryInfo queryInfoZza = zzqVar.zza();
        if (queryInfoZza != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(queryInfoZza);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzqVar.zzb());
        }
        zzaa.zze(this.zzd, null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z10)), new Pair("sgpc_rs", Boolean.toString(zzqVar.zza() != null)));
    }

    public final synchronized void zza() {
        zzh(true);
        zzh(false);
    }

    public final synchronized void zzb(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(obj, pair);
            }
        });
    }

    public final synchronized void zzc(final boolean z10, zzq zzqVar) {
        try {
            Map map = this.zza;
            Boolean boolValueOf = Boolean.valueOf(z10);
            zzq zzqVar2 = (zzq) map.get(boolValueOf);
            if (zzqVar2 == null || zzqVar2.zzc() || zzqVar2.zza() == null || zzqVar.zza() != null) {
                map.put(boolValueOf, zzqVar);
            }
            long jLongValue = (zzqVar.zza() != null ? (Long) zzbgz.zzf.zze() : (Long) zzbgz.zzg.zze()).longValue();
            final boolean z11 = zzqVar.zza() == null;
            zzcbv.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    this.zza.zze(z10, z11);
                }
            }, jLongValue, TimeUnit.SECONDS);
            Map map2 = this.zzb;
            List list = (List) map2.get(boolValueOf);
            map2.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzj(zzqVar, (Pair) it.next(), false);
                }
            }
        } finally {
        }
    }

    public final /* synthetic */ void zzd(Object obj, Pair pair) {
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof WebView) {
            CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzt.zzf().zza(this.zzc);
            if (cookieManagerZza != null) {
                zAcceptThirdPartyCookies = cookieManagerZza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.zza;
        Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
        zzq zzqVar = (zzq) map.get(boolValueOf);
        if (zzqVar != null && !zzqVar.zzc()) {
            zzj(zzqVar, pair, true);
            return;
        }
        Map map2 = this.zzb;
        List arrayList = (List) map2.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    public final /* synthetic */ void zzf(boolean z10) throws Throwable {
        zze(z10, false);
    }

    public final /* synthetic */ Object zzg(AdRequest adRequest, zzp zzpVar) {
        QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest, zzpVar);
        return Boolean.TRUE;
    }
}
