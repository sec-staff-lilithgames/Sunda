package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeli implements zzehq {
    private final Context zza;
    private final Executor zzb;
    private final zzdrn zzc;

    public zzeli(Context context, Executor executor, zzdrn zzdrnVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdrnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final void zza(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu {
        try {
            zzfgn zzfgnVar = zzfgfVar.zza.zza;
            if (zzfgnVar.zzp.zza == 3) {
                ((zzfhl) zzehnVar.zzb).zzx(this.zza, zzfgnVar.zzd, zzffuVar.zzv.toString(), (zzbrp) zzehnVar.zzc);
            } else {
                ((zzfhl) zzehnVar.zzb).zzv(this.zza, zzfgnVar.zzd, zzffuVar.zzv.toString(), (zzbrp) zzehnVar.zzc);
            }
        } catch (Exception e10) {
            String str = zzehnVar.zza;
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final /* bridge */ /* synthetic */ Object zzb(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu, zzekz {
        zzdrj zzdrjVarZzf = this.zzc.zzf(new zzcue(zzfgfVar, zzffuVar, zzehnVar.zza), new zzdrk(new zzelh(this, zzehnVar, zzffuVar)));
        zzdrjVarZzf.zza().zzq(new zzcou((zzfhl) zzehnVar.zzb), this.zzb);
        ((zzeiz) zzehnVar.zzc).zzc(zzdrjVarZzf.zzm());
        return zzdrjVarZzf.zzh();
    }
}
