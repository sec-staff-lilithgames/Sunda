package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdih implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;

    private zzdih(zzdia zzdiaVar, zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
        this.zzd = zzifqVar4;
    }

    public static zzdih zza(zzdia zzdiaVar, zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        return new zzdih(zzdiaVar, zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel versionInfoParcelZza = ((zzckk) this.zzb).zza();
        final zzffu zzffuVarZza = ((zzcuf) this.zzc).zza();
        final zzfgn zzfgnVarZza = ((zzcyf) this.zzd).zza();
        return new zzdgn(new zzdac() { // from class: com.google.android.gms.internal.ads.zzdhz
            @Override // com.google.android.gms.internal.ads.zzdac
            public final /* synthetic */ void zzg() {
                zzfgn zzfgnVar = zzfgnVarZza;
                JSONObject jSONObject = zzffuVarZza.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcelZza.afmaVersion, jSONObject.toString(), zzfgnVar.zzg);
            }
        }, zzcbv.zzg);
    }
}
