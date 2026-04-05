package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdfb implements zzifh {
    private final zzdeo zza;

    private zzdfb(zzdeo zzdeoVar) {
        this.zza = zzdeoVar;
    }

    public static zzdfb zza(zzdeo zzdeoVar) {
        return new zzdfb(zzdeoVar);
    }

    public static Set zzc(zzdeo zzdeoVar) {
        return zzdeoVar.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        return this.zza.zzm();
    }
}
