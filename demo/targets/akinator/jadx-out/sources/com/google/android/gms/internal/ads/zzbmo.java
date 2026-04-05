package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import bp.oM.DwaEpyvxz;
import com.ironsource.C3191e4;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbmo implements zzblx {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    public final void zzb(String str, zzbmn zzbmnVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbmnVar);
        }
    }

    public final n1 zzc(zzbpf zzbpfVar, String str, JSONObject jSONObject) throws JSONException {
        zzcca zzccaVar = new zzcca();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzb(string, new zzbmm(this, zzccaVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", string);
            jSONObject2.put("args", jSONObject);
            zzbpfVar.zzb(str, jSONObject2);
            return zzccaVar;
        } catch (Exception e10) {
            zzccaVar.zzd(e10);
            return zzccaVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get(C3191e4.f.f36439e);
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String strConcat = TextUtils.isEmpty(str4) ? DwaEpyvxz.FYbMidIkY : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            try {
                zzbmn zzbmnVar = (zzbmn) this.zzb.remove(str);
                if (zzbmnVar == null) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                    sb2.append("Received result for unexpected method invocation: ");
                    sb2.append(str);
                    String string = sb2.toString();
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + strConcat.length());
                    sb3.append(str3);
                    sb3.append(strConcat);
                    zzbmnVar.zzb(sb3.toString());
                    return;
                }
                if (str5 == null) {
                    zzbmnVar.zza(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        String string2 = jSONObject.toString(2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(string2).length() + 13);
                        sb4.append("Result GMSG: ");
                        sb4.append(string2);
                        com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                    }
                    zzbmnVar.zza(jSONObject);
                } catch (JSONException e10) {
                    zzbmnVar.zzb(e10.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
