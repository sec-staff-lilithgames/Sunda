package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzebc implements zzeci {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzead zza;
    private final zzgus zzb;
    private final zzfgn zzc;
    private final ScheduledExecutorService zzd;
    private final zzeev zze;
    private final zzflm zzf;
    private final Context zzg;

    public zzebc(Context context, zzfgn zzfgnVar, zzead zzeadVar, zzgus zzgusVar, ScheduledExecutorService scheduledExecutorService, zzeev zzeevVar, zzflm zzflmVar) {
        this.zzg = context;
        this.zzc = zzfgnVar;
        this.zza = zzeadVar;
        this.zzb = zzgusVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzeevVar;
        this.zzf = zzflmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeci
    public final n1 zza(zzbxj zzbxjVar) {
        Context context = this.zzg;
        n1 n1VarZza = this.zza.zza(zzbxjVar);
        zzflc zzflcVarZzn = zzflc.zzn(context, 11);
        zzfll.zzb(n1VarZza, zzflcVarZzn);
        n1 n1VarZzj = zzgui.zzj(n1VarZza, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzebb
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzb((zzeck) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgh)).booleanValue()) {
            n1VarZzj = zzgui.zzh(zzgui.zzi(n1VarZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgi)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzeba.zza, zzcbv.zzg);
        }
        zzfll.zzd(n1VarZzj, this.zzf, zzflcVarZzn);
        zzgui.zzr(n1VarZzj, new zzeaz(this), zzcbv.zzg);
        return n1VarZzj;
    }

    public final /* synthetic */ n1 zzb(zzeck zzeckVar) {
        return zzgui.zza(new zzfgf(new zzfgc(this.zzc), zzfge.zza(new InputStreamReader(zzeckVar.zza()), zzeckVar.zzb().zzm)));
    }

    public final /* synthetic */ zzeev zzc() {
        return this.zze;
    }
}
