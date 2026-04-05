package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzghn implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;

    private zzghn(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
    }

    public static zzghn zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        return new zzghn(zzifqVar, zzifqVar2, zzifqVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        zzfzi zzfziVar = (zzfzi) this.zzb.zzb();
        final zzgjd zzgjdVar = (zzgjd) this.zzc.zzb();
        return zzfziVar.zza(file, zzgaa.zze(), new Function() { // from class: com.google.android.gms.internal.ads.zzghm
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                zzgjdVar.zzd(20308, (Throwable) obj);
                return zzgaa.zze();
            }
        });
    }
}
