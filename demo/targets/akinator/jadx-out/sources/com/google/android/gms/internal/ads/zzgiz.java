package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgiz implements zzgia, zzfzj {
    static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private final Context zzb;
    private final ExecutorService zzc;
    private final String[] zzd;
    private long zze = 0;
    private long zzf = 0;
    private long zzg = -1;
    private boolean zzh = false;

    public zzgiz(Context context, zzfxa zzfxaVar, ExecutorService executorService, String[] strArr) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = strArr;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final n1 zza() {
        return Build.VERSION.SDK_INT < 30 ? zzgui.zzb() : zzgui.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgiy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final void zzb(Map map) {
        long j10;
        long j11;
        zze();
        synchronized (this) {
            try {
                j10 = this.zzh ? this.zzf - this.zze : -1L;
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j10));
        synchronized (this) {
            j11 = this.zzg;
            this.zzg = -1L;
        }
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final void zzc(Map map, Context context, View view) {
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final void zzd(Map map) {
        zze();
    }

    public final void zze() {
        synchronized (this) {
            try {
                if (this.zzh) {
                    this.zzf = System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void zzf() {
        zzgix zzgixVar = new zzgix(this);
        try {
            Object systemService = this.zzb.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(this.zzd, this.zzc, zzgixVar);
        } catch (Throwable unused) {
        }
    }

    public final /* synthetic */ void zzg(long j10) {
        this.zze = j10;
    }

    public final /* synthetic */ long zzh() {
        return this.zzf;
    }

    public final /* synthetic */ void zzi(long j10) {
        this.zzg = j10;
    }

    public final /* synthetic */ void zzj(boolean z10) {
        this.zzh = z10;
    }
}
