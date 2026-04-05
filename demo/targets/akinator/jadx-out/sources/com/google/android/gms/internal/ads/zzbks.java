package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbks implements zzblx {
    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzc;
        zzcgy zzcgyVar = (zzcgy) obj;
        zzbhv zzbhvVarZzar = zzcgyVar.zzar();
        if (zzbhvVarZzar == null || (jSONObjectZzc = zzbhvVarZzar.zzc()) == null) {
            zzcgyVar.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcgyVar.zzd("nativeAdViewSignalsReady", jSONObjectZzc);
        }
    }
}
