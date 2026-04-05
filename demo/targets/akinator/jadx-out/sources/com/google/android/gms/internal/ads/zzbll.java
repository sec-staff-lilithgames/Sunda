package com.google.android.gms.internal.ads;

import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbll implements zzblx {
    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgy zzcgyVar = (zzcgy) obj;
        if (map.containsKey(wHkgq.zUuIbbLYBYQC)) {
            zzcgyVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzcgyVar.zzas(false);
        }
    }
}
