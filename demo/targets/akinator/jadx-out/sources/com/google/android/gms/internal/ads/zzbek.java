package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbek extends zzbel {
    public zzbek(int i10, String str, String str2, String str3) {
        super(1, str, str2, str3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final /* bridge */ /* synthetic */ void zzb(SharedPreferences.Editor editor, Object obj) {
        editor.putString(zze(), (String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final /* bridge */ /* synthetic */ Object zzc(JSONObject jSONObject) {
        return jSONObject.optString(zze(), (String) zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final /* bridge */ /* synthetic */ Object zzd(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zze(), (String) zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzbel
    public final /* bridge */ /* synthetic */ Object zza(Bundle bundle) {
        String strZze = zze();
        String str = QGjYBESwAiCc.PEfXXDRElqFqrT;
        if (bundle.containsKey(str.concat(strZze))) {
            return bundle.getString(str.concat(zze()));
        }
        return (String) zzf();
    }
}
