package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzell implements zzehq {
    private final Context zza;
    private final zzdrn zzb;

    public zzell(Context context, zzdrn zzdrnVar) {
        this.zza = context;
        this.zzb = zzdrnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final void zza(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu {
        try {
            zzbti zzbtiVar = (zzbti) zzehnVar.zzb;
            zzbtiVar.zzo(zzffuVar.zzZ);
            zzfgn zzfgnVar = zzfgfVar.zza.zza;
            if (zzfgnVar.zzp.zza == 3) {
                zzbtiVar.zzp(zzffuVar.zzU, zzffuVar.zzv.toString(), zzfgnVar.zzd, ObjectWrapper.wrap(this.zza), new zzelk(this, zzehnVar, null), (zzbrp) zzehnVar.zzc);
            } else {
                zzbtiVar.zzl(zzffuVar.zzU, zzffuVar.zzv.toString(), zzfgnVar.zzd, ObjectWrapper.wrap(this.zza), new zzelk(this, zzehnVar, null), (zzbrp) zzehnVar.zzc);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final /* bridge */ /* synthetic */ Object zzb(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu, zzekz {
        zzeji zzejiVar = new zzeji(zzffuVar, (zzbti) zzehnVar.zzb, AdFormat.REWARDED);
        zzdrj zzdrjVarZzf = this.zzb.zzf(new zzcue(zzfgfVar, zzffuVar, zzehnVar.zza), new zzdrk(zzejiVar));
        zzejiVar.zzc(zzdrjVarZzf.zzd());
        ((zzeiz) zzehnVar.zzc).zzc(zzdrjVarZzf.zzn());
        return zzdrjVarZzf.zzh();
    }
}
