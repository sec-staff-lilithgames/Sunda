package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.ecommerce.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzba extends com.google.android.gms.analytics.zzj {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();

    public final String toString() {
        HashMap map = new HashMap();
        if (!this.zza.isEmpty()) {
            map.put("products", this.zza);
        }
        if (!this.zzb.isEmpty()) {
            map.put("promotions", this.zzb);
        }
        if (!this.zzc.isEmpty()) {
            map.put("impressions", this.zzc);
        }
        map.put("productAction", null);
        return com.google.android.gms.analytics.zzj.zza(map);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzba zzbaVar = (zzba) zzjVar;
        zzbaVar.zza.addAll(this.zza);
        zzbaVar.zzb.addAll(this.zzb);
        for (Map.Entry entry : this.zzc.entrySet()) {
            String str = (String) entry.getKey();
            for (Product product : (List) entry.getValue()) {
                if (product != null) {
                    String str2 = str == null ? "" : str;
                    if (!zzbaVar.zzc.containsKey(str2)) {
                        zzbaVar.zzc.put(str2, new ArrayList());
                    }
                    ((List) zzbaVar.zzc.get(str2)).add(product);
                }
            }
        }
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.zza);
    }

    public final List zze() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final Map zzf() {
        return this.zzc;
    }
}
