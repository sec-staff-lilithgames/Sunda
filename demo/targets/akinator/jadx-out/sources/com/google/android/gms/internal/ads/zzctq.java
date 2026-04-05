package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzctq implements zzctr {
    private final Map zza;

    public zzctq(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzctr
    public final zzehk zza(int i10, String str) {
        return (zzehk) this.zza.get(str);
    }
}
