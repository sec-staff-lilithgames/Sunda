package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdvh {
    final /* synthetic */ zzdvi zza;
    private final Map zzb;

    public zzdvh(zzdvi zzdviVar) {
        Objects.requireNonNull(zzdviVar);
        this.zza = zzdviVar;
        this.zzb = new ConcurrentHashMap();
    }

    public final zzdvh zza(zzffx zzffxVar) {
        zzc("gqi", zzffxVar.zzb);
        return this;
    }

    public final zzdvh zzb(zzffu zzffuVar) {
        zzc("aai", zzffuVar.zzw);
        zzc("request_id", zzffuVar.zzan);
        zzc("ad_format", zzffu.zza(zzffuVar.zzb));
        return this;
    }

    public final zzdvh zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        });
    }

    public final com.google.android.gms.ads.internal.util.client.zzt zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoZ)).booleanValue()) {
            zzd();
            return com.google.android.gms.ads.internal.util.client.zzt.SUCCESS;
        }
        zzdvi zzdviVar = this.zza;
        return zzdviVar.zzc().zzf(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdve
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzj();
            }
        });
    }

    public final String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    public final void zzh() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzk();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        this.zza.zzc().zzb(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        this.zza.zzc().zzg(this.zzb);
    }

    public final /* synthetic */ void zzk() {
        this.zza.zzc().zze(this.zzb);
    }

    public final /* synthetic */ zzdvh zzl() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }
}
