package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzewm implements zzeya {
    private final zzeya zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzewm(zzeya zzeyaVar, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeyaVar;
        this.zzb = j10;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        n1 n1VarZza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcG)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j10 = this.zzb;
        if (j10 > 0) {
            n1VarZza = zzgui.zzi(n1VarZza, j10, timeUnit, this.zzc);
        }
        return zzgui.zzh(n1VarZza, Throwable.class, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzewl
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, zzcbv.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return this.zza.zzb();
    }

    public final /* synthetic */ n1 zzc(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcE)).booleanValue()) {
            zzeya zzeyaVar = this.zza;
            zzcbj zzcbjVarZzh = com.google.android.gms.ads.internal.zzt.zzh();
            int iZzb = zzeyaVar.zzb();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 22);
            sb2.append("OptionalSignalTimeout:");
            sb2.append(iZzb);
            zzcbjVarZzh.zzg(th2, sb2.toString());
        }
        return zzgui.zza(null);
    }
}
