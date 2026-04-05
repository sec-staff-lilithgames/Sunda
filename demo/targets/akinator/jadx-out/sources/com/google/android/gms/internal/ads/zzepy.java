package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzepy implements zzeya {
    private final Clock zza;
    private final zzfgn zzb;

    public zzepy(Clock clock, zzfgn zzfgnVar) {
        this.zza = clock;
        this.zzb = zzfgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return zzgui.zza(new zzepz(this.zzb, this.zza.currentTimeMillis()));
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 4;
    }
}
