package com.google.android.gms.ads.nonagon.signalgeneration;

import com.apm.insight.b.El.rJqlArycrfkilN;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbgz;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbp extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    public zzbp(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = str;
        Objects.requireNonNull(taggingLibraryJsInterface);
        this.zzb = taggingLibraryJsInterface;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(rJqlArycrfkilN.ZOEpIKCH.concat(String.valueOf(str)));
        String strConcat = ((Boolean) zzbgz.zzc.zze()).booleanValue() ? ",\"as\":".concat(this.zzb.zze().zzb().toString()) : "";
        String str2 = this.zza;
        Locale locale = Locale.getDefault();
        zzbge zzbgeVar = zzbgz.zze;
        final String str3 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) zzbgeVar.zze()).booleanValue() ? ((Long) zzbgz.zzh.zze()).longValue() : 0L), strConcat);
        if (((Boolean) zzbgeVar.zze()).booleanValue()) {
            try {
                this.zzb.zzd().execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb.zzc().evaluateJavascript(str3, null);
                    }
                });
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.zzb.zzc().evaluateJavascript(str3, null);
        }
        if (((Boolean) zzbgz.zzc.zze()).booleanValue() && ((Boolean) zzbgz.zzd.zze()).booleanValue()) {
            this.zzb.zzf().zza();
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) throws JSONException {
        String strConcat;
        final String str;
        long jLongValue;
        String query = queryInfo.getQuery();
        long jLongValue2 = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            if (((Boolean) zzbgz.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzb.zze().zzb());
            }
            String str2 = gjnZrsdA.eEmCtsiEaNePG;
            if (((Boolean) zzbgz.zze.zze()).booleanValue()) {
                jLongValue = ((Long) zzbgz.zzh.zze()).longValue();
            } else {
                jLongValue = 0;
            }
            jSONObject.put(str2, jLongValue);
            jSONObject.put("signal", query);
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            if (((Boolean) zzbgz.zzc.zze()).booleanValue()) {
                strConcat = ",\"as\":".concat(this.zzb.zze().zzb().toString());
            } else {
                strConcat = "";
            }
            String str3 = this.zza;
            Locale locale = Locale.getDefault();
            String query2 = queryInfo.getQuery();
            if (((Boolean) zzbgz.zze.zze()).booleanValue()) {
                jLongValue2 = ((Long) zzbgz.zzh.zze()).longValue();
            }
            str = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str3, query2, Long.valueOf(jLongValue2), strConcat);
        }
        if (((Boolean) zzbgz.zze.zze()).booleanValue()) {
            try {
                this.zzb.zzd().execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbo
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb.zzc().evaluateJavascript(str, null);
                    }
                });
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e10, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.zzb.zzc().evaluateJavascript(str, null);
        }
        if (((Boolean) zzbgz.zzc.zze()).booleanValue() && ((Boolean) zzbgz.zzd.zze()).booleanValue()) {
            this.zzb.zzf().zza();
        }
    }
}
