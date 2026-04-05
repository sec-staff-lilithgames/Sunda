package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeva implements zzeya {
    private final Context zza;
    private final zzgus zzb;

    public zzeva(zzgus zzgusVar, Context context) {
        this.zzb = zzgusVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 57;
    }

    public final /* synthetic */ zzevb zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzevb(com.google.android.gms.ads.internal.util.zzs.zzw(this.zza));
    }
}
