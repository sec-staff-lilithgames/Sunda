package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzd {
    private SharedPreferences zza;
    private SharedPreferences.Editor zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzd(Context context) {
        this.zzc = context;
    }

    private final void zzk() {
        synchronized (this.zzd) {
            try {
                if (this.zza != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.zzc.getSharedPreferences("query_info_shared_prefs", 0);
                this.zza = sharedPreferences;
                this.zzb = sharedPreferences.edit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zza(String str, String str2) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString(str, str2).commit();
        }
    }

    public final String zzb(String str) {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString(str, null);
            this.zzb.remove(str).commit();
        }
        return string;
    }

    public final boolean zzc(String str) {
        boolean zContains;
        zzk();
        synchronized (this.zzd) {
            zContains = this.zza.contains(str);
        }
        return zContains;
    }

    public final void zzd(String str, int i10, String str2, int i11) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString("pn", str).putInt("vc", i10).putString(ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER, str2).putInt("aav", i11).commit();
        }
    }

    public final String zze() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString("pn", null);
        }
        return string;
    }

    public final int zzf() {
        int i10;
        zzk();
        synchronized (this.zzd) {
            i10 = this.zza.getInt("vc", -1);
        }
        return i10;
    }

    public final String zzg() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString(ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER, null);
        }
        return string;
    }

    public final int zzh() {
        int i10;
        zzk();
        synchronized (this.zzd) {
            i10 = this.zza.getInt("aav", -1);
        }
        return i10;
    }

    public final void zzi() {
        zzk();
        synchronized (this.zzd) {
            this.zzb.clear().commit();
        }
    }

    public final Map zzj() {
        HashMap map;
        zzk();
        synchronized (this.zzd) {
            try {
                Map<String, ?> all = this.zza.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), ApsMetricsDataMap.APSMETRICS_FIELD_MANUFACTURER) && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }
}
