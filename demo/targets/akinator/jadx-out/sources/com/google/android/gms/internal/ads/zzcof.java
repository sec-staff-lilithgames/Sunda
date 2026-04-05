package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcof implements zzcnv {
    private final zzdyo zza;

    public zzcof(zzdyo zzdyoVar) {
        this.zza = zzdyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnv
    public final void zza(JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkj)).booleanValue()) {
            this.zza.zzp(jSONObject);
        }
    }
}
