package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzezz implements zzeya {
    final zzgus zza;
    final List zzb;

    public zzezz(zzbee zzbeeVar, zzgus zzgusVar, List list) {
        this.zza = zzgusVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfaa(this.zza.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 48;
    }
}
