package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcrw implements zzifh {
    private final zzcrn zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;
    private final zzifq zze;

    private zzcrw(zzcrn zzcrnVar, zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        this.zza = zzcrnVar;
        this.zzb = zzifqVar;
        this.zzc = zzifqVar2;
        this.zzd = zzifqVar3;
        this.zze = zzifqVar4;
    }

    public static zzcrw zza(zzcrn zzcrnVar, zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4) {
        return new zzcrw(zzcrnVar, zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4);
    }

    public static zzdgn zzc(zzcrn zzcrnVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzffu zzffuVar, final zzfgn zzfgnVar) {
        return new zzdgn(new zzdac() { // from class: com.google.android.gms.internal.ads.zzcrm
            @Override // com.google.android.gms.internal.ads.zzdac
            public final /* synthetic */ void zzg() {
                zzfgn zzfgnVar2 = zzfgnVar;
                JSONObject jSONObject = zzffuVar.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, jSONObject.toString(), zzfgnVar2.zzg);
            }
        }, zzcbv.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (Context) this.zzb.zzb(), ((zzckk) this.zzc).zza(), ((zzcuf) this.zzd).zza(), ((zzcyf) this.zze).zza());
    }
}
