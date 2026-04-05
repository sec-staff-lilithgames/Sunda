package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbej extends zzbel {
    public zzbej(int i10, String str, Float f10, Float f11) {
        super(1, str, f10, f11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final /* bridge */ /* synthetic */ Object zza(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zze())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(zze()))) : (Float) zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(zze(), ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final /* bridge */ /* synthetic */ Object zzc(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(zze(), ((Float) zzf()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final /* bridge */ /* synthetic */ Object zzd(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(zze(), ((Float) zzf()).floatValue()));
    }
}
