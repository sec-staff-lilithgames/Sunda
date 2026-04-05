package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzezn implements zzeya {
    final zzgus zza;

    public zzezn(zzbdi zzbdiVar, zzgus zzgusVar, Context context) {
        this.zza = zzgusVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzezm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzezo(new JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 45;
    }
}
