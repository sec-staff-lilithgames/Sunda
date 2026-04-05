package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzemf implements zzehm {
    private final zzenj zza;
    private final zzdsy zzb;

    public zzemf(zzenj zzenjVar, zzdsy zzdsyVar) {
        this.zza = zzenjVar;
        this.zzb = zzdsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final zzehn zza(String str, JSONObject jSONObject) throws zzfgu {
        zzbti zzbtiVarZzb;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbV)).booleanValue()) {
            try {
                zzbtiVarZzb = this.zzb.zzb(str);
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e10);
                zzbtiVarZzb = null;
            }
        } else {
            zzbtiVarZzb = this.zza.zzb(str);
        }
        if (zzbtiVarZzb == null) {
            return null;
        }
        return new zzehn(zzbtiVarZzb, new zzeiz(), str);
    }
}
