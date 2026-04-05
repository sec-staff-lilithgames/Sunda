package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfkd {
    public static final zzfkj zza(n1 n1Var, Object obj, zzfkk zzfkkVar) {
        return new zzfkj(zzfkkVar, obj, null, zzfkk.zza, Collections.EMPTY_LIST, n1Var, null);
    }

    public static final zzfkj zzb(Callable callable, Object obj, zzfkk zzfkkVar) {
        return zzc(callable, zzfkkVar.zze(), obj, zzfkkVar);
    }

    public static final zzfkj zzc(Callable callable, zzgus zzgusVar, Object obj, zzfkk zzfkkVar) {
        return new zzfkj(zzfkkVar, obj, null, zzfkk.zza, Collections.EMPTY_LIST, zzgusVar.submit(callable), null);
    }

    public static final zzfkj zzd(final zzfjy zzfjyVar, zzgus zzgusVar, Object obj, zzfkk zzfkkVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfkc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() throws Exception {
                zzfjyVar.zza();
                return null;
            }
        }, zzgusVar, obj, zzfkkVar);
    }
}
