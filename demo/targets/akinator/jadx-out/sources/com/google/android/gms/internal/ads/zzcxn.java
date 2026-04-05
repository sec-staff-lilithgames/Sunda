package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcxn implements com.google.android.gms.ads.internal.overlay.zzr {
    private final zzfgf zzc;
    private final zzffu zzd;
    private final Clock zze;
    private final zzdvi zzf;
    private final ScheduledExecutorService zzg;
    private final Object zzb = new Object();
    final zzfmg zza = zzfmh.zza();
    private boolean zzh = false;
    private boolean zzi = false;

    public zzcxn(zzfgf zzfgfVar, zzffu zzffuVar, Clock clock, zzdvi zzdviVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = zzfgfVar;
        this.zzd = zzffuVar;
        this.zze = clock;
        this.zzf = zzdviVar;
        this.zzg = scheduledExecutorService;
    }

    private final void zzn() {
        synchronized (this.zzb) {
            try {
                zzdvi zzdviVar = this.zzf;
                String str = this.zzc.zzb.zzb.zzb;
                String strEncodeToString = Base64.encodeToString(((zzfmh) this.zza.zzbu()).zzaN(), 1);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznS)).booleanValue()) {
                    zzdvh zzdvhVarZza = zzdviVar.zza();
                    zzdvhVarZza.zzc("action", "pclma");
                    zzdvhVarZza.zzc("pclmd", strEncodeToString);
                    zzdvhVarZza.zzc("gqi", str);
                    zzdvhVarZza.zzf();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void zzo(int i10) {
        synchronized (this.zzb) {
            try {
                if (!this.zzi && this.zzh) {
                    zzfmg zzfmgVar = this.zza;
                    zzfla zzflaVarZza = zzflb.zza();
                    zzflaVarZza.zzb(i10);
                    zzflaVarZza.zza(this.zze.currentTimeMillis());
                    zzfmgVar.zza((zzflb) zzflaVarZza.zzbu());
                    if (i10 == 10) {
                        zzn();
                        this.zzi = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
        zzo(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdB() {
        zzo(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdC() {
        zzo(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdD() {
        zzo(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        zzo(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
        zzo(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu() {
        zzo(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        zzo(4);
    }

    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd.zzaE > 0 && !this.zzh) {
                this.zza.zzb(this.zze.currentTimeMillis());
                this.zzh = true;
                this.zzg.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzm();
                    }
                }, this.zzd.zzaE, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final /* synthetic */ void zzm() {
        synchronized (this.zzb) {
            try {
                if (this.zzi) {
                    return;
                }
                this.zzi = true;
                zzn();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdY(int i10) {
    }
}
