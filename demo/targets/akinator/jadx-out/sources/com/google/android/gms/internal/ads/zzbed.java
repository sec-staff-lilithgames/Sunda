package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbed implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Object zza = new Object();
    private SharedPreferences zzb = null;
    private JSONObject zzc = new JSONObject();

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzc = new JSONObject((String) zzbew.zza(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzbec
                    @Override // com.google.android.gms.internal.ads.zzgmv
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final void zza(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (this.zza) {
            try {
                if (this.zzb != null) {
                    return;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                com.google.android.gms.ads.internal.client.zzbd.zza();
                SharedPreferences sharedPreferencesZza = zzben.zza(context);
                this.zzb = sharedPreferencesZza;
                zzg(sharedPreferencesZza);
                if (!((Boolean) zzbgu.zza.zze()).booleanValue() && (sharedPreferences = this.zzb) != null) {
                    sharedPreferences.registerOnSharedPreferenceChangeListener(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String zzb(String str, String str2) {
        return !str.startsWith("adapter:") ? str2 : this.zzc.optString(str, str2);
    }

    public final long zzc(String str, long j10) {
        return !str.startsWith("adapter:") ? j10 : this.zzc.optLong(str, j10);
    }

    public final int zzd(String str, int i10) {
        return !str.startsWith("adapter:") ? i10 : this.zzc.optInt(str, i10);
    }

    public final float zze(String str, float f10) {
        return !str.startsWith("adapter:") ? f10 : (float) this.zzc.optDouble(str, f10);
    }

    public final boolean zzf(String str, boolean z10) {
        return !str.startsWith("adapter:") ? z10 : this.zzc.optBoolean(str, z10);
    }
}
