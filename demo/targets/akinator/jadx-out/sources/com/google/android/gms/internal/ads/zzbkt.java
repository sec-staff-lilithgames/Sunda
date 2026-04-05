package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbkt implements zzblx {
    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzd;
        zzcgy zzcgyVar = (zzcgy) obj;
        zzbhv zzbhvVarZzar = zzcgyVar.zzar();
        if (zzbhvVarZzar == null || (jSONObjectZzd = zzbhvVarZzar.zzd()) == null) {
            zzcgyVar.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzcgyVar.zzd("nativeClickMetaReady", jSONObjectZzd);
        }
    }
}
