package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzejn implements zzehq {
    private final Context zza;
    private final zzdjd zzb;

    public zzejn(Context context, zzdjd zzdjdVar) {
        this.zza = context;
        this.zzb = zzdjdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final void zza(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu {
        try {
            zzbti zzbtiVar = (zzbti) zzehnVar.zzb;
            zzbtiVar.zzo(zzffuVar.zzZ);
            zzbtiVar.zzj(zzffuVar.zzU, zzffuVar.zzv.toString(), zzfgfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejm(this, zzehnVar, null), (zzbrp) zzehnVar.zzc);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e10);
            throw new zzfgu(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final /* bridge */ /* synthetic */ Object zzb(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu, zzekz {
        zzeji zzejiVar = new zzeji(zzffuVar, (zzbti) zzehnVar.zzb, AdFormat.INTERSTITIAL);
        zzdhx zzdhxVarZzd = this.zzb.zzd(new zzcue(zzfgfVar, zzffuVar, zzehnVar.zza), new zzdia(zzejiVar, null));
        zzejiVar.zzc(zzdhxVarZzd.zzd());
        ((zzeiz) zzehnVar.zzc).zzc(zzdhxVarZzd.zzg());
        return zzdhxVarZzd.zzh();
    }
}
