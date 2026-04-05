package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeza implements zzexy {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfwt zzc;

    public zzeza(AdvertisingIdClient.Info info, String str, zzfwt zzfwtVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfwtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbp.zzh((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectZzh.put("pdid", str);
                    jSONObjectZzh.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzh.put("rdid", info.getId());
            jSONObjectZzh.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectZzh.put("idtype", "adid");
            zzfwt zzfwtVar = this.zzc;
            if (zzfwtVar.zzc()) {
                jSONObjectZzh.put("paidv1_id_android_3p", zzfwtVar.zza());
                jSONObjectZzh.put("paidv1_creation_time_android_3p", zzfwtVar.zzb());
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e10);
        }
    }
}
