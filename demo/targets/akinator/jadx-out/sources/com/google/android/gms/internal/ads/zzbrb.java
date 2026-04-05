package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbrb implements zzgtq {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final n1 zzb;

    public zzbrb(n1 n1Var, String str, zzbqi zzbqiVar, zzbqh zzbqhVar) {
        this.zzb = n1Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgtq
    public final n1 zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final n1 zzb(final Object obj) {
        return zzgui.zzj(this.zzb, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzbra
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj2) {
                return this.zza.zzc(obj, (zzbqc) obj2);
            }
        }, zzcbv.zzg);
    }

    public final /* synthetic */ n1 zzc(Object obj, zzbqc zzbqcVar) throws JSONException {
        zzcca zzccaVar = new zzcca();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzblw.zzo.zzb(string, new zzbqz(this, zzccaVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbqcVar.zzb(this.zza, jSONObject);
        return zzccaVar;
    }
}
