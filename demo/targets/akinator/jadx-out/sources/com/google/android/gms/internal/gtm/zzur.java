package com.google.android.gms.internal.gtm;

import com.ironsource.C3191e4;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzur {
    private static final zzuu zza = new zzup();
    private static final zzut zzb = new zzuq();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();

    public /* synthetic */ zzur(zzuu zzuuVar, zzuv zzuvVar) {
    }

    public final zzuw zza() {
        return new zzus(this, null);
    }

    public final void zzd(zzui zzuiVar) {
        zzwe.zza(zzuiVar, C3191e4.h.W);
        if (!zzuiVar.zzb()) {
            zzuu zzuuVar = zza;
            zzwe.zza(zzuiVar, C3191e4.h.W);
            this.zzd.remove(zzuiVar);
            this.zzc.put(zzuiVar, zzuuVar);
            return;
        }
        zzut zzutVar = zzb;
        zzwe.zza(zzuiVar, C3191e4.h.W);
        if (!zzuiVar.zzb()) {
            throw new IllegalArgumentException("key must be repeating");
        }
        this.zzc.remove(zzuiVar);
        this.zzd.put(zzuiVar, zzutVar);
    }
}
