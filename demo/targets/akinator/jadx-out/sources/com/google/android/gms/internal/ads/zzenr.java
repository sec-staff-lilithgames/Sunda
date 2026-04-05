package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.amazon.device.ads.DTBMetricReport;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzenr extends zzbtk {
    private final String zza;
    private final zzbti zzb;
    private final zzcca zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzenr(String str, zzbti zzbtiVar, zzcca zzccaVar, long j10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzccaVar;
        this.zza = str;
        this.zzb = zzbtiVar;
        this.zze = j10;
        try {
            jSONObject.put(DTBMetricReport.ADAPTER_VERSION, zzbtiVar.zzf().toString());
            jSONObject.put("sdk_version", zzbtiVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzd(String str, zzcca zzccaVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbR)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzccaVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzh(String str, int i10) {
        try {
            if (this.zzf) {
                return;
            }
            try {
                JSONObject jSONObject = this.zzd;
                jSONObject.put("signal_error", str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbS)).booleanValue()) {
                    jSONObject.put(DTBMetricReport.LATENCY, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zze);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbR)).booleanValue()) {
                    jSONObject.put("signal_error_code", i10);
                }
            } catch (JSONException unused) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbR)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbS)).booleanValue()) {
                jSONObject.put(DTBMetricReport.LATENCY, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbR)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbtl
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
