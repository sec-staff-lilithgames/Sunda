package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcns {
    private final Map zza;
    private final Map zzb;

    public zzcns(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfgf zzfgfVar) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzfgd zzfgdVar : zzfgfVar.zzb.zzc) {
            Map map = this.zza;
            String str = zzfgdVar.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzfgdVar.zzb) == null) {
                Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzfgdVar.zzb) != null) {
                    zzcnu zzcnuVar = (zzcnu) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    zzcnuVar.zza(map3);
                }
            } else {
                ((zzcnv) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
