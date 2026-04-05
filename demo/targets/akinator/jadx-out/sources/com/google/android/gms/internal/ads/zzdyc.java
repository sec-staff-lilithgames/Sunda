package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdyc implements zzcyr, zzdbu, zzdag {
    private final zzdyo zza;
    private final String zzb;
    private final String zzc;
    private zzcyh zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdyb zze = zzdyb.AD_REQUESTED;

    public zzdyc(zzdyo zzdyoVar, zzfgn zzfgnVar, String str) {
        this.zza = zzdyoVar;
        this.zzc = str;
        this.zzb = zzfgnVar.zzg;
    }

    private final JSONObject zzh(zzcyh zzcyhVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcyhVar.zze());
        jSONObject.put("responseSecsSinceEpoch", zzcyhVar.zzc());
        jSONObject.put("responseId", zzcyhVar.zzf());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkk)).booleanValue()) {
            String strZzd = zzcyhVar.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                String strValueOf = String.valueOf(strZzd);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Bidding data: ".concat(strValueOf));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkn)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzv zzvVar : zzcyhVar.zzg()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.zza);
            jSONObject2.put("latencyMillis", zzvVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkl)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzbb.zza().zzm(zzvVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : zzi(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static JSONObject zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzi(zzeVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zza(zzcto zzctoVar) {
        zzdyo zzdyoVar = this.zza;
        if (zzdyoVar.zzs()) {
            this.zzf = zzctoVar.zzn();
            this.zze = zzdyb.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkr)).booleanValue()) {
                zzdyoVar.zzk(this.zzb, this);
            }
        }
    }

    public final boolean zzc() {
        return this.zze != zzdyb.AD_REQUESTED;
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    public final void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdyo zzdyoVar = this.zza;
        if (zzdyoVar.zzs()) {
            this.zze = zzdyb.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkr)).booleanValue()) {
                zzdyoVar.zzk(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdT(zzbxj zzbxjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkr)).booleanValue()) {
            return;
        }
        zzdyo zzdyoVar = this.zza;
        if (zzdyoVar.zzs()) {
            zzdyoVar.zzk(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdU(zzfgf zzfgfVar) {
        zzdyo zzdyoVar = this.zza;
        if (zzdyoVar.zzs()) {
            zzfge zzfgeVar = zzfgfVar.zzb;
            List list = zzfgeVar.zza;
            if (!list.isEmpty()) {
                this.zzd = ((zzffu) list.get(0)).zzb;
            }
            zzffx zzffxVar = zzfgeVar.zzb;
            String str = zzffxVar.zzl;
            if (!TextUtils.isEmpty(str)) {
                this.zzh = str;
            }
            String str2 = zzffxVar.zzm;
            if (!TextUtils.isEmpty(str2)) {
                this.zzi = str2;
            }
            JSONObject jSONObject = zzffxVar.zzp;
            if (jSONObject.length() > 0) {
                this.zzl = jSONObject;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkn)).booleanValue()) {
                if (!zzdyoVar.zzm()) {
                    this.zzo = true;
                    return;
                }
                String str3 = zzffxVar.zzn;
                if (!TextUtils.isEmpty(str3)) {
                    this.zzj = str3;
                }
                JSONObject jSONObject2 = zzffxVar.zzo;
                if (jSONObject2.length() > 0) {
                    this.zzk = jSONObject2;
                }
                JSONObject jSONObject3 = this.zzk;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzdyoVar.zzl(length);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final JSONObject zzg() throws JSONException {
        JSONObject jSONObjectZzh;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzffu.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkr)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        zzcyh zzcyhVar = this.zzf;
        if (zzcyhVar != null) {
            jSONObjectZzh = zzh(zzcyhVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObjectZzh2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzcyh zzcyhVar2 = (zzcyh) iBinder;
                jSONObjectZzh2 = zzh(zzcyhVar2);
                if (zzcyhVar2.zzg().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzi(this.zzg));
                    jSONObjectZzh2.put("errors", jSONArray);
                }
            }
            jSONObjectZzh = jSONObjectZzh2;
        }
        jSONObject.put("responseInfo", jSONObjectZzh);
        return jSONObject;
    }
}
