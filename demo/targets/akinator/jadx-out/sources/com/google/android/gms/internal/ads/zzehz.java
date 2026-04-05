package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzehz implements zzehq {
    private final Context zza;
    private final zzcqu zzb;
    private final Executor zzc;

    public zzehz(Context context, zzcqu zzcquVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcquVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final void zza(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu {
        zzfhl zzfhlVar = (zzfhl) zzehnVar.zzb;
        zzfgn zzfgnVar = zzfgfVar.zza.zza;
        String string = zzffuVar.zzv.toString();
        zzfhlVar.zzy(this.zza, zzfgnVar.zzd, string, (zzbrp) zzehnVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final /* bridge */ /* synthetic */ Object zzb(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu, zzekz {
        zzcqr zzcqrVarZzf = this.zzb.zzf(new zzcue(zzfgfVar, zzffuVar, zzehnVar.zza), new zzdia(new zzehy(this, zzehnVar, zzffuVar), null), new zzcqs(zzffuVar.zzaa));
        zzcqrVarZzf.zza().zzq(new zzcou((zzfhl) zzehnVar.zzb), this.zzc);
        ((zzeiz) zzehnVar.zzc).zzc(zzcqrVarZzf.zzf());
        return zzcqrVarZzf.zzh();
    }
}
