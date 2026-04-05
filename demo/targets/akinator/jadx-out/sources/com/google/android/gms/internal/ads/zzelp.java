package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzelp implements zzehm {
    private final Map zza = new HashMap();
    private final zzdsy zzb;

    public zzelp(zzdsy zzdsyVar) {
        this.zzb = zzdsyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final zzehn zza(String str, JSONObject jSONObject) throws zzfgu {
        zzehn zzehnVar;
        synchronized (this) {
            try {
                Map map = this.zza;
                zzehnVar = (zzehn) map.get(str);
                if (zzehnVar == null) {
                    zzehnVar = new zzehn(this.zzb.zza(str, jSONObject), new zzeja(), str);
                    map.put(str, zzehnVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzehnVar;
    }
}
