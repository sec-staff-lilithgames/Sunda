package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeic implements zzehq {
    private final Context zza;
    private final zzcqu zzb;

    public zzeic(Context context, zzcqu zzcquVar) {
        this.zza = context;
        this.zzb = zzcquVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final void zza(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu {
        try {
            zzbti zzbtiVar = (zzbti) zzehnVar.zzb;
            zzbtiVar.zzo(zzffuVar.zzZ);
            zzbtiVar.zzs(zzffuVar.zzU, zzffuVar.zzv.toString(), zzfgfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeib(zzehnVar, null), (zzbrp) zzehnVar.zzc);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e10);
            throw new zzfgu(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final /* bridge */ /* synthetic */ Object zzb(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu, zzekz {
        zzeji zzejiVar = new zzeji(zzffuVar, (zzbti) zzehnVar.zzb, AdFormat.APP_OPEN_AD);
        zzcqr zzcqrVarZzf = this.zzb.zzf(new zzcue(zzfgfVar, zzffuVar, zzehnVar.zza), new zzdia(zzejiVar, null), new zzcqs(zzffuVar.zzaa));
        zzejiVar.zzc(zzcqrVarZzf.zzd());
        ((zzeiz) zzehnVar.zzc).zzc(zzcqrVarZzf.zzg());
        return zzcqrVarZzf.zzh();
    }
}
