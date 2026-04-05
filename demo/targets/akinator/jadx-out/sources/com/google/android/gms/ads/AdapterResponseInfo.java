package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzv;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AdapterResponseInfo {
    private final zzv zza;
    private final AdError zzb;

    private AdapterResponseInfo(zzv zzvVar) {
        this.zza = zzvVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.zzc;
        this.zzb = zzeVar == null ? null : zzeVar.zza();
    }

    public static AdapterResponseInfo zza(zzv zzvVar) {
        if (zzvVar != null) {
            return new AdapterResponseInfo(zzvVar);
        }
        return null;
    }

    public AdError getAdError() {
        return this.zzb;
    }

    public String getAdSourceId() {
        return this.zza.zzf;
    }

    public String getAdSourceInstanceId() {
        return this.zza.zzh;
    }

    public String getAdSourceInstanceName() {
        return this.zza.zzg;
    }

    public String getAdSourceName() {
        return this.zza.zze;
    }

    public String getAdapterClassName() {
        return this.zza.zza;
    }

    public Bundle getCredentials() {
        return this.zza.zzd;
    }

    public long getLatencyMillis() {
        return this.zza.zzb;
    }

    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        zzv zzvVar = this.zza;
        jSONObject.put("Adapter", zzvVar.zza);
        jSONObject.put("Latency", zzvVar.zzb);
        String adSourceName = getAdSourceName();
        if (adSourceName == null) {
            jSONObject.put("Ad Source Name", AbstractJsonLexerKt.NULL);
        } else {
            jSONObject.put("Ad Source Name", adSourceName);
        }
        String adSourceId = getAdSourceId();
        if (adSourceId == null) {
            jSONObject.put("Ad Source ID", AbstractJsonLexerKt.NULL);
        } else {
            jSONObject.put("Ad Source ID", adSourceId);
        }
        String adSourceInstanceName = getAdSourceInstanceName();
        if (adSourceInstanceName == null) {
            jSONObject.put("Ad Source Instance Name", AbstractJsonLexerKt.NULL);
        } else {
            jSONObject.put("Ad Source Instance Name", adSourceInstanceName);
        }
        String adSourceInstanceId = getAdSourceInstanceId();
        if (adSourceInstanceId == null) {
            jSONObject.put("Ad Source Instance ID", AbstractJsonLexerKt.NULL);
        } else {
            jSONObject.put("Ad Source Instance ID", adSourceInstanceId);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = zzvVar.zzd;
        for (String str : bundle.keySet()) {
            jSONObject2.put(str, bundle.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.zzb;
        if (adError == null) {
            jSONObject.put("Ad Error", AbstractJsonLexerKt.NULL);
            return jSONObject;
        }
        jSONObject.put("Ad Error", adError.zzb());
        return jSONObject;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return SUvoXnn.lkIQHZ;
        }
    }
}
