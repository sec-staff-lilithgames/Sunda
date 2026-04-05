package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdko implements zzifh {
    private final zzdkm zza;

    private zzdko(zzdkm zzdkmVar) {
        this.zza = zzdkmVar;
    }

    public static zzdko zzc(zzdkm zzdkmVar) {
        return new zzdko(zzdkmVar);
    }

    public static JSONObject zzd(zzdkm zzdkmVar) {
        JSONObject jSONObjectZzc = zzdkmVar.zzc();
        zzifp.zzb(jSONObjectZzc);
        return jSONObjectZzc;
    }

    public final JSONObject zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
