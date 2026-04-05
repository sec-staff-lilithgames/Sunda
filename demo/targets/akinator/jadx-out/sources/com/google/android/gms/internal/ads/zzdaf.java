package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdaf implements zzifh {
    private final zzifq zza;

    private zzdaf(zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzdaf zzc(zzifq zzifqVar) {
        return new zzdaf(zzifqVar);
    }

    public static zzdae zzd(Set set) {
        return new zzdae(set);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdae zzb() {
        return new zzdae(((zzift) this.zza).zzb());
    }
}
