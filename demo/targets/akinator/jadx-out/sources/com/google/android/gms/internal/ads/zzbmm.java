package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbmm implements zzbmn {
    final /* synthetic */ zzcca zza;

    public zzbmm(zzbmo zzbmoVar, zzcca zzccaVar) {
        this.zza = zzccaVar;
        Objects.requireNonNull(zzbmoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final void zzb(String str) {
        this.zza.zzd(new zzbqe(str));
    }
}
