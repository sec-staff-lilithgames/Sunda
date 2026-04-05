package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzgmu;
import com.ironsource.C3191e4;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(Map<String, String> map) {
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_SDK, "gmob_sdk");
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_VERSION, "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put(C3191e4.h.G, zzs.zzv());
        map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.zzb);
        zzt.zzc();
        Context context = this.zza;
        map.put("is_lite_sdk", true != zzs.zzI(context) ? "0" : "1");
        zzbel zzbelVar = zzbeu.zza;
        List listZzf = zzbd.zzb().zzf();
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zzhs)).booleanValue()) {
            listZzf.addAll(zzt.zzh().zzo().zzi().zzh());
        }
        map.put("e", TextUtils.join(",", listZzf));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zzmq)).booleanValue()) {
            zzt.zzc();
            map.put("is_bstar", true != zzs.zzF(context) ? "0" : "1");
        }
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zzku)).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zzcI)).booleanValue()) {
                map.put(Q6.L, zzgmu.zza(zzt.zzh().zzu()));
            }
        }
    }
}
