package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzezj implements zzeya {
    private final zzcbj zza;
    private final ScheduledExecutorService zzb;
    private final zzgus zzc;

    public zzezj(String str, zzbcw zzbcwVar, zzcbj zzcbjVar, ScheduledExecutorService scheduledExecutorService, zzgus zzgusVar) {
        this.zza = zzcbjVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgusVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdt)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdy)).booleanValue()) {
                n1 n1VarZza = zzfxf.zza(Tasks.forResult(null), null);
                zzgus zzgusVar = this.zzc;
                n1 n1VarZzj = zzgui.zzj(n1VarZza, zzezi.zza, zzgusVar);
                if (((Boolean) zzbgh.zza.zze()).booleanValue()) {
                    n1VarZzj = zzgui.zzi(n1VarZzj, ((Long) zzbgh.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgui.zzg(n1VarZzj, Exception.class, new zzglu() { // from class: com.google.android.gms.internal.ads.zzezh
                    @Override // com.google.android.gms.internal.ads.zzglu
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzgusVar);
            }
        }
        return zzgui.zza(new zzezk(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 43;
    }

    public final /* synthetic */ zzezk zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzezk(null, -1);
    }
}
