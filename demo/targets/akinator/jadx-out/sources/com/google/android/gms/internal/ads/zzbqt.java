package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbqt implements zzbqf {
    private final zzbqh zza;
    private final zzbqi zzb;
    private final zzbqb zzc;
    private final String zzd;

    public zzbqt(zzbqb zzbqbVar, String str, zzbqi zzbqiVar, zzbqh zzbqhVar) {
        this.zzc = zzbqbVar;
        this.zzd = str;
        this.zzb = zzbqiVar;
        this.zza = zzbqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtq
    public final n1 zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbqf
    public final n1 zzb(Object obj) {
        zzcca zzccaVar = new zzcca();
        zzbpv zzbpvVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbpvVarZzb.zze(new zzbqq(this, zzbpvVarZzb, obj, zzccaVar), new zzbqr(this, zzccaVar, zzbpvVarZzb));
        return zzccaVar;
    }

    public final /* synthetic */ void zzc(zzbpv zzbpvVar, zzbqc zzbqcVar, Object obj, zzcca zzccaVar) throws JSONException {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String string = UUID.randomUUID().toString();
            zzblw.zzo.zzb(string, new zzbqs(this, zzbpvVar, zzccaVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbqcVar.zzb(this.zzd, jSONObject);
        } catch (Exception e10) {
            try {
                zzccaVar.zzd(e10);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e10);
            } finally {
                zzbpvVar.zza();
            }
        }
    }

    public final /* synthetic */ zzbqh zzd() {
        return this.zza;
    }
}
