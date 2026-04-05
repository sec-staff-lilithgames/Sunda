package com.google.android.gms.internal.ads;

import android.content.Context;
import k4.n;
import k4.o;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfvp implements zzifh {
    private final zzifq zza;

    private zzfvp(zzifq zzifqVar) {
        this.zza = zzifqVar;
    }

    public static zzfvp zza(zzifq zzifqVar) {
        return new zzfvp(zzifqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = ((zzcjt) this.zza).zza();
        e0.checkNotNullParameter(context, "context");
        n nVarCreate$default = o.create$default(o.f70432a, zzfvn.zza, null, null, null, new kv.a() { // from class: com.google.android.gms.internal.ads.zzfvo
            @Override // kv.a
            public final /* synthetic */ Object invoke() {
                return j4.a.dataStoreFile(context, "ad_quality_data.pb");
            }
        }, 14, null);
        zzifp.zzb(nVarCreate$default);
        return nVarCreate$default;
    }
}
