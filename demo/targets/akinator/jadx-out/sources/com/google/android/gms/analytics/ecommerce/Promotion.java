package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class Promotion {
    public static final String ACTION_CLICK = "click";
    public static final String ACTION_VIEW = "view";
    final Map zza = new HashMap();

    public Promotion setCreative(String str) {
        zzb("cr", str);
        return this;
    }

    public Promotion setId(String str) {
        zzb("id", str);
        return this;
    }

    public Promotion setName(String str) {
        zzb("nm", str);
        return this;
    }

    public Promotion setPosition(String str) {
        zzb("ps", str);
        return this;
    }

    public String toString() {
        return zzj.zzb(this.zza);
    }

    public final Map zza(String str) {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.zza.entrySet()) {
            String strValueOf = String.valueOf((String) entry.getKey());
            map.put(str.concat(strValueOf), (String) entry.getValue());
        }
        return map;
    }

    public final void zzb(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zza.put(str, str2);
    }
}
