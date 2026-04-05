package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzczb extends zzdem implements zzcys {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzczb(zzcyx zzcyxVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzq(zzcyxVar, executor);
    }

    public final synchronized void zza() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzb() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlJ)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzcys
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(new zzdel() { // from class: com.google.android.gms.internal.ads.zzcza
            @Override // com.google.android.gms.internal.ads.zzdel
            public final /* synthetic */ void zza(Object obj) {
                ((zzcys) obj).zzc(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcys
    public final void zzd(final zzdjk zzdjkVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzs(new zzdel() { // from class: com.google.android.gms.internal.ads.zzcyy
            @Override // com.google.android.gms.internal.ads.zzdel
            public final /* synthetic */ void zza(Object obj) {
                ((zzcys) obj).zzd(zzdjkVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcys
    public final void zze() {
        zzs(zzcyt.zza);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Timeout waiting for show call succeed to be called.");
            zzd(new zzdjk("Timeout for show call succeed."));
            this.zzd = true;
        }
    }
}
