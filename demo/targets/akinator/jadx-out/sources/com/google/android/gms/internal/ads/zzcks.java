package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcks implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzcks(zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
    }

    public static zzcks zzc(zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzcks(zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbxd zzb() {
        Context contextZza = ((zzcjv) this.zza).zza();
        zzflp zzflpVar = (zzflp) this.zzb.zzb();
        zzbqp zzbqpVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzflpVar);
        zzbqj zzbqjVar = zzbqm.zza;
        zzbqpVarZza.zza("google.afma.request.getAdDictionary", zzbqjVar, zzbqjVar);
        return new zzbxf(contextZza, com.google.android.gms.ads.internal.zzt.zzr().zza(contextZza, VersionInfoParcel.forPackage(), zzflpVar).zza("google.afma.sdkConstants.getSdkConstants", zzbqjVar, zzbqjVar), VersionInfoParcel.forPackage());
    }
}
