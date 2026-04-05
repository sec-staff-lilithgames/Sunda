package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.Y1;
import java.util.Map;
import k6.w;
import org.json.JSONException;
import org.json.JSONObject;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzduo implements zzdbu, zzdac, zzcyr, zzdhh {
    private final zzdvc zza;
    private final zzdvn zzb;
    private final int zzc;

    public zzduo(zzdvc zzdvcVar, zzdvn zzdvnVar, int i10) {
        this.zza = zzdvcVar;
        this.zzb = zzdvnVar;
        this.zzc = i10;
    }

    private final void zzc(Bundle bundle, zzgpe zzgpeVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcv)).booleanValue() || bundle == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(bundle, zzduq.PUBLIC_API_CALLBACK.zza());
        zzdvc zzdvcVar = this.zza;
        zzdvcVar.zzf();
        if (bundle.containsKey("ls")) {
            zzdvcVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgpeVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzdur zzdurVar = (zzdur) zzgpeVar.get(i10);
            long j10 = bundle.getLong(zzdurVar.zzb().zza(), -1L);
            long j11 = bundle.getLong(zzdurVar.zzc().zza(), -1L);
            if (j10 > 0 && j11 > 0) {
                zzdvcVar.zzd(zzdurVar.zza(), String.valueOf(j11 - j10));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzid)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zzdvcVar.zzd("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                zzdvcVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    private final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j10 = bundle.getLong(str);
            if (j10 >= 0) {
                this.zza.zzd(str, String.valueOf(j10));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    public final void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdvc zzdvcVar = this.zza;
        zzdvcVar.zzc().put("action", "ftl");
        zzdvcVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdvcVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhL)).booleanValue()) {
            zzdvcVar.zzd("emsg", zzeVar.zzb);
        }
        zzdvcVar.zzg();
        this.zzb.zzb(zzdvcVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdT(zzbxj zzbxjVar) {
        this.zza.zzb(zzbxjVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdU(zzfgf zzfgfVar) {
        this.zza.zza(zzfgfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhw)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzid)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            zzdvc zzdvcVar = this.zza;
            zzdvcVar.zzc().put("action", "sgf");
            zzdvcVar.zzd("sgf_reason", str);
            zzdvcVar.zzg();
            this.zzb.zzb(zzdvcVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdac
    public final void zzg() {
        zzdvc zzdvcVar = this.zza;
        zzdvcVar.zzc().put("action", C3191e4.h.f36505r);
        zzc(zzdvcVar.zze(), zzdur.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznF)).booleanValue()) {
            zzdvcVar.zzc().put("mafe", true != w.isFeatureSupported("MUTE_AUDIO") ? "0" : "1");
        }
        zzdvcVar.zzg();
        this.zzb.zzb(zzdvcVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhw)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzid)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            if (zzbjVar == null) {
                zzdvc zzdvcVar = this.zza;
                zzdvcVar.zzc().put("action", "sgs");
                zzdvcVar.zzc().put("request_id", Y1.f35726f);
                this.zzb.zzb(zzdvcVar.zzc());
                return;
            }
            zzbxj zzbxjVar = zzbjVar.zzd;
            Bundle bundle = zzbjVar.zze;
            if (zzbxjVar != null) {
                zzc(zzbxjVar.zzm, zzdur.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzc(bundle, zzdur.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(zzbjVar.zzc) ? zzbjVar.zzb : zzbjVar.zzc);
                zzdvc zzdvcVar2 = this.zza;
                zzdvcVar2.zzc().put("action", "sgs");
                Map mapZzc = zzdvcVar2.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkH)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e10) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg(QpyI.bZmJONfNIKbuys, e10);
                    }
                } else {
                    str = "na";
                }
                mapZzc.put("tpc", str);
                zzbxj zzbxjVar2 = zzbjVar.zzd;
                if (zzbxjVar2 != null) {
                    this.zza.zzb(zzbxjVar2.zza);
                }
                zzdvc zzdvcVar3 = this.zza;
                zzdvcVar3.zzg();
                this.zzb.zzb(zzdvcVar3.zzc());
            } catch (JSONException unused) {
                zzdvc zzdvcVar4 = this.zza;
                zzdvcVar4.zzc().put("action", "sgf");
                zzdvcVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdvcVar4.zzc());
            }
        }
    }
}
