package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzdvr {
    protected final Map zza;
    protected final Context zzb;
    protected final Executor zzc;
    protected final com.google.android.gms.ads.internal.util.client.zzu zzd;
    protected final boolean zze;
    private final CsiUrlBuilder zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicReference zzj;

    public zzdvr(Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        this.zza = new HashMap();
        this.zzi = new AtomicBoolean();
        this.zzj = new AtomicReference(new Bundle());
        this.zzc = executor;
        this.zzd = zzuVar;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzco)).booleanValue();
        this.zzf = csiUrlBuilder;
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzct)).booleanValue();
        this.zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhx)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map, boolean z10) {
        if (map.isEmpty()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return;
        }
        zzi(map);
        final String strGenerateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        boolean z11 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z10 || this.zzg) {
                if (!z11 || this.zzh) {
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvo
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzd.zzc(strGenerateUrl, null);
                        }
                    });
                }
            }
        }
    }

    private final void zzi(Map map) {
        if (map == null || map.isEmpty()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty or null paramMap.");
            return;
        }
        if (!this.zzi.getAndSet(true)) {
            final String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlA);
            this.zzj.set(com.google.android.gms.ads.internal.util.zzac.zzc(this.zzb, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzdvp
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    this.zza.zzh(str, sharedPreferences, str2);
                }
            }));
        }
        Bundle bundle = (Bundle) this.zzj.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void zzb(Map map) {
        zza(map, false);
    }

    public final String zzc(Map map) {
        return this.zzf.generateUrl(map);
    }

    public final ConcurrentHashMap zzd() {
        return new ConcurrentHashMap(this.zza);
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zzf(Map map) {
        if (map.isEmpty()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        String strGenerateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        return this.zzd.zzc(strGenerateUrl, null);
    }

    public final void zzg(Map map) {
        if (map.isEmpty()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Empty paramMap.");
            return;
        }
        zzi(map);
        final String strGenerateUrl = this.zzf.generateUrl(map);
        com.google.android.gms.ads.internal.util.zze.zza(strGenerateUrl);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoi)).booleanValue() || this.zze) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd.zzc(strGenerateUrl, null);
                }
            });
        }
    }

    public final /* synthetic */ void zzh(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzj.set(com.google.android.gms.ads.internal.util.zzac.zzb(this.zzb, str));
    }
}
