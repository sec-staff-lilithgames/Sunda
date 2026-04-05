package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzco {
    private static final zzdf zza = zzdf.zzk("UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    private final Context zzc;
    private final Map zzb = new HashMap();
    private final Map zzd = new HashMap();

    public zzco(Context context) {
        this.zzc = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences.Editor zzf(String str) {
        Map map = this.zzd;
        if (!map.containsKey(str)) {
            map.put(str, this.zzc.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) map.get(str);
    }

    public final Map zzb() {
        return this.zzb;
    }

    public final void zzc() {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).commit();
        }
    }

    public final void zzd() {
        this.zzb.clear();
    }

    public final boolean zze(String str, Object obj) {
        zzcn zzcnVarZza = zzcp.zza(this.zzc, str);
        if (zzcnVarZza == null) {
            return false;
        }
        SharedPreferences.Editor editorZzf = zzf(zzcnVarZza.zza);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            String str2 = zzcnVarZza.zzb;
            editorZzf.putInt(str2, num.intValue());
            if (!zza.contains(str2)) {
                return true;
            }
            this.zzb.put(str2, num);
            return true;
        }
        if (obj instanceof Long) {
            editorZzf.putLong(zzcnVarZza.zzb, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            editorZzf.putFloat(zzcnVarZza.zzb, ((Double) obj).floatValue());
            return true;
        }
        if (obj instanceof Float) {
            editorZzf.putFloat(zzcnVarZza.zzb, ((Float) obj).floatValue());
            return true;
        }
        if (obj instanceof Boolean) {
            editorZzf.putBoolean(zzcnVarZza.zzb, ((Boolean) obj).booleanValue());
            return true;
        }
        if (!(obj instanceof String)) {
            return false;
        }
        editorZzf.putString(zzcnVarZza.zzb, (String) obj);
        return true;
    }
}
