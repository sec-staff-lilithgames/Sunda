package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfaq implements zzeya {
    private final zzcbj zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzgus zzd;
    private final int zze;
    private final int zzf;

    public zzfaq(zzcbj zzcbjVar, boolean z10, zzcaz zzcazVar, zzgus zzgusVar, String str, ScheduledExecutorService scheduledExecutorService, int i10, int i11) {
        this.zza = zzcbjVar;
        this.zzb = z10;
        this.zzd = zzgusVar;
        this.zzc = scheduledExecutorService;
        this.zze = i10;
        this.zzf = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhA)).booleanValue() && this.zzb) {
            return zzgui.zza(new zzfar(null));
        }
        if (this.zzf == 2) {
            return zzgui.zza(new zzfar(null));
        }
        if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhC)).split(",")).contains(String.valueOf(this.zze))) {
            return zzgui.zza(new zzfar(null));
        }
        n1 n1VarZza = zzgui.zza(null);
        zzgus zzgusVar = this.zzd;
        return zzgui.zzg(zzgui.zzi(zzgui.zzk(n1VarZza, zzfap.zza, zzgusVar), ((Long) zzbhj.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzglu() { // from class: com.google.android.gms.internal.ads.zzfao
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((Exception) obj);
            }
        }, zzgusVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 50;
    }

    public final /* synthetic */ zzfar zzc(Exception exc) {
        this.zza.zzg(exc, "TrustlessTokenSignal");
        return new zzfar(null);
    }
}
