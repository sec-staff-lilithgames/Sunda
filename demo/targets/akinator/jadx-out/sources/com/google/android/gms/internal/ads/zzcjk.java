package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k6.v;
import k6.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcjk {
    private String zza;
    private zziag zzb;
    private zzied zzc;
    private final ScheduledExecutorService zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    public zzcjk(zzcix zzcixVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        try {
            String variationsHeader = w.isFeatureSupported("GET_VARIATIONS_HEADER") ? v.getVariationsHeader() : null;
            if (variationsHeader != null && !variationsHeader.isEmpty()) {
                this.zza = variationsHeader;
                byte[] bArrDecode = Base64.decode(variationsHeader, 10);
                this.zzb = zziag.zzc(bArrDecode, zzhvy.zzb());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjN)).booleanValue()) {
                    this.zzc = zzied.zzc(bArrDecode, zzhvy.zzb());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjL)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjK)).booleanValue()) {
                        this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjj
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zze();
                            }
                        }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjM)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzhxd e10) {
            e = e10;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        } catch (IllegalArgumentException e11) {
            e = e11;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
        }
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjK)).booleanValue() && !this.zze.getAndSet(true)) {
            zze();
        }
    }

    public final String zzb() {
        zzied zziedVar = this.zzc;
        if (zziedVar != null) {
            return Base64.encodeToString(zziedVar.zzaN(), 10);
        }
        return null;
    }

    public final String zzc() {
        return this.zza;
    }

    public final zziag zzd() {
        return this.zzb;
    }
}
