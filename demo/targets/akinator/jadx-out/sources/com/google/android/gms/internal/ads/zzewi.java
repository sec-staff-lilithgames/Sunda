package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzewi implements zzeya {
    private final zzgus zza;
    private final zzdwl zzb;

    public zzewi(zzgus zzgusVar, zzdwl zzdwlVar) {
        this.zza = zzgusVar;
        this.zzb = zzdwlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzewh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 62;
    }

    public final /* synthetic */ zzewj zzc() {
        return new zzewj(this.zzb.zzb());
    }
}
