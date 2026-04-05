package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzewa implements zzeya {
    private final zzgus zza;
    private final zzfgn zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzewa(zzgus zzgusVar, zzfgn zzfgnVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgusVar;
        this.zzb = zzfgnVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 26;
    }

    public final /* synthetic */ zzewb zzc() {
        return new zzewb(this.zzb, this.zzc, this.zzd);
    }
}
