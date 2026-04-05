package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfxh implements zzifh {
    private final zzifq zza;

    private zzfxh(zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzfxh zza(zzifq zzifqVar) {
        return new zzfxh(zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgus zzgusVarZzb = zzguz.zzb((ExecutorService) this.zza.zzb());
        zzifp.zzb(zzgusVarZzb);
        return zzgusVarZzb;
    }
}
