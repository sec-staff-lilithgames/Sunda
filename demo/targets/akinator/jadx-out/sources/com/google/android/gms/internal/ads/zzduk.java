package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzduk implements zzfkt {
    private final Map zza;
    private final zzbdt zzb;

    public zzduk(zzbdt zzbdtVar, Map map) {
        this.zza = map;
        this.zzb = zzbdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdQ(zzfkm zzfkmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfkmVar)) {
            this.zzb.zzc(((zzduj) map.get(zzfkmVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdR(zzfkm zzfkmVar, String str, Throwable th2) {
        Map map = this.zza;
        if (map.containsKey(zzfkmVar)) {
            this.zzb.zzc(((zzduj) map.get(zzfkmVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdS(zzfkm zzfkmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfkmVar)) {
            this.zzb.zzc(((zzduj) map.get(zzfkmVar)).zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkt
    public final void zzdP(zzfkm zzfkmVar, String str) {
    }
}
