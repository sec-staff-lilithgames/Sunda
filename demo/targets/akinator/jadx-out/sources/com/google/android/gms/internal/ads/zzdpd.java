package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdpd {
    private final Executor zza;
    private final zzdoy zzb;
    private final zzdvc zzc;

    public zzdpd(Executor executor, zzdoy zzdoyVar, zzdvc zzdvcVar) {
        this.zza = executor;
        this.zzb = zzdoyVar;
        this.zzc = zzdvcVar;
    }

    public final n1 zza(JSONObject jSONObject, String str) {
        n1 n1VarZza;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgui.zza(Collections.EMPTY_LIST);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcC)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzc.zze(), zzduq.NATIVE_ASSETS_LOADING_CUSTOM_START.zza());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject == null) {
                n1VarZza = zzgui.zza(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    n1VarZza = zzgui.zza(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    n1VarZza = "string".equals(strOptString2) ? zzgui.zza(new zzdpa(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzgui.zzk(this.zzb.zza(jSONObjectOptJSONObject, "image_value", null), new zzglu() { // from class: com.google.android.gms.internal.ads.zzdpb
                        @Override // com.google.android.gms.internal.ads.zzglu
                        public final /* synthetic */ Object apply(Object obj) {
                            return new zzdpa(strOptString, (zzbht) obj);
                        }
                    }, this.zza) : zzgui.zza(null);
                }
            }
            arrayList.add(n1VarZza);
        }
        return zzgui.zzk(zzgui.zzm(arrayList), zzdpc.zza, this.zza);
    }
}
