package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzekb implements zzehq {
    private final Context zza;
    private final zzdjz zzb;
    private zzbry zzc;
    private final VersionInfoParcel zzd;

    public zzekb(Context context, zzdjz zzdjzVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdjzVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final void zza(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu {
        try {
            zzbti zzbtiVar = (zzbti) zzehnVar.zzb;
            zzbtiVar.zzo(zzffuVar.zzZ);
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbY)).intValue()) {
                zzbtiVar.zzn(zzffuVar.zzU, zzffuVar.zzv.toString(), zzfgfVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeka(this, zzehnVar, null), (zzbrp) zzehnVar.zzc);
                return;
            }
            String str = zzffuVar.zzU;
            String string = zzffuVar.zzv.toString();
            zzfgn zzfgnVar = zzfgfVar.zza.zza;
            zzbtiVar.zzr(str, string, zzfgnVar.zzd, ObjectWrapper.wrap(this.zza), new zzeka(this, zzehnVar, null), (zzbrp) zzehnVar.zzc, zzfgnVar.zzj);
        } catch (RemoteException e10) {
            throw new zzfgu(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final /* bridge */ /* synthetic */ Object zzb(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzekz, zzfgu {
        ArrayList arrayList = zzfgfVar.zza.zza.zzh;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzekz(2, "Unified must be used for RTB.");
        }
        zzdlq zzdlqVarZzaf = zzdlq.zzaf(this.zzc);
        if (!arrayList.contains(Integer.toString(zzdlqVarZzaf.zzx()))) {
            throw new zzekz(1, "No corresponding native ad listener");
        }
        zzdls zzdlsVarZze = this.zzb.zze(new zzcue(zzfgfVar, zzffuVar, zzehnVar.zza), new zzdmb(zzdlqVarZzaf), new zzdnu(null, null, this.zzc));
        ((zzeiz) zzehnVar.zzc).zzc(zzdlsVarZze.zzg());
        return zzdlsVarZze.zzh();
    }

    public final /* synthetic */ void zzc(zzbry zzbryVar) {
        this.zzc = zzbryVar;
    }
}
