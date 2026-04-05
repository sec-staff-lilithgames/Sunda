package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfta implements zzfrv {
    private final Object zza;
    private final zzftb zzb;
    private final zzftm zzc;
    private final zzfrs zzd;
    private final boolean zze;

    public zzfta(Object obj, zzftb zzftbVar, zzftm zzftmVar, zzfrs zzfrsVar, boolean z10) {
        this.zza = obj;
        this.zzb = zzftbVar;
        this.zzc = zzftmVar;
        this.zzd = zzfrsVar;
        this.zze = z10;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzavp zzavpVarZza = zzavq.zza();
        zzavpVarZza.zzd(5);
        zzavpVarZza.zza(zzhvi.zzr(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzavq) zzavpVarZza.zzbu()).zzaN(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e10) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfrv
    public final synchronized String zza(Context context, String str) {
        byte[] bArrZzj;
        try {
            Map mapZzb = this.zzc.zzb();
            mapZzb.put(InneractiveMediationDefs.GENDER_FEMALE, CampaignEx.JSON_KEY_AD_Q);
            mapZzb.put("ctx", context);
            mapZzb.put("aid", null);
            bArrZzj = zzj(null, mapZzb);
            if (this.zze) {
                mapZzb.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrv
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] bArrZzj;
        try {
            Map mapZzc = this.zzc.zzc();
            mapZzc.put(InneractiveMediationDefs.GENDER_FEMALE, ApsMetricsDataMap.APSMETRICS_FIELD_VERSION);
            mapZzc.put("ctx", context);
            mapZzc.put("aid", null);
            mapZzc.put("view", view);
            mapZzc.put("act", activity);
            bArrZzj = zzj(null, mapZzc);
            if (this.zze) {
                mapZzc.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrv
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] bArrZzj;
        try {
            Map mapZzd = this.zzc.zzd();
            mapZzd.put(InneractiveMediationDefs.GENDER_FEMALE, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
            mapZzd.put("ctx", context);
            mapZzd.put("cs", str2);
            mapZzd.put("aid", null);
            mapZzd.put("view", view);
            mapZzd.put("act", activity);
            bArrZzj = zzj(null, mapZzd);
            if (this.zze) {
                mapZzd.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfrv
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzftk {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapZze = this.zzc.zze();
            mapZze.put("aid", null);
            mapZze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapZze);
            this.zzd.zzb(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzftk(2005, e10);
        }
    }

    public final zzftb zze() {
        return this.zzb;
    }

    public final synchronized boolean zzf() throws zzftk {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e10) {
            throw new zzftk(2001, e10);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod(C3191e4.a.f36368f, null).invoke(obj, null)).booleanValue();
    }

    public final synchronized void zzg() throws zzftk {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            this.zzd.zzb(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzftk(2003, e10);
        }
    }

    public final synchronized int zzh() throws zzftk {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e10) {
            throw new zzftk(2006, e10);
        }
        return ((Integer) obj.getClass().getDeclaredMethod(CampaignEx.KEY_LOCAL_CHECK_STATE, null).invoke(obj, null)).intValue();
    }
}
