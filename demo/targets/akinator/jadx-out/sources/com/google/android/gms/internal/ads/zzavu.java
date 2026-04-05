package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzavu extends zzavs {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzavu() {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
    }

    @Override // com.google.android.gms.internal.ads.zzavs
    public final HashMap zza() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(4, this.zze);
        map.put(3, this.zzd);
        map.put(2, this.zzc);
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzavu(String str) {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
        HashMap mapZzb = zzavs.zzb(str);
        if (mapZzb != null) {
            this.zza = mapZzb.get(0) == null ? "E" : (String) mapZzb.get(0);
            this.zzb = mapZzb.get(1) != null ? ((Long) mapZzb.get(1)).longValue() : -1L;
            this.zzc = mapZzb.get(2) == null ? "E" : (String) mapZzb.get(2);
            this.zzd = mapZzb.get(3) == null ? "E" : (String) mapZzb.get(3);
            this.zze = mapZzb.get(4) != null ? (String) mapZzb.get(4) : "E";
        }
    }
}
